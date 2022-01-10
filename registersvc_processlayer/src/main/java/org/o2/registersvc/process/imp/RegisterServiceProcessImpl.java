package org.o2.registersvc.process.imp;

import org.o2.registersvc.creditcheck.CreditCheckSvcClient;
import org.o2.registersvc.creditcheck.beans.CreditCheckRequest;
import org.o2.registersvc.creditcheck.beans.CreditCheckResponse;
import org.o2.registersvc.creditcheck.impl.CreditCheckSvcClientImpl;
import org.o2.registersvc.intg.RegisterServiceDao;
import org.o2.registersvc.intg.beans.RegisterServiceDaoReq;
import org.o2.registersvc.intg.beans.RegisterServiceDaoRes;
import org.o2.registersvc.intg.impl.RegisterServiceDaoImpl;
import org.o2.registersvc.process.RegisterServiceProcess;
import org.o2.registersvc.process.beans.RegisterSvcProcessVBReq;
import org.o2.registersvc.process.beans.RegisterSvcProcessVBRes;
import org.o2.registersvc.process.builder.RegisterSvcProcessReqBuilder;
import org.o2.registersvc.process.builder.RegisterSvcProcessResBuilder;

public class RegisterServiceProcessImpl implements RegisterServiceProcess{

	public RegisterSvcProcessVBRes enrollment(RegisterSvcProcessVBReq vbReq) {
		//get req from the service layer 

		//prepare the req for intg layer i.e 
		//convert process req into intg req
		RegisterSvcProcessReqBuilder builder=new RegisterSvcProcessReqBuilder();
		RegisterServiceDaoReq daoReq=builder.buildVBReq(vbReq);
		CreditCheckRequest	creditReq=builder.buildCreditReq(vbReq);
		
		CreditCheckSvcClient creditClient=new CreditCheckSvcClientImpl();
		CreditCheckResponse creditResp = creditClient.getCreditScore(creditReq);

		if(creditResp != null && creditResp.getScore() > 60){

			RegisterServiceDao daoService=new RegisterServiceDaoImpl();
			RegisterServiceDaoRes daoResp = daoService.enrollment(daoReq);
		}

		//prepare the vbResp i.e convert 
		//the dapResp into vbResp
		RegisterServiceDao daoResp=new RegisterServiceDaoImpl();
		RegisterSvcProcessResBuilder resBuilder=new RegisterSvcProcessResBuilder();
		RegisterSvcProcessVBRes vbResp=resBuilder.buildVBRes(daoResp);
	

		return vbResp;
	}

}
