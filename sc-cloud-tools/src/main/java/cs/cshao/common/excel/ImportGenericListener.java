package cs.cshao.common.excel;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import cs.cshao.common.exc.UserException;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

/**
 * @Desc 范型模版读取类
 * @Author cshao
 * @Date 2022/12/13 13:15
 **/
public class ImportGenericListener<T> extends AnalysisEventListener<T> {

    /**
     * 每隔5条存储数据库，实际使用中可以3000条，然后清理list ，方便内存回收
     */
    private static final int BATCH_COUNT = 20000;
    @Getter
    List<T> list = new ArrayList<>();

    @Override
    public void invoke(T data, AnalysisContext analysisContext) {
        list.add(data);
        // 达到BATCH_COUNT了，需要去存储一次数据库，防止数据几万条数据在内存，容易OOM
        if (list.size() >= BATCH_COUNT) {
            throw new UserException("最多支持每次20000条记录!");
        }
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {
    }
}
