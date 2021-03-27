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
 *         &lt;element ref="{}ClassTitle" minOccurs="0"/>
 *         &lt;element ref="{}ClassSentence"/>
 *         &lt;element ref="{}Item" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Num" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "classTitle",
    "classSentence",
    "item"
})
@XmlRootElement(name = "Class")
public class Class {

    @XmlElement(name = "ClassTitle")
    protected ClassTitle classTitle;
    @XmlElement(name = "ClassSentence", required = true)
    protected ClassSentence classSentence;
    @XmlElement(name = "Item")
    protected List<Item> item;
    @XmlAttribute(name = "Num", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String num;

    /**
     * classTitleプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link ClassTitle }
     *     
     */
    public ClassTitle getClassTitle() {
        return classTitle;
    }

    /**
     * classTitleプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link ClassTitle }
     *     
     */
    public void setClassTitle(ClassTitle value) {
        this.classTitle = value;
    }

    /**
     * classSentenceプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link ClassSentence }
     *     
     */
    public ClassSentence getClassSentence() {
        return classSentence;
    }

    /**
     * classSentenceプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link ClassSentence }
     *     
     */
    public void setClassSentence(ClassSentence value) {
        this.classSentence = value;
    }

    /**
     * Gets the value of the item property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the item property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Item }
     * 
     * 
     */
    public List<Item> getItem() {
        if (item == null) {
            item = new ArrayList<Item>();
        }
        return this.item;
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

}
