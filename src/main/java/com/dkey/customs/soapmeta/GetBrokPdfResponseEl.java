//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.07.13 at 04:55:54 PM EEST 
//


package com.dkey.customs.soapmeta;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GetBrokPdfResult" type="{http://tempuri.org/}GetBrokPdfResponse" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getBrokPdfResult"
})
@XmlRootElement(name = "GetBrokPdfResponseEl")
public class GetBrokPdfResponseEl {

    @XmlElement(name = "GetBrokPdfResult")
    protected GetBrokPdfResponse getBrokPdfResult;

    /**
     * Gets the value of the getBrokPdfResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetBrokPdfResponse }
     *     
     */
    public GetBrokPdfResponse getGetBrokPdfResult() {
        return getBrokPdfResult;
    }

    /**
     * Sets the value of the getBrokPdfResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetBrokPdfResponse }
     *     
     */
    public void setGetBrokPdfResult(GetBrokPdfResponse value) {
        this.getBrokPdfResult = value;
    }

}
