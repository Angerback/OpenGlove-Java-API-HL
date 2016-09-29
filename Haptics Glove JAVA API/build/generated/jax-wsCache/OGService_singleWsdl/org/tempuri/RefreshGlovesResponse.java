
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.openglovewcf.ArrayOfGlove;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RefreshGlovesResult" type="{http://schemas.datacontract.org/2004/07/OpenGloveWCF}ArrayOfGlove" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "refreshGlovesResult"
})
@XmlRootElement(name = "RefreshGlovesResponse")
public class RefreshGlovesResponse {

    @XmlElementRef(name = "RefreshGlovesResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfGlove> refreshGlovesResult;

    /**
     * Obtiene el valor de la propiedad refreshGlovesResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGlove }{@code >}
     *     
     */
    public JAXBElement<ArrayOfGlove> getRefreshGlovesResult() {
        return refreshGlovesResult;
    }

    /**
     * Define el valor de la propiedad refreshGlovesResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGlove }{@code >}
     *     
     */
    public void setRefreshGlovesResult(JAXBElement<ArrayOfGlove> value) {
        this.refreshGlovesResult = value;
    }

}
