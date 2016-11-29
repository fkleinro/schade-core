package de.drschade.lebensversicherung.grobrechner.business.benutzer.entity;

import de.drschade.lebensversicherung.grobrechner.business.FachObjekt;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * insert into BENUTZER (username, password, rolle,email, kontingent) VALUES
 * ('emil@web.de','ae80d870eb40a8fd7c256c0ec3faf2ba511ba134','WEB','emil@web.de',
 * 5);
 * insert into BENUTZER (username, password, rolle,email, kontingent, ipadresse) VALUES
 * ('emil@web.de','ae80d870eb40a8fd7c256c0ec3faf2ba511ba134','IP','emil@web.de',
 * 5,'127.0.0.1');
 * @author fklein-robbenhaar
 */
@Entity
@Table(name = "BENUTZER")
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Benutzer extends FachObjekt {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id;

    @Column
    @NotNull
    String email;

    @Column
    @NotNull
    String username;

    @Column
    @NotNull
    String password;

    @Column
    String anrede;

    @Column
    String name;

    @Column
    Boolean gesperrt;

    @Column
    String rolle;

    @Column
    Integer kontingent;

    @Column
    String ipAdresse;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAnrede() {
        return anrede;
    }

    public void setAnrede(String anrede) {
        this.anrede = anrede;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getGesperrt() {
        return gesperrt;
    }

    public void setGesperrt(Boolean gesperrt) {
        this.gesperrt = gesperrt;
    }

    public String getRolle() {
        return rolle;
    }

    public void setRolle(String rolle) {
        this.rolle = rolle;
    }

    public Integer getKontingent() {
        return kontingent;
    }

    public void setKontingent(Integer kontingent) {
        this.kontingent = kontingent;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIpAdresse() {
        return ipAdresse;
    }

    public void setIpAdresse(String ipAdresse) {
        this.ipAdresse = ipAdresse;
    }

    @Override
    public String toPrettyString() {
        return email;
    }

}
