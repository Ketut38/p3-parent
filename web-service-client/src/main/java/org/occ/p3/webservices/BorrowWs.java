
package org.occ.p3.webservices;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10
 * Generated source version: 2.2
 * 
 */
@WebService(name = "borrowWs", targetNamespace = "http://webservices.p3.occ.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BorrowWs {


    /**
     * 
     */
    @WebMethod
    @RequestWrapper(localName = "init", targetNamespace = "http://webservices.p3.occ.org/", className = "org.occ.p3.webservices.Init")
    @ResponseWrapper(localName = "initResponse", targetNamespace = "http://webservices.p3.occ.org/", className = "org.occ.p3.webservices.InitResponse")
    @Action(input = "http://webservices.p3.occ.org/borrowWs/initRequest", output = "http://webservices.p3.occ.org/borrowWs/initResponse")
    public void init();

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "borrowBook", targetNamespace = "http://webservices.p3.occ.org/", className = "org.occ.p3.webservices.BorrowBook")
    @ResponseWrapper(localName = "borrowBookResponse", targetNamespace = "http://webservices.p3.occ.org/", className = "org.occ.p3.webservices.BorrowBookResponse")
    @Action(input = "http://webservices.p3.occ.org/borrowWs/borrowBookRequest", output = "http://webservices.p3.occ.org/borrowWs/borrowBookResponse")
    public Boolean borrowBook(
        @WebParam(name = "arg0", targetNamespace = "")
        Integer arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        Integer arg1);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "extendBorrow", targetNamespace = "http://webservices.p3.occ.org/", className = "org.occ.p3.webservices.ExtendBorrow")
    @ResponseWrapper(localName = "extendBorrowResponse", targetNamespace = "http://webservices.p3.occ.org/", className = "org.occ.p3.webservices.ExtendBorrowResponse")
    @Action(input = "http://webservices.p3.occ.org/borrowWs/extendBorrowRequest", output = "http://webservices.p3.occ.org/borrowWs/extendBorrowResponse")
    public Boolean extendBorrow(
        @WebParam(name = "arg0", targetNamespace = "")
        Integer arg0);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "terminateBorrow", targetNamespace = "http://webservices.p3.occ.org/", className = "org.occ.p3.webservices.TerminateBorrow")
    @ResponseWrapper(localName = "terminateBorrowResponse", targetNamespace = "http://webservices.p3.occ.org/", className = "org.occ.p3.webservices.TerminateBorrowResponse")
    @Action(input = "http://webservices.p3.occ.org/borrowWs/terminateBorrowRequest", output = "http://webservices.p3.occ.org/borrowWs/terminateBorrowResponse")
    public Boolean terminateBorrow(
        @WebParam(name = "arg0", targetNamespace = "")
        Integer arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        Integer arg1);

}
