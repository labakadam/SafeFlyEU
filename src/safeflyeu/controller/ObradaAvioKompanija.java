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

    @Override
    public List<AvioKompanija> getLista() {
        return HibernateUtil.getSession().createQuery("from AvioKompanija").list();
    }

    @Override
    public AvioKompanija save(AvioKompanija t) throws SafeFlyEUException {

        kontrola(t);

        return dao.save(t);
    }

    @Override
    public void obrisi(AvioKompanija t) throws SafeFlyEUException {
        if (t.getKorisnik().size() > 0) {
            throw new SafeFlyEUException("Ne možete brisati, avio kompanija ima korisnike");
        }
        dao.delete(t);
    }

    @Override
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
        try {
            if (ak.getOsiguranje().getId() == 0) {
                throw new SafeFlyEUException("Obavezan odabir osiguranja");
            }
        } catch (Exception e) {
        }
        try {
            if (ak.getZaposlenik().getId() == 0) {
                throw new SafeFlyEUException("Obavezan odabir zaposlenika");
            }

        } catch (Exception e) {
        }

        if (!Pomocno.checkOIB(ak.getOib())) {
            throw new SafeFlyEUException("Oib je neispravan");
        }
    }

}
