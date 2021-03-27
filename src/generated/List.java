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
 *         &lt;element ref="{}ListSentence"/>
 *         &lt;element ref="{}Sublist1" maxOccurs="unbounded" minOccurs="0"/>
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
    "listSentence",
    "sublist1"
})
@XmlRootElement(name = "List")
public class List {

    @XmlElement(name = "ListSentence", required = true)
    protected ListSentence listSentence;
    @XmlElement(name = "Sublist1")
    protected java.util.List<Sublist1> sublist1;

    /**
     * listSentenceプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link ListSentence }
     *     
     */
    public ListSentence getListSentence() {
        return listSentence;
    }

    /**
     * listSentenceプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link ListSentence }
     *     
     */
    public void setListSentence(ListSentence value) {
        this.listSentence = value;
    }

    /**
     * Gets the value of the sublist1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sublist1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSublist1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Sublist1 }
     * 
     * 
     */
    public java.util.List<Sublist1> getSublist1() {
        if (sublist1 == null) {
            sublist1 = new ArrayList<Sublist1>();
        }
        return this.sublist1;
    }

}
