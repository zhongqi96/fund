package com.haier.hairy.fund.dto;

import com.haier.hairy.common.rest.RestResponse;

public class IsOpenFundResponse extends RestResponse{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public IsOpenFundResponse() {
		super();
		
	}
	
	
	
	public IsOpenFundResponse(int responseCode) {
		super(responseCode);
	}



	public IsOpenFundResponse(int code,String message) {
		super();
		this.setResponseCode(code);
		this.setResponseMessage(message);
	}
	

	boolean openFund;

	public boolean isOpenFund() {
		return openFund;
	}

	public void setOpenFund(boolean openFund) {
		this.openFund = openFund;
	}
	
}
