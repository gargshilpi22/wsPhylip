
package phylipWrappers_client;

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
 * JAX-WS RI 2.2.6b20 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "phylip", targetNamespace = "http://phylipWrappers/", wsdlLocation = "http://localhost:8080/wsPHYLIP/phylip?wsdl")
public class Phylip_Service
    extends Service
{

    private final static URL PHYLIP_WSDL_LOCATION;
    private final static WebServiceException PHYLIP_EXCEPTION;
    private final static QName PHYLIP_QNAME = new QName("http://phylipWrappers/", "phylip");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/wsPHYLIP/phylip?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        PHYLIP_WSDL_LOCATION = url;
        PHYLIP_EXCEPTION = e;
    }

    public Phylip_Service() {
        super(__getWsdlLocation(), PHYLIP_QNAME);
    }

    public Phylip_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), PHYLIP_QNAME, features);
    }

    public Phylip_Service(URL wsdlLocation) {
        super(wsdlLocation, PHYLIP_QNAME);
    }

    public Phylip_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, PHYLIP_QNAME, features);
    }

    public Phylip_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Phylip_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Phylip
     */
    @WebEndpoint(name = "phylipPort")
    public Phylip getPhylipPort() {
        return super.getPort(new QName("http://phylipWrappers/", "phylipPort"), Phylip.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Phylip
     */
    @WebEndpoint(name = "phylipPort")
    public Phylip getPhylipPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://phylipWrappers/", "phylipPort"), Phylip.class, features);
    }

    private static URL __getWsdlLocation() {
        if (PHYLIP_EXCEPTION!= null) {
            throw PHYLIP_EXCEPTION;
        }
        return PHYLIP_WSDL_LOCATION;
    }

}
