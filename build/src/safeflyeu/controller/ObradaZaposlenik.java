/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package safeflyeu.controller;

import java.util.List;
import org.hibernate.Query;
import safeflyeu.model.Zaposlenik;
import safeflyeu.pomocno.HibernateUtil;
import safeflyeu.pomocno.ObradaSucelje;
import safeflyeu.pomocno.Pomocno;
import safeflyeu.pomocno.SafeFlyEUException;

/**
 *
 * @author labak
 */
public class ObradaZaposlenik extends Obrada<Zaposlenik> implements ObradaSucelje<Zaposlenik> {

    public ObradaZaposlenik() {
        super();
    }

    public List<Zaposlenik> getLista() {
        return HibernateUtil.getSession().createQuery("from Zaposlenik").list();
    }

    public List<Zaposlenik> getLista(String uvjet, boolean isSelected) {

        Query query = HibernateUtil.getSession().createQuery("from Zaposlenik a "
                + " where concat(a.ime,' ',a.prezime) like :uvjet")
                .setString("uvjet", "%" + uvjet + "%");
        if (isSelected) {
            query.setMaxResults(50);
        }

        return query.list();
    }

    public Zaposlenik save(Zaposlenik z) throws SafeFlyEUException {

        kontrola(z);

        return dao.save(z);
    }

    public void obrisi(Zaposlenik z) throws SafeFlyEUException {
        
        kontrola(z);
        
        dao.delete(z);
    }

    public void kontrola(Zaposlenik z) throws SafeFlyEUException {
        if (z.getBrojMobitela() == null) {
            throw new SafeFlyEUException(("Broj mobitela nije definiran"));
        }
        if (z.getBrojMobitela().trim().isEmpty()) {
            throw new SafeFlyEUException("Broj mobitela nije unesen");
        }
        if (z.getBrojUgovora() == null) {
            throw new SafeFlyEUException(("Broj ugovora nije definiran"));
        }
        if (z.getBrojUgovora().trim().isEmpty()) {
            throw new SafeFlyEUException("Broj ugovora nije unesen");
        }
        if (z.getEmail() == null) {
            throw new SafeFlyEUException(("Email nije definiran"));
        }
        if (z.getEmail().trim().isEmpty()) {
            throw new SafeFlyEUException("Email nije unesen");
        }
        if (z.getIme() == null) {
            throw new SafeFlyEUException(("Ime nije definirano"));
        }
        if (z.getIme().trim().isEmpty()) {
            throw new SafeFlyEUException("Ime nije uneseno");
        }
        if (z.getPrezime() == null) {
            throw new SafeFlyEUException(("Prezime nije definirano"));
        }
        if (z.getPrezime().trim().isEmpty()) {
            throw new SafeFlyEUException("Prezime nije uneseno");
        }
        if (!Pomocno.checkOIB(z.getOib())) {
            throw new SafeFlyEUException("Oib je neispravan");
        }
    }

}
