package com.haier.hairy.fund.dto;

import com.haier.hairy.common.util.BaseObject;

public class IsOpenFundRequest extends BaseObject {

	private static final long serialVersionUID = 1L;
	
	/**
	 * 用户快捷通id
	 */
	private String memberId;
	
	/**
	 * 基金公司编码
	 */
	private String companyCode;
	
	/**
	 * 基金编码
	 */
	private String fundCode;

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getCompanyCode() {
		return companyCode;
	}

	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}

	public String getFundCode() {
		return fundCode;
	}

	public void setFundCode(String fundCode) {
		this.fundCode = fundCode;
	}

}
