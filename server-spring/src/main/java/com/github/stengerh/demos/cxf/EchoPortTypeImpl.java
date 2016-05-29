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
