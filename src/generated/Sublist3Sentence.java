//
// このファイルは、JavaTM Architecture for XML Binding(JAXB) Reference Implementation、v2.2.8-b130911.1802によって生成されました 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>を参照してください 
// ソース・スキーマの再コンパイル時にこのファイルの変更は失われます。 
// 生成日: 2021.02.27 時間 09:22:30 AM GMT+09:00 
//


package generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Sublist3Sentence complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="Sublist3Sentence">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}Sublist3SentenceE"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Sublist3Sentence", propOrder = {
    "sublist3SentenceE"
})
public class Sublist3Sentence {

    @XmlElement(name = "Sublist3SentenceE", required = true)
    protected Sublist3SentenceE sublist3SentenceE;

    /**
     * sublist3SentenceEプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Sublist3SentenceE }
     *     
     */
    public Sublist3SentenceE getSublist3SentenceE() {
        return sublist3SentenceE;
    }

    /**
     * sublist3SentenceEプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Sublist3SentenceE }
     *     
     */
    public void setSublist3SentenceE(Sublist3SentenceE value) {
        this.sublist3SentenceE = value;
    }

}
