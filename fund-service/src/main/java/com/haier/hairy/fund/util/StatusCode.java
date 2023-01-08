package com.haier.hairy.fund.util;


public enum StatusCode {
    
    SUCCESS(0, "正常处理"),
    PARAMETER_ERROR(1, "参数错误"),
    LOGICAL_ERROR(2, "逻辑错误"),
    
    NOT_FOUND(1000,"查询记录不存在！"),
    CHECK_ERROR(1001,"校验不满足条件"),
    VERIFICATION_CODE_ERROR(1002,"输入验证码有误！"),
    
    
    DB_ERROR(9001, "数据库错误！"),
    PARSE_DATE_ERROR(9002, "时间转换出错！"),
    
    UNKNOWN_BIZ_ERROR(9998, "未知的业务异常！"),
    SYSTEM_ERROR(9999, "系统错误"),
    
    /* 5开头段 为投标*/
    BID_AMOUNT_LARGE_ZERO(5001,"投标金额必须大于零!"),
    BID_AMOUNT_IS_INTEGER(5002,"投标金额必须为整数!"),
    NOT_BID_STATE(5003,"指定的标不是投标中状态,不能投标！"),
    BEYOND_AMOUNT(5004,"投标金额大于可投金额!"),
    STARTING_AMOUNT(5005,"本项目起投金额为 %s 元，请调整您的投资金额!"),
    NEED_CAST_FULL(5006,"可投金额低于最低起投金额时，需一次性投满标!"),
    INCREMENTAL_LIMIT(5007,"只可以投资 %s + %s 的整数倍，您输入的金额不符合条件，请重新输入!"),
    SINGLE_UPPER_BOUND(5008,"本项目单笔投资额上限为 %s 元，请调整您的投资金额!"),
    CUMULATIVE_CAP(5009,"本项目累计投资额上限为 %s 元，您的投资已超出上限!"),
    INSUFFICIENT_PAYMENT(5010,"余额付款加理财金付款之和小于投标金额!"),
    NOT_SUPPORT_THEMSELVES(5011,"不可投本账号发的标！"),
    LICAIJIN_ACCOUNT_NOT_EXIST(5012,"理财金往来账户不存在！"),
    LCJLOCK_ACCOUNT_NOT_EXIST(5013,"理财金锁定账户不存在！"),  
    INSUFFICIENT_LICAIJIN_ACCOUNT(5014,"理财金账户金额不足！"),
    NOT_BINDING_KJT(5015,"未找到与快捷通会员绑定信息！"),
    BALANCE_INSUFFICIENT(5016,"账户余额不足！"),
    LCJ_NOT_All_USE(5017,"理财金必须全部使用！"),
    TRADEING(5018,"交易进行中"),
    
   
    
    IS_XJX_XKZX(5101,"抱歉，本标的属于新客专享，您不符合新客专享的条件！"),
    IS_YFKLC(5102,"抱歉，本标的属于经销商预付款理财专享，您不符合投标的条件！"),


    /* 6开头，为放款*/
    LOAN_CHECK_ERROR(6001,"放款逻辑错误！"),
    LOAN_STATUS_ERROR(6002,"不是募集成功状态,不能放款！"),
    LOAN_LCJ_NO_SUFFICIENT(6003,"投资人锁定账户理财金余额不足！"),
    LOAN_INTEREST_DAY_ERROR(6004,"固定付息日不能大于28！"),
    LOAN_DAY_CHECK_ERROR(6005,"按天借款，其天数必须大于0！"),
    LOAN_PAY_METHOD_ERROR(6006,"不支持的还款方式！"),
    LOAN_TRANSFER_ERROR(6007,"放款转账出现异常！");
    
    private int status;
    
    private String message;

    public int getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

    StatusCode(int status, String message) {
        this.status = status;
        this.message = message;
    }
    
    /**
     * 通过代码获取枚举项
     * @param code
     * @return
     */
    public static StatusCode getByCode(Integer statusCode) {
        if (statusCode == null) {
            return null;
        }

        for (StatusCode at : values()) {
            if (at.getStatus() == statusCode) {
                return at;
            }
        }

        return null;
    }
}