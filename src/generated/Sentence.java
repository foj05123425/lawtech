//
// このファイルは、JavaTM Architecture for XML Binding(JAXB) Reference Implementation、v2.2.8-b130911.1802によって生成されました 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>を参照してください 
// ソース・スキーマの再コンパイル時にこのファイルの変更は失われます。 
// 生成日: 2021.02.27 時間 09:22:30 AM GMT+09:00 
//


package generated;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>anonymous complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element ref="{}Line"/>
 *         &lt;element ref="{}QuoteStruct"/>
 *         &lt;element ref="{}ArithFormula"/>
 *         &lt;element ref="{}Ruby"/>
 *         &lt;element ref="{}Sup"/>
 *         &lt;element ref="{}Sub"/>
 *       &lt;/choice>
 *       &lt;attribute name="Num" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *       &lt;attribute name="Function">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="main"/>
 *             &lt;enumeration value="proviso"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Indent">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="Paragraph"/>
 *             &lt;enumeration value="Item"/>
 *             &lt;enumeration value="Subitem1"/>
 *             &lt;enumeration value="Subitem2"/>
 *             &lt;enumeration value="Subitem3"/>
 *             &lt;enumeration value="Subitem4"/>
 *             &lt;enumeration value="Subitem5"/>
 *             &lt;enumeration value="Subitem6"/>
 *             &lt;enumeration value="Subitem7"/>
 *             &lt;enumeration value="Subitem8"/>
 *             &lt;enumeration value="Subitem9"/>
 *             &lt;enumeration value="Subitem10"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="WritingMode" default="vertical">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="vertical"/>
 *             &lt;enumeration value="horizontal"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
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
@XmlRootElement(name = "Sentence")
public class Sentence {

    @XmlElementRefs({
        @XmlElementRef(name = "QuoteStruct", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Line", type = Line.class, required = false),
        @XmlElementRef(name = "Sub", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ArithFormula", type = ArithFormula.class, required = false),
        @XmlElementRef(name = "Sup", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Ruby", type = Ruby.class, required = false)
    })
    @XmlMixed
    protected List<Object> content;
    @XmlAttribute(name = "Num")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger num;
    @XmlAttribute(name = "Function")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String function;
    @XmlAttribute(name = "Indent")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String indent;
    @XmlAttribute(name = "WritingMode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String writingMode;

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
     * {@link JAXBElement }{@code <}{@link Any }{@code >}
     * {@link String }
     * {@link Line }
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link ArithFormula }
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link Ruby }
     * 
     * 
     */
    public List<Object> getContent() {
        if (content == null) {
            content = new ArrayList<Object>();
        }
        return this.content;
    }

    /**
     * numプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNum() {
        return num;
    }

    /**
     * numプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNum(BigInteger value) {
        this.num = value;
    }

    /**
     * functionプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFunction() {
        return function;
    }

    /**
     * functionプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFunction(String value) {
        this.function = value;
    }

    /**
     * indentプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndent() {
        return indent;
    }

    /**
     * indentプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndent(String value) {
        this.indent = value;
    }

    /**
     * writingModeプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWritingMode() {
        if (writingMode == null) {
            return "vertical";
        } else {
            return writingMode;
        }
    }

    /**
     * writingModeプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWritingMode(String value) {
        this.writingMode = value;
    }

}
