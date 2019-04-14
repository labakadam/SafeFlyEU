/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package safeflyeu.controller;

import java.util.List;
import safeflyeu.model.AvioKompanija;
import safeflyeu.pomocno.HibernateUtil;
import safeflyeu.pomocno.ObradaSucelje;
import safeflyeu.pomocno.Pomocno;
import safeflyeu.pomocno.SafeFlyEUException;

/**
 *
 * @author labak
 */
public class ObradaAvioKompanija extends Obrada<AvioKompanija> implements ObradaSucelje<AvioKompanija> {

    public ObradaAvioKompanija() {
        super();
    }

    public List<AvioKompanija> getLista() {
        return HibernateUtil.getSession().createQuery("from AvioKompanija").list();
    }

    public AvioKompanija save(AvioKompanija ak) throws SafeFlyEUException {

        kontrola(ak);

        return dao.save(ak);
    }

    public void obrisi(AvioKompanija ak) throws SafeFlyEUException {

        dao.delete(ak);
    }

    public void kontrola(AvioKompanija ak) throws SafeFlyEUException {
        if (ak.getAvion() == null) {
            throw new SafeFlyEUException(("Avion nije definiran"));
        }
        if (ak.getAvion().trim().isEmpty()) {
            throw new SafeFlyEUException("Avion nije unesen");
        }
        if (ak.getIban() == null) {
            throw new SafeFlyEUException(("IBAN nije definiran"));
        }
        if (ak.getIban().trim().isEmpty()) {
            throw new SafeFlyEUException("IBAN nije unesen");
        }
        if (ak.getLet() == null) {
            throw new SafeFlyEUException(("Let nije definiran"));
        }
        if (ak.getLet().trim().isEmpty()) {
            throw new SafeFlyEUException("Let nije unesen");
        }
        if (ak.getNaziv() == null) {
            throw new SafeFlyEUException(("Naziv nije definiran"));
        }
        if (ak.getNaziv().trim().isEmpty()) {
            throw new SafeFlyEUException("Naziv nije unesen");
        }
        if (!Pomocno.checkOIB(ak.getOib())) {
            throw new SafeFlyEUException("Oib je neispravan");
        }
    }

}
