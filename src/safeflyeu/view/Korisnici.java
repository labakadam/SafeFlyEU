/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package safeflyeu.view;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import safeflyeu.controller.ObradaKorisnik;
import safeflyeu.controller.ObradaOsiguranje;
import safeflyeu.model.Korisnik;
import safeflyeu.model.Osiguranje;
import safeflyeu.pomocno.SafeFlyEUException;

/**
 *
 * @author labak
 */
public class Korisnici extends javax.swing.JFrame {

    private final ObradaKorisnik obradaEntitet;

    private static DefaultComboBoxModel<Osiguranje> modelOsiguranje;

    /**
     * Creates new form Korisnici
     */
    public Korisnici() {
        initComponents();
        obradaEntitet = new ObradaKorisnik();

        DefaultComboBoxModel<Osiguranje> os = new DefaultComboBoxModel<>();
        Osiguranje o = new Osiguranje();
        o.setId(0);
        o.setNaziv("Odaberite osiguranje");
        os.addElement(o);
        new ObradaOsiguranje().getLista().forEach((s) -> {
            os.addElement(s);
        });
        cmbOsiguranja.setModel(os);

        ucitajPodatke();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstEntiteti = new javax.swing.JList<>();
        jButton1 = new javax.swing.JButton();
        btnDodaj = new javax.swing.JButton();
        btnPromjena = new javax.swing.JButton();
        btnBrisanje = new javax.swing.JButton();
        txtOib = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtPrezime = new javax.swing.JTextField();
        txtIme = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cmbOsiguranja = new javax.swing.JComboBox<>();
        txtUvjet = new javax.swing.JTextField();
        chbLimitator = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Korisnici");
        setUndecorated(true);

        jLabel1.setText("Ime");

        jLabel2.setText("Prezime");

        jLabel3.setText("Email");

        jLabel4.setText("Oib");

        jLabel5.setText("Osiguranje");

        lstEntiteti.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstEntitetiValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstEntiteti);

        jButton1.setText("Exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnDodaj.setText("Dodaj");
        btnDodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajActionPerformed(evt);
            }
        });

        btnPromjena.setText("Promjena");
        btnPromjena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPromjenaActionPerformed(evt);
            }
        });

        btnBrisanje.setText("Brisanje");
        btnBrisanje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrisanjeActionPerformed(evt);
            }
        });

        jLabel6.setText("Korisnici");

        txtUvjet.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUvjetKeyReleased(evt);
            }
        });

        chbLimitator.setSelected(true);
        chbLimitator.setText("Limitiraj na 50 rezultata");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(txtUvjet))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chbLimitator)
                            .addComponent(jLabel1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(cmbOsiguranja, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtOib)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel2)
                                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtPrezime, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtIme, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(88, 88, 88))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnDodaj, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(btnPromjena, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(btnBrisanje, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(52, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chbLimitator)
                    .addComponent(txtUvjet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel1)
                        .addGap(7, 7, 7)
                        .addComponent(txtIme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addGap(9, 9, 9)
                        .addComponent(txtPrezime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtOib, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbOsiguranja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBrisanje)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnDodaj)
                        .addComponent(btnPromjena)))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajActionPerformed
        Korisnik entitet = new Korisnik();

        preuzmiVrijednosti(entitet);

        try {
            obradaEntitet.save(entitet);
        } catch (SafeFlyEUException e) {
            JOptionPane.showConfirmDialog(null, e.getMessage());
            return;
        }

        ucitajPodatke();

        ocistiPolja();


    }//GEN-LAST:event_btnDodajActionPerformed

    private void btnPromjenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPromjenaActionPerformed
        Korisnik entitet = lstEntiteti.getSelectedValue();

        if (entitet == null) {
            JOptionPane.showConfirmDialog(null, "Prvo odaberite korisnika");
        }

        preuzmiVrijednosti(entitet);

        try {
            obradaEntitet.save(entitet);
        } catch (SafeFlyEUException e) {
            JOptionPane.showConfirmDialog(null, e.getMessage());
            return;
        }

        ucitajPodatke();

        ocistiPolja();

    }//GEN-LAST:event_btnPromjenaActionPerformed

    private void btnBrisanjeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrisanjeActionPerformed
        Korisnik entitet = lstEntiteti.getSelectedValue();

        if (entitet == null) {
            JOptionPane.showConfirmDialog(null, "Prvo odaberite korisnika");
        }

        try {
            obradaEntitet.obrisi(entitet);
            ucitajPodatke();
            ocistiPolja();
        } catch (SafeFlyEUException ex) {
            JOptionPane.showMessageDialog(null, "Ne mogu obrisati");
        }

    }//GEN-LAST:event_btnBrisanjeActionPerformed

    private void lstEntitetiValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstEntitetiValueChanged
        if (evt.getValueIsAdjusting()) {
            return;
        }
        ocistiPolja();

        Korisnik entitet = lstEntiteti.getSelectedValue();

        if (entitet == null) {
            return;
        }

        txtIme.setText(entitet.getIme());
        txtPrezime.setText(entitet.getPrezime());
        txtEmail.setText(entitet.getEmail());
        txtOib.setText(entitet.getOib());
        cmbOsiguranja.setSelectedItem(entitet.getOsiguranje());

        modelOsiguranje = (DefaultComboBoxModel<Osiguranje>) cmbOsiguranja.getModel();
        for (int i = 0; i < modelOsiguranje.getSize(); i++) {
            if (modelOsiguranje.getElementAt(i).getId() == entitet.getOsiguranje().getId()) {
                cmbOsiguranja.setSelectedIndex(i);
                break;
            }
        }


    }//GEN-LAST:event_lstEntitetiValueChanged

    private void txtUvjetKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUvjetKeyReleased
        //if(evt.getKeyCode()==KeyEvent.VK_ENTER){
        ucitajPodatke();
        // }
    }//GEN-LAST:event_txtUvjetKeyReleased

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBrisanje;
    private javax.swing.JButton btnDodaj;
    private javax.swing.JButton btnPromjena;
    private javax.swing.JCheckBox chbLimitator;
    private javax.swing.JComboBox<Osiguranje> cmbOsiguranja;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<Korisnik> lstEntiteti;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtIme;
    private javax.swing.JTextField txtOib;
    private javax.swing.JTextField txtPrezime;
    private javax.swing.JTextField txtUvjet;
    // End of variables declaration//GEN-END:variables

    private void ocistiPolja() {
        txtIme.setText("");
        txtPrezime.setText("");
        txtEmail.setText("");
        txtOib.setText("");
        cmbOsiguranja.setSelectedIndex(0);
    }

    private Korisnik preuzmiVrijednosti(Korisnik entitet) {
        entitet.setIme(txtIme.getText());
        entitet.setPrezime(txtPrezime.getText());
        entitet.setEmail(txtEmail.getText());
        entitet.setOib(txtOib.getText());
        entitet.getOsiguranje((Osiguranje) cmbOsiguranja.getSelectedItem());
        return entitet;

    }

    private void ucitajPodatke() {

        DefaultListModel<Korisnik> m = new DefaultListModel<>();
        obradaEntitet.getLista().forEach((k) -> {
            m.addElement(k);
        });

        lstEntiteti.setModel(m);

    }

//    private class DuzeUcitanjeEntiteta extends Thread {
//
//        @Override
//        public void run() {
//            DefaultListModel<Korisnik> m = new DefaultListModel<>();
//            for (Korisnik k : obradaEntitet.getLista(txtUvjet.getText().trim(), chbLimitator.isSelected())) {
//                m.addElement(k);
//            }
//            lstEntiteti.setModel(m);
//        }
//
//    }
}
