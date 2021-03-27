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
 *         &lt;element ref="{}ArithFormulaNum" minOccurs="0"/>
 *         &lt;element ref="{}RelatedArticleNum" minOccurs="0"/>
 *         &lt;element ref="{}ArithFormula" maxOccurs="unbounded"/>
 *         &lt;element ref="{}Remarks" minOccurs="0"/>
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
    "arithFormulaNum",
    "relatedArticleNum",
    "arithFormula",
    "remarks"
})
@XmlRootElement(name = "Appdx")
public class Appdx {

    @XmlElement(name = "ArithFormulaNum")
    protected ArithFormulaNum arithFormulaNum;
    @XmlElement(name = "RelatedArticleNum")
    protected RelatedArticleNum relatedArticleNum;
    @XmlElement(name = "ArithFormula", required = true)
    protected List<ArithFormula> arithFormula;
    @XmlElement(name = "Remarks")
    protected Remarks remarks;

    /**
     * arithFormulaNumプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link ArithFormulaNum }
     *     
     */
    public ArithFormulaNum getArithFormulaNum() {
        return arithFormulaNum;
    }

    /**
     * arithFormulaNumプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link ArithFormulaNum }
     *     
     */
    public void setArithFormulaNum(ArithFormulaNum value) {
        this.arithFormulaNum = value;
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
     * Gets the value of the arithFormula property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the arithFormula property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArithFormula().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArithFormula }
     * 
     * 
     */
    public List<ArithFormula> getArithFormula() {
        if (arithFormula == null) {
            arithFormula = new ArrayList<ArithFormula>();
        }
        return this.arithFormula;
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

}
