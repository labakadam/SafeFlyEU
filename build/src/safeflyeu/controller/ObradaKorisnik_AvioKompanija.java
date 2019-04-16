/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package safeflyeu.controller;

import java.util.List;
import safeflyeu.model.Korisnik_AvioKompanija;
import safeflyeu.pomocno.HibernateUtil;
import safeflyeu.pomocno.ObradaSucelje;
import safeflyeu.pomocno.SafeFlyEUException;

/**
 *
 * @author labak
 */
public class ObradaKorisnik_AvioKompanija extends Obrada<Korisnik_AvioKompanija> implements ObradaSucelje<Korisnik_AvioKompanija>{

    public ObradaKorisnik_AvioKompanija() {
        super();

    }

    public List<Korisnik_AvioKompanija> getLista() {
        return HibernateUtil.getSession().createQuery("from Korisnik_AvioKompanija").list();
    }

    public Korisnik_AvioKompanija save(Korisnik_AvioKompanija kak) throws SafeFlyEUException {

        kontrola(kak);

        return dao.save(kak);
    }

    public void obrisi(Korisnik_AvioKompanija kak) throws SafeFlyEUException {

        dao.delete(kak);
    }

    public void kontrola(Korisnik_AvioKompanija kak) throws SafeFlyEUException {
        if (kak.getOznakaSjedala() == null) {
            throw new SafeFlyEUException(("Oznaka sjedala nije definirana"));
        }
        if (kak.getOznakaSjedala().trim().isEmpty()) {
            throw new SafeFlyEUException("Oznaka sjedala nije unesena");
        }
        
    }

}
