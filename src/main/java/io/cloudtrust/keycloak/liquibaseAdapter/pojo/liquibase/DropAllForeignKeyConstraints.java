//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.10.02 at 09:10:35 AM CEST 
//


package io.cloudtrust.keycloak.liquibaseAdapter.pojo.liquibase;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attGroup ref="{http://www.liquibase.org/xml/ns/dbchangelog}dropAllForeignKeyConstraintsAttrib"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "dropAllForeignKeyConstraints")
public class DropAllForeignKeyConstraints {

    @XmlAttribute(name = "baseTableCatalogName")
    protected String baseTableCatalogName;
    @XmlAttribute(name = "baseTableSchemaName")
    protected String baseTableSchemaName;
    @XmlAttribute(name = "baseTableName", required = true)
    protected String baseTableName;

    /**
     * Gets the value of the baseTableCatalogName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseTableCatalogName() {
        return baseTableCatalogName;
    }

    /**
     * Sets the value of the baseTableCatalogName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseTableCatalogName(String value) {
        this.baseTableCatalogName = value;
    }

    /**
     * Gets the value of the baseTableSchemaName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseTableSchemaName() {
        return baseTableSchemaName;
    }

    /**
     * Sets the value of the baseTableSchemaName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseTableSchemaName(String value) {
        this.baseTableSchemaName = value;
    }

    /**
     * Gets the value of the baseTableName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseTableName() {
        return baseTableName;
    }

    /**
     * Sets the value of the baseTableName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseTableName(String value) {
        this.baseTableName = value;
    }

}
