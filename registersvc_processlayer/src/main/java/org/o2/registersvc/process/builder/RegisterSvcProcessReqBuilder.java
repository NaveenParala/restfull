package org.o2.registersvc.process.builder;

import org.o2.registersvc.creditcheck.beans.CreditCheckRequest;
import org.o2.registersvc.intg.beans.RegisterServiceDaoReq;
import org.o2.registersvc.process.beans.RegisterSvcProcessVBReq;

public class RegisterSvcProcessReqBuilder {

	public RegisterServiceDaoReq buildVBReq(RegisterSvcProcessVBReq vbReq) {
		
		RegisterServiceDaoReq daoReq=new RegisterServiceDaoReq();
		
		daoReq.setClientId(vbReq.getClientId());
		daoReq.setChannelId(vbReq.getChannelId());
		daoReq.setCardNum(vbReq.getCardNum());
		daoReq.setCvv(vbReq.getCvv());
		daoReq.setExpDate(vbReq.getExpDate());
		daoReq.setNameOnCard(vbReq.getNameOnCard());
		daoReq.setAccountNum(vbReq.getAccountNum());
		daoReq.setMobileNum(vbReq.getMobileNum());

		return daoReq;
	}

	public CreditCheckRequest buildCreditReq(RegisterSvcProcessVBReq vbReq) {
		
		CreditCheckRequest creditReq=new CreditCheckRequest();
		creditReq.setClientId(vbReq.getClientId());
		creditReq.setChannelId(vbReq.getChannelId());
		creditReq.setCardNum(vbReq.getCardNum());
		creditReq.setCvv(vbReq.getCvv());
		creditReq.setExpDate(vbReq.getExpDate());
		creditReq.setNameOnCard(vbReq.getNameOnCard());

		return creditReq;
	}

}
