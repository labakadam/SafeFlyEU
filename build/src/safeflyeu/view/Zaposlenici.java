/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package safeflyeu.view;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import safeflyeu.controller.ObradaAvioKompanija;
import safeflyeu.controller.ObradaKorisnik;
import safeflyeu.controller.ObradaZaposlenik;
import safeflyeu.model.AvioKompanija;
import safeflyeu.model.Korisnik;
import safeflyeu.model.Osiguranje;
import safeflyeu.model.Zaposlenik;
import safeflyeu.pomocno.SafeFlyEUException;

/**
 *
 * @author labak
 */
public class Zaposlenici extends javax.swing.JFrame {

    private final ObradaZaposlenik obradaEntitet;
    private static DefaultComboBoxModel<AvioKompanija> modelAvioKompanija;
    
    
    public Zaposlenici() {
        initComponents();
        obradaEntitet = new ObradaZaposlenik();

        DefaultComboBoxModel<AvioKompanija> akm = new DefaultComboBoxModel<>();
        AvioKompanija a = new AvioKompanija();
        a.setId(0);
        a.setNaziv("Odaberite avio kompaniju");
        akm.addElement(a);
        new ObradaAvioKompanija().getLista().forEach((s) -> {
            akm.addElement(s);
        });
        cmbAvioKompanije.setModel(akm);
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

        cmbAvioKompanije = new javax.swing.JComboBox<>();
        btnDodaj = new javax.swing.JButton();
        btnPromjena = new javax.swing.JButton();
        btnBrisanje = new javax.swing.JButton();
        txtOib = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtPrezime = new javax.swing.JTextField();
        txtIme = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstEntiteti = new javax.swing.JList<>();
        jButton1 = new javax.swing.JButton();
        txtUvjet = new javax.swing.JTextField();
        chbLimitator = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtBrojMobitela = new javax.swing.JTextField();
        txtBrojUgovora = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

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

        jLabel1.setText("Ime");

        jLabel2.setText("Prezime");

        jLabel3.setText("Email");

        jLabel4.setText("Oib");

        jLabel5.setText("Avio-kompanije");

        lstEntiteti.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstEntitetiValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstEntiteti);

        jButton1.setText("X");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtUvjet.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUvjetKeyReleased(evt);
            }
        });

        chbLimitator.setSelected(true);
        chbLimitator.setText("Limitiraj na 50 rezultata");

        jLabel6.setText("Zaposlenici");

        jLabel7.setText("Broj mobitela");

        jLabel8.setText("Broj ugovora");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(105, 105, 105)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(txtOib, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(txtPrezime, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(txtIme, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtBrojUgovora, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtBrojMobitela, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cmbAvioKompanije, javax.swing.GroupLayout.Alignment.LEADING, 0, 156, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(btnDodaj, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81)
                        .addComponent(btnPromjena, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addComponent(btnBrisanje, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtUvjet, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chbLimitator)))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chbLimitator)
                    .addComponent(txtUvjet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtIme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPrezime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtOib, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbAvioKompanije, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)))
                .addGap(9, 9, 9)
                .addComponent(txtBrojMobitela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBrojUgovora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDodaj)
                    .addComponent(btnPromjena)
                    .addComponent(btnBrisanje))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajActionPerformed
        Zaposlenik z = new Zaposlenik();
        
        preuzmiVrijednosti(z);

        try {
            obradaEntitet.save(z);
            ocistiPolja();
            ucitajPodatke();
        } catch (SafeFlyEUException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        ucitajPodatke();
        ocistiPolja();
    }//GEN-LAST:event_btnDodajActionPerformed

    private void btnPromjenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPromjenaActionPerformed
        Zaposlenik z = lstEntiteti.getSelectedValue();

        if (z == null) {
            JOptionPane.showConfirmDialog(null, "Prvo odaberite zaposlenika");
        }

        preuzmiVrijednosti(z);

        try {
            obradaEntitet.save(z);
        } catch (SafeFlyEUException e) {
            JOptionPane.showConfirmDialog(null, e.getMessage());
            return;
        }

        ucitajPodatke();

        ocistiPolja();
    }//GEN-LAST:event_btnPromjenaActionPerformed

    private void btnBrisanjeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrisanjeActionPerformed
        Zaposlenik z = lstEntiteti.getSelectedValue();

        if (z == null) {
            JOptionPane.showConfirmDialog(null, "Prvo odaberite korisnika");
        }
        try {
            obradaEntitet.obrisi(z);
            ucitajPodatke();
            ocistiPolja();
        } catch (SafeFlyEUException e) {
            JOptionPane.showMessageDialog(null, "Ne mogu obrisati");
        }
    }//GEN-LAST:event_btnBrisanjeActionPerformed

    private void lstEntitetiValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstEntitetiValueChanged
        if (evt.getValueIsAdjusting()) {
            return;
        }

        

        Zaposlenik z = lstEntiteti.getSelectedValue();

        if (z == null) {
            return;
        }
        ocistiPolja();

        txtIme.setText(z.getIme());
        txtPrezime.setText(z.getPrezime());
        txtEmail.setText(z.getEmail());
        txtBrojMobitela.setText(z.getBrojMobitela());
        txtBrojUgovora.setText(z.getBrojUgovora());
        try {
            txtOib.setText((z.getOib()));
        } catch (Exception e) {
            e.printStackTrace();
        }
        

        modelAvioKompanija = (DefaultComboBoxModel<AvioKompanija>) cmbAvioKompanije.getModel();
        for (int i = 0; i < modelAvioKompanija.getSize(); i++) {
            if (modelAvioKompanija.getElementAt(i).getId() == z.getAvioKompanija().getId()) {
                cmbAvioKompanije.setSelectedIndex(i);
                break;
            }
        }
    }//GEN-LAST:event_lstEntitetiValueChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtUvjetKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUvjetKeyReleased
        //if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            ucitajPodatke();
            // }
    }//GEN-LAST:event_txtUvjetKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBrisanje;
    private javax.swing.JButton btnDodaj;
    private javax.swing.JButton btnPromjena;
    private javax.swing.JCheckBox chbLimitator;
    private javax.swing.JComboBox<AvioKompanija> cmbAvioKompanije;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<Zaposlenik> lstEntiteti;
    private javax.swing.JTextField txtBrojMobitela;
    private javax.swing.JTextField txtBrojUgovora;
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
        txtBrojUgovora.setText("");
        txtBrojMobitela.setText("");
        
        cmbAvioKompanije.setSelectedIndex(0);
    
    }

    private void preuzmiVrijednosti(Zaposlenik z) {
        z.setIme(txtIme.getText());
        z.setPrezime(txtPrezime.getText());
        z.setEmail(txtEmail.getText());
        try {
            z.setOib(txtOib.getText());
        } catch (Exception e) {
            e.printStackTrace();
        }
        z.setBrojMobitela(txtBrojUgovora.getText());
        z.setBrojUgovora(txtBrojUgovora.getText());
    }

    
    private void ucitajPodatke() {
        
        
        DefaultListModel<Zaposlenik> m = new DefaultListModel<>();
        obradaEntitet.getLista().forEach((z) -> {
            m.addElement(z);
        });
        lstEntiteti.setModel(m);
    
    }
}
