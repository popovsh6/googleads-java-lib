
package com.google.api.ads.dfp.jaxws.v201405;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for performSuggestedAdUnitActionResponse element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="performSuggestedAdUnitActionResponse">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="rval" type="{https://www.google.com/apis/ads/publisher/v201405}SuggestedAdUnitUpdateResult" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/restriction>
 *     &lt;/complexContent>
 *   &lt;/complexType>
 * &lt;/element>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "rval"
})
@XmlRootElement(name = "performSuggestedAdUnitActionResponse")
public class SuggestedAdUnitServiceInterfaceperformSuggestedAdUnitActionResponse {

    protected SuggestedAdUnitUpdateResult rval;

    /**
     * Gets the value of the rval property.
     * 
     * @return
     *     possible object is
     *     {@link SuggestedAdUnitUpdateResult }
     *     
     */
    public SuggestedAdUnitUpdateResult getRval() {
        return rval;
    }

    /**
     * Sets the value of the rval property.
     * 
     * @param value
     *     allowed object is
     *     {@link SuggestedAdUnitUpdateResult }
     *     
     */
    public void setRval(SuggestedAdUnitUpdateResult value) {
        this.rval = value;
    }

}
