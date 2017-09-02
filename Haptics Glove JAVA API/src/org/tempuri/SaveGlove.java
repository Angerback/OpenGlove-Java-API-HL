
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.openglovewcf.Glove;


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
 *         &lt;element name="glove" type="{http://schemas.datacontract.org/2004/07/OpenGloveWCF}Glove" minOccurs="0"/>
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
    "glove"
})
@XmlRootElement(name = "SaveGlove")
public class SaveGlove {

    @XmlElementRef(name = "glove", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<Glove> glove;

    /**
     * Obtiene el valor de la propiedad glove.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Glove }{@code >}
     *     
     */
    public JAXBElement<Glove> getGlove() {
        return glove;
    }

    /**
     * Define el valor de la propiedad glove.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Glove }{@code >}
     *     
     */
    public void setGlove(JAXBElement<Glove> value) {
        this.glove = value;
    }

}
