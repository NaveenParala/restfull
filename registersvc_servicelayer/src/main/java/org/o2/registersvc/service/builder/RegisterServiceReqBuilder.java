package org.o2.registersvc.service.builder;

import org.o2.registersvc.process.beans.RegisterSvcProcessVBReq;
import org.o2.registersvc.schema.req.RegisterServiceReqType;

public class RegisterServiceReqBuilder {

	public RegisterSvcProcessVBReq buildProcessReq(RegisterServiceReqType wsReq) {
		RegisterSvcProcessVBReq vbReq=new RegisterSvcProcessVBReq();
		
		vbReq.setClientId(wsReq.getClientDetails().getClientId());
		vbReq.setChannelId(wsReq.getClientDetails().getChannelId());
		vbReq.setCardNum(wsReq.getCardDetails().getCardNum());
		vbReq.setCvv(wsReq.getCardDetails().getCardNum());
		vbReq.setCardNum(wsReq.getCardDetails().getCvv());
		vbReq.setExpDate(wsReq.getCardDetails().getExpDate());
		vbReq.setNameOnCard(wsReq.getCardDetails().getNameOnCard());
		vbReq.setAccountNum(wsReq.getAccountDetails().getAccountNum());
		vbReq.setMobileNum(wsReq.getAccountDetails().getMobile());
		
		return null;
	}

	
}
