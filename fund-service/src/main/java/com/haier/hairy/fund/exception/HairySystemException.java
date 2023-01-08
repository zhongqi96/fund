package com.haier.hairy.fund.exception;

public class HairySystemException extends RuntimeException{

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * 错误码
     */
    private int code;
    
    /**
     * 构造方法
     * 
     * @param code
     */
    public HairySystemException(int code) {
        this.code = code;
    }
    
    /**
     * 构造方法
     * 
     * @param code
     */
    public HairySystemException(String message) {
        super(message);
    }
    
    /**
     * 构造方法
     * 
     * @param code
     */
    public HairySystemException(String message, Throwable cause) {
        super(message, cause);
    }  

    /**
     * 构造方法
     * 
     * @param code
     * @param message
     */
    public HairySystemException(int code, String message) {
        super(message);
        this.code = code;
    }

    /**
     * 构造方法
     * 
     * @param code
     * @param message
     * @param cause
     */
    public HairySystemException(int code, String message, Throwable cause) {
        super(message, cause);
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}