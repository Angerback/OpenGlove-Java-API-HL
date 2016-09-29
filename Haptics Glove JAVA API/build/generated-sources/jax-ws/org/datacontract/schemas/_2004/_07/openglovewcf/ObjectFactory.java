
package org.datacontract.schemas._2004._07.openglovewcf;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringstring;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfint;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.openglovewcf package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Side_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenGloveWCF", "Side");
    private final static QName _GloveConfiguration_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenGloveWCF", "Glove.Configuration");
    private final static QName _ArrayOfGlove_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenGloveWCF", "ArrayOfGlove");
    private final static QName _GloveConfigurationProfile_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenGloveWCF", "Glove.Configuration.Profile");
    private final static QName _Glove_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenGloveWCF", "Glove");
    private final static QName _GloveConfigurationProfileMappings_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenGloveWCF", "Mappings");
    private final static QName _GloveConfigurationProfileGloveHash_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenGloveWCF", "GloveHash");
    private final static QName _GloveConfigurationProfileProfileName_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenGloveWCF", "ProfileName");
    private final static QName _GlovePort_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenGloveWCF", "Port");
    private final static QName _GloveBluetoothAddress_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenGloveWCF", "BluetoothAddress");
    private final static QName _GloveName_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenGloveWCF", "Name");
    private final static QName _GloveGloveConfiguration_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenGloveWCF", "GloveConfiguration");
    private final static QName _GloveConfigurationAllowedBaudRates_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenGloveWCF", "AllowedBaudRates");
    private final static QName _GloveConfigurationPositivePins_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenGloveWCF", "PositivePins");
    private final static QName _GloveConfigurationGloveProfile_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenGloveWCF", "GloveProfile");
    private final static QName _GloveConfigurationNegativePins_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenGloveWCF", "NegativePins");
    private final static QName _GloveConfigurationNegativeInit_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenGloveWCF", "NegativeInit");
    private final static QName _GloveConfigurationPositiveInit_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenGloveWCF", "PositiveInit");
    private final static QName _GloveConfigurationGloveName_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenGloveWCF", "GloveName");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.openglovewcf
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ArrayOfGlove }
     * 
     */
    public ArrayOfGlove createArrayOfGlove() {
        return new ArrayOfGlove();
    }

    /**
     * Create an instance of {@link GloveConfigurationProfile }
     * 
     */
    public GloveConfigurationProfile createGloveConfigurationProfile() {
        return new GloveConfigurationProfile();
    }

    /**
     * Create an instance of {@link Glove }
     * 
     */
    public Glove createGlove() {
        return new Glove();
    }

    /**
     * Create an instance of {@link GloveConfiguration }
     * 
     */
    public GloveConfiguration createGloveConfiguration() {
        return new GloveConfiguration();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Side }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenGloveWCF", name = "Side")
    public JAXBElement<Side> createSide(Side value) {
        return new JAXBElement<Side>(_Side_QNAME, Side.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GloveConfiguration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenGloveWCF", name = "Glove.Configuration")
    public JAXBElement<GloveConfiguration> createGloveConfiguration(GloveConfiguration value) {
        return new JAXBElement<GloveConfiguration>(_GloveConfiguration_QNAME, GloveConfiguration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGlove }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenGloveWCF", name = "ArrayOfGlove")
    public JAXBElement<ArrayOfGlove> createArrayOfGlove(ArrayOfGlove value) {
        return new JAXBElement<ArrayOfGlove>(_ArrayOfGlove_QNAME, ArrayOfGlove.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GloveConfigurationProfile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenGloveWCF", name = "Glove.Configuration.Profile")
    public JAXBElement<GloveConfigurationProfile> createGloveConfigurationProfile(GloveConfigurationProfile value) {
        return new JAXBElement<GloveConfigurationProfile>(_GloveConfigurationProfile_QNAME, GloveConfigurationProfile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Glove }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenGloveWCF", name = "Glove")
    public JAXBElement<Glove> createGlove(Glove value) {
        return new JAXBElement<Glove>(_Glove_QNAME, Glove.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenGloveWCF", name = "Mappings", scope = GloveConfigurationProfile.class)
    public JAXBElement<ArrayOfKeyValueOfstringstring> createGloveConfigurationProfileMappings(ArrayOfKeyValueOfstringstring value) {
        return new JAXBElement<ArrayOfKeyValueOfstringstring>(_GloveConfigurationProfileMappings_QNAME, ArrayOfKeyValueOfstringstring.class, GloveConfigurationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenGloveWCF", name = "GloveHash", scope = GloveConfigurationProfile.class)
    public JAXBElement<String> createGloveConfigurationProfileGloveHash(String value) {
        return new JAXBElement<String>(_GloveConfigurationProfileGloveHash_QNAME, String.class, GloveConfigurationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenGloveWCF", name = "ProfileName", scope = GloveConfigurationProfile.class)
    public JAXBElement<String> createGloveConfigurationProfileProfileName(String value) {
        return new JAXBElement<String>(_GloveConfigurationProfileProfileName_QNAME, String.class, GloveConfigurationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenGloveWCF", name = "Port", scope = Glove.class)
    public JAXBElement<String> createGlovePort(String value) {
        return new JAXBElement<String>(_GlovePort_QNAME, String.class, Glove.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenGloveWCF", name = "BluetoothAddress", scope = Glove.class)
    public JAXBElement<String> createGloveBluetoothAddress(String value) {
        return new JAXBElement<String>(_GloveBluetoothAddress_QNAME, String.class, Glove.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenGloveWCF", name = "Name", scope = Glove.class)
    public JAXBElement<String> createGloveName(String value) {
        return new JAXBElement<String>(_GloveName_QNAME, String.class, Glove.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GloveConfiguration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenGloveWCF", name = "GloveConfiguration", scope = Glove.class)
    public JAXBElement<GloveConfiguration> createGloveGloveConfiguration(GloveConfiguration value) {
        return new JAXBElement<GloveConfiguration>(_GloveGloveConfiguration_QNAME, GloveConfiguration.class, Glove.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenGloveWCF", name = "AllowedBaudRates", scope = GloveConfiguration.class)
    public JAXBElement<ArrayOfint> createGloveConfigurationAllowedBaudRates(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_GloveConfigurationAllowedBaudRates_QNAME, ArrayOfint.class, GloveConfiguration.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenGloveWCF", name = "PositivePins", scope = GloveConfiguration.class)
    public JAXBElement<ArrayOfint> createGloveConfigurationPositivePins(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_GloveConfigurationPositivePins_QNAME, ArrayOfint.class, GloveConfiguration.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GloveConfigurationProfile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenGloveWCF", name = "GloveProfile", scope = GloveConfiguration.class)
    public JAXBElement<GloveConfigurationProfile> createGloveConfigurationGloveProfile(GloveConfigurationProfile value) {
        return new JAXBElement<GloveConfigurationProfile>(_GloveConfigurationGloveProfile_QNAME, GloveConfigurationProfile.class, GloveConfiguration.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenGloveWCF", name = "NegativePins", scope = GloveConfiguration.class)
    public JAXBElement<ArrayOfint> createGloveConfigurationNegativePins(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_GloveConfigurationNegativePins_QNAME, ArrayOfint.class, GloveConfiguration.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenGloveWCF", name = "NegativeInit", scope = GloveConfiguration.class)
    public JAXBElement<ArrayOfstring> createGloveConfigurationNegativeInit(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_GloveConfigurationNegativeInit_QNAME, ArrayOfstring.class, GloveConfiguration.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenGloveWCF", name = "GloveHash", scope = GloveConfiguration.class)
    public JAXBElement<String> createGloveConfigurationGloveHash(String value) {
        return new JAXBElement<String>(_GloveConfigurationProfileGloveHash_QNAME, String.class, GloveConfiguration.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenGloveWCF", name = "PositiveInit", scope = GloveConfiguration.class)
    public JAXBElement<ArrayOfstring> createGloveConfigurationPositiveInit(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_GloveConfigurationPositiveInit_QNAME, ArrayOfstring.class, GloveConfiguration.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenGloveWCF", name = "GloveName", scope = GloveConfiguration.class)
    public JAXBElement<String> createGloveConfigurationGloveName(String value) {
        return new JAXBElement<String>(_GloveConfigurationGloveName_QNAME, String.class, GloveConfiguration.class, value);
    }

}
