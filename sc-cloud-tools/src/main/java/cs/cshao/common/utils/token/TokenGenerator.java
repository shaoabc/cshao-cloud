package cs.cshao.common.utils.token;

import org.springframework.stereotype.Component;

/**
 * @desc token 生成器接口
 * @author cshao
 * @time 2019-12-25
 * */
@Component
public interface TokenGenerator {

    String generate(String... strings);

}
