/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package safeflyeu.controller;

import java.util.List;
import safeflyeu.model.Korisnik;
import safeflyeu.pomocno.HibernateUtil;
import safeflyeu.pomocno.ObradaSucelje;
import safeflyeu.pomocno.Pomocno;
import safeflyeu.pomocno.SafeFlyEUException;
import org.apache.commons.validator.routines.EmailValidator;
import org.hibernate.Query;

/**
 *
 * @author labak
 */
public class ObradaKorisnik extends Obrada<Korisnik> implements ObradaSucelje<Korisnik> {

    public ObradaKorisnik() {
        super();
    }

    public List<Korisnik> getLista() {
        return HibernateUtil.getSession().createQuery("from Korisnik").list();
    }

    public List<Korisnik> getLista(String uvjet, boolean isSelected) {

        Query query = HibernateUtil.getSession().createQuery("from Polaznik a "
                + " where concat(a.ime,' ',a.prezime) like :uvjet")
                .setString("uvjet", "%" + uvjet + "%");
        if (isSelected) {
            query.setMaxResults(50);
        }

        return query.list();
    }

    public Korisnik save(Korisnik k) throws SafeFlyEUException {

        kontrola(k);
        return dao.save(k);

    }

    public void obrisi(Korisnik k) throws SafeFlyEUException {
        if (k.getOsiguranje().size() > 0) {

        }
        dao.delete(k);
    }

    /**
     *
     * @param k
     * @throws SafeFlyEUException
     */
    public void kontrola(Korisnik k) throws SafeFlyEUException {
        if (k.getIme() == null) {
            throw new SafeFlyEUException("Ime nije definirano");
        }
        if (k.getIme().trim().isEmpty()) {
            throw new SafeFlyEUException("Ime je obavezno");
        }
        if (k.getPrezime() == null) {
            throw new SafeFlyEUException("Prezime nije definirano");
        }

        if (k.getPrezime().trim().isEmpty()) {
            throw new SafeFlyEUException("Prezime je obavezno");
        }
        if (!EmailValidator.getInstance().isValid(k.getEmail())) {
            throw new SafeFlyEUException("Email nije ispravan");

        }
        if (!Pomocno.checkOIB(k.getOib())) {
            throw new SafeFlyEUException("Oib je neispravan");
        }
    }

}
