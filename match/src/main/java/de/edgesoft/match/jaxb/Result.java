
package de.edgesoft.match.jaxb;

import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import de.edgesoft.edgeutils.commons.ModelClass;
import de.edgesoft.edgeutils.javafx.SimpleBooleanPropertyAdapter;
import de.edgesoft.edgeutils.javafx.SimpleIntegerPropertyAdapter;


/**
 * <p>Java class for Result complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Result">
 *   &lt;complexContent>
 *     &lt;extension base="{}ModelClass">
 *       &lt;sequence>
 *         &lt;element name="won-a" type="{}BooleanProperty"/>
 *         &lt;element name="number" type="{}IntegerProperty"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Result", propOrder = {
    "wonA",
    "number"
})
public class Result
    extends ModelClass
{

    @XmlElement(name = "won-a", required = true, type = String.class)
    @XmlJavaTypeAdapter(SimpleBooleanPropertyAdapter.class)
    @XmlSchemaType(name = "boolean")
    protected SimpleBooleanProperty wonA;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(SimpleIntegerPropertyAdapter.class)
    @XmlSchemaType(name = "int")
    protected SimpleIntegerProperty number;

    /**
     * Gets the value of the wonA property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public SimpleBooleanProperty getWonA() {
        return wonA;
    }

    /**
     * Sets the value of the wonA property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWonA(SimpleBooleanProperty value) {
        this.wonA = value;
    }

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public SimpleIntegerProperty getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(SimpleIntegerProperty value) {
        this.number = value;
    }

}
