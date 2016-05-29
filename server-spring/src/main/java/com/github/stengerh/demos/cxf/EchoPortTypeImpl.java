/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.stengerh.demos.cxf;

import com.github.stengerh.demo.cxf.service11.EchoPortType;
import org.apache.cxf.annotations.SchemaValidation;

/**
 *
 * @author Holger Stenger
 */
@SchemaValidation
public class EchoPortTypeImpl implements EchoPortType {

    @Override
    public String echo(String value) {
        return value;
    }
    
}
