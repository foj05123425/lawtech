//
// このファイルは、JavaTM Architecture for XML Binding(JAXB) Reference Implementation、v2.2.8-b130911.1802によって生成されました 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>を参照してください 
// ソース・スキーマの再コンパイル時にこのファイルの変更は失われます。 
// 生成日: 2021.02.27 時間 09:22:30 AM GMT+09:00 
//


package generated;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}Subitem7Title" minOccurs="0"/>
 *         &lt;element ref="{}Subitem7Sentence"/>
 *         &lt;sequence>
 *           &lt;element ref="{}Subitem8" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;choice maxOccurs="unbounded" minOccurs="0">
 *             &lt;element ref="{}TableStruct"/>
 *             &lt;element ref="{}FigStruct"/>
 *             &lt;element ref="{}StyleStruct"/>
 *             &lt;element ref="{}List"/>
 *           &lt;/choice>
 *         &lt;/sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="Num" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="Delete" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Hide" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "subitem7Title",
    "subitem7Sentence",
    "subitem8",
    "tableStructOrFigStructOrStyleStruct"
})
@XmlRootElement(name = "Subitem7")
public class Subitem7 {

    @XmlElement(name = "Subitem7Title")
    protected Subitem7Title subitem7Title;
    @XmlElement(name = "Subitem7Sentence", required = true)
    protected Subitem7Sentence subitem7Sentence;
    @XmlElement(name = "Subitem8")
    protected java.util.List<Subitem8> subitem8;
    @XmlElements({
        @XmlElement(name = "TableStruct", type = TableStruct.class),
        @XmlElement(name = "FigStruct", type = FigStruct.class),
        @XmlElement(name = "StyleStruct", type = StyleStruct.class),
        @XmlElement(name = "List", type = generated.List.class)
    })
    protected java.util.List<Object> tableStructOrFigStructOrStyleStruct;
    @XmlAttribute(name = "Num", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String num;
    @XmlAttribute(name = "Delete")
    protected Boolean delete;
    @XmlAttribute(name = "Hide")
    protected Boolean hide;

    /**
     * subitem7Titleプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Subitem7Title }
     *     
     */
    public Subitem7Title getSubitem7Title() {
        return subitem7Title;
    }

    /**
     * subitem7Titleプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Subitem7Title }
     *     
     */
    public void setSubitem7Title(Subitem7Title value) {
        this.subitem7Title = value;
    }

    /**
     * subitem7Sentenceプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Subitem7Sentence }
     *     
     */
    public Subitem7Sentence getSubitem7Sentence() {
        return subitem7Sentence;
    }

    /**
     * subitem7Sentenceプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Subitem7Sentence }
     *     
     */
    public void setSubitem7Sentence(Subitem7Sentence value) {
        this.subitem7Sentence = value;
    }

    /**
     * Gets the value of the subitem8 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subitem8 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubitem8().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Subitem8 }
     * 
     * 
     */
    public java.util.List<Subitem8> getSubitem8() {
        if (subitem8 == null) {
            subitem8 = new ArrayList<Subitem8>();
        }
        return this.subitem8;
    }

    /**
     * Gets the value of the tableStructOrFigStructOrStyleStruct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tableStructOrFigStructOrStyleStruct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTableStructOrFigStructOrStyleStruct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TableStruct }
     * {@link FigStruct }
     * {@link StyleStruct }
     * {@link generated.List }
     * 
     * 
     */
    public java.util.List<Object> getTableStructOrFigStructOrStyleStruct() {
        if (tableStructOrFigStructOrStyleStruct == null) {
            tableStructOrFigStructOrStyleStruct = new ArrayList<Object>();
        }
        return this.tableStructOrFigStructOrStyleStruct;
    }

    /**
     * numプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNum() {
        return num;
    }

    /**
     * numプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNum(String value) {
        this.num = value;
    }

    /**
     * deleteプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isDelete() {
        if (delete == null) {
            return false;
        } else {
            return delete;
        }
    }

    /**
     * deleteプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDelete(Boolean value) {
        this.delete = value;
    }

    /**
     * hideプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isHide() {
        if (hide == null) {
            return false;
        } else {
            return hide;
        }
    }

    /**
     * hideプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHide(Boolean value) {
        this.hide = value;
    }

}
