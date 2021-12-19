
package com.jm.demo.client;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import jakarta.xml.ws.Service;
import jakarta.xml.ws.WebEndpoint;
import jakarta.xml.ws.WebServiceClient;
import jakarta.xml.ws.WebServiceException;
import jakarta.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 3.0.2
 * Generated source version: 3.0
 * 
 */
@WebServiceClient(name = "CountriesPortService", targetNamespace = "http://spring.io/guides/gs-producing-web-service", wsdlLocation = "file:/C:/Users/jeanp/Dev/java11-soap-client/src/main/resources/GetCountries.wsdl")
public class CountriesPortService
    extends Service
{

    private final static URL COUNTRIESPORTSERVICE_WSDL_LOCATION;
    private final static WebServiceException COUNTRIESPORTSERVICE_EXCEPTION;
    private final static QName COUNTRIESPORTSERVICE_QNAME = new QName("http://spring.io/guides/gs-producing-web-service", "CountriesPortService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/C:/Users/jeanp/Dev/java11-soap-client/src/main/resources/GetCountries.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        COUNTRIESPORTSERVICE_WSDL_LOCATION = url;
        COUNTRIESPORTSERVICE_EXCEPTION = e;
    }

    public CountriesPortService() {
        super(__getWsdlLocation(), COUNTRIESPORTSERVICE_QNAME);
    }

    public CountriesPortService(WebServiceFeature... features) {
        super(__getWsdlLocation(), COUNTRIESPORTSERVICE_QNAME, features);
    }

    public CountriesPortService(URL wsdlLocation) {
        super(wsdlLocation, COUNTRIESPORTSERVICE_QNAME);
    }

    public CountriesPortService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, COUNTRIESPORTSERVICE_QNAME, features);
    }

    public CountriesPortService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CountriesPortService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns CountriesPort
     */
    @WebEndpoint(name = "CountriesPortSoap11")
    public CountriesPort getCountriesPortSoap11() {
        return super.getPort(new QName("http://spring.io/guides/gs-producing-web-service", "CountriesPortSoap11"), CountriesPort.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CountriesPort
     */
    @WebEndpoint(name = "CountriesPortSoap11")
    public CountriesPort getCountriesPortSoap11(WebServiceFeature... features) {
        return super.getPort(new QName("http://spring.io/guides/gs-producing-web-service", "CountriesPortSoap11"), CountriesPort.class, features);
    }

    private static URL __getWsdlLocation() {
        if (COUNTRIESPORTSERVICE_EXCEPTION!= null) {
            throw COUNTRIESPORTSERVICE_EXCEPTION;
        }
        return COUNTRIESPORTSERVICE_WSDL_LOCATION;
    }

}
