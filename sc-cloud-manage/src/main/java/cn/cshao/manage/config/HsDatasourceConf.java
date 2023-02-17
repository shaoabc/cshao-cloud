package cn.cshao.manage.config;

import cn.cshao.manage.config.properties.HsDbProperties;
import com.alibaba.druid.pool.DruidDataSource;
import cs.cshao.common.bean.BeanUtils;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * @author cshao
 * @desc   主数据源--公共字典
 * @company
 * @create 2023-02-17 11:07 下午
 */
@Configuration
@MapperScan(basePackages = HsDatasourceConf.PACKAGE, sqlSessionFactoryRef = "hsSqlSessionFactory")
public class HsDatasourceConf {

    /**
     * 精确到目录，以便跟其他数据源隔离
     */
    static final String PACKAGE = "cn.cshao.common.dao.slldb";
    static final String MAPPER_LOCATION = "classpath:mapper.slldb/**/*.xml";

    @Autowired
    private HsDbProperties properties;

    @Bean(name = "hsDataSource")
    @Primary
    public DataSource hsDataSource() throws SQLException {
        return BeanUtils.copyProperties(properties, new DruidDataSource());
    }

    @Bean(name = "hsTransactionManager")
    @Primary
    public DataSourceTransactionManager hsTransactionManager() throws SQLException {
        return new DataSourceTransactionManager(hsDataSource());
    }

    @Bean(name = "hsSqlSessionFactory")
    @Primary
    public SqlSessionFactory hsSqlSessionFactory(@Qualifier("hsDataSource") DataSource hsDataSource)
            throws Exception {
        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(hsDataSource);
        sessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver()
                .getResources(HsDatasourceConf.MAPPER_LOCATION));
        sessionFactory.getObject().getConfiguration().setMapUnderscoreToCamelCase(true);
        return sessionFactory.getObject();
    }

}
