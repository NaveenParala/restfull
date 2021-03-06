
package org.o2.registersvc.schema.res;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.o2.registersvc.schema.res package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _RegisterSvcRes_QNAME = new QName("http://www.o2.org/RegisterSvc/schema/Res", "RegisterSvcRes");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.o2.registersvc.schema.res
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RegisterServiceResType }
     * 
     */
    public RegisterServiceResType createRegisterServiceResType() {
        return new RegisterServiceResType();
    }

    /**
     * Create an instance of {@link CreditCheckType }
     * 
     */
    public CreditCheckType createCreditCheckType() {
        return new CreditCheckType();
    }

    /**
     * Create an instance of {@link StatusBlockType }
     * 
     */
    public StatusBlockType createStatusBlockType() {
        return new StatusBlockType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterServiceResType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.o2.org/RegisterSvc/schema/Res", name = "RegisterSvcRes")
    public JAXBElement<RegisterServiceResType> createRegisterSvcRes(RegisterServiceResType value) {
        return new JAXBElement<RegisterServiceResType>(_RegisterSvcRes_QNAME, RegisterServiceResType.class, null, value);
    }

}
