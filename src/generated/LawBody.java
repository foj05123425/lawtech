//
// このファイルは、JavaTM Architecture for XML Binding(JAXB) Reference Implementation、v2.2.8-b130911.1802によって生成されました 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>を参照してください 
// ソース・スキーマの再コンパイル時にこのファイルの変更は失われます。 
// 生成日: 2021.02.27 時間 09:22:30 AM GMT+09:00 
//


package generated;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;choice>
 *           &lt;sequence>
 *             &lt;element ref="{}LawTitle"/>
 *             &lt;element ref="{}EnactStatement" maxOccurs="unbounded" minOccurs="0"/>
 *             &lt;element ref="{}TOC" minOccurs="0"/>
 *           &lt;/sequence>
 *           &lt;sequence>
 *             &lt;element ref="{}EnactStatement" maxOccurs="unbounded"/>
 *             &lt;element ref="{}TOC" minOccurs="0"/>
 *           &lt;/sequence>
 *           &lt;sequence>
 *             &lt;element ref="{}TOC"/>
 *             &lt;element ref="{}LawTitle" minOccurs="0"/>
 *           &lt;/sequence>
 *         &lt;/choice>
 *         &lt;element ref="{}Preamble" minOccurs="0"/>
 *         &lt;element ref="{}MainProvision"/>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element ref="{}SupplProvision"/>
 *           &lt;element ref="{}AppdxTable"/>
 *           &lt;element ref="{}AppdxNote"/>
 *           &lt;element ref="{}AppdxStyle"/>
 *           &lt;element ref="{}Appdx"/>
 *           &lt;element ref="{}AppdxFig"/>
 *           &lt;element ref="{}AppdxFormat"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="Subject" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
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
@XmlRootElement(name = "LawBody")
public class LawBody {

    @XmlElementRefs({
        @XmlElementRef(name = "LawTitle", type = LawTitle.class, required = false),
        @XmlElementRef(name = "TOC", type = TOC.class, required = false),
        @XmlElementRef(name = "MainProvision", type = MainProvision.class, required = false),
        @XmlElementRef(name = "AppdxTable", type = AppdxTable.class, required = false),
        @XmlElementRef(name = "AppdxNote", type = AppdxNote.class, required = false),
        @XmlElementRef(name = "AppdxFormat", type = AppdxFormat.class, required = false),
        @XmlElementRef(name = "EnactStatement", type = EnactStatement.class, required = false),
        @XmlElementRef(name = "SupplProvision", type = SupplProvision.class, required = false),
        @XmlElementRef(name = "AppdxFig", type = AppdxFig.class, required = false),
        @XmlElementRef(name = "Appdx", type = Appdx.class, required = false),
        @XmlElementRef(name = "AppdxStyle", type = AppdxStyle.class, required = false),
        @XmlElementRef(name = "Preamble", type = Preamble.class, required = false)
    })
    protected List<Object> content;
    @XmlAttribute(name = "Subject")
    @XmlSchemaType(name = "anySimpleType")
    protected String subject;

    /**
     * 残りのコンテンツ・モデルを取得します。
     * 
     * <p>
     * 次の理由でこの"catch-all"プロパティを取得しています。
     * このフィールド名"EnactStatement"は、スキーマの2つの異なる部分で使用されています。関連項目: 
     * 行66/file:/C:/Users/xxx/Documents/law/XMLSchemaForJapaneseLaw_v3.xsd
     * 行62/file:/C:/Users/xxx/Documents/law/XMLSchemaForJapaneseLaw_v3.xsd
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
     * {@link LawTitle }
     * {@link TOC }
     * {@link MainProvision }
     * {@link AppdxTable }
     * {@link AppdxNote }
     * {@link AppdxFormat }
     * {@link EnactStatement }
     * {@link SupplProvision }
     * {@link AppdxFig }
     * {@link Appdx }
     * {@link AppdxStyle }
     * {@link Preamble }
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
     * subjectプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubject() {
        return subject;
    }

    /**
     * subjectプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubject(String value) {
        this.subject = value;
    }

}
