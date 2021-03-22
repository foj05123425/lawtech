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
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
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
 *       &lt;choice>
 *         &lt;sequence>
 *           &lt;element ref="{}AmendProvisionSentence"/>
 *           &lt;element ref="{}NewProvision" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;element ref="{}NewProvision" maxOccurs="unbounded"/>
 *       &lt;/choice>
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
@XmlRootElement(name = "AmendProvision")
public class AmendProvision {

    @XmlElementRefs({
        @XmlElementRef(name = "NewProvision", type = NewProvision.class, required = false),
        @XmlElementRef(name = "AmendProvisionSentence", type = AmendProvisionSentence.class, required = false)
    })
    protected List<Object> content;

    /**
     * 残りのコンテンツ・モデルを取得します。
     * 
     * <p>
     * 次の理由でこの"catch-all"プロパティを取得しています。
     * このフィールド名"NewProvision"は、スキーマの2つの異なる部分で使用されています。関連項目: 
     * 行529/file:/C:/Users/xxx/Documents/law/XMLSchemaForJapaneseLaw_v3.xsd
     * 行527/file:/C:/Users/xxx/Documents/law/XMLSchemaForJapaneseLaw_v3.xsd
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
     * {@link AmendProvisionSentence }
     * {@link NewProvision }
     * 
     * 
     */
    public List<Object> getContent() {
        if (content == null) {
            content = new ArrayList<Object>();
        }
        return this.content;
    }

}
