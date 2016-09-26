/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IHM;

import Entites.*;
import Traitements.*;
import java.awt.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import toutbois.*;
import static toutbois.Application.*;

public class PanRepresentant extends javax.swing.JDialog {
    //Variable de controle d'action ajouter/modifier/supprimer (switch)
    public char fct;

    public PanRepresentant(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
     public PanRepresentant(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        setModal(modal); 
        this.setLocationRelativeTo(null);
        initComponents();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTBNewCli = new javax.swing.JPanel();
        tbNC = new javax.swing.JToolBar();
        btnAjouterRep = new javax.swing.JButton();
        btnModifierRep = new javax.swing.JButton();
        btnSupprimerRep = new javax.swing.JButton();
        lblImageNC = new javax.swing.JLabel();
        btnRetourRep = new javax.swing.JButton();
        Quitter = new javax.swing.JButton();
        jPanAdresseNewCli = new javax.swing.JPanel();
        lblNomRP = new javax.swing.JLabel();
        lblPrenomRP = new javax.swing.JLabel();
        lblNumRP = new javax.swing.JLabel();
        txtNomRP = new javax.swing.JTextField();
        txtPrenomRP = new javax.swing.JTextField();
        txtNumRP = new javax.swing.JTextField();
        txtTauxRP = new javax.swing.JTextField();
        lblMailNC = new javax.swing.JLabel();
        lblSalaire = new javax.swing.JLabel();
        txtSalaireRP = new javax.swing.JTextField();
        jLabelClient = new javax.swing.JLabel();
        btnEnsRechRP = new javax.swing.JButton();
        lblEnseRechRP = new javax.swing.JLabel();
        txtEnsRechRP = new javax.swing.JTextField();
        btnActionRC = new javax.swing.JButton();
        btnAnuRC = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Espace Représentant");
        setIconImage(new ImageIcon("tbIcon.png").getImage());

        jPanel1.setBackground(new java.awt.Color(51, 153, 0));
        jPanel1.setLayout(null);

        jTBNewCli.setBackground(new java.awt.Color(20, 30, 60));
        jTBNewCli.setForeground(new java.awt.Color(255, 255, 255));
        jTBNewCli.setMaximumSize(new java.awt.Dimension(169, 480));
        jTBNewCli.setMinimumSize(new java.awt.Dimension(169, 480));
        jTBNewCli.setPreferredSize(new java.awt.Dimension(169, 487));

        tbNC.setBackground(new java.awt.Color(20, 30, 60));
        tbNC.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        tbNC.setFloatable(false);
        tbNC.setForeground(new java.awt.Color(255, 255, 255));
        tbNC.setOrientation(javax.swing.SwingConstants.VERTICAL);
        tbNC.setRollover(true);
        tbNC.setMaximumSize(new java.awt.Dimension(169, 289));
        tbNC.setMinimumSize(new java.awt.Dimension(169, 289));
        tbNC.setPreferredSize(new java.awt.Dimension(169, 480));

        btnAjouterRep.setBackground(new java.awt.Color(20, 30, 60));
        btnAjouterRep.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        btnAjouterRep.setForeground(new java.awt.Color(255, 255, 255));
        btnAjouterRep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IHM/add.png"))); // NOI18N
        btnAjouterRep.setText("Ajouter");
        btnAjouterRep.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAjouterRep.setFocusPainted(false);
        btnAjouterRep.setMaximumSize(new java.awt.Dimension(169, 95));
        btnAjouterRep.setMinimumSize(new java.awt.Dimension(169, 95));
        btnAjouterRep.setName(""); // NOI18N
        btnAjouterRep.setPreferredSize(new java.awt.Dimension(169, 95));
        btnAjouterRep.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAjouterRepMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAjouterRepMouseExited(evt);
            }
        });
        btnAjouterRep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAjouterRepActionPerformed(evt);
            }
        });
        tbNC.add(btnAjouterRep);

        btnModifierRep.setBackground(new java.awt.Color(20, 30, 60));
        btnModifierRep.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        btnModifierRep.setForeground(new java.awt.Color(255, 255, 255));
        btnModifierRep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IHM/pencil.png"))); // NOI18N
        btnModifierRep.setText("Modifier");
        btnModifierRep.setFocusPainted(false);
        btnModifierRep.setFocusable(false);
        btnModifierRep.setMaximumSize(new java.awt.Dimension(169, 95));
        btnModifierRep.setMinimumSize(new java.awt.Dimension(169, 95));
        btnModifierRep.setPreferredSize(new java.awt.Dimension(169, 95));
        btnModifierRep.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnModifierRepMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnModifierRepMouseExited(evt);
            }
        });
        btnModifierRep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifierRepActionPerformed(evt);
            }
        });
        tbNC.add(btnModifierRep);

        btnSupprimerRep.setBackground(new java.awt.Color(20, 30, 60));
        btnSupprimerRep.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        btnSupprimerRep.setForeground(new java.awt.Color(255, 255, 255));
        btnSupprimerRep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IHM/garbagebin.png"))); // NOI18N
        btnSupprimerRep.setText("Supprimer");
        btnSupprimerRep.setFocusPainted(false);
        btnSupprimerRep.setFocusable(false);
        btnSupprimerRep.setMaximumSize(new java.awt.Dimension(169, 95));
        btnSupprimerRep.setMinimumSize(new java.awt.Dimension(169, 95));
        btnSupprimerRep.setPreferredSize(new java.awt.Dimension(169, 95));
        btnSupprimerRep.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSupprimerRep.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSupprimerRepMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSupprimerRepMouseExited(evt);
            }
        });
        btnSupprimerRep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSupprimerRepActionPerformed(evt);
            }
        });
        tbNC.add(btnSupprimerRep);

        lblImageNC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IHM/icon5.jpg"))); // NOI18N
        lblImageNC.setMaximumSize(new java.awt.Dimension(169, 85));
        lblImageNC.setMinimumSize(new java.awt.Dimension(169, 85));
        lblImageNC.setPreferredSize(new java.awt.Dimension(169, 85));
        tbNC.add(lblImageNC);

        btnRetourRep.setBackground(new java.awt.Color(20, 30, 60));
        btnRetourRep.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        btnRetourRep.setForeground(new java.awt.Color(255, 255, 255));
        btnRetourRep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IHM/return.png"))); // NOI18N
        btnRetourRep.setText("Retour");
        btnRetourRep.setFocusPainted(false);
        btnRetourRep.setFocusable(false);
        btnRetourRep.setMaximumSize(new java.awt.Dimension(130, 85));
        btnRetourRep.setMinimumSize(new java.awt.Dimension(169, 85));
        btnRetourRep.setPreferredSize(new java.awt.Dimension(130, 85));
        btnRetourRep.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnRetourRep.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRetourRepMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRetourRepMouseExited(evt);
            }
        });
        btnRetourRep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetourRepActionPerformed(evt);
            }
        });
        tbNC.add(btnRetourRep);

        Quitter.setBackground(new java.awt.Color(20, 30, 60));
        Quitter.setFont(new java.awt.Font("OCR A Std", 0, 14)); // NOI18N
        Quitter.setForeground(new java.awt.Color(255, 255, 255));
        Quitter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IHM/delete.png"))); // NOI18N
        Quitter.setText("Quitter");
        Quitter.setFocusPainted(false);
        Quitter.setFocusable(false);
        Quitter.setMaximumSize(new java.awt.Dimension(169, 95));
        Quitter.setMinimumSize(new java.awt.Dimension(169, 95));
        Quitter.setPreferredSize(new java.awt.Dimension(169, 95));
        Quitter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                QuitterMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                QuitterMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                QuitterMouseExited(evt);
            }
        });
        tbNC.add(Quitter);

        javax.swing.GroupLayout jTBNewCliLayout = new javax.swing.GroupLayout(jTBNewCli);
        jTBNewCli.setLayout(jTBNewCliLayout);
        jTBNewCliLayout.setHorizontalGroup(
            jTBNewCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jTBNewCliLayout.createSequentialGroup()
                .addComponent(tbNC, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 56, Short.MAX_VALUE))
        );
        jTBNewCliLayout.setVerticalGroup(
            jTBNewCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jTBNewCliLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(tbNC, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jTBNewCli);
        jTBNewCli.setBounds(570, 0, 130, 580);

        jPanAdresseNewCli.setBackground(new java.awt.Color(51, 153, 0));
        jPanAdresseNewCli.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Références", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 3, 24), java.awt.Color.white)); // NOI18N
        jPanAdresseNewCli.setLayout(null);

        lblNomRP.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNomRP.setText("Nom* : ");
        jPanAdresseNewCli.add(lblNomRP);
        lblNomRP.setBounds(20, 40, 70, 30);

        lblPrenomRP.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPrenomRP.setText("Prénom* :");
        jPanAdresseNewCli.add(lblPrenomRP);
        lblPrenomRP.setBounds(296, 40, 80, 30);

        lblNumRP.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNumRP.setText("Numéro* :");
        jPanAdresseNewCli.add(lblNumRP);
        lblNumRP.setBounds(20, 80, 80, 30);

        txtNomRP.setText("Nom");
        txtNomRP.setEnabled(false);
        jPanAdresseNewCli.add(txtNomRP);
        txtNomRP.setBounds(90, 40, 150, 30);

        txtPrenomRP.setText("Siret");
        txtPrenomRP.setEnabled(false);
        jPanAdresseNewCli.add(txtPrenomRP);
        txtPrenomRP.setBounds(370, 40, 100, 30);

        txtNumRP.setText("N°");
        txtNumRP.setEnabled(false);
        jPanAdresseNewCli.add(txtNumRP);
        txtNumRP.setBounds(90, 80, 39, 30);

        txtTauxRP.setText("Taux");
        txtTauxRP.setEnabled(false);
        jPanAdresseNewCli.add(txtTauxRP);
        txtTauxRP.setBounds(320, 80, 155, 30);

        lblMailNC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblMailNC.setText("Taux de commission* :");
        jPanAdresseNewCli.add(lblMailNC);
        lblMailNC.setBounds(170, 80, 140, 30);

        lblSalaire.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblSalaire.setText("Salaire* : ");
        lblSalaire.setToolTipText("");
        jPanAdresseNewCli.add(lblSalaire);
        lblSalaire.setBounds(20, 140, 60, 30);

        txtSalaireRP.setText("salaire");
        txtSalaireRP.setEnabled(false);
        jPanAdresseNewCli.add(txtSalaireRP);
        txtSalaireRP.setBounds(90, 140, 120, 30);

        jPanel1.add(jPanAdresseNewCli);
        jPanAdresseNewCli.setBounds(20, 180, 490, 200);

        jLabelClient.setFont(new java.awt.Font("OCR A Extended", 0, 30)); // NOI18N
        jLabelClient.setForeground(new java.awt.Color(255, 255, 255));
        jLabelClient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IHM/icon3.jpg"))); // NOI18N
        jLabelClient.setText("Espace Représentant");
        jPanel1.add(jLabelClient);
        jLabelClient.setBounds(20, 10, 440, 50);

        btnEnsRechRP.setText("Rechercher");
        btnEnsRechRP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnsRechRPActionPerformed(evt);
            }
        });
        jPanel1.add(btnEnsRechRP);
        btnEnsRechRP.setBounds(420, 110, 100, 40);

        lblEnseRechRP.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblEnseRechRP.setForeground(new java.awt.Color(255, 255, 255));
        lblEnseRechRP.setText("Enseigne à rechercher :");
        jPanel1.add(lblEnseRechRP);
        lblEnseRechRP.setBounds(40, 60, 290, 40);

        txtEnsRechRP.setText("Recherche");
        jPanel1.add(txtEnsRechRP);
        txtEnsRechRP.setBounds(320, 70, 200, 30);

        btnActionRC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IHM/add.png"))); // NOI18N
        btnActionRC.setText("Ajouter");
        btnActionRC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionRCActionPerformed(evt);
            }
        });
        jPanel1.add(btnActionRC);
        btnActionRC.setBounds(30, 390, 100, 40);

        btnAnuRC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IHM/return.png"))); // NOI18N
        btnAnuRC.setText("Annuler");
        btnAnuRC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnuRCActionPerformed(evt);
            }
        });
        jPanel1.add(btnAnuRC);
        btnAnuRC.setBounds(400, 390, 100, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 682, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     * Méthode servant à activer les textField et les boutons Ajouter/Annuler
     * selon le bouton cliqué
     * C : Ajouter
     * M : Modifier
     * S : Supprimer
     */
    public void init_champsRP(){
        switch(fct){
            case 'C':
                //clique sur ajouter le textfield deviennent editable
                JTextField[] txtFieldPC = {txtNomRP,txtPrenomRP,txtNumRP,txtTauxRP, txtSalaireRP};
                for (JTextField txtFieldPC1 : txtFieldPC) {
                    txtFieldPC1.setEnabled(true);
                    txtFieldPC1.setText("");
                }
                btnActionRC.setText("Ajouter");
                btnActionRC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IHM/add.png")));
                break;
            //idem sauf que les textefield ne se vide pas
            case 'M':
                JTextField[] txtFieldPC1 = {txtNomRP,txtPrenomRP,txtNumRP,txtTauxRP, txtSalaireRP};
                for (JTextField txtFieldPC2 : txtFieldPC1) {
                    txtFieldPC2.setEnabled(true);
                }

                btnActionRC.setText("Modifier");
                btnActionRC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IHM/pencil.png")));
                break;
            //idem sauf que les textefield ne se vide pas
            case 'S':
                JTextField[] txtFieldPC3 = {txtNomRP,txtPrenomRP,txtNumRP,txtTauxRP, txtSalaireRP};
                for (JTextField txtFieldPC4 : txtFieldPC3) {
                    txtFieldPC4.setEnabled(true);
                }
                btnActionRC.setText("Supprimer");
                btnActionRC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IHM/garbagebin.png")));
                break;
        }
        //les bouton deviennent visible
        btnActionRC.setVisible(true);
        btnAnuRC.setVisible(true); 
    }
    
    /**
     * Rend les champs, combobox et bouton Ajouter/Annuler non activés
     */
    public void annu_champsRP(){
        JTextField[] txtFieldPC = {txtNomRP,txtPrenomRP,txtNumRP,txtTauxRP,txtSalaireRP};
        for (JTextField txtFieldPC1 : txtFieldPC) {
            txtFieldPC1.setEnabled(false);
            txtFieldPC1.setText("");
        }
        btnActionRC.setVisible(false);
        btnAnuRC.setVisible(false); 
        lblEnseRechRP.setVisible(false);
        txtEnsRechRP.setVisible(false);
        btnEnsRechRP.setVisible(false);
    }
    
    private void btnAjouterRepMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAjouterRepMouseEntered

        this.btnAjouterRep.setForeground(Color.black);
    }//GEN-LAST:event_btnAjouterRepMouseEntered

    private void btnAjouterRepMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAjouterRepMouseExited

        this.btnAjouterRep.setForeground(Color.white);
    }//GEN-LAST:event_btnAjouterRepMouseExited

    private void btnAjouterRepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAjouterRepActionPerformed

        fct='C';
        init_champsRP();
    }//GEN-LAST:event_btnAjouterRepActionPerformed

    private void btnModifierRepMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModifierRepMouseEntered

        this.btnModifierRep.setForeground(Color.black);
    }//GEN-LAST:event_btnModifierRepMouseEntered

    private void btnModifierRepMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModifierRepMouseExited

        this.btnModifierRep.setForeground(Color.white);

    }//GEN-LAST:event_btnModifierRepMouseExited

    private void btnModifierRepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifierRepActionPerformed
        annu_champsRP();
        lblEnseRechRP.setVisible(true);
        txtEnsRechRP.setVisible(true);
        btnEnsRechRP.setVisible(true); 
        fct = 'M';
        
    }//GEN-LAST:event_btnModifierRepActionPerformed

    private void btnSupprimerRepMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSupprimerRepMouseEntered

        this.btnSupprimerRep.setForeground(Color.black);
    }//GEN-LAST:event_btnSupprimerRepMouseEntered

    private void btnSupprimerRepMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSupprimerRepMouseExited

        this.btnSupprimerRep.setForeground(Color.white);
    }//GEN-LAST:event_btnSupprimerRepMouseExited

    private void btnSupprimerRepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSupprimerRepActionPerformed
        annu_champsRP();
        lblEnseRechRP.setVisible(true);
        txtEnsRechRP.setVisible(true);
        btnEnsRechRP.setVisible(true); 
        fct ='S';

    }//GEN-LAST:event_btnSupprimerRepActionPerformed

    private void btnRetourRepMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRetourRepMouseEntered

        this.btnRetourRep.setForeground(Color.black);
    }//GEN-LAST:event_btnRetourRepMouseEntered

    private void btnRetourRepMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRetourRepMouseExited

        this.btnRetourRep.setForeground(Color.white);
    }//GEN-LAST:event_btnRetourRepMouseExited

    private void btnRetourRepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetourRepActionPerformed

            Application fp = new Application();
            this.dispose();

    }//GEN-LAST:event_btnRetourRepActionPerformed

    private void QuitterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QuitterMouseClicked

        System.exit(0);
    }//GEN-LAST:event_QuitterMouseClicked

    private void QuitterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QuitterMouseEntered

        this.Quitter.setForeground(Color.black);
    }//GEN-LAST:event_QuitterMouseEntered

    private void QuitterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QuitterMouseExited

        this.Quitter.setForeground(Color.white);
    }//GEN-LAST:event_QuitterMouseExited

    private void btnEnsRechRPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnsRechRPActionPerformed

        annu_champsRP();
        String mot = txtEnsRechRP.getText();
        String line;
        boolean b = false;

        switch(fct){
            case 'M':
            for(int i = 0; i < r.size() && b == false;i++){
                Representant monRep = r.get(i);
                line = monRep.getNom()+";"+monRep.getPrenom()+";"+monRep.getNum()+";"+monRep.getTaux();
                if(line.contains(mot)){
                    b= true;
                    txtNomRP.setText(monRep.getNom());
                    txtPrenomRP.setText(monRep.getPrenom());
                    txtNumRP.setText(String.valueOf(monRep.getNum()));
                    txtTauxRP.setText(String.valueOf(monRep.getTaux()));
                    txtSalaireRP.setText(String.valueOf(monRep.getSalaire()));
                    init_champsRP();
                }
            }
            break;
            case 'S':
            for(int i = 0; i < r.size() && b == false;i++){
                Representant monRep = r.get(i);
                line = monRep.getNom()+";"+monRep.getPrenom()+";"+monRep.getNum()+";"+monRep.getTaux();
                if(line.contains(mot)){
                    b= true;
                    txtNomRP.setText(monRep.getNom());
                    txtPrenomRP.setText(monRep.getPrenom());
                    txtNumRP.setText(String.valueOf(monRep.getNum()));
                    txtTauxRP.setText(String.valueOf(monRep.getTaux()));
                    txtSalaireRP.setText(String.valueOf(monRep.getSalaire()));
                    init_champsRP();
                }
            }
            break;
        }
    }//GEN-LAST:event_btnEnsRechRPActionPerformed

    private void btnActionRCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActionRCActionPerformed
        // TODO add your handling code here:
        //le cas que tu choisit C= ajouter
        switch(fct){
            //créer un prospect
            case 'C':

                Representant rep = new Representant (txtNomRP.getText(),txtPrenomRP.getText(),Integer.parseInt(txtNumRP.getText()),Integer.parseInt(txtTauxRP.getText()), Integer.parseInt(txtSalaireRP.getText()));
                r.add(rep);
                try {

                    Fichiers.fermer_fichier('R', "Representant.txt");
                } catch (IOException ex) {
                    Logger.getLogger(PanProspect.class.getName()).log(Level.SEVERE, null, ex);
                }
                annu_champsRP();
            break;
            //modifier un prospect
            case 'M':
                
                String mot = txtEnsRechRP.getText();
                String line;
                boolean b = false;
                
                for(int i = 0; i< r.size();i++){
                    Representant reps = r.get(i);
                    line = reps.getNom()+";"+reps.getPrenom()+";"+reps.getNum()+";"+reps.getTaux()+";"+reps.getSalaire();
                    if(line.contains(mot)){
                        b=true;
                        reps.setNom(txtNomRP.getText());
                        reps.setNum(Integer.parseInt(txtNumRP.getText()));
                        reps.setPrenom(txtPrenomRP.getText());
                        reps.setSalaire(Integer.parseInt(txtSalaireRP.getText()));
                        reps.setTaux(Integer.parseInt(txtTauxRP.getText()));
                        r.set(WIDTH, reps);
                        annu_champsRP();
                        try {
                            Fichiers.fermer_fichier('R', "Representant.txt");
                        } catch (IOException ex) {
                            Logger.getLogger(PanRepresentant.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }    
            break;
            //supprimer prospect
            case 'S':
                String mot1 = txtEnsRechRP.getText();
                String line1;
                boolean b1 = false;

                for(int i = 0; i < r.size() && b1 == false;i++){
                    Representant monRep = r.get(i);
                    line1 = monRep.getNom()+";"+monRep.getPrenom()+";"+monRep.getNum()+";"+monRep.getTaux()+";"+monRep.getSalaire();
                    if(line1.contains(mot1)){
                        b1= true;
                        r.remove(i);
                        try {

                            Fichiers.fermer_fichier('R', "Representant.txt");
                        } catch (IOException ex) {
                            Logger.getLogger(PanProspect.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        annu_champsRP();
                    }
                }
            break;
        }
    }//GEN-LAST:event_btnActionRCActionPerformed

    private void btnAnuRCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnuRCActionPerformed

        annu_champsRP();
    }//GEN-LAST:event_btnAnuRCActionPerformed


    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PanRepresentant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PanRepresentant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PanRepresentant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PanRepresentant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                PanRepresentant dialog = new PanRepresentant(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Quitter;
    public javax.swing.JButton btnActionRC;
    private javax.swing.JButton btnAjouterRep;
    public javax.swing.JButton btnAnuRC;
    private javax.swing.JButton btnEnsRechRP;
    private javax.swing.JButton btnModifierRep;
    private javax.swing.JButton btnRetourRep;
    private javax.swing.JButton btnSupprimerRep;
    private javax.swing.JLabel jLabelClient;
    private javax.swing.JPanel jPanAdresseNewCli;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jTBNewCli;
    private javax.swing.JLabel lblEnseRechRP;
    private javax.swing.JLabel lblImageNC;
    private javax.swing.JLabel lblMailNC;
    private javax.swing.JLabel lblNomRP;
    private javax.swing.JLabel lblNumRP;
    private javax.swing.JLabel lblPrenomRP;
    private javax.swing.JLabel lblSalaire;
    private javax.swing.JToolBar tbNC;
    private javax.swing.JTextField txtEnsRechRP;
    private javax.swing.JTextField txtNomRP;
    private javax.swing.JTextField txtNumRP;
    private javax.swing.JTextField txtPrenomRP;
    private javax.swing.JTextField txtSalaireRP;
    private javax.swing.JTextField txtTauxRP;
    // End of variables declaration//GEN-END:variables
}
