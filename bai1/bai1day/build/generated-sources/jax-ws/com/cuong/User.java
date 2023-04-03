
package com.cuong;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for user complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="user">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cvc" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="kieuThe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="namHetHan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="soThe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tenChuThe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "user", propOrder = {
    "cvc",
    "id",
    "kieuThe",
    "namHetHan",
    "soThe",
    "tenChuThe"
})
public class User {

    protected Integer cvc;
    protected Integer id;
    protected String kieuThe;
    protected String namHetHan;
    protected String soThe;
    protected String tenChuThe;

    /**
     * Gets the value of the cvc property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCvc() {
        return cvc;
    }

    /**
     * Sets the value of the cvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCvc(Integer value) {
        this.cvc = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setId(Integer value) {
        this.id = value;
    }

    /**
     * Gets the value of the kieuThe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKieuThe() {
        return kieuThe;
    }

    /**
     * Sets the value of the kieuThe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKieuThe(String value) {
        this.kieuThe = value;
    }

    /**
     * Gets the value of the namHetHan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNamHetHan() {
        return namHetHan;
    }

    /**
     * Sets the value of the namHetHan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNamHetHan(String value) {
        this.namHetHan = value;
    }

    /**
     * Gets the value of the soThe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoThe() {
        return soThe;
    }

    /**
     * Sets the value of the soThe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoThe(String value) {
        this.soThe = value;
    }

    /**
     * Gets the value of the tenChuThe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTenChuThe() {
        return tenChuThe;
    }

    /**
     * Sets the value of the tenChuThe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTenChuThe(String value) {
        this.tenChuThe = value;
    }

}
