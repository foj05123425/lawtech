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
 *         &lt;element ref="{}Subitem4Title" minOccurs="0"/>
 *         &lt;element ref="{}Subitem4Sentence"/>
 *         &lt;sequence>
 *           &lt;element ref="{}Subitem5" maxOccurs="unbounded" minOccurs="0"/>
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
    "subitem4Title",
    "subitem4Sentence",
    "subitem5",
    "tableStructOrFigStructOrStyleStruct"
})
@XmlRootElement(name = "Subitem4")
public class Subitem4 {

    @XmlElement(name = "Subitem4Title")
    protected Subitem4Title subitem4Title;
    @XmlElement(name = "Subitem4Sentence", required = true)
    protected Subitem4Sentence subitem4Sentence;
    @XmlElement(name = "Subitem5")
    protected java.util.List<Subitem5> subitem5;
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
     * subitem4Titleプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Subitem4Title }
     *     
     */
    public Subitem4Title getSubitem4Title() {
        return subitem4Title;
    }

    /**
     * subitem4Titleプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Subitem4Title }
     *     
     */
    public void setSubitem4Title(Subitem4Title value) {
        this.subitem4Title = value;
    }

    /**
     * subitem4Sentenceプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Subitem4Sentence }
     *     
     */
    public Subitem4Sentence getSubitem4Sentence() {
        return subitem4Sentence;
    }

    /**
     * subitem4Sentenceプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Subitem4Sentence }
     *     
     */
    public void setSubitem4Sentence(Subitem4Sentence value) {
        this.subitem4Sentence = value;
    }

    /**
     * Gets the value of the subitem5 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subitem5 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubitem5().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Subitem5 }
     * 
     * 
     */
    public java.util.List<Subitem5> getSubitem5() {
        if (subitem5 == null) {
            subitem5 = new ArrayList<Subitem5>();
        }
        return this.subitem5;
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
