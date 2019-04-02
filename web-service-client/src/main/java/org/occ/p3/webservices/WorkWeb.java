
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
@WebServiceClient(name = "workWeb", targetNamespace = "http://webservices.p3.occ.org/", wsdlLocation = "http://lfr011641:8080/web-service-0715021529330909835.0.1-SNAPSHOT/ws/workWs?wsdl")
public class WorkWeb
    extends Service
{

    private final static URL WORKWEB_WSDL_LOCATION;
    private final static WebServiceException WORKWEB_EXCEPTION;
    private final static QName WORKWEB_QNAME = new QName("http://webservices.p3.occ.org/", "workWeb");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://lfr011641:8080/web-service-0715021529330909835.0.1-SNAPSHOT/ws/workWs?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WORKWEB_WSDL_LOCATION = url;
        WORKWEB_EXCEPTION = e;
    }

    public WorkWeb() {
        super(__getWsdlLocation(), WORKWEB_QNAME);
    }

    public WorkWeb(WebServiceFeature... features) {
        super(__getWsdlLocation(), WORKWEB_QNAME, features);
    }

    public WorkWeb(URL wsdlLocation) {
        super(wsdlLocation, WORKWEB_QNAME);
    }

    public WorkWeb(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WORKWEB_QNAME, features);
    }

    public WorkWeb(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WorkWeb(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WorkWs
     */
    @WebEndpoint(name = "workWsPort")
    public WorkWs getWorkWsPort() {
        return super.getPort(new QName("http://webservices.p3.occ.org/", "workWsPort"), WorkWs.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WorkWs
     */
    @WebEndpoint(name = "workWsPort")
    public WorkWs getWorkWsPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://webservices.p3.occ.org/", "workWsPort"), WorkWs.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WORKWEB_EXCEPTION!= null) {
            throw WORKWEB_EXCEPTION;
        }
        return WORKWEB_WSDL_LOCATION;
    }

}
