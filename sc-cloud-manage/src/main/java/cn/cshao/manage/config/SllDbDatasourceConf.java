package cn.cshao.manage.config;

import cn.cshao.manage.config.properties.HsDbProperties;
import cn.cshao.manage.config.properties.SllDbProperties;
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

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * @author cshao
 * @desc  患者数据源
 * @company
 * @create 2023-02-18 12:10 上午
 */
@Configuration
@MapperScan(basePackages = SllDbDatasourceConf.PACKAGE, sqlSessionFactoryRef = "sllSqlSessionFactory")
public class SllDbDatasourceConf {

    @Resource
    private SllDbProperties properties;
    /**
     * 精确到目录，以便跟其他数据源隔离
     */
    static final String PACKAGE = "cn.cshao.common.dao.slldb";
    static final String MAPPER_LOCATION = "classpath:mapper/slldb/**/*.xml";

    @Bean(name = "sllDataSource")
    public DataSource sllDataSource() throws SQLException {
        return BeanUtils.copyProperties(properties, new DruidDataSource());
    }

    @Bean(name = "sllTransactionManager")
    public DataSourceTransactionManager sllTransactionManager() throws SQLException {
        return new DataSourceTransactionManager(sllDataSource());
    }

    @Bean(name = "sllSqlSessionFactory")
    public SqlSessionFactory sllSqlSessionFactory(@Qualifier("sllDataSource") DataSource sllDataSource)
            throws Exception {
        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(sllDataSource);
        sessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver()
                .getResources(SllDbDatasourceConf.MAPPER_LOCATION));
        sessionFactory.getObject().getConfiguration().setMapUnderscoreToCamelCase(true);
        return sessionFactory.getObject();
    }
}
