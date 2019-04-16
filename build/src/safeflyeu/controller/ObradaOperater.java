/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package safeflyeu.controller;

import static com.mchange.v2.c3p0.impl.C3P0Defaults.password;
import safeflyeu.model.Operater;
import safeflyeu.pomocno.BCrypt;
import safeflyeu.pomocno.SafeFlyEUException;
import safeflyeu.pomocno.HibernateUtil;
import safeflyeu.pomocno.ObradaSucelje;
import java.util.List;

/**
 *
 * @author Profesor
 */
public class ObradaOperater extends Obrada<Operater> implements ObradaSucelje<Operater> {

    /**
     *
     *
     * Ako treba gledati vrijednosti parametara koji idu u bazu tada u my.ini
     * (C:\xampp\mysql\bin) u dijelu [mysqld] dodati (ili osloboditi - maknuti
     * #) #general_log_file = f:\mysqllog.log #general_log = 1 f:\mysqllog.log
     * je datoteka gdje želite da piše - pripaziti ima li mysql ovlasti nad tom
     * datotekom
     */
    public Operater autoriziraj(String email, String lozinka) {
        Operater o = (Operater) HibernateUtil.getSession().createQuery(" from Operater o "
                + " where o.email=:email ")
                .setString("email", email)
                .uniqueResult();
        if (o == null) {
            return null;
        }

        if (BCrypt.checkpw("adam", o.getLozinka())) {
            //o.setLozinka(null); - riješiti
            return o;
        }

        return null;
    }

    public Operater glavno(String ime, String prezime, String username, String password) {

        Operater o = (Operater) HibernateUtil.getSession().createQuery("insert into operater (ime,prezime,email,lozinka) "
                + " values (?,?,?,?)")
                .setString("ime", ime)
                .setString("prezime", prezime)
                .setString("email", username)
                .setString("lozinka", password)
                .uniqueResult();
        if (o == null) {
            return null;
        }
        if (BCrypt.checkpw(password, o.getLozinka())) {
            return o;
        }

        return null;
    }

    @Override
    public List<Operater> getLista() {
        return HibernateUtil.getSession().createQuery("from Operater").list();
    }

    @Override
    public void kontrola(Operater t) throws SafeFlyEUException {

    }

    @Override
    public void obrisi(Operater t) throws SafeFlyEUException {

    }

    @Override
    public Operater save(Operater t) throws SafeFlyEUException {
        return dao.save(t);
    }

}
