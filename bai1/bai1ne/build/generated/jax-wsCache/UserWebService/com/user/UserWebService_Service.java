
package com.user;

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
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "UserWebService", targetNamespace = "http://user.com/", wsdlLocation = "http://localhost:8080/bai1ne/UserWebService?wsdl")
public class UserWebService_Service
    extends Service
{

    private final static URL USERWEBSERVICE_WSDL_LOCATION;
    private final static WebServiceException USERWEBSERVICE_EXCEPTION;
    private final static QName USERWEBSERVICE_QNAME = new QName("http://user.com/", "UserWebService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/bai1ne/UserWebService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        USERWEBSERVICE_WSDL_LOCATION = url;
        USERWEBSERVICE_EXCEPTION = e;
    }

    public UserWebService_Service() {
        super(__getWsdlLocation(), USERWEBSERVICE_QNAME);
    }

    public UserWebService_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), USERWEBSERVICE_QNAME, features);
    }

    public UserWebService_Service(URL wsdlLocation) {
        super(wsdlLocation, USERWEBSERVICE_QNAME);
    }

    public UserWebService_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, USERWEBSERVICE_QNAME, features);
    }

    public UserWebService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public UserWebService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns UserWebService
     */
    @WebEndpoint(name = "UserWebServicePort")
    public UserWebService getUserWebServicePort() {
        return super.getPort(new QName("http://user.com/", "UserWebServicePort"), UserWebService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns UserWebService
     */
    @WebEndpoint(name = "UserWebServicePort")
    public UserWebService getUserWebServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://user.com/", "UserWebServicePort"), UserWebService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (USERWEBSERVICE_EXCEPTION!= null) {
            throw USERWEBSERVICE_EXCEPTION;
        }
        return USERWEBSERVICE_WSDL_LOCATION;
    }

}
