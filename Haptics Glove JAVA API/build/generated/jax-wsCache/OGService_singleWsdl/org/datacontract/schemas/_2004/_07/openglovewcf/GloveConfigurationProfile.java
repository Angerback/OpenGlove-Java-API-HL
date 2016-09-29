
package org.datacontract.schemas._2004._07.openglovewcf;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringstring;


/**
 * <p>Clase Java para Glove.Configuration.Profile complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Glove.Configuration.Profile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AreaCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="GloveHash" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Mappings" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOfstringstring" minOccurs="0"/>
 *         &lt;element name="ProfileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Glove.Configuration.Profile", propOrder = {
    "areaCount",
    "gloveHash",
    "mappings",
    "profileName"
})
public class GloveConfigurationProfile {

    @XmlElement(name = "AreaCount")
    protected Integer areaCount;
    @XmlElementRef(name = "GloveHash", namespace = "http://schemas.datacontract.org/2004/07/OpenGloveWCF", type = JAXBElement.class, required = false)
    protected JAXBElement<String> gloveHash;
    @XmlElementRef(name = "Mappings", namespace = "http://schemas.datacontract.org/2004/07/OpenGloveWCF", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfKeyValueOfstringstring> mappings;
    @XmlElementRef(name = "ProfileName", namespace = "http://schemas.datacontract.org/2004/07/OpenGloveWCF", type = JAXBElement.class, required = false)
    protected JAXBElement<String> profileName;

    /**
     * Obtiene el valor de la propiedad areaCount.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAreaCount() {
        return areaCount;
    }

    /**
     * Define el valor de la propiedad areaCount.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAreaCount(Integer value) {
        this.areaCount = value;
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
     * Obtiene el valor de la propiedad mappings.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfKeyValueOfstringstring> getMappings() {
        return mappings;
    }

    /**
     * Define el valor de la propiedad mappings.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringstring }{@code >}
     *     
     */
    public void setMappings(JAXBElement<ArrayOfKeyValueOfstringstring> value) {
        this.mappings = value;
    }

    /**
     * Obtiene el valor de la propiedad profileName.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProfileName() {
        return profileName;
    }

    /**
     * Define el valor de la propiedad profileName.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProfileName(JAXBElement<String> value) {
        this.profileName = value;
    }

}
