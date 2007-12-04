package org.resteasy;

import org.resteasy.specimpl.UriBuilderImpl;
import org.resteasy.spi.HttpOutput;

/**
 * @author <a href="mailto:bill@burkecentral.com">Bill Burke</a>
 * @version $Revision: 1 $
 */
public class MatrixParamMarshaller implements ParameterMarshaller {
    private String paramName;

    public MatrixParamMarshaller(String paramName) {
        this.paramName = paramName;
    }

    public void marshall(Object object, UriBuilderImpl uri, HttpOutput output) {
        uri.matrixParam(paramName, object.toString());
    }
}