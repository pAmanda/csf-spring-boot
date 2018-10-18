package test.com.cxf.service;

import javax.jws.WebService;

@WebService(serviceName = "HelloService", portName = "HelloPort",
        targetNamespace = "http://test.com.cxf.service/",
        endpointInterface = "test.com.cxf.service.Hello")
public class HelloPortImpl implements Hello {


  public java.lang.String sayHello(String myname) {
    try {
      return "Hello, Welcome to CXF Spring boot " + myname + "!!!";

    } catch (java.lang.Exception ex) {
      ex.printStackTrace();
      throw new RuntimeException(ex);
    }
  }

}
