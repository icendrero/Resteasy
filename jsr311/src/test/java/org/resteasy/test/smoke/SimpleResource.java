package org.resteasy.test.smoke;

import javax.ws.rs.ConsumeMime;
import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.ProduceMime;
import javax.ws.rs.QueryParam;
import javax.ws.rs.UriParam;

/**
 * @author <a href="mailto:bill@burkecentral.com">Bill Burke</a>
 * @version $Revision: 1 $
 */
public class SimpleResource {

    @GET
    @Path("basic")
    @ProduceMime("text/plain")
    public String getBasic() {
        System.out.println("getBasic()");
        return "basic";
    }

    @PUT
    @Path("basic")
    @ConsumeMime("text/plain")
    public void putBasic(String body) {
        System.out.println(body);
    }

    @GET
    @Path("queryParam")
    @ProduceMime("text/plain")
    public String getQueryParam(@QueryParam("param")String param) {
        return param;
    }

    @GET
    @Path("matrixParam")
    @ProduceMime("text/plain")
    public String getMatrixParam(@MatrixParam("param")String param) {
        return param;
    }

    @GET
    @Path("uriParam/{param}")
    @ProduceMime("text/plain")
    public int getUriParam(@UriParam("param")int param) {
        return param;
    }


}
