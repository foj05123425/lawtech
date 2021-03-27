//
// このファイルは、JavaTM Architecture for XML Binding(JAXB) Reference Implementation、v2.2.8-b130911.1802によって生成されました 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>を参照してください 
// ソース・スキーマの再コンパイル時にこのファイルの変更は失われます。 
// 生成日: 2021.02.27 時間 09:22:30 AM GMT+09:00 
//


package generated;

import java.math.BigInteger;
import java.util.ArrayList;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
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
 *         &lt;element ref="{}ParagraphCaption" minOccurs="0"/>
 *         &lt;element ref="{}ParagraphNum"/>
 *         &lt;element ref="{}ParagraphSentence"/>
 *         &lt;choice>
 *           &lt;element ref="{}AmendProvision" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{}Class" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;sequence>
 *             &lt;choice maxOccurs="unbounded">
 *               &lt;element ref="{}TableStruct"/>
 *               &lt;element ref="{}FigStruct"/>
 *               &lt;element ref="{}StyleStruct"/>
 *             &lt;/choice>
 *             &lt;element ref="{}Item" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;/sequence>
 *           &lt;sequence>
 *             &lt;element ref="{}Item" maxOccurs="unbounded"/>
 *             &lt;choice maxOccurs="unbounded" minOccurs="0">
 *               &lt;element ref="{}TableStruct"/>
 *               &lt;element ref="{}FigStruct"/>
 *               &lt;element ref="{}StyleStruct"/>
 *               &lt;element ref="{}List"/>
 *             &lt;/choice>
 *           &lt;/sequence>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="Num" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *       &lt;attribute name="OldStyle" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="OldNum" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
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
    "content"
})
@XmlRootElement(name = "Paragraph")
public class Paragraph {

    @XmlElementRefs({
        @XmlElementRef(name = "FigStruct", type = FigStruct.class, required = false),
        @XmlElementRef(name = "StyleStruct", type = StyleStruct.class, required = false),
        @XmlElementRef(name = "Item", type = Item.class, required = false),
        @XmlElementRef(name = "AmendProvision", type = AmendProvision.class, required = false),
        @XmlElementRef(name = "ParagraphSentence", type = ParagraphSentence.class, required = false),
        @XmlElementRef(name = "Class", type = Class.class, required = false),
        @XmlElementRef(name = "ParagraphCaption", type = ParagraphCaption.class, required = false),
        @XmlElementRef(name = "TableStruct", type = TableStruct.class, required = false),
        @XmlElementRef(name = "ParagraphNum", type = ParagraphNum.class, required = false),
        @XmlElementRef(name = "List", type = generated.List.class, required = false)
    })
    protected java.util.List<Object> content;
    @XmlAttribute(name = "Num", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger num;
    @XmlAttribute(name = "OldStyle")
    protected Boolean oldStyle;
    @XmlAttribute(name = "OldNum")
    protected Boolean oldNum;
    @XmlAttribute(name = "Hide")
    protected Boolean hide;

    /**
     * 残りのコンテンツ・モデルを取得します。
     * 
     * <p>
     * 次の理由でこの"catch-all"プロパティを取得しています。
     * このフィールド名"Item"は、スキーマの2つの異なる部分で使用されています。関連項目: 
     * 行466/file:/C:/Users/xxx/Documents/law/XMLSchemaForJapaneseLaw_v3.xsd
     * 行463/file:/C:/Users/xxx/Documents/law/XMLSchemaForJapaneseLaw_v3.xsd
     * <p>
     * このプロパティを削除するには、次の両方の宣言の1つにプロパティ・カスタマイズを適用して、
     * 名前を変更します。
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
     * {@link FigStruct }
     * {@link StyleStruct }
     * {@link Item }
     * {@link AmendProvision }
     * {@link ParagraphSentence }
     * {@link Class }
     * {@link ParagraphCaption }
     * {@link TableStruct }
     * {@link ParagraphNum }
     * {@link generated.List }
     * 
     * 
     */
    public java.util.List<Object> getContent() {
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
     * oldStyleプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isOldStyle() {
        if (oldStyle == null) {
            return false;
        } else {
            return oldStyle;
        }
    }

    /**
     * oldStyleプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOldStyle(Boolean value) {
        this.oldStyle = value;
    }

    /**
     * oldNumプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isOldNum() {
        if (oldNum == null) {
            return false;
        } else {
            return oldNum;
        }
    }

    /**
     * oldNumプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOldNum(Boolean value) {
        this.oldNum = value;
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
