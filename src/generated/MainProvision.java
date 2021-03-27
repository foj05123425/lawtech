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
 *         &lt;element ref="{}Part" maxOccurs="unbounded"/>
 *         &lt;element ref="{}Chapter" maxOccurs="unbounded"/>
 *         &lt;element ref="{}Section" maxOccurs="unbounded"/>
 *         &lt;element ref="{}Article" maxOccurs="unbounded"/>
 *         &lt;element ref="{}Paragraph" maxOccurs="unbounded"/>
 *       &lt;/choice>
 *       &lt;attribute name="Extract" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "part",
    "chapter",
    "section",
    "article",
    "paragraph"
})
@XmlRootElement(name = "MainProvision")
public class MainProvision {

    @XmlElement(name = "Part")
    protected List<Part> part;
    @XmlElement(name = "Chapter")
    protected List<Chapter> chapter;
    @XmlElement(name = "Section")
    protected List<Section> section;
    @XmlElement(name = "Article")
    protected List<Article> article;
    @XmlElement(name = "Paragraph")
    protected List<Paragraph> paragraph;
    @XmlAttribute(name = "Extract")
    protected Boolean extract;

    /**
     * Gets the value of the part property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the part property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPart().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Part }
     * 
     * 
     */
    public List<Part> getPart() {
        if (part == null) {
            part = new ArrayList<Part>();
        }
        return this.part;
    }

    /**
     * Gets the value of the chapter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chapter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChapter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Chapter }
     * 
     * 
     */
    public List<Chapter> getChapter() {
        if (chapter == null) {
            chapter = new ArrayList<Chapter>();
        }
        return this.chapter;
    }

    /**
     * Gets the value of the section property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the section property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Section }
     * 
     * 
     */
    public List<Section> getSection() {
        if (section == null) {
            section = new ArrayList<Section>();
        }
        return this.section;
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
     * Gets the value of the paragraph property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paragraph property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParagraph().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Paragraph }
     * 
     * 
     */
    public List<Paragraph> getParagraph() {
        if (paragraph == null) {
            paragraph = new ArrayList<Paragraph>();
        }
        return this.paragraph;
    }

    /**
     * extractプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExtract() {
        return extract;
    }

    /**
     * extractプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExtract(Boolean value) {
        this.extract = value;
    }

}
