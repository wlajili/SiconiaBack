//
// Ce fichier a �t� g�n�r� par l'impl�mentation de r�f�rence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apport�e � ce fichier sera perdue lors de la recompilation du sch�ma source. 
// G�n�r� le : 2018.11.21 � 05:12:19 PM GMT+01:00 
//


package com.talan.siconia.connectmeter.reply;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="header">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="verb" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="noun" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="revision" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="dateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="source" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="reply">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="replyCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="correlationId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "header",
    "reply"
})
@XmlRootElement(name = "MeterAssetConnectArmedReplyMessage")
public class MeterAssetConnectArmedReplyMessage {

    @XmlElement(required = true)
    protected MeterAssetConnectArmedReplyMessage.Header header;
    @XmlElement(required = true)
    protected MeterAssetConnectArmedReplyMessage.Reply reply;

    /**
     * Obtient la valeur de la propri�t� header.
     * 
     * @return
     *     possible object is
     *     {@link MeterAssetConnectArmedReplyMessage.Header }
     *     
     */
    public MeterAssetConnectArmedReplyMessage.Header getHeader() {
        return header;
    }

    /**
     * D�finit la valeur de la propri�t� header.
     * 
     * @param value
     *     allowed object is
     *     {@link MeterAssetConnectArmedReplyMessage.Header }
     *     
     */
    public void setHeader(MeterAssetConnectArmedReplyMessage.Header value) {
        this.header = value;
    }

    /**
     * Obtient la valeur de la propri�t� reply.
     * 
     * @return
     *     possible object is
     *     {@link MeterAssetConnectArmedReplyMessage.Reply }
     *     
     */
    public MeterAssetConnectArmedReplyMessage.Reply getReply() {
        return reply;
    }

    /**
     * D�finit la valeur de la propri�t� reply.
     * 
     * @param value
     *     allowed object is
     *     {@link MeterAssetConnectArmedReplyMessage.Reply }
     *     
     */
    public void setReply(MeterAssetConnectArmedReplyMessage.Reply value) {
        this.reply = value;
    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="verb" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="noun" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="revision" type="{http://www.w3.org/2001/XMLSchema}String"/>
     *         &lt;element name="dateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *         &lt;element name="source" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "verb",
        "noun",
        "revision",
        "dateTime",
        "source"
    })
    public static class Header {

        @XmlElement(required = true)
        protected String verb;
        @XmlElement(required = true)
        protected String noun;
        protected String revision;
        @XmlElement(required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar dateTime;
        @XmlElement(required = true)
        protected String source;

        /**
         * Obtient la valeur de la propri�t� verb.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVerb() {
            return verb;
        }

        /**
         * D�finit la valeur de la propri�t� verb.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVerb(String value) {
            this.verb = value;
        }

        /**
         * Obtient la valeur de la propri�t� noun.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNoun() {
            return noun;
        }

        /**
         * D�finit la valeur de la propri�t� noun.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNoun(String value) {
            this.noun = value;
        }

        /**
         * Obtient la valeur de la propri�t� revision.
         * 
         */
        public String getRevision() {
            return revision;
        }

        /**
         * D�finit la valeur de la propri�t� revision.
         * 
         */
        public void setRevision(String value) {
            this.revision = value;
        }

        /**
         * Obtient la valeur de la propri�t� dateTime.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDateTime() {
            return dateTime;
        }

        /**
         * D�finit la valeur de la propri�t� dateTime.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDateTime(XMLGregorianCalendar value) {
            this.dateTime = value;
        }

        /**
         * Obtient la valeur de la propri�t� source.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSource() {
            return source;
        }

        /**
         * D�finit la valeur de la propri�t� source.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSource(String value) {
            this.source = value;
        }

    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="replyCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="correlationId" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "replyCode",
        "correlationId"
    })
    public static class Reply {

        protected String replyCode;
        protected String correlationId;

        /**
         * Obtient la valeur de la propri�t� replyCode.
         * 
         */
        public String getReplyCode() {
            return replyCode;
        }

        /**
         * D�finit la valeur de la propri�t� replyCode.
         * 
         */
        public void setReplyCode(String value) {
            this.replyCode = value;
        }

        /**
         * Obtient la valeur de la propri�t� correlationId.
         * 
         */
        public String getCorrelationId() {
            return correlationId;
        }

        /**
         * D�finit la valeur de la propri�t� correlationId.
         * 
         */
        public void setCorrelationId(String value) {
            this.correlationId = value;
        }

    }

}
