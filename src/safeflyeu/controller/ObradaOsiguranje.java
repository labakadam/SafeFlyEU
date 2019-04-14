/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package safeflyeu.controller;

import java.util.List;
import safeflyeu.model.Osiguranje;
import safeflyeu.pomocno.HibernateUtil;
import safeflyeu.pomocno.Pomocno;
import safeflyeu.pomocno.SafeFlyEUException;

/**
 *
 * @author labak
 */
public class ObradaOsiguranje extends Obrada<Osiguranje> {

    public ObradaOsiguranje() {
        super();
    }

    public List<Osiguranje> getLista() {
        return HibernateUtil.getSession().createQuery("from Osiguranje").list();
    }

    public Osiguranje spremi(Osiguranje o) throws SafeFlyEUException {

        kontrola(o);

        return dao.save(o);
    }

    public void obrisi(Osiguranje o) throws SafeFlyEUException {

        dao.delete(o);
    }

    public void kontrola(Osiguranje o) throws SafeFlyEUException {
        if (o.getVrsta() == null) {
            throw new SafeFlyEUException("Vrsta osiguranja nije definirana");
        }
        if (o.getVrsta().trim().isEmpty()) {
            throw new SafeFlyEUException("Vrsta osiguranja nije unesena");
        }
        if (o.getNaziv() == null) {
            throw new SafeFlyEUException("Naziv osiguranja nije definiran");
        }
        if (o.getNaziv().trim().isEmpty()) {
            throw new SafeFlyEUException("Naziv osiguranja nije unesen");
        }
        if (!Pomocno.checkOIB(o.getOib())) {
            throw new SafeFlyEUException("Oib je neispravan");
        }
        if (o.getIban() == null) {
            throw new SafeFlyEUException("IBAN nije definiran");
        }
        if (o.getIban().trim().isEmpty()) {
            throw new SafeFlyEUException("IBAN nije unesen");
        }
    }

}
