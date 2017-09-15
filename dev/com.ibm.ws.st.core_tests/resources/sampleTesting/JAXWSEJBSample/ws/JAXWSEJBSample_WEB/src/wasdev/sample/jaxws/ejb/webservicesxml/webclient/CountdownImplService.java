/*******************************************************************************
 * Copyright (c) 2017 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
/*******************************************************************************
 * Copyright (c) 2017 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
//
// Generated By:JAX-WS RI IBM 2.2.1-11/28/2011 08:27 AM(foreman)- (JAXB RI IBM 2.2.3-11/28/2011 06:17 AM(foreman)-)
//

package wasdev.sample.jaxws.ejb.webservicesxml.webclient;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;

@WebServiceClient(name = "CountdownImplService", targetNamespace = "http://webservicesxml.ejb.jaxws.sample.wasdev/",
                  wsdlLocation = "file:/D:/tmp/beta/wsgen_results/CountdownImplService.wsdl")
public class CountdownImplService
                extends Service
{

    private final static URL COUNTDOWNIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException COUNTDOWNIMPLSERVICE_EXCEPTION;
    private final static QName COUNTDOWNIMPLSERVICE_QNAME = new QName("http://webservicesxml.ejb.jaxws.sample.wasdev/", "CountdownImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/D:/tmp/beta/wsgen_results/CountdownImplService.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        COUNTDOWNIMPLSERVICE_WSDL_LOCATION = url;
        COUNTDOWNIMPLSERVICE_EXCEPTION = e;
    }

    public CountdownImplService() {
        super(__getWsdlLocation(), COUNTDOWNIMPLSERVICE_QNAME);
    }

    public CountdownImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), COUNTDOWNIMPLSERVICE_QNAME, features);
    }

    public CountdownImplService(URL wsdlLocation) {
        super(wsdlLocation, COUNTDOWNIMPLSERVICE_QNAME);
    }

    public CountdownImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, COUNTDOWNIMPLSERVICE_QNAME, features);
    }

    public CountdownImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CountdownImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *         returns CountdownImpl
     */
    @WebEndpoint(name = "CountdownImplPort")
    public CountdownImpl getCountdownImplPort() {
        return super.getPort(new QName("http://webservicesxml.ejb.jaxws.sample.wasdev/", "CountdownImplPort"), CountdownImpl.class);
    }

    /**
     * 
     * @param features
     *            A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy. Supported features not in the <code>features</code> parameter will have their default
     *            values.
     * @return
     *         returns CountdownImpl
     */
    @WebEndpoint(name = "CountdownImplPort")
    public CountdownImpl getCountdownImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://webservicesxml.ejb.jaxws.sample.wasdev/", "CountdownImplPort"), CountdownImpl.class, features);
    }

    private static URL __getWsdlLocation() {
        if (COUNTDOWNIMPLSERVICE_EXCEPTION != null) {
            throw COUNTDOWNIMPLSERVICE_EXCEPTION;
        }
        return COUNTDOWNIMPLSERVICE_WSDL_LOCATION;
    }

}