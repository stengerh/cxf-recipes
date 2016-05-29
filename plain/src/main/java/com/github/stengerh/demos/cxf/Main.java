/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.stengerh.demos.cxf;

import java.io.IOException;
import javax.xml.ws.Endpoint;
import org.apache.log4j.BasicConfigurator;

/**
 *
 * @author Holger Stenger
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BasicConfigurator.configure();
        
        Endpoint soapEndpoint = Endpoint.create(new SoapPortImpl());
        
        soapEndpoint.publish("http://localhost:8080/wsdl11/soap11/");
        
        try {
            System.in.read();
        } finally {
            soapEndpoint.stop();
        }
    }

}
