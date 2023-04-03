
package com.user;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.user package. 
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

    private final static QName _GetUserByIdResponse_QNAME = new QName("http://user.com/", "getUserByIdResponse");
    private final static QName _GetListUser_QNAME = new QName("http://user.com/", "getListUser");
    private final static QName _ThanhToan_QNAME = new QName("http://user.com/", "thanh-toan");
    private final static QName _GetUserById_QNAME = new QName("http://user.com/", "getUserById");
    private final static QName _GetListUserResponse_QNAME = new QName("http://user.com/", "getListUserResponse");
    private final static QName _ThanhToanResponse_QNAME = new QName("http://user.com/", "thanh-toanResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.user
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetListUser }
     * 
     */
    public GetListUser createGetListUser() {
        return new GetListUser();
    }

    /**
     * Create an instance of {@link ThanhToan }
     * 
     */
    public ThanhToan createThanhToan() {
        return new ThanhToan();
    }

    /**
     * Create an instance of {@link GetUserById }
     * 
     */
    public GetUserById createGetUserById() {
        return new GetUserById();
    }

    /**
     * Create an instance of {@link GetUserByIdResponse }
     * 
     */
    public GetUserByIdResponse createGetUserByIdResponse() {
        return new GetUserByIdResponse();
    }

    /**
     * Create an instance of {@link GetListUserResponse }
     * 
     */
    public GetListUserResponse createGetListUserResponse() {
        return new GetListUserResponse();
    }

    /**
     * Create an instance of {@link ThanhToanResponse }
     * 
     */
    public ThanhToanResponse createThanhToanResponse() {
        return new ThanhToanResponse();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://user.com/", name = "getUserByIdResponse")
    public JAXBElement<GetUserByIdResponse> createGetUserByIdResponse(GetUserByIdResponse value) {
        return new JAXBElement<GetUserByIdResponse>(_GetUserByIdResponse_QNAME, GetUserByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://user.com/", name = "getListUser")
    public JAXBElement<GetListUser> createGetListUser(GetListUser value) {
        return new JAXBElement<GetListUser>(_GetListUser_QNAME, GetListUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ThanhToan }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://user.com/", name = "thanh-toan")
    public JAXBElement<ThanhToan> createThanhToan(ThanhToan value) {
        return new JAXBElement<ThanhToan>(_ThanhToan_QNAME, ThanhToan.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://user.com/", name = "getUserById")
    public JAXBElement<GetUserById> createGetUserById(GetUserById value) {
        return new JAXBElement<GetUserById>(_GetUserById_QNAME, GetUserById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://user.com/", name = "getListUserResponse")
    public JAXBElement<GetListUserResponse> createGetListUserResponse(GetListUserResponse value) {
        return new JAXBElement<GetListUserResponse>(_GetListUserResponse_QNAME, GetListUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ThanhToanResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://user.com/", name = "thanh-toanResponse")
    public JAXBElement<ThanhToanResponse> createThanhToanResponse(ThanhToanResponse value) {
        return new JAXBElement<ThanhToanResponse>(_ThanhToanResponse_QNAME, ThanhToanResponse.class, null, value);
    }

}
