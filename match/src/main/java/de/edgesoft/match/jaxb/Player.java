
package de.edgesoft.match.jaxb;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import de.edgesoft.edgeutils.commons.ModelClass;
import de.edgesoft.edgeutils.javafx.SimpleIntegerPropertyAdapter;
import de.edgesoft.edgeutils.javafx.SimpleStringPropertyAdapter;


/**
 * <p>Java class for Player complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Player">
 *   &lt;complexContent>
 *     &lt;extension base="{}ModelClass">
 *       &lt;sequence>
 *         &lt;element name="name" type="{}StringProperty" minOccurs="0"/>
 *         &lt;element name="live-pz" type="{}IntegerProperty" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Player", propOrder = {
    "name",
    "livePz"
})
public class Player
    extends ModelClass
{

    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(SimpleStringPropertyAdapter.class)
    protected SimpleStringProperty name;
    @XmlElement(name = "live-pz", type = String.class)
    @XmlJavaTypeAdapter(SimpleIntegerPropertyAdapter.class)
    @XmlSchemaType(name = "int")
    protected SimpleIntegerProperty livePz;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public SimpleStringProperty getName() {
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
    public void setName(SimpleStringProperty value) {
        this.name = value;
    }

    /**
     * Gets the value of the livePz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public SimpleIntegerProperty getLivePz() {
        return livePz;
    }

    /**
     * Sets the value of the livePz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLivePz(SimpleIntegerProperty value) {
        this.livePz = value;
    }

}
