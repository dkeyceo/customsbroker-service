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
 * <p>Java class for GetBrokAppPdfReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetBrokAppPdfReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://tempuri.org/}CsnWsRequestArgBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AppSubType" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *         &lt;element name="AppName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AppDateNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ApplicantName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ApplicantAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ApplicantPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ApplicantEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ApplicantKopfg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ApplicantCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ApplicantKatottg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RequestText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ResponseByPost" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ResponseByEmail" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="BrokRegNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Reason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StopDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetBrokAppPdfReq", propOrder = {
    "appSubType",
    "appName",
    "appDateNum",
    "applicantName",
    "applicantAddress",
    "applicantPhone",
    "applicantEmail",
    "applicantKopfg",
    "applicantCode",
    "applicantKatottg",
    "requestText",
    "responseByPost",
    "responseByEmail",
    "brokRegNum",
    "reason",
    "stopDate"
})
public class GetBrokAppPdfReq
    extends CsnWsRequestArgBase
{

    @XmlElement(name = "AppSubType")
    protected short appSubType;
    @XmlElement(name = "AppName")
    protected String appName;
    @XmlElement(name = "AppDateNum")
    protected String appDateNum;
    @XmlElement(name = "ApplicantName")
    protected String applicantName;
    @XmlElement(name = "ApplicantAddress")
    protected String applicantAddress;
    @XmlElement(name = "ApplicantPhone")
    protected String applicantPhone;
    @XmlElement(name = "ApplicantEmail")
    protected String applicantEmail;
    @XmlElement(name = "ApplicantKopfg")
    protected String applicantKopfg;
    @XmlElement(name = "ApplicantCode")
    protected String applicantCode;
    @XmlElement(name = "ApplicantKatottg")
    protected String applicantKatottg;
    @XmlElement(name = "RequestText")
    protected String requestText;
    @XmlElement(name = "ResponseByPost")
    protected boolean responseByPost;
    @XmlElement(name = "ResponseByEmail")
    protected boolean responseByEmail;
    @XmlElement(name = "BrokRegNum")
    protected String brokRegNum;
    @XmlElement(name = "Reason")
    protected String reason;
    @XmlElement(name = "StopDate")
    protected String stopDate;

    /**
     * Gets the value of the appSubType property.
     * 
     */
    public short getAppSubType() {
        return appSubType;
    }

    /**
     * Sets the value of the appSubType property.
     * 
     */
    public void setAppSubType(short value) {
        this.appSubType = value;
    }

    /**
     * Gets the value of the appName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppName() {
        return appName;
    }

    /**
     * Sets the value of the appName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppName(String value) {
        this.appName = value;
    }

    /**
     * Gets the value of the appDateNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppDateNum() {
        return appDateNum;
    }

    /**
     * Sets the value of the appDateNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppDateNum(String value) {
        this.appDateNum = value;
    }

    /**
     * Gets the value of the applicantName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicantName() {
        return applicantName;
    }

    /**
     * Sets the value of the applicantName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicantName(String value) {
        this.applicantName = value;
    }

    /**
     * Gets the value of the applicantAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicantAddress() {
        return applicantAddress;
    }

    /**
     * Sets the value of the applicantAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicantAddress(String value) {
        this.applicantAddress = value;
    }

    /**
     * Gets the value of the applicantPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicantPhone() {
        return applicantPhone;
    }

    /**
     * Sets the value of the applicantPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicantPhone(String value) {
        this.applicantPhone = value;
    }

    /**
     * Gets the value of the applicantEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicantEmail() {
        return applicantEmail;
    }

    /**
     * Sets the value of the applicantEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicantEmail(String value) {
        this.applicantEmail = value;
    }

    /**
     * Gets the value of the applicantKopfg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicantKopfg() {
        return applicantKopfg;
    }

    /**
     * Sets the value of the applicantKopfg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicantKopfg(String value) {
        this.applicantKopfg = value;
    }

    /**
     * Gets the value of the applicantCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicantCode() {
        return applicantCode;
    }

    /**
     * Sets the value of the applicantCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicantCode(String value) {
        this.applicantCode = value;
    }

    /**
     * Gets the value of the applicantKatottg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicantKatottg() {
        return applicantKatottg;
    }

    /**
     * Sets the value of the applicantKatottg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicantKatottg(String value) {
        this.applicantKatottg = value;
    }

    /**
     * Gets the value of the requestText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestText() {
        return requestText;
    }

    /**
     * Sets the value of the requestText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestText(String value) {
        this.requestText = value;
    }

    /**
     * Gets the value of the responseByPost property.
     * 
     */
    public boolean isResponseByPost() {
        return responseByPost;
    }

    /**
     * Sets the value of the responseByPost property.
     * 
     */
    public void setResponseByPost(boolean value) {
        this.responseByPost = value;
    }

    /**
     * Gets the value of the responseByEmail property.
     * 
     */
    public boolean isResponseByEmail() {
        return responseByEmail;
    }

    /**
     * Sets the value of the responseByEmail property.
     * 
     */
    public void setResponseByEmail(boolean value) {
        this.responseByEmail = value;
    }

    /**
     * Gets the value of the brokRegNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrokRegNum() {
        return brokRegNum;
    }

    /**
     * Sets the value of the brokRegNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrokRegNum(String value) {
        this.brokRegNum = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason(String value) {
        this.reason = value;
    }

    /**
     * Gets the value of the stopDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStopDate() {
        return stopDate;
    }

    /**
     * Sets the value of the stopDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStopDate(String value) {
        this.stopDate = value;
    }

}
