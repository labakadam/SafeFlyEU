/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package safeflyeu.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author labak
 */
@Entity
@Table
public class AvioKompanija extends Entitet implements Serializable {

    @ManyToOne
    private Zaposlenik zaposlenik;

    @ManyToOne
    private Osiguranje osiguranje;

    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(
            name = "korisnik_avioKompanija",
            joinColumns = {
                @JoinColumn(name = "avioKompanija_id")},
            inverseJoinColumns = {
                @JoinColumn(name = "korisnik_id")}
    )
    private List<Korisnik> korisnik = new ArrayList<>();

    private String naziv;
    private String let;
    private String avion;
    private String oib;
    private String iban;

    public List<Korisnik> getKorisnik() {
        return korisnik;
    }

    public void setKorisnik(List<Korisnik> korisnik) {
        this.korisnik = korisnik;
    }

    public Osiguranje getOsiguranje() {
        return osiguranje;
    }

    public void setOsiguranje(Osiguranje osiguranje) {
        this.osiguranje = osiguranje;
    }

    public Zaposlenik getZaposlenik() {
        return zaposlenik;
    }

    public void setZaposlenik(Zaposlenik zaposlenik) {
        this.zaposlenik = zaposlenik;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getLet() {
        return let;
    }

    public void setLet(String let) {
        this.let = let;
    }

    public String getAvion() {
        return avion;
    }

    public void setAvion(String avion) {
        this.avion = avion;
    }

    public String getOib() {
        return oib;
    }

    public void setOib(String oib) {
        this.oib = oib;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public Osiguranje getOsiguranje(Osiguranje osiguranje) {
        return osiguranje;
    }

    public Zaposlenik getZaposlenik(Zaposlenik zaposlenik) {
        return zaposlenik;
    }

    @Override
    public String toString() {
        return naziv;
    }

}
