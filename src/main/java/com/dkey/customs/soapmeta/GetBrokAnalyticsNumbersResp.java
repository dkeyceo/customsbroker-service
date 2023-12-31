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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetBrokAnalyticsNumbersResp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetBrokAnalyticsNumbersResp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://tempuri.org/}CsnWs2ResponseBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TotalNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="IssuedNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ReissuedNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="SuspendedNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="StatusNumberList" type="{http://tempuri.org/}ArrayOfBrokAnalyticsCancellStatusNumbersItem" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetBrokAnalyticsNumbersResp", propOrder = {
    "totalNumber",
    "issuedNumber",
    "reissuedNumber",
    "suspendedNumber",
    "statusNumberList"
})
public class GetBrokAnalyticsNumbersResp
    extends CsnWs2ResponseBase
{

    @XmlElement(name = "TotalNumber")
    protected int totalNumber;
    @XmlElement(name = "IssuedNumber")
    protected int issuedNumber;
    @XmlElement(name = "ReissuedNumber")
    protected int reissuedNumber;
    @XmlElement(name = "SuspendedNumber")
    protected int suspendedNumber;
    @XmlElement(name = "StatusNumberList")
    protected ArrayOfBrokAnalyticsCancellStatusNumbersItem statusNumberList;

    /**
     * Gets the value of the totalNumber property.
     * 
     */
    public int getTotalNumber() {
        return totalNumber;
    }

    /**
     * Sets the value of the totalNumber property.
     * 
     */
    public void setTotalNumber(int value) {
        this.totalNumber = value;
    }

    /**
     * Gets the value of the issuedNumber property.
     * 
     */
    public int getIssuedNumber() {
        return issuedNumber;
    }

    /**
     * Sets the value of the issuedNumber property.
     * 
     */
    public void setIssuedNumber(int value) {
        this.issuedNumber = value;
    }

    /**
     * Gets the value of the reissuedNumber property.
     * 
     */
    public int getReissuedNumber() {
        return reissuedNumber;
    }

    /**
     * Sets the value of the reissuedNumber property.
     * 
     */
    public void setReissuedNumber(int value) {
        this.reissuedNumber = value;
    }

    /**
     * Gets the value of the suspendedNumber property.
     * 
     */
    public int getSuspendedNumber() {
        return suspendedNumber;
    }

    /**
     * Sets the value of the suspendedNumber property.
     * 
     */
    public void setSuspendedNumber(int value) {
        this.suspendedNumber = value;
    }

    /**
     * Gets the value of the statusNumberList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBrokAnalyticsCancellStatusNumbersItem }
     *     
     */
    public ArrayOfBrokAnalyticsCancellStatusNumbersItem getStatusNumberList() {
        return statusNumberList;
    }

    /**
     * Sets the value of the statusNumberList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBrokAnalyticsCancellStatusNumbersItem }
     *     
     */
    public void setStatusNumberList(ArrayOfBrokAnalyticsCancellStatusNumbersItem value) {
        this.statusNumberList = value;
    }

}
