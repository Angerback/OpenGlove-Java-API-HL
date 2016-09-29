
package org.datacontract.schemas._2004._07.openglovewcf;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Glove complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Glove">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BluetoothAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Connected" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="GloveConfiguration" type="{http://schemas.datacontract.org/2004/07/OpenGloveWCF}Glove.Configuration" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Port" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Side" type="{http://schemas.datacontract.org/2004/07/OpenGloveWCF}Side" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Glove", propOrder = {
    "bluetoothAddress",
    "connected",
    "gloveConfiguration",
    "name",
    "port",
    "side"
})
public class Glove {

    @XmlElementRef(name = "BluetoothAddress", namespace = "http://schemas.datacontract.org/2004/07/OpenGloveWCF", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bluetoothAddress;
    @XmlElement(name = "Connected")
    protected Boolean connected;
    @XmlElementRef(name = "GloveConfiguration", namespace = "http://schemas.datacontract.org/2004/07/OpenGloveWCF", type = JAXBElement.class, required = false)
    protected JAXBElement<GloveConfiguration> gloveConfiguration;
    @XmlElementRef(name = "Name", namespace = "http://schemas.datacontract.org/2004/07/OpenGloveWCF", type = JAXBElement.class, required = false)
    protected JAXBElement<String> name;
    @XmlElementRef(name = "Port", namespace = "http://schemas.datacontract.org/2004/07/OpenGloveWCF", type = JAXBElement.class, required = false)
    protected JAXBElement<String> port;
    @XmlElement(name = "Side")
    protected Side side;

    /**
     * Obtiene el valor de la propiedad bluetoothAddress.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBluetoothAddress() {
        return bluetoothAddress;
    }

    /**
     * Define el valor de la propiedad bluetoothAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBluetoothAddress(JAXBElement<String> value) {
        this.bluetoothAddress = value;
    }

    /**
     * Obtiene el valor de la propiedad connected.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConnected() {
        return connected;
    }

    /**
     * Define el valor de la propiedad connected.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConnected(Boolean value) {
        this.connected = value;
    }

    /**
     * Obtiene el valor de la propiedad gloveConfiguration.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GloveConfiguration }{@code >}
     *     
     */
    public JAXBElement<GloveConfiguration> getGloveConfiguration() {
        return gloveConfiguration;
    }

    /**
     * Define el valor de la propiedad gloveConfiguration.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GloveConfiguration }{@code >}
     *     
     */
    public void setGloveConfiguration(JAXBElement<GloveConfiguration> value) {
        this.gloveConfiguration = value;
    }

    /**
     * Obtiene el valor de la propiedad name.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getName() {
        return name;
    }

    /**
     * Define el valor de la propiedad name.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setName(JAXBElement<String> value) {
        this.name = value;
    }

    /**
     * Obtiene el valor de la propiedad port.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPort() {
        return port;
    }

    /**
     * Define el valor de la propiedad port.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPort(JAXBElement<String> value) {
        this.port = value;
    }

    /**
     * Obtiene el valor de la propiedad side.
     * 
     * @return
     *     possible object is
     *     {@link Side }
     *     
     */
    public Side getSide() {
        return side;
    }

    /**
     * Define el valor de la propiedad side.
     * 
     * @param value
     *     allowed object is
     *     {@link Side }
     *     
     */
    public void setSide(Side value) {
        this.side = value;
    }

}
