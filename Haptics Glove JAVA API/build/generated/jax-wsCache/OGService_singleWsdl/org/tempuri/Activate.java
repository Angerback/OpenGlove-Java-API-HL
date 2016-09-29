
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="gloveAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="actuator" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="intensity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
    "gloveAddress",
    "actuator",
    "intensity"
})
@XmlRootElement(name = "Activate")
public class Activate {

    @XmlElementRef(name = "gloveAddress", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> gloveAddress;
    protected Integer actuator;
    protected Integer intensity;

    /**
     * Obtiene el valor de la propiedad gloveAddress.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGloveAddress() {
        return gloveAddress;
    }

    /**
     * Define el valor de la propiedad gloveAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGloveAddress(JAXBElement<String> value) {
        this.gloveAddress = value;
    }

    /**
     * Obtiene el valor de la propiedad actuator.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getActuator() {
        return actuator;
    }

    /**
     * Define el valor de la propiedad actuator.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setActuator(Integer value) {
        this.actuator = value;
    }

    /**
     * Obtiene el valor de la propiedad intensity.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIntensity() {
        return intensity;
    }

    /**
     * Define el valor de la propiedad intensity.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIntensity(Integer value) {
        this.intensity = value;
    }

}
