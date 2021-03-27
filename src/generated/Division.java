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
 *         &lt;element ref="{}DivisionTitle"/>
 *         &lt;element ref="{}Article" maxOccurs="unbounded"/>
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
    "divisionTitle",
    "article"
})
@XmlRootElement(name = "Division")
public class Division {

    @XmlElement(name = "DivisionTitle", required = true)
    protected DivisionTitle divisionTitle;
    @XmlElement(name = "Article", required = true)
    protected List<Article> article;
    @XmlAttribute(name = "Num", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String num;
    @XmlAttribute(name = "Delete")
    protected Boolean delete;
    @XmlAttribute(name = "Hide")
    protected Boolean hide;

    /**
     * divisionTitleプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link DivisionTitle }
     *     
     */
    public DivisionTitle getDivisionTitle() {
        return divisionTitle;
    }

    /**
     * divisionTitleプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link DivisionTitle }
     *     
     */
    public void setDivisionTitle(DivisionTitle value) {
        this.divisionTitle = value;
    }

    /**
     * Gets the value of the article property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the article property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArticle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Article }
     * 
     * 
     */
    public List<Article> getArticle() {
        if (article == null) {
            article = new ArrayList<Article>();
        }
        return this.article;
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
