
package de.edgesoft.match.jaxb;

import java.util.ArrayList;
import java.util.List;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import de.edgesoft.edgeutils.commons.ModelClass;
import de.edgesoft.edgeutils.javafx.SimpleIntegerPropertyAdapter;
import de.edgesoft.edgeutils.javafx.SimpleObjectPropertyLocalDateAdapter;
import de.edgesoft.edgeutils.javafx.SimpleObjectPropertyLocalTimeAdapter;
import de.edgesoft.edgeutils.javafx.SimpleStringPropertyAdapter;


/**
 * <p>Java class for Match complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Match">
 *   &lt;complexContent>
 *     &lt;extension base="{}ModelClass">
 *       &lt;sequence>
 *         &lt;element name="title" type="{}StringProperty" minOccurs="0"/>
 *         &lt;element name="date" type="{}LocalDateProperty"/>
 *         &lt;element name="start" type="{}LocalTimeProperty" minOccurs="0"/>
 *         &lt;element name="end" type="{}LocalTimeProperty" minOccurs="0"/>
 *         &lt;element name="set" type="{}Set" maxOccurs="unbounded"/>
 *         &lt;element name="set-result" type="{}Result" minOccurs="0"/>
 *         &lt;element name="live-pz-diff" type="{}IntegerProperty" minOccurs="0"/>
 *         &lt;element name="player-a" type="{}Player" minOccurs="0"/>
 *         &lt;element name="player-b" type="{}Player" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Match", propOrder = {
    "title",
    "date",
    "start",
    "end",
    "set",
    "setResult",
    "livePzDiff",
    "playerA",
    "playerB"
})
public class Match
    extends ModelClass
{

    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(SimpleStringPropertyAdapter.class)
    protected SimpleStringProperty title;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(SimpleObjectPropertyLocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected SimpleObjectProperty date;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(SimpleObjectPropertyLocalTimeAdapter.class)
    @XmlSchemaType(name = "time")
    protected SimpleObjectProperty start;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(SimpleObjectPropertyLocalTimeAdapter.class)
    @XmlSchemaType(name = "time")
    protected SimpleObjectProperty end;
    @XmlElement(required = true)
    protected List<Set> set;
    @XmlElement(name = "set-result")
    protected Result setResult;
    @XmlElement(name = "live-pz-diff", type = String.class)
    @XmlJavaTypeAdapter(SimpleIntegerPropertyAdapter.class)
    @XmlSchemaType(name = "int")
    protected SimpleIntegerProperty livePzDiff;
    @XmlElement(name = "player-a")
    protected Player playerA;
    @XmlElement(name = "player-b")
    protected Player playerB;

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public SimpleStringProperty getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(SimpleStringProperty value) {
        this.title = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public SimpleObjectProperty getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDate(SimpleObjectProperty value) {
        this.date = value;
    }

    /**
     * Gets the value of the start property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public SimpleObjectProperty getStart() {
        return start;
    }

    /**
     * Sets the value of the start property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStart(SimpleObjectProperty value) {
        this.start = value;
    }

    /**
     * Gets the value of the end property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public SimpleObjectProperty getEnd() {
        return end;
    }

    /**
     * Sets the value of the end property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnd(SimpleObjectProperty value) {
        this.end = value;
    }

    /**
     * Gets the value of the set property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the set property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Set }
     * 
     * 
     */
    public List<Set> getSet() {
        if (set == null) {
            set = new ArrayList<Set>();
        }
        return this.set;
    }

    /**
     * Gets the value of the setResult property.
     * 
     * @return
     *     possible object is
     *     {@link Result }
     *     
     */
    public Result getSetResult() {
        return setResult;
    }

    /**
     * Sets the value of the setResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Result }
     *     
     */
    public void setSetResult(Result value) {
        this.setResult = value;
    }

    /**
     * Gets the value of the livePzDiff property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public SimpleIntegerProperty getLivePzDiff() {
        return livePzDiff;
    }

    /**
     * Sets the value of the livePzDiff property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLivePzDiff(SimpleIntegerProperty value) {
        this.livePzDiff = value;
    }

    /**
     * Gets the value of the playerA property.
     * 
     * @return
     *     possible object is
     *     {@link Player }
     *     
     */
    public Player getPlayerA() {
        return playerA;
    }

    /**
     * Sets the value of the playerA property.
     * 
     * @param value
     *     allowed object is
     *     {@link Player }
     *     
     */
    public void setPlayerA(Player value) {
        this.playerA = value;
    }

    /**
     * Gets the value of the playerB property.
     * 
     * @return
     *     possible object is
     *     {@link Player }
     *     
     */
    public Player getPlayerB() {
        return playerB;
    }

    /**
     * Sets the value of the playerB property.
     * 
     * @param value
     *     allowed object is
     *     {@link Player }
     *     
     */
    public void setPlayerB(Player value) {
        this.playerB = value;
    }

}
