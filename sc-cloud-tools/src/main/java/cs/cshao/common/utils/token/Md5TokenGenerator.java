package cs.cshao.common.utils.token;

import org.springframework.stereotype.Component;
import org.springframework.util.DigestUtils;

/**
 * @desc token 生成器实现类
 * @author cshao
 * @time 2022-12-25
 * */
@Component
public class Md5TokenGenerator implements TokenGenerator {

    @Override
    public String generate(String... strings) {
        long timestamp = System.currentTimeMillis();
        StringBuilder tokenMeta = new StringBuilder();
        for (String s : strings) {
            tokenMeta.append(s);
        }
        tokenMeta.append(timestamp);
        return DigestUtils.md5DigestAsHex(tokenMeta.toString().getBytes());
    }
}
