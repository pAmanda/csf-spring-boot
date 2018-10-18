package test.com.cxf.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

@WebService(targetNamespace = "http://test.com.cxf.service/", name = "Hello")
public interface Hello {

  @WebResult(name = "return", targetNamespace = "")
  @RequestWrapper(localName = "sayHello",
          targetNamespace = "http://test.com.cxf.service/",
          className = "test.com.cxf.service.Hello")
  @WebMethod(action = "urn:SayHello")
  @ResponseWrapper(localName = "sayHelloResponse",
          targetNamespace = "http://test.com.cxf.service/",
          className = "")
  String sayHello(@WebParam(name = "myname", targetNamespace = "") String myname);

}
