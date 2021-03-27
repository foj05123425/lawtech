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
 *         &lt;element ref="{}SubsectionTitle"/>
 *         &lt;element ref="{}ArticleRange" minOccurs="0"/>
 *         &lt;element ref="{}TOCDivision" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Num" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="Delete" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "subsectionTitle",
    "articleRange",
    "tocDivision"
})
@XmlRootElement(name = "TOCSubsection")
public class TOCSubsection {

    @XmlElement(name = "SubsectionTitle", required = true)
    protected SubsectionTitle subsectionTitle;
    @XmlElement(name = "ArticleRange")
    protected ArticleRange articleRange;
    @XmlElement(name = "TOCDivision")
    protected List<TOCDivision> tocDivision;
    @XmlAttribute(name = "Num", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String num;
    @XmlAttribute(name = "Delete")
    protected Boolean delete;

    /**
     * subsectionTitleプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link SubsectionTitle }
     *     
     */
    public SubsectionTitle getSubsectionTitle() {
        return subsectionTitle;
    }

    /**
     * subsectionTitleプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link SubsectionTitle }
     *     
     */
    public void setSubsectionTitle(SubsectionTitle value) {
        this.subsectionTitle = value;
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
     * Gets the value of the tocDivision property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tocDivision property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTOCDivision().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TOCDivision }
     * 
     * 
     */
    public List<TOCDivision> getTOCDivision() {
        if (tocDivision == null) {
            tocDivision = new ArrayList<TOCDivision>();
        }
        return this.tocDivision;
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

}
