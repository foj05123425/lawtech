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
 *         &lt;element ref="{}AppdxFigTitle" minOccurs="0"/>
 *         &lt;element ref="{}RelatedArticleNum" minOccurs="0"/>
 *         &lt;choice maxOccurs="unbounded">
 *           &lt;element ref="{}FigStruct"/>
 *           &lt;element ref="{}TableStruct"/>
 *         &lt;/choice>
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
    "appdxFigTitle",
    "relatedArticleNum",
    "figStructOrTableStruct"
})
@XmlRootElement(name = "AppdxFig")
public class AppdxFig {

    @XmlElement(name = "AppdxFigTitle")
    protected AppdxFigTitle appdxFigTitle;
    @XmlElement(name = "RelatedArticleNum")
    protected RelatedArticleNum relatedArticleNum;
    @XmlElements({
        @XmlElement(name = "FigStruct", type = FigStruct.class),
        @XmlElement(name = "TableStruct", type = TableStruct.class)
    })
    protected List<Object> figStructOrTableStruct;
    @XmlAttribute(name = "Num")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger num;

    /**
     * appdxFigTitleプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link AppdxFigTitle }
     *     
     */
    public AppdxFigTitle getAppdxFigTitle() {
        return appdxFigTitle;
    }

    /**
     * appdxFigTitleプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link AppdxFigTitle }
     *     
     */
    public void setAppdxFigTitle(AppdxFigTitle value) {
        this.appdxFigTitle = value;
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
     * Gets the value of the figStructOrTableStruct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the figStructOrTableStruct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFigStructOrTableStruct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FigStruct }
     * {@link TableStruct }
     * 
     * 
     */
    public List<Object> getFigStructOrTableStruct() {
        if (figStructOrTableStruct == null) {
            figStructOrTableStruct = new ArrayList<Object>();
        }
        return this.figStructOrTableStruct;
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
