
package org.datacontract.schemas._2004._07.openglovewcf;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Side.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="Side">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Right"/>
 *     &lt;enumeration value="Left"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Side")
@XmlEnum
public enum Side {

    @XmlEnumValue("Right")
    RIGHT("Right"),
    @XmlEnumValue("Left")
    LEFT("Left");
    private final String value;

    Side(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Side fromValue(String v) {
        for (Side c: Side.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
