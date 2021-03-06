
package org.occ.p3.webservices;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "borrowWeb", targetNamespace = "http://webservices.p3.occ.org/", wsdlLocation = "http://lfr011641:8080/web-service-05227549248861136051.0.1-SNAPSHOT/ws/borrowWs?wsdl")
public class BorrowWeb
    extends Service
{

    private final static URL BORROWWEB_WSDL_LOCATION;
    private final static WebServiceException BORROWWEB_EXCEPTION;
    private final static QName BORROWWEB_QNAME = new QName("http://webservices.p3.occ.org/", "borrowWeb");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://lfr011641:8080/web-service-05227549248861136051.0.1-SNAPSHOT/ws/borrowWs?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        BORROWWEB_WSDL_LOCATION = url;
        BORROWWEB_EXCEPTION = e;
    }

    public BorrowWeb() {
        super(__getWsdlLocation(), BORROWWEB_QNAME);
    }

    public BorrowWeb(WebServiceFeature... features) {
        super(__getWsdlLocation(), BORROWWEB_QNAME, features);
    }

    public BorrowWeb(URL wsdlLocation) {
        super(wsdlLocation, BORROWWEB_QNAME);
    }

    public BorrowWeb(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, BORROWWEB_QNAME, features);
    }

    public BorrowWeb(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BorrowWeb(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns BorrowWs
     */
    @WebEndpoint(name = "borrowWsPort")
    public BorrowWs getBorrowWsPort() {
        return super.getPort(new QName("http://webservices.p3.occ.org/", "borrowWsPort"), BorrowWs.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BorrowWs
     */
    @WebEndpoint(name = "borrowWsPort")
    public BorrowWs getBorrowWsPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://webservices.p3.occ.org/", "borrowWsPort"), BorrowWs.class, features);
    }

    private static URL __getWsdlLocation() {
        if (BORROWWEB_EXCEPTION!= null) {
            throw BORROWWEB_EXCEPTION;
        }
        return BORROWWEB_WSDL_LOCATION;
    }

}
