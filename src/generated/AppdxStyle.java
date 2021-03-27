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
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element ref="{}AppdxStyleTitle" minOccurs="0"/>
 *         &lt;element ref="{}RelatedArticleNum" minOccurs="0"/>
 *         &lt;element ref="{}StyleStruct" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Remarks" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Num" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "appdxStyleTitle",
    "relatedArticleNum",
    "styleStruct",
    "remarks"
})
@XmlRootElement(name = "AppdxStyle")
public class AppdxStyle {

    @XmlElement(name = "AppdxStyleTitle")
    protected AppdxStyleTitle appdxStyleTitle;
    @XmlElement(name = "RelatedArticleNum")
    protected RelatedArticleNum relatedArticleNum;
    @XmlElement(name = "StyleStruct")
    protected List<StyleStruct> styleStruct;
    @XmlElement(name = "Remarks")
    protected Remarks remarks;
    @XmlAttribute(name = "Num")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger num;

    /**
     * appdxStyleTitleプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link AppdxStyleTitle }
     *     
     */
    public AppdxStyleTitle getAppdxStyleTitle() {
        return appdxStyleTitle;
    }

    /**
     * appdxStyleTitleプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link AppdxStyleTitle }
     *     
     */
    public void setAppdxStyleTitle(AppdxStyleTitle value) {
        this.appdxStyleTitle = value;
    }

    /**
     * relatedArticleNumプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link RelatedArticleNum }
     *     
     */
    public RelatedArticleNum getRelatedArticleNum() {
        return relatedArticleNum;
    }

    /**
     * relatedArticleNumプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link RelatedArticleNum }
     *     
     */
    public void setRelatedArticleNum(RelatedArticleNum value) {
        this.relatedArticleNum = value;
    }

    /**
     * Gets the value of the styleStruct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the styleStruct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStyleStruct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StyleStruct }
     * 
     * 
     */
    public List<StyleStruct> getStyleStruct() {
        if (styleStruct == null) {
            styleStruct = new ArrayList<StyleStruct>();
        }
        return this.styleStruct;
    }

    /**
     * remarksプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Remarks }
     *     
     */
    public Remarks getRemarks() {
        return remarks;
    }

    /**
     * remarksプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Remarks }
     *     
     */
    public void setRemarks(Remarks value) {
        this.remarks = value;
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

}
