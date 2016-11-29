package de.drschade.lebensversicherung.grobrechner.business.berechnung.entity;

import de.drschade.lebensversicherung.grobrechner.business.FachObjekt;
import de.drschade.lebensversicherung.grobrechner.business.benutzer.entity.Benutzer;
import java.math.BigDecimal;
import java.time.LocalDate;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 *
 * @author pschade
 */
@Entity
@Table(name = "BERECHNUNG")
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Berechnung extends FachObjekt {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id;

    @Column
    String key;

    @Column
    Integer landCode;

    @Column
    @NotNull(message = "Ein Geburtsjahr muss vorgegeben sein")
    Integer vertragVersPGeburtsjahr;

    @Column
    Integer vertragPartnerGeburtsjahr;

    @Column
    Boolean vertragVersPGeschlecht;

    @Column
    BigDecimal vertragBeitragPeriodisch;

    @Column
    BigDecimal vertragBeitragDynamikProzent;

    BigDecimal vertragBeitragDynamikProzentfuss;

    @Column
    BigDecimal VertragBeitragDynamikEuro;

    @Column
    Integer vertragBeitragDynamikRhythmus;

    @Column
    Integer vertragBeitragDynamikKuendigungJahr;

    @Column
    BigDecimal vertragBeitragAnfangseinlage;

    @Column
    Integer vertragBeitragPeriodischZahlweise;

    @Column
    Integer vertragTyp;

    @Column
    @NotNull(message = "Ein Vertragsbeginn bitte angeben")
    Integer vertragBeginnJahr;

    @Column
    Integer vertragEndeJahr;

    @Column
    Integer vertragEndeJahrBeitrag;

    @Column
    LocalDate vertragBeginnDatum;

    @Column
    LocalDate vertragEndeDatum;

    @Column
    Boolean vertragIsVerbundeneLeben;

    @Column
    Integer vertragLeistungTodArt;

    @Column
    BigDecimal vertragLeistungTodBetrag;

    @Column
    Integer vertragLeistungUnfalltodArt;

    @Column
    BigDecimal vertragLeistungUnfalltodBetrag;

    @Column
    Integer vertragLeistungBUArt;

    @Column
    private Boolean isBUBeitragsbefreiung;

    @Column
    BigDecimal vertragLeistungBUBetrag;

    @Column
    Integer vertragKuendigung;

    @Column
    Boolean vertragIsKuendigung;

    transient boolean vertragIsKuendigungTest;

    @Column
    Integer vertragKuendigungJahr;

    @Column
    LocalDate vertragKuendigungEndeDatum;

    @Column
    BigDecimal vertragKuendigungEndeBetrag;

    @Column
    Integer vertragBeitragPeriodischReduktionJahr;

    @Column
    BigDecimal vertragBeitragPeriodischReduktionEuro;

    @Column
    BigDecimal vertragAktuellRKWBetrag;

    @Column
    LocalDate vertragAktuellRKWDatum;

    @Column
    BigDecimal vertragPlausiBeitragssummeBetrag;

    @Column
    String email;

    @Column
    Boolean isGuiCheckedAktuellRKW;

    @Column
    Boolean isGuiCheckedBeitragsdynamik;

    @Column
    Boolean isGuiCheckedTodesfallleistung;

    @Column
    Boolean isGuiCheckedUnfalltodesfallleistung;

    @Column
    Boolean isGuiCheckedBULeistung;

    @OneToOne(mappedBy = "berechnung", cascade = CascadeType.ALL)
    BerechnungErgebnis ergebnis = new BerechnungErgebnis();

    @OneToOne
    @JoinColumn(name = "BENUTZER_ID")
    Benutzer benutzer = new Benutzer();

    public Berechnung() {
        reset();
        // TODO: @Philipp: wenn der Werte von reset und auskommentiert gleich, dann reset aufrufen und auskommentiert löschen
//        this.ergebnis.resultIsPlausible = Boolean.FALSE;
//        this.ergebnis.resultPlausiCode = 0; //Rückgabewert
//        this.landCode = 0; //0 = Deutschland, 1 = Österreich
//        this.vertragTyp = 0; //klassisch als Standard
//        this.vertragBeitragPeriodisch = new BigDecimal(0);
//        this.vertragBeitragDynamikProzent = new BigDecimal(0);
//        this.vertragBeitragDynamikRhythmus = 1;
//        this.vertragBeitragPeriodischZahlweise = 12;
//        this.vertragLeistungTodArt = 0;
//        this.vertragLeistungUnfalltodArt = 0;
//        this.vertragLeistungBUArt = 0;
//        this.vertragLeistungTodBetrag = new BigDecimal(0);
//        this.vertragLeistungUnfalltodBetrag = new BigDecimal(0);
//        this.vertragLeistungBUBetrag = new BigDecimal(0);
//        this.vertragKuendigung = 0;
//        this.vertragKuendigungJahr = 0;
//        this.vertragKuendigungEndeBetrag = new BigDecimal(0);
//        this.vertragKuendigungEndeDatum = null;
//        this.vertragAktuellRKWDatum = null;
//        //jetzt Ergebnisfelder vorbesetzen
//        this.ergebnis.resultRUeErstattungApprox = new BigDecimal(0);
//        this.ergebnis.resultRUeErstattungApproxVon = new BigDecimal(0);
//        this.ergebnis.resultRUeErstattungApproxBis = new BigDecimal(0);
//        this.ergebnis.resultRUeErstattungApproxSup = new BigDecimal(0);
//        this.ergebnis.resultRUeErstattungApproxSupVon = new BigDecimal(0);
//        this.ergebnis.resultRUeErstattungApproxSupBis = new BigDecimal(0);
//        this.ergebnis.resultBeitragSummeApproxEcht = new BigDecimal(0); //echt
//        this.ergebnis.resultBeitragSummeApproxGesamt = new BigDecimal(0);
//        this.ergebnis.resultBeitragSummeSparbeitrag = new BigDecimal(0);
//        this.ergebnis.resultBeitragSummeRisikobeitragApprox = new BigDecimal(0);
//        this.ergebnis.resultBeitragSummeRisikobeitragBUApprox = new BigDecimal(0);
//        this.ergebnis.resultBeitragSummeRisikobeitragTodApprox = new BigDecimal(0);
//        this.ergebnis.resultRUePfuschApprox = new BigDecimal(0);
//        this.ergebnis.resultRUePfuschApproxSup = new BigDecimal(0);
//        this.ergebnis.resultRKWApprox = new BigDecimal(0);
//        this.ergebnis.resultDeckKapitalApprox = new BigDecimal(0);
//        this.ergebnis.resultRUeErstattungRKWApproxSup = new BigDecimal(0);
//        this.ergebnis.resultRUeErstattungRKWApproxSupVon = new BigDecimal(0);
//        this.ergebnis.resultRUeErstattungRKWApproxSupBis = new BigDecimal(0);
    }

    /*
     * Resettet das Berechnungsobjekt und bereitet damit eine nächste Berechnung vor
     */
    public void reset() {
        this.ergebnis.plausibel = Boolean.FALSE;
        this.ergebnis.plausiCode = 0; //Rückgabewert
        this.setLandCode(1); //1 = Deutschland, 2 = Österreich
        this.setVertragTyp(1); //klassisch als Standard
        this.setVertragBeitragPeriodisch(BigDecimal.ZERO);
        this.setVertragBeitragPeriodischZahlweise(12);
        this.setVertragBeitragAnfangseinlage(BigDecimal.ZERO);
        this.setVertragBeitragDynamikProzent(BigDecimal.ZERO);
        this.setVertragBeitragDynamikRhythmus((Integer) 1);
        this.setVertragBeitragDynamikKuendigungJahr(null);
        this.setVertragBeitragDynamikEuro(BigDecimal.ZERO);
        this.setVertragVersPGeschlecht(Boolean.TRUE);
        this.setVertragVersPGeburtsjahr(null);
        this.setVertragPartnerGeburtsjahr(null);
        this.setVertragBeginnJahr(null);
        this.setVertragEndeJahr(null);
        this.setVertragEndeJahrBeitrag(null);
        this.setVertragKuendigung(0);
        this.setVertragKuendigungJahr(null);
        this.setVertragKuendigungEndeBetrag(BigDecimal.ZERO);
        this.setVertragKuendigungEndeDatum(null);
        this.setVertragLeistungTodArt((Integer) 0);
        this.setVertragLeistungTodBetrag(BigDecimal.ZERO);
        this.setVertragLeistungUnfalltodArt((Integer) 0);
        this.setVertragLeistungUnfalltodBetrag(BigDecimal.ZERO);
        this.setVertragLeistungBUArt((Integer) 0);
        this.setVertragLeistungBUBetrag(BigDecimal.ZERO);
        this.setVertragIsVerbundeneLeben(Boolean.FALSE);
        this.setVertragAktuellRKWBetrag(BigDecimal.ZERO);
        this.setVertragAktuellRKWDatum(null);
        this.setVertragBeitragPeriodischReduktionJahr(null);
        this.setVertragBeitragPeriodischReduktionEuro(BigDecimal.ZERO);
        this.setVertragPlausiBeitragssummeBetrag(BigDecimal.ZERO);

        //Rückgabefelder noch resetten
        this.getErgebnis().setRueErstattungApprox(BigDecimal.ZERO);
        this.getErgebnis().setRueErstattungApproxVon(BigDecimal.ZERO);
        this.getErgebnis().setRueErstattungApproxBis(BigDecimal.ZERO);
        this.getErgebnis().setRueErstattungApproxSup(BigDecimal.ZERO);
        this.getErgebnis().setRueErstattungApproxSupVon(BigDecimal.ZERO);
        this.getErgebnis().setRueErstattungApproxSupBis(BigDecimal.ZERO);
        this.getErgebnis().setBeitragSummeApproxEcht(BigDecimal.ZERO); //echt
        this.getErgebnis().setBeitragSummeApproxGesamt(BigDecimal.ZERO);
        this.getErgebnis().setBeitragSummeSparbeitrag(BigDecimal.ZERO);
        this.getErgebnis().setBeitragSummeRisikobeitragApprox(BigDecimal.ZERO);
        this.getErgebnis().setBeitragSummeRisikobeitragBUApprox(BigDecimal.ZERO);
        this.getErgebnis().setBeitragSummeRisikobeitragTodApprox(BigDecimal.ZERO);
        this.getErgebnis().setRuePfuschApprox(BigDecimal.ZERO);
        this.getErgebnis().setRuePfuschApproxSup(BigDecimal.ZERO);
        this.getErgebnis().setDeckKapitalApprox(BigDecimal.ZERO);
        this.getErgebnis().setRkwApprox(BigDecimal.ZERO);
        this.getErgebnis().setRueErstattungRKWApproxSup(BigDecimal.ZERO);
        this.getErgebnis().setRueErstattungRKWApproxSupVon(BigDecimal.ZERO);
        this.getErgebnis().setRueErstattungRKWApproxSupBis(BigDecimal.ZERO);
    }

    public Integer getLandCode() {
        return landCode;
    }

    public void setLandCode(Integer landCode) {
        this.landCode = landCode;
    }

    public BerechnungErgebnis getErgebnis() {
        return ergebnis;
    }

    public void setErgebnis(BerechnungErgebnis ergebnis) {
        this.ergebnis = ergebnis;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getVertragVersPGeburtsjahr() {
        return vertragVersPGeburtsjahr;
    }

    public void setVertragVersPGeburtsjahr(Integer vertragVersPGeburtsjahr) {
        this.vertragVersPGeburtsjahr = vertragVersPGeburtsjahr;
    }

    public Boolean getVertragVersPGeschlecht() {
        return vertragVersPGeschlecht;
    }

    public void setVertragVersPGeschlecht(Boolean vertragVersPGeschlecht) {
        this.vertragVersPGeschlecht = vertragVersPGeschlecht;
    }

    public BigDecimal getVertragBeitragPeriodisch() {
        return vertragBeitragPeriodisch;
    }

    public void setVertragBeitragPeriodisch(BigDecimal vertragBeitragPeriodisch) {
        this.vertragBeitragPeriodisch = vertragBeitragPeriodisch;
    }

    public Integer getVertragBeitragPeriodischZahlweise() {
        return vertragBeitragPeriodischZahlweise;
    }

    public void setVertragBeitragPeriodischZahlweise(Integer vertragBeitragPeriodischZahlweise) {
        this.vertragBeitragPeriodischZahlweise = vertragBeitragPeriodischZahlweise;
    }

    public BigDecimal getVertragBeitragDynamikProzent() {
        return vertragBeitragDynamikProzent;
    }

    public void setVertragBeitragDynamikProzent(BigDecimal vertragBeitragDynamikProzent) {
        if (vertragBeitragDynamikProzent != null) {
            if (vertragBeitragDynamikProzent.doubleValue() > 0.25) {
                // Dynamik scheint in Prozentpunkt p angegeben, statt in Prozent
                this.vertragBeitragDynamikProzent = vertragBeitragDynamikProzent.divide(BigDecimal.valueOf(100));
            } else {
                this.vertragBeitragDynamikProzent = vertragBeitragDynamikProzent;
            }
        }
    }

    public Integer getVertragTyp() {
        return vertragTyp;
    }

    public void setVertragTyp(Integer vertragTyp) {
        this.vertragTyp = vertragTyp;
    }

    public Integer getVertragBeginnJahr() {
        return vertragBeginnJahr;
    }

    public void setVertragBeginnJahr(Integer vertragBeginnJahr) {
        this.vertragBeginnJahr = vertragBeginnJahr;
    }

    public Integer getVertragEndeJahr() {
        return vertragEndeJahr;
    }

    public void setVertragEndeJahr(Integer vertragEndeJahr) {
        this.vertragEndeJahr = vertragEndeJahr;
        if (this.vertragEndeJahrBeitrag != null) {
            if (this.vertragEndeJahrBeitrag == 0) {
                this.vertragEndeJahrBeitrag = vertragEndeJahr;
            }
        }
    }

    public Integer getVertragLeistungTodArt() {
        return vertragLeistungTodArt;
    }

    public void setVertragLeistungTodArt(Integer vertragLeistungTodArt) {
        this.vertragLeistungTodArt = vertragLeistungTodArt;
    }

    public BigDecimal getVertragLeistungTodBetrag() {
        return vertragLeistungTodBetrag;
    }

    public void setVertragLeistungTodBetrag(BigDecimal vertragLeistungTodBetrag) {
        this.vertragLeistungTodBetrag = vertragLeistungTodBetrag;
    }

    public Integer getVertragLeistungBUArt() {
        return vertragLeistungBUArt;
    }

    public void setVertragLeistungBUArt(Integer vertragLeistungBUArt) {
        this.vertragLeistungBUArt = vertragLeistungBUArt;
    }

    public Boolean getIsBUBeitragsbefreiung() {
        return isBUBeitragsbefreiung;
    }

    public void setIsBUBeitragsbefreiung(Boolean isBUBeitragsbefreiung) {
        this.isBUBeitragsbefreiung = isBUBeitragsbefreiung;
    }

    public BigDecimal getVertragLeistungBUBetrag() {
        return vertragLeistungBUBetrag;
    }

    public void setVertragLeistungBUBetrag(BigDecimal vertragLeistungBUBetrag) {
        this.vertragLeistungBUBetrag = vertragLeistungBUBetrag;
    }

    public Integer getVertragKuendigung() {
        return vertragKuendigung;
    }

    public void setVertragKuendigung(Integer vertragKuendigung) {
        this.vertragKuendigung = vertragKuendigung;
    }

    public Integer getVertragKuendigungJahr() {
        return vertragKuendigungJahr;
    }

    public void setVertragKuendigungJahr(Integer vertragKuendigungJahr) {
        this.vertragKuendigungJahr = vertragKuendigungJahr;
    }

    public BigDecimal getVertragKuendigungEndeBetrag() {
        return vertragKuendigungEndeBetrag;
    }

    public void setVertragKuendigungEndeBetrag(BigDecimal vertragKuendigungEndeBetrag) {
        this.vertragKuendigungEndeBetrag = vertragKuendigungEndeBetrag;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setVertragPartnerGeburtsjahr(Integer vertragPartnerGeburtsjahr) {
        this.vertragPartnerGeburtsjahr = vertragPartnerGeburtsjahr;
    }

    public void setVertragBeitragAnfangseinlage(BigDecimal vertragBeitragAnfangseinlage) {
        this.vertragBeitragAnfangseinlage = vertragBeitragAnfangseinlage;
    }

    public void setVertragBeitragDynamikRhythmus(Integer vertragBeitragDynamikRhythmus) {
        this.vertragBeitragDynamikRhythmus = vertragBeitragDynamikRhythmus;
    }

    public void setVertragBeitragDynamikKuendigungJahr(Integer vertragBeitragDynamikKuendigungJahr) {
        this.vertragBeitragDynamikKuendigungJahr = vertragBeitragDynamikKuendigungJahr;
    }

    public void setVertragEndeJahrBeitrag(Integer vertragEndeJahrBeitrag) {
        this.vertragEndeJahrBeitrag = vertragEndeJahrBeitrag;
    }

    public void setVertragKuendigungEndeDatum(LocalDate vertragKuendigungEndeDatum) {
        this.vertragKuendigungEndeDatum = vertragKuendigungEndeDatum;
        if (this.vertragKuendigungEndeDatum != null) {
            this.vertragKuendigungJahr = this.vertragKuendigungEndeDatum.getYear();
        }
    }

    public void setVertragAktuellRKWBetrag(BigDecimal vertragAktuellRKWBetrag) {
        this.vertragAktuellRKWBetrag = vertragAktuellRKWBetrag;
    }

    public void setVertragAktuellRKWDatum(LocalDate vertragAktuellRKWDatum) {
        this.vertragAktuellRKWDatum = vertragAktuellRKWDatum;
    }

    public Boolean getVertragIsVerbundeneLeben() {
        return vertragIsVerbundeneLeben;
    }

    public void setVertragIsVerbundeneLeben(Boolean vertragIsVerbundeneLeben) {
        this.vertragIsVerbundeneLeben = vertragIsVerbundeneLeben;
    }

    public Integer getVertragLeistungUnfalltodArt() {
        return vertragLeistungUnfalltodArt;
    }

    public void setVertragLeistungUnfalltodArt(Integer vertragLeistungUnfalltodArt) {
        this.vertragLeistungUnfalltodArt = vertragLeistungUnfalltodArt;
    }

    public BigDecimal getVertragLeistungUnfalltodBetrag() {
        return vertragLeistungUnfalltodBetrag;
    }

    public void setVertragLeistungUnfalltodBetrag(BigDecimal vertragLeistungUnfalltodBetrag) {
        this.vertragLeistungUnfalltodBetrag = vertragLeistungUnfalltodBetrag;
    }

    public Integer getVertragBeitragPeriodischReduktionJahr() {
        return vertragBeitragPeriodischReduktionJahr;
    }

    public void setVertragBeitragPeriodischReduktionJahr(Integer vertragBeitragPeriodischReduktionJahr) {
        this.vertragBeitragPeriodischReduktionJahr = vertragBeitragPeriodischReduktionJahr;
    }

    public BigDecimal getVertragBeitragPeriodischReduktionEuro() {
        return vertragBeitragPeriodischReduktionEuro;
    }

    public void setVertragBeitragPeriodischReduktionEuro(BigDecimal vertragBeitragPeriodischReduktionEuro) {
        this.vertragBeitragPeriodischReduktionEuro = vertragBeitragPeriodischReduktionEuro;
    }

    public BigDecimal getVertragPlausiBeitragssummeBetrag() {
        return vertragPlausiBeitragssummeBetrag;
    }

    public void setVertragPlausiBeitragssummeBetrag(BigDecimal vertragPlausiBeitragssummeBetrag) {
        this.vertragPlausiBeitragssummeBetrag = vertragPlausiBeitragssummeBetrag;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Integer getVertragPartnerGeburtsjahr() {
        return vertragPartnerGeburtsjahr;
    }

    public BigDecimal getVertragBeitragAnfangseinlage() {
        return vertragBeitragAnfangseinlage;
    }

    public Integer getVertragBeitragDynamikRhythmus() {
        return vertragBeitragDynamikRhythmus;
    }

    public Integer getVertragBeitragDynamikKuendigungJahr() {
        return vertragBeitragDynamikKuendigungJahr;
    }

    public Integer getVertragEndeJahrBeitrag() {
        return vertragEndeJahrBeitrag;
    }

    public LocalDate getVertragKuendigungEndeDatum() {
        return vertragKuendigungEndeDatum;
    }

    public BigDecimal getVertragAktuellRKWBetrag() {
        return vertragAktuellRKWBetrag;
    }

    public LocalDate getVertragAktuellRKWDatum() {
        return vertragAktuellRKWDatum;
    }

    public BigDecimal getVertragBeitragDynamikEuro() {
        return VertragBeitragDynamikEuro;
    }

    public void setVertragBeitragDynamikEuro(BigDecimal VertragBeitragDynamikEuro) {
        this.VertragBeitragDynamikEuro = VertragBeitragDynamikEuro;
    }

    public LocalDate getVertragBeginnDatum() {
        return vertragBeginnDatum;
    }

    public void setVertragBeginnDatum(LocalDate VertragBeginnDatum) {
        this.vertragBeginnDatum = VertragBeginnDatum;
    }

    public LocalDate getVertragEndeDatum() {
        return vertragEndeDatum;
    }

    public void setVertragEndeDatum(LocalDate VertragEndeDatum) {
        this.vertragEndeDatum = VertragEndeDatum;
    }

    public Boolean getVertragIsKuendigung() {
        if (this.getVertragKuendigung() == 0) {
            vertragIsKuendigung = Boolean.FALSE;
        } else {
            vertragIsKuendigung = Boolean.TRUE;
        }
        return vertragIsKuendigung;
    }

    public void setVertragIsKuendigung(Boolean vertragIsKuendigung) {
        this.vertragIsKuendigung = vertragIsKuendigung;
        if (vertragIsKuendigung) {
            this.setVertragKuendigung(1);
        } else {
            this.setVertragKuendigung(0);
        }
    }

    public BigDecimal getVertragBeitragDynamikProzentfuss() {
        if (this.vertragBeitragDynamikProzent != null) {
            this.vertragBeitragDynamikProzentfuss
                    = this.getVertragBeitragDynamikProzent().multiply(BigDecimal.valueOf(100.0));
        } else {
            this.vertragBeitragDynamikProzentfuss = BigDecimal.ZERO;
        }
        return vertragBeitragDynamikProzentfuss;
    }

    public void setVertragBeitragDynamikProzentfuss(BigDecimal vertragBeitragDynamikProzentfuss) {
        this.vertragBeitragDynamikProzentfuss = vertragBeitragDynamikProzentfuss;
        this.setVertragBeitragDynamikProzent(vertragBeitragDynamikProzentfuss.divide(BigDecimal.valueOf(100.)));
    }

    @Override
    public String toPrettyString() {
        return "undefiniert";
    }

    public boolean isVertragIsKuendigungTest() {
        return vertragIsKuendigungTest;
    }

    public void setVertragIsKuendigungTest(boolean vertragIsKuendigungTest) {
        this.vertragIsKuendigungTest = vertragIsKuendigungTest;
    }

    public Boolean getIsGuiCheckedAktuellRKW() {
        return isGuiCheckedAktuellRKW;
    }

    public void setIsGuiCheckedAktuellRKW(Boolean isGuiCheckedAktuellRKW) {
        this.isGuiCheckedAktuellRKW = isGuiCheckedAktuellRKW;
    }

    public Boolean getIsGuiCheckedBeitragsdynamik() {
        return isGuiCheckedBeitragsdynamik;
    }

    public void setIsGuiCheckedBeitragsdynamik(Boolean isGuiCheckedBeitragsdynamik) {
        this.isGuiCheckedBeitragsdynamik = isGuiCheckedBeitragsdynamik;
    }

    public Boolean getIsGuiCheckedTodesfallleistung() {
        return isGuiCheckedTodesfallleistung;
    }

    public void setIsGuiCheckedTodesfallleistung(Boolean isGuiCheckedTodesfallleistung) {
        this.isGuiCheckedTodesfallleistung = isGuiCheckedTodesfallleistung;
    }

    public Boolean getIsGuiCheckedUnfalltodesfallleistung() {
        return isGuiCheckedUnfalltodesfallleistung;
    }

    public void setIsGuiCheckedUnfalltodesfallleistung(Boolean isGuiCheckedUnfalltodesfallleistung) {
        this.isGuiCheckedUnfalltodesfallleistung = isGuiCheckedUnfalltodesfallleistung;
    }

    public Boolean getIsGuiCheckedBULeistung() {
        return isGuiCheckedBULeistung;
    }

    public void setIsGuiCheckedBULeistung(Boolean isGuiCheckedBULeistung) {
        this.isGuiCheckedBULeistung = isGuiCheckedBULeistung;
    }

    public Benutzer getBenutzer() {
        return benutzer;
    }

    public void setBenutzer(Benutzer benutzer) {
        this.benutzer = benutzer;
    }
    
    

}
