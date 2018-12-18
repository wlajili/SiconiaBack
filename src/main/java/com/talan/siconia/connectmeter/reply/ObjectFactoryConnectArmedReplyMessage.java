//
// Ce fichier a �t� g�n�r� par l'impl�mentation de r�f�rence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apport�e � ce fichier sera perdue lors de la recompilation du sch�ma source. 
// G�n�r� le : 2018.11.21 � 05:12:19 PM GMT+01:00 
//


package com.talan.siconia.connectmeter.reply;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the xsd package. 
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
public class ObjectFactoryConnectArmedReplyMessage {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: xsd
     * 
     */
    public ObjectFactoryConnectArmedReplyMessage() {
    }

    /**
     * Create an instance of {@link MeterAssetConnectArmedReplyMessage }
     * 
     */
    public MeterAssetConnectArmedReplyMessage createMeterAssetConnectArmedReplyMessage() {
        return new MeterAssetConnectArmedReplyMessage();
    }

    /**
     * Create an instance of {@link MeterAssetConnectArmedReplyMessage.Header }
     * 
     */
    public MeterAssetConnectArmedReplyMessage.Header createMeterAssetConnectArmedReplyMessageHeader() {
        return new MeterAssetConnectArmedReplyMessage.Header();
    }

    /**
     * Create an instance of {@link MeterAssetConnectArmedReplyMessage.Reply }
     * 
     */
    public MeterAssetConnectArmedReplyMessage.Reply createMeterAssetConnectArmedReplyMessageReply() {
        return new MeterAssetConnectArmedReplyMessage.Reply();
    }

}
