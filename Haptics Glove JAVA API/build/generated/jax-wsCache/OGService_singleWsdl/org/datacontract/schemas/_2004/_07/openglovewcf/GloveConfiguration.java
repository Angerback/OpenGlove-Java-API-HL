
package org.datacontract.schemas._2004._07.openglovewcf;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfint;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;


/**
 * <p>Clase Java para Glove.Configuration complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Glove.Configuration">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AllowedBaudRates" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint" minOccurs="0"/>
 *         &lt;element name="BaudRate" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="GloveHash" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GloveName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GloveProfile" type="{http://schemas.datacontract.org/2004/07/OpenGloveWCF}Glove.Configuration.Profile" minOccurs="0"/>
 *         &lt;element name="NegativeInit" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="NegativePins" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint" minOccurs="0"/>
 *         &lt;element name="PositiveInit" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="PositivePins" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Glove.Configuration", propOrder = {
    "allowedBaudRates",
    "baudRate",
    "gloveHash",
    "gloveName",
    "gloveProfile",
    "negativeInit",
    "negativePins",
    "positiveInit",
    "positivePins"
})
public class GloveConfiguration {

    @XmlElementRef(name = "AllowedBaudRates", namespace = "http://schemas.datacontract.org/2004/07/OpenGloveWCF", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfint> allowedBaudRates;
    @XmlElement(name = "BaudRate")
    protected Integer baudRate;
    @XmlElementRef(name = "GloveHash", namespace = "http://schemas.datacontract.org/2004/07/OpenGloveWCF", type = JAXBElement.class, required = false)
    protected JAXBElement<String> gloveHash;
    @XmlElementRef(name = "GloveName", namespace = "http://schemas.datacontract.org/2004/07/OpenGloveWCF", type = JAXBElement.class, required = false)
    protected JAXBElement<String> gloveName;
    @XmlElementRef(name = "GloveProfile", namespace = "http://schemas.datacontract.org/2004/07/OpenGloveWCF", type = JAXBElement.class, required = false)
    protected JAXBElement<GloveConfigurationProfile> gloveProfile;
    @XmlElementRef(name = "NegativeInit", namespace = "http://schemas.datacontract.org/2004/07/OpenGloveWCF", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> negativeInit;
    @XmlElementRef(name = "NegativePins", namespace = "http://schemas.datacontract.org/2004/07/OpenGloveWCF", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfint> negativePins;
    @XmlElementRef(name = "PositiveInit", namespace = "http://schemas.datacontract.org/2004/07/OpenGloveWCF", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> positiveInit;
    @XmlElementRef(name = "PositivePins", namespace = "http://schemas.datacontract.org/2004/07/OpenGloveWCF", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfint> positivePins;

    /**
     * Obtiene el valor de la propiedad allowedBaudRates.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public JAXBElement<ArrayOfint> getAllowedBaudRates() {
        return allowedBaudRates;
    }

    /**
     * Define el valor de la propiedad allowedBaudRates.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public void setAllowedBaudRates(JAXBElement<ArrayOfint> value) {
        this.allowedBaudRates = value;
    }

    /**
     * Obtiene el valor de la propiedad baudRate.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBaudRate() {
        return baudRate;
    }

    /**
     * Define el valor de la propiedad baudRate.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBaudRate(Integer value) {
        this.baudRate = value;
    }

    /**
     * Obtiene el valor de la propiedad gloveHash.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGloveHash() {
        return gloveHash;
    }

    /**
     * Define el valor de la propiedad gloveHash.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGloveHash(JAXBElement<String> value) {
        this.gloveHash = value;
    }

    /**
     * Obtiene el valor de la propiedad gloveName.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGloveName() {
        return gloveName;
    }

    /**
     * Define el valor de la propiedad gloveName.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGloveName(JAXBElement<String> value) {
        this.gloveName = value;
    }

    /**
     * Obtiene el valor de la propiedad gloveProfile.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GloveConfigurationProfile }{@code >}
     *     
     */
    public JAXBElement<GloveConfigurationProfile> getGloveProfile() {
        return gloveProfile;
    }

    /**
     * Define el valor de la propiedad gloveProfile.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GloveConfigurationProfile }{@code >}
     *     
     */
    public void setGloveProfile(JAXBElement<GloveConfigurationProfile> value) {
        this.gloveProfile = value;
    }

    /**
     * Obtiene el valor de la propiedad negativeInit.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getNegativeInit() {
        return negativeInit;
    }

    /**
     * Define el valor de la propiedad negativeInit.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setNegativeInit(JAXBElement<ArrayOfstring> value) {
        this.negativeInit = value;
    }

    /**
     * Obtiene el valor de la propiedad negativePins.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public JAXBElement<ArrayOfint> getNegativePins() {
        return negativePins;
    }

    /**
     * Define el valor de la propiedad negativePins.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public void setNegativePins(JAXBElement<ArrayOfint> value) {
        this.negativePins = value;
    }

    /**
     * Obtiene el valor de la propiedad positiveInit.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getPositiveInit() {
        return positiveInit;
    }

    /**
     * Define el valor de la propiedad positiveInit.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setPositiveInit(JAXBElement<ArrayOfstring> value) {
        this.positiveInit = value;
    }

    /**
     * Obtiene el valor de la propiedad positivePins.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public JAXBElement<ArrayOfint> getPositivePins() {
        return positivePins;
    }

    /**
     * Define el valor de la propiedad positivePins.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public void setPositivePins(JAXBElement<ArrayOfint> value) {
        this.positivePins = value;
    }

}
