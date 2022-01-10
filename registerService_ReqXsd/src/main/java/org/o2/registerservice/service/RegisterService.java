
package org.o2.registerservice.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import org.o2.registersvc.schema.req.RegisterServiceReqType;
import org.o2.registersvc.schema.res.RegisterSvcResType;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "RegisterService", targetNamespace = "http://www.o2.org/RegisterService/Service")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    org.o2.registersvc.schema.req.ObjectFactory.class,
    org.o2.registersvc.schema.res.ObjectFactory.class
})
public interface RegisterService {


    /**
     * 
     * @param parameters
     * @return
     *     returns org.o2.registersvc.schema.res.RegisterSvcResType
     */
    @WebMethod(operationName = "Enrollment", action = " ")
    @WebResult(name = "RegisterSvcRes", targetNamespace = "http://www.o2.org/RegisterSvc/schema/Res", partName = "parameters")
    public RegisterSvcResType enrollment(
        @WebParam(name = "RegisterSvcReq", targetNamespace = "http://www.o2.org/RegisterSvc/schema/Req", partName = "parameters")
        RegisterServiceReqType parameters);

}