
package com.jk.ws;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "WSBookService", targetNamespace = "http://cxf.jk.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WSBookService {


    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns java.util.List<com.jk.ws.Book>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getList", targetNamespace = "http://cxf.jk.com/", className = "com.jk.ws.GetList")
    @ResponseWrapper(localName = "getListResponse", targetNamespace = "http://cxf.jk.com/", className = "com.jk.ws.GetListResponse")
    public List<Book> getList(
            @WebParam(name = "arg0", targetNamespace = "")
            String arg0,
            @WebParam(name = "arg1", targetNamespace = "")
            Integer arg1,
            @WebParam(name = "arg2", targetNamespace = "")
            Integer arg2);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "updateBookById", targetNamespace = "http://cxf.jk.com/", className = "com.jk.ws.UpdateBookById")
    @ResponseWrapper(localName = "updateBookByIdResponse", targetNamespace = "http://cxf.jk.com/", className = "com.jk.ws.UpdateBookByIdResponse")
    public Boolean updateBookById(
            @WebParam(name = "arg0", targetNamespace = "")
            Book arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.Long
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCount", targetNamespace = "http://cxf.jk.com/", className = "com.jk.ws.GetCount")
    @ResponseWrapper(localName = "getCountResponse", targetNamespace = "http://cxf.jk.com/", className = "com.jk.ws.GetCountResponse")
    public Long getCount(
            @WebParam(name = "arg0", targetNamespace = "")
            String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "insertBook", targetNamespace = "http://cxf.jk.com/", className = "com.jk.ws.InsertBook")
    @ResponseWrapper(localName = "insertBookResponse", targetNamespace = "http://cxf.jk.com/", className = "com.jk.ws.InsertBookResponse")
    public Boolean insertBook(
            @WebParam(name = "arg0", targetNamespace = "")
            Book arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns com.jk.ws.Book
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getBookById", targetNamespace = "http://cxf.jk.com/", className = "com.jk.ws.GetBookById")
    @ResponseWrapper(localName = "getBookByIdResponse", targetNamespace = "http://cxf.jk.com/", className = "com.jk.ws.GetBookByIdResponse")
    public Book getBookById(
            @WebParam(name = "arg0", targetNamespace = "")
            Integer arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "deleteById", targetNamespace = "http://cxf.jk.com/", className = "com.jk.ws.DeleteById")
    @ResponseWrapper(localName = "deleteByIdResponse", targetNamespace = "http://cxf.jk.com/", className = "com.jk.ws.DeleteByIdResponse")
    public Boolean deleteById(
            @WebParam(name = "arg0", targetNamespace = "")
            Integer arg0);

}
