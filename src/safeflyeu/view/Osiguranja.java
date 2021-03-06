/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package safeflyeu.view;

import safeflyeu.controller.ObradaOsiguranje;
import safeflyeu.model.Osiguranje;
import safeflyeu.pomocno.SafeFlyEUException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author labak
 */
public class Osiguranja extends javax.swing.JFrame {

    private ObradaOsiguranje obradaOsiguranje;
    private DecimalFormat format;

    /**
     * Creates new form Osiguranja
     */
    public Osiguranja() {
        initComponents();
        obradaOsiguranje = new ObradaOsiguranje();

        //ucitajPodatke();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lstOsiguranja = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        txtNaziv = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtVrsta = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtOib = new javax.swing.JTextField();
        txtIban = new javax.swing.JTextField();
        btnDodaj = new javax.swing.JButton();
        btnPromjena = new javax.swing.JButton();
        btnBrisanje = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtUvjet = new javax.swing.JTextField();
        chbLimitator = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Osiguranja");
        setUndecorated(true);

        lstOsiguranja.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstOsiguranjaValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstOsiguranja);

        jLabel1.setText("Naziv");

        txtNaziv.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        jLabel2.setText("Vrsta");

        txtVrsta.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        jLabel3.setText("Oib");

        txtOib.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        txtIban.setHorizontalAlignment(javax.swing.JTextField.LEFT);

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

        jLabel4.setText("Iban");

        jLabel5.setFont(new java.awt.Font("Aharoni", 1, 18)); // NOI18N
        jLabel5.setText("Osiguranja");

        jButton1.setText("Exit");
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnDodaj)
                                .addGap(18, 18, 18)
                                .addComponent(btnPromjena)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnBrisanje)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtIban, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtOib, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtVrsta, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtNaziv, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE))
                                    .addComponent(jLabel4))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtUvjet, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(chbLimitator))
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chbLimitator)
                    .addComponent(txtUvjet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNaziv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtVrsta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtOib, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIban, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnDodaj)
                        .addComponent(btnPromjena)
                        .addComponent(btnBrisanje))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lstOsiguranjaValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstOsiguranjaValueChanged
        if (evt.getValueIsAdjusting()) {
            return;
        }
        ocistiPolja();

        Osiguranje o = lstOsiguranja.getSelectedValue();
        if (o == null) {
            return;
        }

        ocistiPolja();

        txtNaziv.setText(o.getNaziv());
        txtVrsta.setText(o.getVrsta());
        txtIban.setText(o.getIban());

        try {
            txtOib.setText((o.getOib()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_lstOsiguranjaValueChanged

    private void btnDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajActionPerformed
        Osiguranje o = new Osiguranje();

        if (!kontrola(o)) {
            return;
        }

        try {
            obradaOsiguranje.save(o);
        } catch (SafeFlyEUException e) {
            JOptionPane.showConfirmDialog(null, e.getMessage());
            return;
        }

        ucitajPodatke();

        ocistiPolja();


    }//GEN-LAST:event_btnDodajActionPerformed

    private void btnPromjenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPromjenaActionPerformed
        Osiguranje o = lstOsiguranja.getSelectedValue();

        if (o == null) {
            JOptionPane.showConfirmDialog(null, "Prvo odaberite osiguranje");
        }

        if (!kontrola(o)) {
            return;
        }

        try {
            obradaOsiguranje.save(o);
        } catch (SafeFlyEUException e) {
            JOptionPane.showConfirmDialog(null, e.getMessage());
            return;
        }

        ucitajPodatke();

        ocistiPolja();

    }//GEN-LAST:event_btnPromjenaActionPerformed

    private void btnBrisanjeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrisanjeActionPerformed
        Osiguranje o = lstOsiguranja.getSelectedValue();

        if (o == null) {
            JOptionPane.showConfirmDialog(null, "Prvo odaberite osiguranje");
        }

        try {
            obradaOsiguranje.obrisi(o);
            ucitajPodatke();
            ocistiPolja();
        } catch (SafeFlyEUException e) {
            JOptionPane.showMessageDialog(null, "Ne mogu obrisati");
        }


    }//GEN-LAST:event_btnBrisanjeActionPerformed

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
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<Osiguranje> lstOsiguranja;
    private javax.swing.JTextField txtIban;
    private javax.swing.JTextField txtNaziv;
    private javax.swing.JTextField txtOib;
    private javax.swing.JTextField txtUvjet;
    private javax.swing.JTextField txtVrsta;
    // End of variables declaration//GEN-END:variables

    private void ucitajPodatke() {

        DefaultListModel<Osiguranje> m = new DefaultListModel<>();
        for (Osiguranje o : obradaOsiguranje.getLista()) {
            m.addElement(o);
        }
        lstOsiguranja.setModel(m);

    }

    private void ocistiPolja() {
        txtNaziv.setText("");
        txtVrsta.setText("");
        txtIban.setText("");
        txtOib.setText("");
    }

    private boolean kontrola(Osiguranje o) {
        o.setNaziv(txtNaziv.getText());
        o.setVrsta(txtVrsta.getText());
        o.setIban((txtIban.getText()));
        try {
            o.setOib((txtOib.getText()));
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showConfirmDialog(null, "Oib nije broj");
        }

        return true;
    }
}
