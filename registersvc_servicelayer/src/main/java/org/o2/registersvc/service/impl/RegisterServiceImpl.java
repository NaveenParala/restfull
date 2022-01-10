package org.o2.registersvc.service.impl;

import org.o2.registerservice.service.RegisterService;
import org.o2.registersvc.process.RegisterServiceProcess;
import org.o2.registersvc.process.beans.RegisterSvcProcessVBReq;
import org.o2.registersvc.process.beans.RegisterSvcProcessVBRes;
import org.o2.registersvc.process.imp.RegisterServiceProcessImpl;
import org.o2.registersvc.schema.req.RegisterServiceReqType;
import org.o2.registersvc.schema.res.RegisterServiceResType;
import org.o2.registersvc.service.builder.RegisterServiceReqBuilder;
import org.o2.registersvc.service.builder.RegisterServiceResBuilder;
import org.o2.registersvc.service.validator.RegisterServiceValidator;

public class RegisterServiceImpl implements RegisterService {

	public RegisterServiceResType enrollment(RegisterServiceReqType wsReq) {
		
		//get the req from client
		
		//validate the req
		RegisterServiceValidator validator=new RegisterServiceValidator();
		validator.validateWsReq(wsReq);
		
		//prepare the req for the process layer i.e 
	    //convert the srevice layer req to process layer 
		RegisterServiceReqBuilder builder=new RegisterServiceReqBuilder();
		RegisterSvcProcessVBReq vbReq=builder.buildProcessReq(wsReq);
		
		RegisterServiceProcess process=new RegisterServiceProcessImpl();
		RegisterSvcProcessVBRes vbRes = process.enrollment(vbReq);
		
		//prepare the ws response i.e converting to vbResp into wsResp
		RegisterServiceResBuilder resBuilder=new RegisterServiceResBuilder();
		RegisterServiceResType wsResp=resBuilder.buildWsRes(vbRes);
		
		
		
		
		return wsResp;
	}

}
