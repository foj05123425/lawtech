//
// このファイルは、JavaTM Architecture for XML Binding(JAXB) Reference Implementation、v2.2.8-b130911.1802によって生成されました 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>を参照してください 
// ソース・スキーマの再コンパイル時にこのファイルの変更は失われます。 
// 生成日: 2021.02.27 時間 09:22:30 AM GMT+09:00 
//


package generated;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element ref="{}LawNum"/>
 *         &lt;element ref="{}LawBody"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Era" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="Meiji"/>
 *             &lt;enumeration value="Taisho"/>
 *             &lt;enumeration value="Showa"/>
 *             &lt;enumeration value="Heisei"/>
 *             &lt;enumeration value="Reiwa"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Year" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *       &lt;attribute name="Num" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *       &lt;attribute name="PromulgateMonth" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *       &lt;attribute name="PromulgateDay" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *       &lt;attribute name="LawType" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="Constitution"/>
 *             &lt;enumeration value="Act"/>
 *             &lt;enumeration value="CabinetOrder"/>
 *             &lt;enumeration value="ImperialOrder"/>
 *             &lt;enumeration value="MinisterialOrdinance"/>
 *             &lt;enumeration value="Rule"/>
 *             &lt;enumeration value="Misc"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Lang" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="ja"/>
 *             &lt;enumeration value="en"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "lawNum",
    "lawBody"
})
@XmlRootElement(name = "Law")
public class Law {

    @XmlElement(name = "LawNum", required = true)
    protected String lawNum;
    @XmlElement(name = "LawBody", required = true)
    protected LawBody lawBody;
    @XmlAttribute(name = "Era", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String era;
    @XmlAttribute(name = "Year", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger year;
    @XmlAttribute(name = "Num", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger num;
    @XmlAttribute(name = "PromulgateMonth")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger promulgateMonth;
    @XmlAttribute(name = "PromulgateDay")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger promulgateDay;
    @XmlAttribute(name = "LawType", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String lawType;
    @XmlAttribute(name = "Lang", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String lang;

    /**
     * lawNumプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLawNum() {
        return lawNum;
    }

    /**
     * lawNumプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLawNum(String value) {
        this.lawNum = value;
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

    /**
     * eraプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEra() {
        return era;
    }

    /**
     * eraプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEra(String value) {
        this.era = value;
    }

    /**
     * yearプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getYear() {
        return year;
    }

    /**
     * yearプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setYear(BigInteger value) {
        this.year = value;
    }

    /**
     * numプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNum() {
        return num;
    }

    /**
     * numプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNum(BigInteger value) {
        this.num = value;
    }

    /**
     * promulgateMonthプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPromulgateMonth() {
        return promulgateMonth;
    }

    /**
     * promulgateMonthプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPromulgateMonth(BigInteger value) {
        this.promulgateMonth = value;
    }

    /**
     * promulgateDayプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPromulgateDay() {
        return promulgateDay;
    }

    /**
     * promulgateDayプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPromulgateDay(BigInteger value) {
        this.promulgateDay = value;
    }

    /**
     * lawTypeプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLawType() {
        return lawType;
    }

    /**
     * lawTypeプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLawType(String value) {
        this.lawType = value;
    }

    /**
     * langプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
    }

    /**
     * langプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLang(String value) {
        this.lang = value;
    }

}
