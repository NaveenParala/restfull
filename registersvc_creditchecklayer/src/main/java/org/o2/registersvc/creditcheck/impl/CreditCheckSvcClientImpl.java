package org.o2.registersvc.creditcheck.impl;

import org.o2.registersvc.creditcheck.CreditCheckSvcClient;
import org.o2.registersvc.creditcheck.beans.CreditCheckRequest;
import org.o2.registersvc.creditcheck.beans.CreditCheckResponse;

public class CreditCheckSvcClientImpl implements CreditCheckSvcClient{

	public CreditCheckResponse getCreditScore(CreditCheckRequest creditReq) {
		//prepare the credit check response
		CreditCheckResponse creditResp=new CreditCheckResponse();
		
		creditResp.setRespCode("4812");
		creditResp.setRespMsg("good");
		creditResp.setStatus("delivered");
		creditResp.setScore(60);
		
		return creditResp;
	}

}

