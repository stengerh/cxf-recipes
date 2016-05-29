package com.github.stengerh.demos.cxf;

import com.github.stengerh.demo.cxf.service11.EchoPortType;
import javax.jws.WebService;
import org.apache.cxf.annotations.Logging;
import org.apache.cxf.annotations.SchemaValidation;

/**
 *
 * @author Holger Stenger
 */
@Logging
@SchemaValidation
@WebService(
        serviceName = "EchoService",
        portName = "SoapPort",
        targetNamespace = "urn:service11.cxf-demo.stengerh.github.com",
        wsdlLocation = "http://localhost/wsdl11/soap11/?wsdl",
        endpointInterface = "com.github.stengerh.demo.cxf.service11.EchoPortType")
public class SoapPortImpl implements EchoPortType {

    @Override
    public String echo(String value) {
        return value;
    }

}
