package cs.cshao.common.bean;

import cs.cshao.common.cons.Constants;
import lombok.Data;

import java.io.Serializable;

/**
 * API 统一返回数据结构
 * @author shaochen
 */
@Data
public class RestResult<T> implements Serializable {

    private int code = Constants.SUCCESS_CODE;

    private String msg = Constants.SUCCESS_MSG;

    private T data = null;


    /**
     * 无参构造
     */
    public RestResult() {
    }

    /**
     * 带一个参数构造
     * @param data
     */
    public RestResult(T data) {
        this.data = data;
    }

    /**
     * 多个参数构造器
     * @param msg
     * @param data
     */
    public RestResult(String msg, T data) {
        this.msg = msg;
        this.data = data;
    }

    /**
     * 多个参数构造器
     * @param code
     * @param msg
     */
    public RestResult(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    /**
     * 多个参数构造器
     * @param code
     * @param msg
     * @param data
     */
    public RestResult(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static <T> RestResult<T> success() {
        return new RestResult<>();
    }

    public static <T> RestResult<T> success(T data) {
        return new RestResult<>(data);
    }

    public static <T> RestResult<T> success(String msg, T data) {
        return new RestResult<>(msg, data);
    }

    public static <T> RestResult<T> fail() {
        return new RestResult<>(Constants.FAIL_CODE, Constants.FAIL_MSG);
    }

    public static <T> RestResult<T> fail(String msg) {
        return new RestResult<>(Constants.FAIL_CODE, msg);
    }

    public static <T> RestResult<T> fail(String msg, T data) {
        return new RestResult<>(Constants.FAIL_CODE, msg, data);
    }

    public static <T> RestResult<T> fail(int code, String msg) {
        return new RestResult<>(code, msg);
    }

    /**
     * 请求结果判断
     *
     * @return true:请求成功、false:请求失败
     */
    public boolean isSuccess() {
        return this.getCode() == Constants.SUCCESS_CODE;
    }

    /**
     * 请求结果判断
     *
     * @return true:请求失败、false:请求成功
     */
    public boolean isFail() {
        return this.getCode() != Constants.SUCCESS_CODE;
    }
}
