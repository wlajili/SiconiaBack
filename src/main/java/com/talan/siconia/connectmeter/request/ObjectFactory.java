//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2018.11.22 à 10:57:54 AM GMT+01:00 
//


package com.talan.siconia.connectmeter.request;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.talan.siconia.connectmeter.request package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.talan.siconia.connectmeter.request
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MeterAssetConnectArmedRequestMessage }
     * 
     */
    public MeterAssetConnectArmedRequestMessage createMeterAssetConnectArmedRequestMessage() {
        return new MeterAssetConnectArmedRequestMessage();
    }

    /**
     * Create an instance of {@link MeterAssetConnectArmedRequestMessage.Payload }
     * 
     */
    public MeterAssetConnectArmedRequestMessage.Payload createMeterAssetConnectArmedRequestMessagePayload() {
        return new MeterAssetConnectArmedRequestMessage.Payload();
    }

    /**
     * Create an instance of {@link MeterAssetConnectArmedRequestMessage.Header }
     * 
     */
    public MeterAssetConnectArmedRequestMessage.Header createMeterAssetConnectArmedRequestMessageHeader() {
        return new MeterAssetConnectArmedRequestMessage.Header();
    }

    /**
     * Create an instance of {@link MeterAssetConnectArmedRequestMessage.Payload.MeterAsset }
     * 
     */
    public MeterAssetConnectArmedRequestMessage.Payload.MeterAsset createMeterAssetConnectArmedRequestMessagePayloadMeterAsset() {
        return new MeterAssetConnectArmedRequestMessage.Payload.MeterAsset();
    }

}
