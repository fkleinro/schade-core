package de.drschade.lebensversicherung.grobrechner.business.berechnung.entity;

import de.drschade.lebensversicherung.grobrechner.business.FachObjekt;
import java.math.BigDecimal;
import java.util.regex.Pattern;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 *
 * @author fklein-robbenhaar
 */
@Entity
@Table(name = "BERECHNUNG_ERGEBNIS")
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@JsonIgnoreProperties(ignoreUnknown = true)
public class BerechnungErgebnis extends FachObjekt {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id;

    @Column
    BigDecimal rueErstattungApprox;

    @Column
    BigDecimal rueErstattungApproxVon;

    @Column
    BigDecimal rueErstattungApproxBis;

    @Column
    BigDecimal ruePfuschApprox;

    @Column
    BigDecimal rueErstattungApproxSup;

    @Column
    BigDecimal rueErstattungApproxSupVon;

    @Column
    BigDecimal rueErstattungApproxSupBis;

    @Column
    BigDecimal rueErstattungRKWApproxSup;

    @Column
    BigDecimal rueErstattungRKWApproxSupVon;

    @Column
    BigDecimal rueErstattungRKWApproxSupBis;

    @Column
    BigDecimal ruePfuschApproxSup;

    @Column
    BigDecimal beitragSummeApproxEcht;

    @Column
    BigDecimal beitragSummeApproxGesamt;

    @Column
    BigDecimal beitragSummeSparbeitrag;

    @Column
    BigDecimal beitragSummeRisikobeitragApprox;

    @Column
    BigDecimal beitragSummeRisikobeitragTodApprox;

    @Column
    BigDecimal beitragSummeRisikobeitragBUApprox;

    @Column
    BigDecimal rkwApprox;

    @Column
    BigDecimal deckKapitalApprox;

    @Column
    Integer plausiCode;

    @Column
    Boolean plausibel;
    
    @Column
    String fehlerWarnungen;

    @OneToOne
    @PrimaryKeyJoinColumn
    private Berechnung berechnung;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Berechnung getBerechnung() {
        return berechnung;
    }

    public void setBerechnung(Berechnung berechnung) {
        this.berechnung = berechnung;
    }

    public BigDecimal getRueErstattungApprox() {
        return rueErstattungApprox;
    }

    public void setRueErstattungApprox(BigDecimal rueErstattungApprox) {
        this.rueErstattungApprox = rueErstattungApprox;
    }

    public BigDecimal getRueErstattungApproxVon() {
        return rueErstattungApproxVon;
    }

    public void setRueErstattungApproxVon(BigDecimal rueErstattungApproxVon) {
        this.rueErstattungApproxVon = rueErstattungApproxVon;
    }

    public BigDecimal getRueErstattungApproxBis() {
        return rueErstattungApproxBis;
    }

    public void setRueErstattungApproxBis(BigDecimal rueErstattungApproxBis) {
        this.rueErstattungApproxBis = rueErstattungApproxBis;
    }

    public BigDecimal getRuePfuschApprox() {
        return ruePfuschApprox;
    }

    public void setRuePfuschApprox(BigDecimal ruePfuschApprox) {
        this.ruePfuschApprox = ruePfuschApprox;
    }

    public BigDecimal getRueErstattungApproxSup() {
        return rueErstattungApproxSup;
    }

    public void setRueErstattungApproxSup(BigDecimal rueErstattungApproxSup) {
        this.rueErstattungApproxSup = rueErstattungApproxSup;
    }

    public BigDecimal getRueErstattungApproxSupVon() {
        return rueErstattungApproxSupVon;
    }

    public void setRueErstattungApproxSupVon(BigDecimal rueErstattungApproxSupVon) {
        this.rueErstattungApproxSupVon = rueErstattungApproxSupVon;
    }

    public BigDecimal getRueErstattungApproxSupBis() {
        return rueErstattungApproxSupBis;
    }

    public void setRueErstattungApproxSupBis(BigDecimal rueErstattungApproxSupBis) {
        this.rueErstattungApproxSupBis = rueErstattungApproxSupBis;
    }

    public BigDecimal getRueErstattungRKWApproxSup() {
        return rueErstattungRKWApproxSup;
    }

    public void setRueErstattungRKWApproxSup(BigDecimal rueErstattungRKWApproxSup) {
        this.rueErstattungRKWApproxSup = rueErstattungRKWApproxSup;
    }

