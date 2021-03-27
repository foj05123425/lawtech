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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
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
 *         &lt;element ref="{}SupplProvisionLabel"/>
 *         &lt;element ref="{}ArticleRange" minOccurs="0"/>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element ref="{}TOCArticle"/>
 *           &lt;element ref="{}TOCChapter"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "supplProvisionLabel",
    "articleRange",
    "tocArticleOrTOCChapter"
})
@XmlRootElement(name = "TOCSupplProvision")
public class TOCSupplProvision {

    @XmlElement(name = "SupplProvisionLabel", required = true)
    protected SupplProvisionLabel supplProvisionLabel;
    @XmlElement(name = "ArticleRange")
    protected ArticleRange articleRange;
    @XmlElements({
        @XmlElement(name = "TOCArticle", type = TOCArticle.class),
        @XmlElement(name = "TOCChapter", type = TOCChapter.class)
    })
    protected List<Object> tocArticleOrTOCChapter;

    /**
     * supplProvisionLabelプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link SupplProvisionLabel }
     *     
     */
    public SupplProvisionLabel getSupplProvisionLabel() {
        return supplProvisionLabel;
    }

    /**
     * supplProvisionLabelプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link SupplProvisionLabel }
     *     
     */
    public void setSupplProvisionLabel(SupplProvisionLabel value) {
        this.supplProvisionLabel = value;
    }

    /**
     * articleRangeプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link ArticleRange }
     *     
     */
    public ArticleRange getArticleRange() {
        return articleRange;
    }

    /**
     * articleRangeプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link ArticleRange }
     *     
     */
    public void setArticleRange(ArticleRange value) {
        this.articleRange = value;
    }

    /**
     * Gets the value of the tocArticleOrTOCChapter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tocArticleOrTOCChapter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTOCArticleOrTOCChapter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TOCArticle }
     * {@link TOCChapter }
     * 
     * 
     */
    public List<Object> getTOCArticleOrTOCChapter() {
        if (tocArticleOrTOCChapter == null) {
            tocArticleOrTOCChapter = new ArrayList<Object>();
        }
        return this.tocArticleOrTOCChapter;
    }

}
