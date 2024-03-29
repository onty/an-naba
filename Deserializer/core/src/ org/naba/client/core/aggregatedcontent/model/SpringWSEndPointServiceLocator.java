/**
 * SpringWSEndPointServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package  org.naba.client.core.aggregatedcontent.model;

public class SpringWSEndPointServiceLocator extends org.apache.axis.client.Service implements  org.naba.client.core.aggregatedcontent.model.SpringWSEndPointService {

    public SpringWSEndPointServiceLocator() {
    }


    public SpringWSEndPointServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SpringWSEndPointServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for TestSpringWS
    private java.lang.String TestSpringWS_address = "http://localhost:8888/war-mdlwr/axis/TestSpringWS";

    public java.lang.String getTestSpringWSAddress() {
        return TestSpringWS_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String TestSpringWSWSDDServiceName = "TestSpringWS";

    public java.lang.String getTestSpringWSWSDDServiceName() {
        return TestSpringWSWSDDServiceName;
    }

    public void setTestSpringWSWSDDServiceName(java.lang.String name) {
        TestSpringWSWSDDServiceName = name;
    }

    public  org.naba.client.core.aggregatedcontent.model.SpringWSEndPoint getTestSpringWS() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(TestSpringWS_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getTestSpringWS(endpoint);
    }

    public  org.naba.client.core.aggregatedcontent.model.SpringWSEndPoint getTestSpringWS(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
             org.naba.client.core.aggregatedcontent.model.TestSpringWSSoapBindingStub _stub = new  org.naba.client.core.aggregatedcontent.model.TestSpringWSSoapBindingStub(portAddress, this);
            _stub.setPortName(getTestSpringWSWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setTestSpringWSEndpointAddress(java.lang.String address) {
        TestSpringWS_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if ( org.naba.client.core.aggregatedcontent.model.SpringWSEndPoint.class.isAssignableFrom(serviceEndpointInterface)) {
                 org.naba.client.core.aggregatedcontent.model.TestSpringWSSoapBindingStub _stub = new  org.naba.client.core.aggregatedcontent.model.TestSpringWSSoapBindingStub(new java.net.URL(TestSpringWS_address), this);
                _stub.setPortName(getTestSpringWSWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("TestSpringWS".equals(inputPortName)) {
            return getTestSpringWS();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://localhost:8888/war-mdlwr/axis/TestSpringWS", "SpringWSEndPointService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://localhost:8888/war-mdlwr/axis/TestSpringWS", "TestSpringWS"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("TestSpringWS".equals(portName)) {
            setTestSpringWSEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
