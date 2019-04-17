/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package safeflyeu.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
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

//    @ManyToMany
//    private List<Korisnik> korisnici = new ArrayList<>();

    private String naziv;
    private String let;
    private String avion;
    private String oib;
    private String iban;

//    public List<Korisnik> getKorisnici() {
//        return korisnici;
//    }
//
//    public void setKorisnici(List<Korisnik> korisnici) {
//        this.korisnici = korisnici;
//    }

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

    @Override
    public String toString() {
        return naziv;
    }

    public Osiguranje getOsiguranje(Osiguranje osiguranje) {
        return osiguranje;
    }

    public Zaposlenik getZaposlenik(Zaposlenik zaposlenik) {
        return zaposlenik;
    }

}
