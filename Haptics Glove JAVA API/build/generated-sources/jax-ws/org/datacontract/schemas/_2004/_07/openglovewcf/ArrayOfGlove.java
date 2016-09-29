
package org.datacontract.schemas._2004._07.openglovewcf;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfGlove complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfGlove">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Glove" type="{http://schemas.datacontract.org/2004/07/OpenGloveWCF}Glove" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfGlove", propOrder = {
    "glove"
})
public class ArrayOfGlove {

    @XmlElement(name = "Glove", nillable = true)
    protected List<Glove> glove;

    /**
     * Gets the value of the glove property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the glove property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGlove().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Glove }
     * 
     * 
     */
    public List<Glove> getGlove() {
        if (glove == null) {
            glove = new ArrayList<Glove>();
        }
        return this.glove;
    }

}
