//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.10.02 at 09:10:35 AM CEST 
//


package io.cloudtrust.keycloak.liquibaseAdapter.pojo.liquibase;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="column" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="index" type="{http://www.liquibase.org/xml/ns/dbchangelog}integerExp" />
 *                 &lt;attribute name="header" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="defaultValue" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="defaultValueNumeric" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="defaultValueDate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="defaultValueBoolean" type="{http://www.liquibase.org/xml/ns/dbchangelog}booleanExp" />
 *                 &lt;attribute name="defaultValueComputed" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.liquibase.org/xml/ns/dbchangelog}tableNameAttribute"/>
 *       &lt;attribute name="file" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="encoding" type="{http://www.w3.org/2001/XMLSchema}string" default="UTF-8" />
 *       &lt;attribute name="primaryKey" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="separator" type="{http://www.w3.org/2001/XMLSchema}string" default="," />
 *       &lt;attribute name="quotchar" type="{http://www.w3.org/2001/XMLSchema}string" default=""" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "content"
})
@XmlRootElement(name = "loadUpdateData")
public class LoadUpdateData {

    @XmlElementRef(name = "column", namespace = "http://www.liquibase.org/xml/ns/dbchangelog", type = JAXBElement.class, required = false)
    @XmlMixed
    protected List<Serializable> content;
    @XmlAttribute(name = "file")
    protected String file;
    @XmlAttribute(name = "encoding")
    protected String encoding;
    @XmlAttribute(name = "primaryKey", required = true)
    protected String primaryKey;
    @XmlAttribute(name = "separator")
    protected String separator;
    @XmlAttribute(name = "quotchar")
    protected String quotchar;
    @XmlAttribute(name = "catalogName")
    protected String catalogName;
    @XmlAttribute(name = "schemaName")
    protected String schemaName;
    @XmlAttribute(name = "tableName", required = true)
    protected String tableName;

    /**
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link LoadUpdateData.Column }{@code >}
     * {@link String }
     * 
     * 
     */
    public List<Serializable> getContent() {
        if (content == null) {
            content = new ArrayList<Serializable>();
        }
        return this.content;
    }

    /**
     * Gets the value of the file property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFile() {
        return file;
    }

    /**
     * Sets the value of the file property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFile(String value) {
        this.file = value;
    }

    /**
     * Gets the value of the encoding property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncoding() {
        if (encoding == null) {
            return "UTF-8";
        } else {
            return encoding;
        }
    }

    /**
     * Sets the value of the encoding property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncoding(String value) {
        this.encoding = value;
    }

    /**
     * Gets the value of the primaryKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryKey() {
        return primaryKey;
    }

    /**
     * Sets the value of the primaryKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryKey(String value) {
        this.primaryKey = value;
    }

    /**
     * Gets the value of the separator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeparator() {
        if (separator == null) {
            return ",";
        } else {
            return separator;
        }
    }

    /**
     * Sets the value of the separator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeparator(String value) {
        this.separator = value;
    }

    /**
     * Gets the value of the quotchar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuotchar() {
        if (quotchar == null) {
            return "\"";
        } else {
            return quotchar;
        }
    }

    /**
     * Sets the value of the quotchar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuotchar(String value) {
        this.quotchar = value;
    }

    /**
     * Gets the value of the catalogName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCatalogName() {
        return catalogName;
    }

    /**
     * Sets the value of the catalogName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCatalogName(String value) {
        this.catalogName = value;
    }

    /**
     * Gets the value of the schemaName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemaName() {
        return schemaName;
    }

    /**
     * Sets the value of the schemaName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchemaName(String value) {
        this.schemaName = value;
    }

    /**
     * Gets the value of the tableName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * Sets the value of the tableName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTableName(String value) {
        this.tableName = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="index" type="{http://www.liquibase.org/xml/ns/dbchangelog}integerExp" />
     *       &lt;attribute name="header" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="defaultValue" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="defaultValueNumeric" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="defaultValueDate" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="defaultValueBoolean" type="{http://www.liquibase.org/xml/ns/dbchangelog}booleanExp" />
     *       &lt;attribute name="defaultValueComputed" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Column {

        @XmlAttribute(name = "index")
        protected String index;
        @XmlAttribute(name = "header")
        protected String header;
        @XmlAttribute(name = "name")
        protected String name;
        @XmlAttribute(name = "type")
        protected String type;
        @XmlAttribute(name = "defaultValue")
        protected String defaultValue;
        @XmlAttribute(name = "defaultValueNumeric")
        protected String defaultValueNumeric;
        @XmlAttribute(name = "defaultValueDate")
        protected String defaultValueDate;
        @XmlAttribute(name = "defaultValueBoolean")
        protected String defaultValueBoolean;
        @XmlAttribute(name = "defaultValueComputed")
        protected String defaultValueComputed;

        /**
         * Gets the value of the index property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIndex() {
            return index;
        }

        /**
         * Sets the value of the index property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIndex(String value) {
            this.index = value;
        }

        /**
         * Gets the value of the header property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHeader() {
            return header;
        }

        /**
         * Sets the value of the header property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHeader(String value) {
            this.header = value;
        }

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getType() {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setType(String value) {
            this.type = value;
        }

        /**
         * Gets the value of the defaultValue property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDefaultValue() {
            return defaultValue;
        }

        /**
         * Sets the value of the defaultValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDefaultValue(String value) {
            this.defaultValue = value;
        }

        /**
         * Gets the value of the defaultValueNumeric property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDefaultValueNumeric() {
            return defaultValueNumeric;
        }

        /**
         * Sets the value of the defaultValueNumeric property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDefaultValueNumeric(String value) {
            this.defaultValueNumeric = value;
        }

        /**
         * Gets the value of the defaultValueDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDefaultValueDate() {
            return defaultValueDate;
        }

        /**
         * Sets the value of the defaultValueDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDefaultValueDate(String value) {
            this.defaultValueDate = value;
        }

        /**
         * Gets the value of the defaultValueBoolean property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDefaultValueBoolean() {
            return defaultValueBoolean;
        }

        /**
         * Sets the value of the defaultValueBoolean property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDefaultValueBoolean(String value) {
            this.defaultValueBoolean = value;
        }

        /**
         * Gets the value of the defaultValueComputed property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDefaultValueComputed() {
            return defaultValueComputed;
        }

        /**
         * Sets the value of the defaultValueComputed property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDefaultValueComputed(String value) {
            this.defaultValueComputed = value;
        }

    }

}
