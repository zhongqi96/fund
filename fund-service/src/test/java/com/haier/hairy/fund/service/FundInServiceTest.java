package com.haier.hairy.fund.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.haier.hairy.fund.BaseTest;

/**
 * Created by 01384435 on 2016/01/05.
 */
public class FundInServiceTest extends BaseTest{
	
    @Autowired
    IFundInService fundInService;

    @Test
    public void isOpenFundTest() throws Exception {
    	boolean isOpenFund = fundInService.isOpenFund("100000058661", "JX", "000686");
    	System.out.println(isOpenFund);
    }


}
