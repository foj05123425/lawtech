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
 *       &lt;choice>
 *         &lt;choice>
 *           &lt;element ref="{}LawTitle"/>
 *           &lt;element ref="{}Preamble"/>
 *           &lt;element ref="{}TOC"/>
 *           &lt;element ref="{}Part" maxOccurs="unbounded"/>
 *           &lt;element ref="{}PartTitle" maxOccurs="unbounded"/>
 *           &lt;element ref="{}Chapter" maxOccurs="unbounded"/>
 *           &lt;element ref="{}ChapterTitle" maxOccurs="unbounded"/>
 *           &lt;element ref="{}Section" maxOccurs="unbounded"/>
 *           &lt;element ref="{}SectionTitle" maxOccurs="unbounded"/>
 *           &lt;element ref="{}Subsection" maxOccurs="unbounded"/>
 *           &lt;element ref="{}SubsectionTitle" maxOccurs="unbounded"/>
 *           &lt;element ref="{}Division" maxOccurs="unbounded"/>
 *           &lt;element ref="{}DivisionTitle" maxOccurs="unbounded"/>
 *           &lt;element ref="{}Article" maxOccurs="unbounded"/>
 *           &lt;element ref="{}SupplNote" maxOccurs="unbounded"/>
 *           &lt;element ref="{}Paragraph" maxOccurs="unbounded"/>
 *           &lt;element ref="{}Item" maxOccurs="unbounded"/>
 *           &lt;element ref="{}Subitem1" maxOccurs="unbounded"/>
 *           &lt;element ref="{}Subitem2" maxOccurs="unbounded"/>
 *           &lt;element ref="{}Subitem3" maxOccurs="unbounded"/>
 *           &lt;element ref="{}Subitem4" maxOccurs="unbounded"/>
 *           &lt;element ref="{}Subitem5" maxOccurs="unbounded"/>
 *           &lt;element ref="{}Subitem6" maxOccurs="unbounded"/>
 *           &lt;element ref="{}Subitem7" maxOccurs="unbounded"/>
 *           &lt;element ref="{}Subitem8" maxOccurs="unbounded"/>
 *           &lt;element ref="{}Subitem9" maxOccurs="unbounded"/>
 *           &lt;element ref="{}Subitem10" maxOccurs="unbounded"/>
 *           &lt;element ref="{}List" maxOccurs="unbounded"/>
 *           &lt;element ref="{}Sentence" maxOccurs="unbounded"/>
 *           &lt;element ref="{}AmendProvision" maxOccurs="unbounded"/>
 *           &lt;element ref="{}AppdxTable" maxOccurs="unbounded"/>
 *           &lt;element ref="{}AppdxNote" maxOccurs="unbounded"/>
 *           &lt;element ref="{}AppdxStyle" maxOccurs="unbounded"/>
 *           &lt;element ref="{}Appdx" maxOccurs="unbounded"/>
 *           &lt;element ref="{}AppdxFig" maxOccurs="unbounded"/>
 *           &lt;element ref="{}AppdxFormat" maxOccurs="unbounded"/>
 *           &lt;element ref="{}SupplProvisionAppdxStyle" maxOccurs="unbounded"/>
 *           &lt;element ref="{}SupplProvisionAppdxTable" maxOccurs="unbounded"/>
 *           &lt;element ref="{}SupplProvisionAppdx" maxOccurs="unbounded"/>
 *           &lt;element ref="{}TableStruct"/>
 *           &lt;element ref="{}TableRow" maxOccurs="unbounded"/>
 *           &lt;element ref="{}TableColumn" maxOccurs="unbounded"/>
 *           &lt;element ref="{}FigStruct"/>
 *           &lt;element ref="{}NoteStruct"/>
 *           &lt;element ref="{}StyleStruct"/>
 *           &lt;element ref="{}FormatStruct"/>
 *           &lt;element ref="{}Remarks"/>
 *         &lt;/choice>
 *         &lt;element ref="{}LawBody"/>
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
    "lawTitle",
    "preamble",
    "toc",
    "part",
    "partTitle",
    "chapter",
    "chapterTitle",
    "section",
    "sectionTitle",
    "subsection",
    "subsectionTitle",
    "division",
    "divisionTitle",
    "article",
    "supplNote",
    "paragraph",
    "item",
    "subitem1",
    "subitem2",
    "subitem3",
    "subitem4",
    "subitem5",
    "subitem6",
    "subitem7",
    "subitem8",
    "subitem9",
    "subitem10",
    "list",
    "sentence",
    "amendProvision",
    "appdxTable",
    "appdxNote",
    "appdxStyle",
    "appdx",
    "appdxFig",
    "appdxFormat",
    "supplProvisionAppdxStyle",
    "supplProvisionAppdxTable",
    "supplProvisionAppdx",
    "tableStruct",
    "tableRow",
    "tableColumn",
    "figStruct",
    "noteStruct",
    "styleStruct",
    "formatStruct",
    "remarks",
    "lawBody"
})
@XmlRootElement(name = "NewProvision")
public class NewProvision {

