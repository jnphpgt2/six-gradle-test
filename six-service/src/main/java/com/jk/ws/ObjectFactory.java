
package com.jk.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.jk.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _InsertBookResponse_QNAME = new QName("http://cxf.jk.com/", "insertBookResponse");
    private final static QName _GetList_QNAME = new QName("http://cxf.jk.com/", "getList");
    private final static QName _GetListResponse_QNAME = new QName("http://cxf.jk.com/", "getListResponse");
    private final static QName _UpdateBookById_QNAME = new QName("http://cxf.jk.com/", "updateBookById");
    private final static QName _DeleteByIdResponse_QNAME = new QName("http://cxf.jk.com/", "deleteByIdResponse");
    private final static QName _GetBookByIdResponse_QNAME = new QName("http://cxf.jk.com/", "getBookByIdResponse");
    private final static QName _GetCountResponse_QNAME = new QName("http://cxf.jk.com/", "getCountResponse");
    private final static QName _GetCount_QNAME = new QName("http://cxf.jk.com/", "getCount");
    private final static QName _InsertBook_QNAME = new QName("http://cxf.jk.com/", "insertBook");
    private final static QName _GetBookById_QNAME = new QName("http://cxf.jk.com/", "getBookById");
    private final static QName _DeleteById_QNAME = new QName("http://cxf.jk.com/", "deleteById");
    private final static QName _UpdateBookByIdResponse_QNAME = new QName("http://cxf.jk.com/", "updateBookByIdResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.jk.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetCountResponse }
     * 
     */
    public GetCountResponse createGetCountResponse() {
        return new GetCountResponse();
    }

    /**
     * Create an instance of {@link DeleteByIdResponse }
     * 
     */
    public DeleteByIdResponse createDeleteByIdResponse() {
        return new DeleteByIdResponse();
    }

    /**
     * Create an instance of {@link GetBookByIdResponse }
     * 
     */
    public GetBookByIdResponse createGetBookByIdResponse() {
        return new GetBookByIdResponse();
    }

    /**
     * Create an instance of {@link InsertBookResponse }
     * 
     */
    public InsertBookResponse createInsertBookResponse() {
        return new InsertBookResponse();
    }

    /**
     * Create an instance of {@link GetList }
     * 
     */
    public GetList createGetList() {
        return new GetList();
    }

    /**
     * Create an instance of {@link GetListResponse }
     * 
     */
    public GetListResponse createGetListResponse() {
        return new GetListResponse();
    }

    /**
     * Create an instance of {@link UpdateBookById }
     * 
     */
    public UpdateBookById createUpdateBookById() {
        return new UpdateBookById();
    }

    /**
     * Create an instance of {@link DeleteById }
     * 
     */
    public DeleteById createDeleteById() {
        return new DeleteById();
    }

    /**
     * Create an instance of {@link UpdateBookByIdResponse }
     * 
     */
    public UpdateBookByIdResponse createUpdateBookByIdResponse() {
        return new UpdateBookByIdResponse();
    }

    /**
     * Create an instance of {@link InsertBook }
     * 
     */
    public InsertBook createInsertBook() {
        return new InsertBook();
    }

    /**
     * Create an instance of {@link GetCount }
     * 
     */
    public GetCount createGetCount() {
        return new GetCount();
    }

    /**
     * Create an instance of {@link GetBookById }
     * 
     */
    public GetBookById createGetBookById() {
        return new GetBookById();
    }

    /**
     * Create an instance of {@link Book }
     * 
     */
    public Book createBook() {
        return new Book();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertBookResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cxf.jk.com/", name = "insertBookResponse")
    public JAXBElement<InsertBookResponse> createInsertBookResponse(InsertBookResponse value) {
        return new JAXBElement<InsertBookResponse>(_InsertBookResponse_QNAME, InsertBookResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cxf.jk.com/", name = "getList")
    public JAXBElement<GetList> createGetList(GetList value) {
        return new JAXBElement<GetList>(_GetList_QNAME, GetList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cxf.jk.com/", name = "getListResponse")
    public JAXBElement<GetListResponse> createGetListResponse(GetListResponse value) {
        return new JAXBElement<GetListResponse>(_GetListResponse_QNAME, GetListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateBookById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cxf.jk.com/", name = "updateBookById")
    public JAXBElement<UpdateBookById> createUpdateBookById(UpdateBookById value) {
        return new JAXBElement<UpdateBookById>(_UpdateBookById_QNAME, UpdateBookById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cxf.jk.com/", name = "deleteByIdResponse")
    public JAXBElement<DeleteByIdResponse> createDeleteByIdResponse(DeleteByIdResponse value) {
        return new JAXBElement<DeleteByIdResponse>(_DeleteByIdResponse_QNAME, DeleteByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBookByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cxf.jk.com/", name = "getBookByIdResponse")
    public JAXBElement<GetBookByIdResponse> createGetBookByIdResponse(GetBookByIdResponse value) {
        return new JAXBElement<GetBookByIdResponse>(_GetBookByIdResponse_QNAME, GetBookByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cxf.jk.com/", name = "getCountResponse")
    public JAXBElement<GetCountResponse> createGetCountResponse(GetCountResponse value) {
        return new JAXBElement<GetCountResponse>(_GetCountResponse_QNAME, GetCountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cxf.jk.com/", name = "getCount")
    public JAXBElement<GetCount> createGetCount(GetCount value) {
        return new JAXBElement<GetCount>(_GetCount_QNAME, GetCount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertBook }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cxf.jk.com/", name = "insertBook")
    public JAXBElement<InsertBook> createInsertBook(InsertBook value) {
        return new JAXBElement<InsertBook>(_InsertBook_QNAME, InsertBook.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBookById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cxf.jk.com/", name = "getBookById")
    public JAXBElement<GetBookById> createGetBookById(GetBookById value) {
        return new JAXBElement<GetBookById>(_GetBookById_QNAME, GetBookById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cxf.jk.com/", name = "deleteById")
    public JAXBElement<DeleteById> createDeleteById(DeleteById value) {
        return new JAXBElement<DeleteById>(_DeleteById_QNAME, DeleteById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateBookByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cxf.jk.com/", name = "updateBookByIdResponse")
    public JAXBElement<UpdateBookByIdResponse> createUpdateBookByIdResponse(UpdateBookByIdResponse value) {
        return new JAXBElement<UpdateBookByIdResponse>(_UpdateBookByIdResponse_QNAME, UpdateBookByIdResponse.class, null, value);
    }

}
