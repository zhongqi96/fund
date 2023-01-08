package com.haier.hairy.fund.facade.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.haier.hairy.fund.service.IFundInService;
import com.haier.hairy.fund.dto.IsOpenFundRequest;
import com.haier.hairy.fund.dto.IsOpenFundResponse;
import com.haier.hairy.fund.facade.IFundInFacade;

@Service("fundInFacade")
public class FundInFacadeImpl implements IFundInFacade {
	
	protected final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	IFundInService fundInService;

	@Override
	public IsOpenFundResponse isOpenFund(IsOpenFundRequest req) {
		logger.info("isOpenFund request:{}", req);
		
		IsOpenFundResponse response = new IsOpenFundResponse();
		
		boolean isOpenFund = fundInService.isOpenFund(req.getMemberId(), req.getCompanyCode(), req.getFundCode());
		response.setOpenFund(isOpenFund);
		
		return response;
	}

}