    @XmlElement(name = "LawTitle")
    protected LawTitle lawTitle;
    @XmlElement(name = "Preamble")
    protected Preamble preamble;
    @XmlElement(name = "TOC")
    protected TOC toc;
    @XmlElement(name = "Part")
    protected java.util.List<Part> part;
    @XmlElement(name = "PartTitle")
    protected java.util.List<PartTitle> partTitle;
    @XmlElement(name = "Chapter")
    protected java.util.List<Chapter> chapter;
    @XmlElement(name = "ChapterTitle")
    protected java.util.List<ChapterTitle> chapterTitle;
    @XmlElement(name = "Section")
    protected java.util.List<Section> section;
    @XmlElement(name = "SectionTitle")
    protected java.util.List<SectionTitle> sectionTitle;
    @XmlElement(name = "Subsection")
    protected java.util.List<Subsection> subsection;
    @XmlElement(name = "SubsectionTitle")
    protected java.util.List<SubsectionTitle> subsectionTitle;
    @XmlElement(name = "Division")
    protected java.util.List<Division> division;
    @XmlElement(name = "DivisionTitle")
    protected java.util.List<DivisionTitle> divisionTitle;
    @XmlElement(name = "Article")
    protected java.util.List<Article> article;
    @XmlElement(name = "SupplNote")
    protected java.util.List<SupplNote> supplNote;
    @XmlElement(name = "Paragraph")
    protected java.util.List<Paragraph> paragraph;
    @XmlElement(name = "Item")
    protected java.util.List<Item> item;
    @XmlElement(name = "Subitem1")
    protected java.util.List<Subitem1> subitem1;
    @XmlElement(name = "Subitem2")
    protected java.util.List<Subitem2> subitem2;
    @XmlElement(name = "Subitem3")
    protected java.util.List<Subitem3> subitem3;
    @XmlElement(name = "Subitem4")
    protected java.util.List<Subitem4> subitem4;
    @XmlElement(name = "Subitem5")
    protected java.util.List<Subitem5> subitem5;
    @XmlElement(name = "Subitem6")
    protected java.util.List<Subitem6> subitem6;
    @XmlElement(name = "Subitem7")
    protected java.util.List<Subitem7> subitem7;
    @XmlElement(name = "Subitem8")
    protected java.util.List<Subitem8> subitem8;
    @XmlElement(name = "Subitem9")
    protected java.util.List<Subitem9> subitem9;
    @XmlElement(name = "Subitem10")
    protected java.util.List<Subitem10> subitem10;
    @XmlElement(name = "List")
    protected java.util.List<generated.List> list;
    @XmlElement(name = "Sentence")
    protected java.util.List<Sentence> sentence;
    @XmlElement(name = "AmendProvision")
    protected java.util.List<AmendProvision> amendProvision;
    @XmlElement(name = "AppdxTable")
    protected java.util.List<AppdxTable> appdxTable;
    @XmlElement(name = "AppdxNote")
    protected java.util.List<AppdxNote> appdxNote;
    @XmlElement(name = "AppdxStyle")
    protected java.util.List<AppdxStyle> appdxStyle;
    @XmlElement(name = "Appdx")
    protected java.util.List<Appdx> appdx;
    @XmlElement(name = "AppdxFig")
    protected java.util.List<AppdxFig> appdxFig;
    @XmlElement(name = "AppdxFormat")
    protected java.util.List<AppdxFormat> appdxFormat;
    @XmlElement(name = "SupplProvisionAppdxStyle")
    protected java.util.List<SupplProvisionAppdxStyle> supplProvisionAppdxStyle;
    @XmlElement(name = "SupplProvisionAppdxTable")
    protected java.util.List<SupplProvisionAppdxTable> supplProvisionAppdxTable;
    @XmlElement(name = "SupplProvisionAppdx")
    protected java.util.List<SupplProvisionAppdx> supplProvisionAppdx;
    @XmlElement(name = "TableStruct")
    protected TableStruct tableStruct;
    @XmlElement(name = "TableRow")
    protected java.util.List<TableRow> tableRow;
    @XmlElement(name = "TableColumn")
    protected java.util.List<TableColumn> tableColumn;
    @XmlElement(name = "FigStruct")
    protected FigStruct figStruct;
    @XmlElement(name = "NoteStruct")
    protected NoteStruct noteStruct;
    @XmlElement(name = "StyleStruct")
    protected StyleStruct styleStruct;
    @XmlElement(name = "FormatStruct")
    protected FormatStruct formatStruct;
    @XmlElement(name = "Remarks")
    protected Remarks remarks;
    @XmlElement(name = "LawBody")
    protected LawBody lawBody;