    public BigDecimal getRueErstattungRKWApproxSupVon() {
        return rueErstattungRKWApproxSupVon;
    }

    public void setRueErstattungRKWApproxSupVon(BigDecimal rueErstattungRKWApproxSupVon) {
        this.rueErstattungRKWApproxSupVon = rueErstattungRKWApproxSupVon;
    }

    public BigDecimal getRueErstattungRKWApproxSupBis() {
        return rueErstattungRKWApproxSupBis;
    }

    public void setRueErstattungRKWApproxSupBis(BigDecimal rueErstattungRKWApproxSupBis) {
        this.rueErstattungRKWApproxSupBis = rueErstattungRKWApproxSupBis;
    }

    public BigDecimal getRuePfuschApproxSup() {
        return ruePfuschApproxSup;
    }

    public void setRuePfuschApproxSup(BigDecimal ruePfuschApproxSup) {
        this.ruePfuschApproxSup = ruePfuschApproxSup;
    }

    public BigDecimal getBeitragSummeApproxEcht() {
        return beitragSummeApproxEcht;
    }

    public void setBeitragSummeApproxEcht(BigDecimal beitragSummeApproxEcht) {
        this.beitragSummeApproxEcht = beitragSummeApproxEcht;
    }

    public BigDecimal getBeitragSummeApproxGesamt() {
        return beitragSummeApproxGesamt;
    }

    public void setBeitragSummeApproxGesamt(BigDecimal beitragSummeApproxGesamt) {
        this.beitragSummeApproxGesamt = beitragSummeApproxGesamt;
    }

    public BigDecimal getBeitragSummeSparbeitrag() {
        return beitragSummeSparbeitrag;
    }

    public void setBeitragSummeSparbeitrag(BigDecimal beitragSummeSparbeitrag) {
        this.beitragSummeSparbeitrag = beitragSummeSparbeitrag;
    }

    public BigDecimal getBeitragSummeRisikobeitragApprox() {
        return beitragSummeRisikobeitragApprox;
    }

    public void setBeitragSummeRisikobeitragApprox(BigDecimal beitragSummeRisikobeitragApprox) {
        this.beitragSummeRisikobeitragApprox = beitragSummeRisikobeitragApprox;
    }

    public BigDecimal getBeitragSummeRisikobeitragTodApprox() {
        return beitragSummeRisikobeitragTodApprox;
    }

    public void setBeitragSummeRisikobeitragTodApprox(BigDecimal beitragSummeRisikobeitragTodApprox) {
        this.beitragSummeRisikobeitragTodApprox = beitragSummeRisikobeitragTodApprox;
    }

    public BigDecimal getBeitragSummeRisikobeitragBUApprox() {
        return beitragSummeRisikobeitragBUApprox;
    }

    public void setBeitragSummeRisikobeitragBUApprox(BigDecimal beitragSummeRisikobeitragBUApprox) {
        this.beitragSummeRisikobeitragBUApprox = beitragSummeRisikobeitragBUApprox;
    }

    public BigDecimal getRkwApprox() {
        return rkwApprox;
    }

    public void setRkwApprox(BigDecimal rkwApprox) {
        this.rkwApprox = rkwApprox;
    }

    public BigDecimal getDeckKapitalApprox() {
        return deckKapitalApprox;
    }

    public void setDeckKapitalApprox(BigDecimal deckKapitalApprox) {
        this.deckKapitalApprox = deckKapitalApprox;
    }

    public Integer getPlausiCode() {
        return plausiCode;
    }

    public void setPlausiCode(Integer plausiCode) {
        this.plausiCode = plausiCode;
    }

    public Boolean getPlausibel() {
        return plausibel;
    }

    public void setPlausibel(Boolean plausibel) {
        this.plausibel = plausibel;
    }

    public String getFehlerWarnungen() {
        return fehlerWarnungen;
    }

    public String getFehlerWarnungenPretty() {
        String prettyStr = fehlerWarnungen;
        if (prettyStr.length() > 0) {
            //Semikolon in Zeilenumbruch
            //prettyStr = prettyStr.replaceAll(";", "&lt;br /&gt;");
        } else {
            prettyStr = "keine";
        }
        return prettyStr;
    }
    
    public void setFehlerWarnungen(String fehlerWarnungen) {
        this.fehlerWarnungen = fehlerWarnungen;
    }

    @Override
    public String toPrettyString() {
        return "undefiniert";
    }

}
