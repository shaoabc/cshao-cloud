package cs.cshao.common.utils.sequence.base;

public interface IDWorker {

    long nextId();

    String generateId(String prefix);

}
