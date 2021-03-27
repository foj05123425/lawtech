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
 *         &lt;element ref="{}Sublist1Sentence"/>
 *         &lt;element ref="{}Sublist2" maxOccurs="unbounded" minOccurs="0"/>
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
    "sublist1Sentence",
    "sublist2"
})
@XmlRootElement(name = "Sublist1")
public class Sublist1 {

    @XmlElement(name = "Sublist1Sentence", required = true)
    protected Sublist1Sentence sublist1Sentence;
    @XmlElement(name = "Sublist2")
    protected List<Sublist2> sublist2;

    /**
     * sublist1Sentenceプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Sublist1Sentence }
     *     
     */
    public Sublist1Sentence getSublist1Sentence() {
        return sublist1Sentence;
    }

    /**
     * sublist1Sentenceプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Sublist1Sentence }
     *     
     */
    public void setSublist1Sentence(Sublist1Sentence value) {
        this.sublist1Sentence = value;
    }

    /**
     * Gets the value of the sublist2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sublist2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSublist2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Sublist2 }
     * 
     * 
     */
    public List<Sublist2> getSublist2() {
        if (sublist2 == null) {
            sublist2 = new ArrayList<Sublist2>();
        }
        return this.sublist2;
    }

}
