
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfint;
import org.datacontract.schemas._2004._07.openglovewcf.ArrayOfGlove;
import org.datacontract.schemas._2004._07.openglovewcf.Glove;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.tempuri package. 
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

    private final static QName _ActivateManyActuators_QNAME = new QName("http://tempuri.org/", "actuators");
    private final static QName _ActivateManyGloveAddress_QNAME = new QName("http://tempuri.org/", "gloveAddress");
    private final static QName _ActivateManyIntensityList_QNAME = new QName("http://tempuri.org/", "intensityList");
    private final static QName _GetGlovesResponseGetGlovesResult_QNAME = new QName("http://tempuri.org/", "GetGlovesResult");
    private final static QName _SaveGloveGlove_QNAME = new QName("http://tempuri.org/", "glove");
    private final static QName _RefreshGlovesResponseRefreshGlovesResult_QNAME = new QName("http://tempuri.org/", "RefreshGlovesResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.tempuri
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetGloves }
     * 
     */
    public GetGloves createGetGloves() {
        return new GetGloves();
    }

    /**
     * Create an instance of {@link ActivateMany }
     * 
     */
    public ActivateMany createActivateMany() {
        return new ActivateMany();
    }

    /**
     * Create an instance of {@link SaveGloveResponse }
     * 
     */
    public SaveGloveResponse createSaveGloveResponse() {
        return new SaveGloveResponse();
    }

    /**
     * Create an instance of {@link ConnectResponse }
     * 
     */
    public ConnectResponse createConnectResponse() {
        return new ConnectResponse();
    }

    /**
     * Create an instance of {@link Connect }
     * 
     */
    public Connect createConnect() {
        return new Connect();
    }

    /**
     * Create an instance of {@link GetGlovesResponse }
     * 
     */
    public GetGlovesResponse createGetGlovesResponse() {
        return new GetGlovesResponse();
    }

    /**
     * Create an instance of {@link RefreshGloves }
     * 
     */
    public RefreshGloves createRefreshGloves() {
        return new RefreshGloves();
    }

    /**
     * Create an instance of {@link SaveGlove }
     * 
     */
    public SaveGlove createSaveGlove() {
        return new SaveGlove();
    }

    /**
     * Create an instance of {@link RefreshGlovesResponse }
     * 
     */
    public RefreshGlovesResponse createRefreshGlovesResponse() {
        return new RefreshGlovesResponse();
    }

    /**
     * Create an instance of {@link ActivateManyResponse }
     * 
     */
    public ActivateManyResponse createActivateManyResponse() {
        return new ActivateManyResponse();
    }

    /**
     * Create an instance of {@link Disconnect }
     * 
     */
    public Disconnect createDisconnect() {
        return new Disconnect();
    }

    /**
     * Create an instance of {@link DisconnectResponse }
     * 
     */
    public DisconnectResponse createDisconnectResponse() {
        return new DisconnectResponse();
    }

    /**
     * Create an instance of {@link Activate }
     * 
     */
    public Activate createActivate() {
        return new Activate();
    }

    /**
     * Create an instance of {@link ActivateResponse }
     * 
     */
    public ActivateResponse createActivateResponse() {
        return new ActivateResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "actuators", scope = ActivateMany.class)
    public JAXBElement<ArrayOfint> createActivateManyActuators(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_ActivateManyActuators_QNAME, ArrayOfint.class, ActivateMany.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "gloveAddress", scope = ActivateMany.class)
    public JAXBElement<String> createActivateManyGloveAddress(String value) {
        return new JAXBElement<String>(_ActivateManyGloveAddress_QNAME, String.class, ActivateMany.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "intensityList", scope = ActivateMany.class)
    public JAXBElement<ArrayOfint> createActivateManyIntensityList(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_ActivateManyIntensityList_QNAME, ArrayOfint.class, ActivateMany.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGlove }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetGlovesResult", scope = GetGlovesResponse.class)
    public JAXBElement<ArrayOfGlove> createGetGlovesResponseGetGlovesResult(ArrayOfGlove value) {
        return new JAXBElement<ArrayOfGlove>(_GetGlovesResponseGetGlovesResult_QNAME, ArrayOfGlove.class, GetGlovesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "gloveAddress", scope = Disconnect.class)
    public JAXBElement<String> createDisconnectGloveAddress(String value) {
        return new JAXBElement<String>(_ActivateManyGloveAddress_QNAME, String.class, Disconnect.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "gloveAddress", scope = Activate.class)
    public JAXBElement<String> createActivateGloveAddress(String value) {
        return new JAXBElement<String>(_ActivateManyGloveAddress_QNAME, String.class, Activate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Glove }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "glove", scope = SaveGlove.class)
    public JAXBElement<Glove> createSaveGloveGlove(Glove value) {
        return new JAXBElement<Glove>(_SaveGloveGlove_QNAME, Glove.class, SaveGlove.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGlove }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RefreshGlovesResult", scope = RefreshGlovesResponse.class)
    public JAXBElement<ArrayOfGlove> createRefreshGlovesResponseRefreshGlovesResult(ArrayOfGlove value) {
        return new JAXBElement<ArrayOfGlove>(_RefreshGlovesResponseRefreshGlovesResult_QNAME, ArrayOfGlove.class, RefreshGlovesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "gloveAddress", scope = Connect.class)
    public JAXBElement<String> createConnectGloveAddress(String value) {
        return new JAXBElement<String>(_ActivateManyGloveAddress_QNAME, String.class, Connect.class, value);
    }

}
