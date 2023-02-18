package cn.cshao.user.cmpt.schedule;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @Desc: 清理无联系的图片影像
 * @Author: cshao
 * @Date: 2022/12/22 7:31
 **/
@Component
@Slf4j
@AllArgsConstructor
public class DeleteDataTask {

    /**
     * 每天凌晨2点执行一次
     */
    @Scheduled(cron = "0 0 2 * * ?")
    public void excuteDeleteImages() {
        log.info("未关联的文件清除开始！");
    }

}
