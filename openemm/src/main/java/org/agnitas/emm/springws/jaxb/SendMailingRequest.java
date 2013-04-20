//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.07.12 at 11:32:44 AM EEST 
//


package org.agnitas.emm.springws.jaxb;

import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="mailingID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="recipientsType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sendDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="blocksize" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="stepping" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "SendMailingRequest")
public class SendMailingRequest {

    protected int mailingID;
    @XmlElement(required = true)
    protected String recipientsType;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(DateAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected Date sendDate;
    protected int blocksize;
    protected int stepping;

    /**
     * Gets the value of the mailingID property.
     * 
     */
    public int getMailingID() {
        return mailingID;
    }

    /**
     * Sets the value of the mailingID property.
     * 
     */
    public void setMailingID(int value) {
        this.mailingID = value;
    }

    /**
     * Gets the value of the recipientsType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientsType() {
        return recipientsType;
    }

    /**
     * Sets the value of the recipientsType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipientsType(String value) {
        this.recipientsType = value;
    }

    /**
     * Gets the value of the sendDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getSendDate() {
        return sendDate;
    }

    /**
     * Sets the value of the sendDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSendDate(Date value) {
        this.sendDate = value;
    }

    /**
     * Gets the value of the blocksize property.
     * 
     */
    public int getBlocksize() {
        return blocksize;
    }

    /**
     * Sets the value of the blocksize property.
     * 
     */
    public void setBlocksize(int value) {
        this.blocksize = value;
    }

    /**
     * Gets the value of the stepping property.
     * 
     */
    public int getStepping() {
        return stepping;
    }

    /**
     * Sets the value of the stepping property.
     * 
     */
    public void setStepping(int value) {
        this.stepping = value;
    }

}