package com.haier.hairy.fund.service.impl;

import javax.annotation.Resource;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.haier.hairy.fund.exception.HairySystemException;
import com.haier.hairy.fund.service.IFundInService;
import com.haier.hairy.fund.util.StatusCode;
import com.kjt.fund.service.facade.api.IFundQueryFacade;
import com.kjt.fund.service.facade.request.EntityReq;
import com.kjt.fund.service.facade.response.EntityRes;

@Service(value = "fundInService")
public class IFundInServiceImpl implements IFundInService {
	
	private static Logger logger = LoggerFactory.getLogger(IFundInServiceImpl.class);

	private static final String VERSION = "1.0";
	
	@Resource(name = "fundQueryFacade")
	private IFundQueryFacade fundQueryFacade;
	
	@Override
	public boolean isOpenFund(String memberId, String companyCode, String fundCode) {

		EntityReq entityReq = new EntityReq();
		entityReq.setVersion(VERSION);
		entityReq.setCompanyCode(companyCode);
		entityReq.setKjtCustId(memberId);
		entityReq.setFundCode(fundCode);
		
		logger.info("getBaseEntity，请求参数:{}", entityReq);
		EntityRes resp = fundQueryFacade.getBaseEntity(entityReq);
		logger.info("getBaseEntity，返回参数:{}", ToStringBuilder.reflectionToString(resp, ToStringStyle.MULTI_LINE_STYLE));
		logger.info("getBaseEntity，返回参数dto:{}", ToStringBuilder.reflectionToString(resp.getEntityDto(), ToStringStyle.MULTI_LINE_STYLE));
		
		if (resp == null) {
			throw new HairySystemException(StatusCode.SYSTEM_ERROR.getStatus(), "getBaseEntity返回为空");
		}
		
		if(resp.getEntityDto() == null){
			throw new HairySystemException(StatusCode.SYSTEM_ERROR.getStatus(), "返回EntityDto为空");
		}
		
		if(resp.getEntityDto().getOpenStat() != null && "S".equals(resp.getEntityDto().getOpenStat().trim())){
			return true;
		}
		
		return false;
	}

}
