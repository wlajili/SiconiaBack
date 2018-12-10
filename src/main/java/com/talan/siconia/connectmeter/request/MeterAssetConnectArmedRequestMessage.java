//
// Ce fichier a �t� g�n�r� par l'impl�mentation de r�f�rence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apport�e � ce fichier sera perdue lors de la recompilation du sch�ma source. 
// G�n�r� le : 2018.11.22 � 10:57:54 AM GMT+01:00 
//


package com.talan.siconia.connectmeter.request;

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
 *                   &lt;element name="revision" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="dateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="source" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="messageID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="payload">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="meterAsset">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="mRID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="idType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="pathName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="modelNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="serialNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="requestPriority" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="executeStartTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="executeExpireTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
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
    "payload"
})
@XmlRootElement(name = "MeterAssetConnectArmedRequestMessage")
public class MeterAssetConnectArmedRequestMessage {

    @XmlElement(required = true)
    protected MeterAssetConnectArmedRequestMessage.Header header;
    @XmlElement(required = true)
    protected MeterAssetConnectArmedRequestMessage.Payload payload;

    /**
     * Obtient la valeur de la propri�t� header.
     * 
     * @return
     *     possible object is
     *     {@link MeterAssetConnectArmedRequestMessage.Header }
     *     
     */
    public MeterAssetConnectArmedRequestMessage.Header getHeader() {
        return header;
    }

    /**
     * D�finit la valeur de la propri�t� header.
     * 
     * @param value
     *     allowed object is
     *     {@link MeterAssetConnectArmedRequestMessage.Header }
     *     
     */
    public void setHeader(MeterAssetConnectArmedRequestMessage.Header value) {
        this.header = value;
    }

    /**
     * Obtient la valeur de la propri�t� payload.
     * 
     * @return
     *     possible object is
     *     {@link MeterAssetConnectArmedRequestMessage.Payload }
     *     
     */
    public MeterAssetConnectArmedRequestMessage.Payload getPayload() {
        return payload;
    }

    /**
     * D�finit la valeur de la propri�t� payload.
     * 
     * @param value
     *     allowed object is
     *     {@link MeterAssetConnectArmedRequestMessage.Payload }
     *     
     */
    public void setPayload(MeterAssetConnectArmedRequestMessage.Payload value) {
        this.payload = value;
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
     *         &lt;element name="revision" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="dateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *         &lt;element name="source" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="messageID" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
        "source",
        "messageID"
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
        protected int messageID;

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

        /**
         * Obtient la valeur de la propri�t� messageID.
         * 
         */
        public int getMessageID() {
            return messageID;
        }

        /**
         * D�finit la valeur de la propri�t� messageID.
         * 
         */
        public void setMessageID(int value) {
            this.messageID = value;
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
     *         &lt;element name="meterAsset">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="mRID" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="idType" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="pathName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="modelNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="serialNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="requestPriority" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="executeStartTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *         &lt;element name="executeExpireTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
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
        "meterAsset",
        "requestPriority",
        "executeStartTime",
        "executeExpireTime"
    })
    public static class Payload {

        @XmlElement(required = true)
        protected MeterAssetConnectArmedRequestMessage.Payload.MeterAsset meterAsset;
        protected String requestPriority;
        @XmlElement(required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar executeStartTime;
        @XmlElement(required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar executeExpireTime;

        /**
         * Obtient la valeur de la propri�t� meterAsset.
         * 
         * @return
         *     possible object is
         *     {@link MeterAssetConnectArmedRequestMessage.Payload.MeterAsset }
         *     
         */
        public MeterAssetConnectArmedRequestMessage.Payload.MeterAsset getMeterAsset() {
            return meterAsset;
        }

        /**
         * D�finit la valeur de la propri�t� meterAsset.
         * 
         * @param value
         *     allowed object is
         *     {@link MeterAssetConnectArmedRequestMessage.Payload.MeterAsset }
         *     
         */
        public void setMeterAsset(MeterAssetConnectArmedRequestMessage.Payload.MeterAsset value) {
            this.meterAsset = value;
        }

        /**
         * Obtient la valeur de la propri�t� requestPriority.
         * 
         */
        public String getRequestPriority() {
            return requestPriority;
        }

        /**
         * D�finit la valeur de la propri�t� requestPriority.
         * 
         */
        public void setRequestPriority(String value) {
            this.requestPriority = value;
        }

        /**
         * Obtient la valeur de la propri�t� executeStartTime.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getExecuteStartTime() {
            return executeStartTime;
        }

        /**
         * D�finit la valeur de la propri�t� executeStartTime.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setExecuteStartTime(XMLGregorianCalendar value) {
            this.executeStartTime = value;
        }

        /**
         * Obtient la valeur de la propri�t� executeExpireTime.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getExecuteExpireTime() {
            return executeExpireTime;
        }

        /**
         * D�finit la valeur de la propri�t� executeExpireTime.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setExecuteExpireTime(XMLGregorianCalendar value) {
            this.executeExpireTime = value;
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
         *         &lt;element name="mRID" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="idType" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="pathName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="modelNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="serialNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "mrid",
            "idType",
            "pathName",
            "modelNumber",
            "serialNumber"
        })
        public static class MeterAsset {

            @XmlElement(name = "mRID", required = true)
            protected String mrid;
            @XmlElement(required = true)
            protected String idType;
            @XmlElement(required = true)
            protected String pathName;
            @XmlElement(required = true)
            protected String modelNumber;
            @XmlElement(required = true)
            protected String serialNumber;

            /**
             * Obtient la valeur de la propri�t� mrid.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMRID() {
                return mrid;
            }

            /**
             * D�finit la valeur de la propri�t� mrid.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMRID(String value) {
                this.mrid = value;
            }

            /**
             * Obtient la valeur de la propri�t� idType.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIdType() {
                return idType;
            }

            /**
             * D�finit la valeur de la propri�t� idType.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIdType(String value) {
                this.idType = value;
            }

            /**
             * Obtient la valeur de la propri�t� pathName.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPathName() {
                return pathName;
            }

            /**
             * D�finit la valeur de la propri�t� pathName.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPathName(String value) {
                this.pathName = value;
            }

            /**
             * Obtient la valeur de la propri�t� modelNumber.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getModelNumber() {
                return modelNumber;
            }

            /**
             * D�finit la valeur de la propri�t� modelNumber.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setModelNumber(String value) {
                this.modelNumber = value;
            }

            /**
             * Obtient la valeur de la propri�t� serialNumber.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSerialNumber() {
                return serialNumber;
            }

            /**
             * D�finit la valeur de la propri�t� serialNumber.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSerialNumber(String value) {
                this.serialNumber = value;
            }

        }

    }

}
