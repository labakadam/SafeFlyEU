/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package safeflyeu.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
//import javax.persistence.MappedSuperclass;
import javax.persistence.Table;

/**
 *
 * @author labak
 */
@Entity
@Table
public class Korisnik_AvioKompanija extends Entitet implements Serializable {

    @ManyToOne
    private Korisnik korisnik;

    @ManyToOne
    private AvioKompanija avioKompanija;

    private String oznakaSjedala;
    private boolean hrana;
    private boolean pice;
    private boolean prtljaga;

    public Korisnik getKorisnik() {
        return korisnik;
    }

    public void setKorisnik(Korisnik korisnik) {
        this.korisnik = korisnik;
    }

    public AvioKompanija getAvioKompanija() {
        return avioKompanija;
    }

    public void setAvioKompanija(AvioKompanija avioKompanija) {
        this.avioKompanija = avioKompanija;
    }

    public String getOznakaSjedala() {
        return oznakaSjedala;
    }

    public void setOznakaSjedala(String oznakaSjedala) {
        this.oznakaSjedala = oznakaSjedala;
    }

    public boolean isHrana() {
        return hrana;
    }

    public void setHrana(boolean hrana) {
        this.hrana = hrana;
    }

    public boolean isPice() {
        return pice;
    }

    public void setPice(boolean pice) {
        this.pice = pice;
    }

    public boolean isPrtljaga() {
        return prtljaga;
    }

    public void setPrtljaga(boolean prtljaga) {
        this.prtljaga = prtljaga;
    }

}
