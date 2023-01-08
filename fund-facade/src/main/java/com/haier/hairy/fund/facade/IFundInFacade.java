package com.haier.hairy.fund.facade;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

import javax.ws.rs.*;

import com.haier.hairy.fund.dto.IsOpenFundRequest;
import com.haier.hairy.fund.dto.IsOpenFundResponse;

@Path("/fundInFacade")
@Produces("application/json")
@Consumes("application/json")
@Api(value = "/fundInFacade")
public interface IFundInFacade {

	@POST
	@Path("/isOpenFund")
	@ApiOperation(value = "判断当前登录用户是否开通基金账户",response = IsOpenFundResponse.class)
	IsOpenFundResponse isOpenFund(@ApiParam(value = "IsOpenFundResponse", required = true) IsOpenFundRequest req);
	
}