    /**
     * lawTitleプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link LawTitle }
     *     
     */
    public LawTitle getLawTitle() {
        return lawTitle;
    }

    /**
     * lawTitleプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link LawTitle }
     *     
     */
    public void setLawTitle(LawTitle value) {
        this.lawTitle = value;
    }

    /**
     * preambleプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Preamble }
     *     
     */
    public Preamble getPreamble() {
        return preamble;
    }

    /**
     * preambleプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Preamble }
     *     
     */
    public void setPreamble(Preamble value) {
        this.preamble = value;
    }

    /**
     * tocプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TOC }
     *     
     */
    public TOC getTOC() {
        return toc;
    }

    /**
     * tocプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TOC }
     *     
     */
    public void setTOC(TOC value) {
        this.toc = value;
    }

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
    public java.util.List<Part> getPart() {
        if (part == null) {
            part = new ArrayList<Part>();
        }
        return this.part;
    }

    /**
     * Gets the value of the partTitle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partTitle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartTitle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartTitle }
     * 
     * 
     */
    public java.util.List<PartTitle> getPartTitle() {
        if (partTitle == null) {
            partTitle = new ArrayList<PartTitle>();
        }
        return this.partTitle;
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
    public java.util.List<Chapter> getChapter() {
        if (chapter == null) {
            chapter = new ArrayList<Chapter>();
        }
        return this.chapter;
    }

    /**
     * Gets the value of the chapterTitle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chapterTitle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChapterTitle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChapterTitle }
     * 
     * 
     */
    public java.util.List<ChapterTitle> getChapterTitle() {
        if (chapterTitle == null) {
            chapterTitle = new ArrayList<ChapterTitle>();
        }
        return this.chapterTitle;
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
    public java.util.List<Section> getSection() {
        if (section == null) {
            section = new ArrayList<Section>();
        }
        return this.section;
    }

    /**
     * Gets the value of the sectionTitle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sectionTitle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSectionTitle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SectionTitle }
     * 
     * 
     */
    public java.util.List<SectionTitle> getSectionTitle() {
        if (sectionTitle == null) {
            sectionTitle = new ArrayList<SectionTitle>();
        }
        return this.sectionTitle;
    }

    /**
     * Gets the value of the subsection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subsection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubsection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Subsection }
     * 
     * 
     */
    public java.util.List<Subsection> getSubsection() {
        if (subsection == null) {
            subsection = new ArrayList<Subsection>();
        }
        return this.subsection;
    }

    /**
     * Gets the value of the subsectionTitle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subsectionTitle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubsectionTitle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubsectionTitle }
     * 
     * 
     */
    public java.util.List<SubsectionTitle> getSubsectionTitle() {
        if (subsectionTitle == null) {
            subsectionTitle = new ArrayList<SubsectionTitle>();
        }
        return this.subsectionTitle;
    }

    /**
     * Gets the value of the division property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the division property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDivision().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Division }
     * 
     * 
     */
    public java.util.List<Division> getDivision() {
        if (division == null) {
            division = new ArrayList<Division>();
        }
        return this.division;
    }

    /**
     * Gets the value of the divisionTitle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the divisionTitle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDivisionTitle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DivisionTitle }
     * 
     * 
     */
    public java.util.List<DivisionTitle> getDivisionTitle() {
        if (divisionTitle == null) {
            divisionTitle = new ArrayList<DivisionTitle>();
        }
        return this.divisionTitle;
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
    public java.util.List<Article> getArticle() {
        if (article == null) {
            article = new ArrayList<Article>();
        }
        return this.article;
    }

    /**
     * Gets the value of the supplNote property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supplNote property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupplNote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplNote }
     * 
     * 
     */
    public java.util.List<SupplNote> getSupplNote() {
        if (supplNote == null) {
            supplNote = new ArrayList<SupplNote>();
        }
        return this.supplNote;
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
    public java.util.List<Paragraph> getParagraph() {
        if (paragraph == null) {
            paragraph = new ArrayList<Paragraph>();
        }
        return this.paragraph;
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
    public java.util.List<Item> getItem() {
        if (item == null) {
            item = new ArrayList<Item>();
        }
        return this.item;
    }

    /**
     * Gets the value of the subitem1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subitem1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubitem1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Subitem1 }
     * 
     * 
     */
    public java.util.List<Subitem1> getSubitem1() {
        if (subitem1 == null) {
            subitem1 = new ArrayList<Subitem1>();
        }
        return this.subitem1;
    }

    /**
     * Gets the value of the subitem2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subitem2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubitem2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Subitem2 }
     * 
     * 
     */
    public java.util.List<Subitem2> getSubitem2() {
        if (subitem2 == null) {
            subitem2 = new ArrayList<Subitem2>();
        }
        return this.subitem2;
    }

    /**
     * Gets the value of the subitem3 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subitem3 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubitem3().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Subitem3 }
     * 
     * 
     */
    public java.util.List<Subitem3> getSubitem3() {
        if (subitem3 == null) {
            subitem3 = new ArrayList<Subitem3>();
        }
        return this.subitem3;
    }

    /**
     * Gets the value of the subitem4 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subitem4 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubitem4().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Subitem4 }
     * 
     * 
     */
    public java.util.List<Subitem4> getSubitem4() {
        if (subitem4 == null) {
            subitem4 = new ArrayList<Subitem4>();
        }
        return this.subitem4;
    }

    /**
     * Gets the value of the subitem5 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subitem5 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubitem5().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Subitem5 }
     * 
     * 
     */
    public java.util.List<Subitem5> getSubitem5() {
        if (subitem5 == null) {
            subitem5 = new ArrayList<Subitem5>();
        }
        return this.subitem5;
    }

    /**
     * Gets the value of the subitem6 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subitem6 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubitem6().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Subitem6 }
     * 
     * 
     */
    public java.util.List<Subitem6> getSubitem6() {
        if (subitem6 == null) {
            subitem6 = new ArrayList<Subitem6>();
        }
        return this.subitem6;
    }

    /**
     * Gets the value of the subitem7 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subitem7 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubitem7().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Subitem7 }
     * 
     * 
     */
    public java.util.List<Subitem7> getSubitem7() {
        if (subitem7 == null) {
            subitem7 = new ArrayList<Subitem7>();
        }
        return this.subitem7;
    }

    /**
     * Gets the value of the subitem8 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subitem8 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubitem8().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Subitem8 }
     * 
     * 
     */
    public java.util.List<Subitem8> getSubitem8() {
        if (subitem8 == null) {
            subitem8 = new ArrayList<Subitem8>();
        }
        return this.subitem8;
    }

    /**
     * Gets the value of the subitem9 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subitem9 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubitem9().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Subitem9 }
     * 
     * 
     */
    public java.util.List<Subitem9> getSubitem9() {
        if (subitem9 == null) {
            subitem9 = new ArrayList<Subitem9>();
        }
        return this.subitem9;
    }

    /**
     * Gets the value of the subitem10 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subitem10 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubitem10().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Subitem10 }
     * 
     * 
     */
    public java.util.List<Subitem10> getSubitem10() {
        if (subitem10 == null) {
            subitem10 = new ArrayList<Subitem10>();
        }
        return this.subitem10;
    }

    /**
     * Gets the value of the list property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the list property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link generated.List }
     * 
     * 
     */
    public java.util.List<generated.List> getList() {
        if (list == null) {
            list = new ArrayList<generated.List>();
        }
        return this.list;
    }

    /**
     * Gets the value of the sentence property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sentence property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSentence().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Sentence }
     * 
     * 
     */
    public java.util.List<Sentence> getSentence() {
        if (sentence == null) {
            sentence = new ArrayList<Sentence>();
        }
        return this.sentence;
    }

    /**
     * Gets the value of the amendProvision property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the amendProvision property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAmendProvision().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmendProvision }
     * 
     * 
     */
    public java.util.List<AmendProvision> getAmendProvision() {
        if (amendProvision == null) {
            amendProvision = new ArrayList<AmendProvision>();
        }
        return this.amendProvision;
    }

    /**
     * Gets the value of the appdxTable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the appdxTable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAppdxTable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AppdxTable }
     * 
     * 
     */
    public java.util.List<AppdxTable> getAppdxTable() {
        if (appdxTable == null) {
            appdxTable = new ArrayList<AppdxTable>();
        }
        return this.appdxTable;
    }

    /**
     * Gets the value of the appdxNote property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the appdxNote property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAppdxNote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AppdxNote }
     * 
     * 
     */
    public java.util.List<AppdxNote> getAppdxNote() {
        if (appdxNote == null) {
            appdxNote = new ArrayList<AppdxNote>();
        }
        return this.appdxNote;
    }

    /**
     * Gets the value of the appdxStyle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the appdxStyle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAppdxStyle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AppdxStyle }
     * 
     * 
     */
    public java.util.List<AppdxStyle> getAppdxStyle() {
        if (appdxStyle == null) {
            appdxStyle = new ArrayList<AppdxStyle>();
        }
        return this.appdxStyle;
    }

    /**
     * Gets the value of the appdx property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the appdx property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAppdx().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Appdx }
     * 
     * 
     */
    public java.util.List<Appdx> getAppdx() {
        if (appdx == null) {
            appdx = new ArrayList<Appdx>();
        }
        return this.appdx;
    }

    /**
     * Gets the value of the appdxFig property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the appdxFig property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAppdxFig().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AppdxFig }
     * 
     * 
     */
    public java.util.List<AppdxFig> getAppdxFig() {
        if (appdxFig == null) {
            appdxFig = new ArrayList<AppdxFig>();
        }
        return this.appdxFig;
    }

    /**
     * Gets the value of the appdxFormat property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the appdxFormat property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAppdxFormat().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AppdxFormat }
     * 
     * 
     */
    public java.util.List<AppdxFormat> getAppdxFormat() {
        if (appdxFormat == null) {
            appdxFormat = new ArrayList<AppdxFormat>();
        }
        return this.appdxFormat;
    }

    /**
     * Gets the value of the supplProvisionAppdxStyle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supplProvisionAppdxStyle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupplProvisionAppdxStyle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplProvisionAppdxStyle }
     * 
     * 
     */
    public java.util.List<SupplProvisionAppdxStyle> getSupplProvisionAppdxStyle() {
        if (supplProvisionAppdxStyle == null) {
            supplProvisionAppdxStyle = new ArrayList<SupplProvisionAppdxStyle>();
        }
        return this.supplProvisionAppdxStyle;
    }

    /**
     * Gets the value of the supplProvisionAppdxTable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supplProvisionAppdxTable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupplProvisionAppdxTable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplProvisionAppdxTable }
     * 
     * 
     */
    public java.util.List<SupplProvisionAppdxTable> getSupplProvisionAppdxTable() {
        if (supplProvisionAppdxTable == null) {
            supplProvisionAppdxTable = new ArrayList<SupplProvisionAppdxTable>();
        }
        return this.supplProvisionAppdxTable;
    }

    /**
     * Gets the value of the supplProvisionAppdx property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supplProvisionAppdx property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupplProvisionAppdx().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplProvisionAppdx }
     * 
     * 
     */
    public java.util.List<SupplProvisionAppdx> getSupplProvisionAppdx() {
        if (supplProvisionAppdx == null) {
            supplProvisionAppdx = new ArrayList<SupplProvisionAppdx>();
        }
        return this.supplProvisionAppdx;
    }

    /**
     * tableStructプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TableStruct }
     *     
     */
    public TableStruct getTableStruct() {
        return tableStruct;
    }

    /**
     * tableStructプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TableStruct }
     *     
     */
    public void setTableStruct(TableStruct value) {
        this.tableStruct = value;
    }

    /**
     * Gets the value of the tableRow property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tableRow property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTableRow().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TableRow }
     * 
     * 
     */
    public java.util.List<TableRow> getTableRow() {
        if (tableRow == null) {
            tableRow = new ArrayList<TableRow>();
        }
        return this.tableRow;
    }

    /**
     * Gets the value of the tableColumn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tableColumn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTableColumn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TableColumn }
     * 
     * 
     */
    public java.util.List<TableColumn> getTableColumn() {
        if (tableColumn == null) {
            tableColumn = new ArrayList<TableColumn>();
        }
        return this.tableColumn;
    }

    /**
     * figStructプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link FigStruct }
     *     
     */
    public FigStruct getFigStruct() {
        return figStruct;
    }

    /**
     * figStructプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link FigStruct }
     *     
     */
    public void setFigStruct(FigStruct value) {
        this.figStruct = value;
    }

    /**
     * noteStructプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link NoteStruct }
     *     
     */
    public NoteStruct getNoteStruct() {
        return noteStruct;
    }

    /**
     * noteStructプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link NoteStruct }
     *     
     */
    public void setNoteStruct(NoteStruct value) {
        this.noteStruct = value;
    }

    /**
     * styleStructプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link StyleStruct }
     *     
     */
    public StyleStruct getStyleStruct() {
        return styleStruct;
    }

    /**
     * styleStructプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link StyleStruct }
     *     
     */
    public void setStyleStruct(StyleStruct value) {
        this.styleStruct = value;
    }

    /**
     * formatStructプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link FormatStruct }
     *     
     */
    public FormatStruct getFormatStruct() {
        return formatStruct;
    }

    /**
     * formatStructプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link FormatStruct }
     *     
     */
    public void setFormatStruct(FormatStruct value) {
        this.formatStruct = value;
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

    /**
     * lawBodyプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link LawBody }
     *     
     */
    public LawBody getLawBody() {
        return lawBody;
    }

    /**
     * lawBodyプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link LawBody }
     *     
     */
    public void setLawBody(LawBody value) {
        this.lawBody = value;
    }

}
