/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IHM;

import Entites.*;
import Exception.FormatMailException;
import Exception.FormatPhoneException;
import Exception.FormatSiretException;
import Traitements.*;
import java.awt.*;
import java.io.*;
import java.util.logging.*;
import javax.swing.*;
import toutbois.*;
import static toutbois.Application.*;

/**
 *
 * @author ajugnon
 */
public class PanProspect extends javax.swing.JDialog {
    public char fct;

    public PanProspect(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("OverridableMethodCallInConstructor")
    public PanProspect(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        this.setLocationRelativeTo(null);
        initComponents();
    }
    /**
     * Fonction qui initilise tout les champs de la fenetre pour les activer.
     */
    public void init_champsPC(){
        switch(fct){
            
            case 'A':
                JTextField[] txtFieldPC = {txtLastVisitePC,txtCedexPC,txtCompAdPC,txtCpPC,txtEnseignePC,txtMailPC,txtNumRuePC,txtRuePC,txtSiretPC,txtTelPC,txtVillePC};
                cboPaysPC.setEnabled(true);
                cboVoiePC.setEnabled(true);
                for (JTextField txtFieldPC1 : txtFieldPC) {
                    txtFieldPC1.setEnabled(true);
                    txtFieldPC1.setText("");
                }
                btnActionPC.setText("Ajouter");
                btnActionPC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IHM/add.png")));
                break;
                
            case 'M':
                JTextField[] txtFieldPC1 = {txtLastVisitePC,txtCedexPC,txtCompAdPC,txtCpPC,txtEnseignePC,txtMailPC,txtNumRuePC,txtRuePC,txtSiretPC,txtTelPC,txtVillePC};
                cboPaysPC.setEnabled(true);
                cboVoiePC.setEnabled(true);
                for (JTextField txtFieldPC2 : txtFieldPC1) {
                    txtFieldPC2.setEnabled(true);
                }

                btnActionPC.setText("Modifier");
                btnActionPC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IHM/pencil.png")));
                break;
                
            case 'S':
                JTextField[] txtFieldPC3 = {txtLastVisitePC,txtCedexPC,txtCompAdPC,txtCpPC,txtEnseignePC,txtMailPC,txtNumRuePC,txtRuePC,txtSiretPC,txtTelPC,txtVillePC};
                cboPaysPC.setEnabled(true);
                cboVoiePC.setEnabled(true);
                for (JTextField txtFieldPC4 : txtFieldPC3) {
                    txtFieldPC4.setEnabled(true);
                }
                btnActionPC.setText("Supprimer");
                btnActionPC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IHM/garbagebin.png")));
                break;
        }

        btnActionPC.setVisible(true);
        btnAnuPC.setVisible(true); 
    }
    
    /**
     * Rend les champs, combobox et bouton Ajouter/Annuler non activés
     */
    public void annu_champsPC(){
        JTextField[] txtFieldPC = {txtLastVisitePC,txtCedexPC,txtCompAdPC,txtCpPC,txtEnseignePC,txtMailPC,txtNumRuePC,txtRuePC,txtSiretPC,txtTelPC,txtVillePC};
        cboPaysPC.setEnabled(false);
        cboVoiePC.setEnabled(false);
        for (JTextField txtFieldPC1 : txtFieldPC) {
            txtFieldPC1.setEnabled(false);
            txtFieldPC1.setText("");
        }
        btnActionPC.setVisible(false);
        btnAnuPC.setVisible(false); 
        lblEnseRechPC.setVisible(false);
        txtEnsRechPC.setVisible(false);
        btnEnsRechPC.setVisible(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanFondPC = new javax.swing.JPanel();
        lblEnseRechPC = new javax.swing.JLabel();
        txtEnsRechPC = new javax.swing.JTextField();
        btnEnsRechPC = new javax.swing.JButton();
        jTBNewPro = new javax.swing.JPanel();
        tbPC = new javax.swing.JToolBar();
        btnAjouterPC = new javax.swing.JButton();
        btnModifierPC = new javax.swing.JButton();
        btnSupprimerPC = new javax.swing.JButton();
        lblImageNC = new javax.swing.JLabel();
        btnRetourPC = new javax.swing.JButton();
        Quitter = new javax.swing.JButton();
        btnActionPC = new javax.swing.JButton();
        btnAnuPC = new javax.swing.JButton();
        jPanAdresseNewCli = new javax.swing.JPanel();
        lblEnseignePC = new javax.swing.JLabel();
        lblSiretPC = new javax.swing.JLabel();
        lblNumRuePC = new javax.swing.JLabel();
        lblVoiePC = new javax.swing.JLabel();
        txtEnseignePC = new javax.swing.JTextField();
        txtSiretPC = new javax.swing.JTextField();
        txtNumRuePC = new javax.swing.JTextField();
        cboVoiePC = new javax.swing.JComboBox();
        txtRuePC = new javax.swing.JTextField();
        lblVillePC = new javax.swing.JLabel();
        txtVillePC = new javax.swing.JTextField();
        lblCpPC = new javax.swing.JLabel();
        txtCpPC = new javax.swing.JTextField();
        cboPaysPC = new javax.swing.JComboBox();
        lblCedexPC = new javax.swing.JLabel();
        txtCedexPC = new javax.swing.JTextField();
        lblCompAdPC = new javax.swing.JLabel();
        txtCompAdPC = new javax.swing.JTextField();
        txtMailPC = new javax.swing.JTextField();
        txtTelPC = new javax.swing.JTextField();
        lblPaysPC = new javax.swing.JLabel();
        lblTelPC = new javax.swing.JLabel();
        lblMailPC = new javax.swing.JLabel();
        lblVisitePC = new javax.swing.JLabel();
        txtLastVisitePC = new javax.swing.JTextField();
        jLabelClient = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Espace Prospect");
        setIconImage(new ImageIcon("tbIcon.png").getImage());
        setResizable(false);

        jPanFondPC.setBackground(new java.awt.Color(255, 153, 0));
        jPanFondPC.setPreferredSize(new java.awt.Dimension(842, 505));
        jPanFondPC.setLayout(null);

        lblEnseRechPC.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblEnseRechPC.setForeground(new java.awt.Color(255, 255, 255));
        lblEnseRechPC.setText("Enseigne à rechercher :");
        jPanFondPC.add(lblEnseRechPC);
        lblEnseRechPC.setBounds(40, 60, 290, 40);

        txtEnsRechPC.setText("Recherche");
        jPanFondPC.add(txtEnsRechPC);
        txtEnsRechPC.setBounds(320, 70, 200, 30);

        btnEnsRechPC.setText("Rechercher");
        btnEnsRechPC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnsRechPCActionPerformed(evt);
            }
        });
        jPanFondPC.add(btnEnsRechPC);
        btnEnsRechPC.setBounds(420, 110, 100, 40);

        jTBNewPro.setBackground(new java.awt.Color(20, 30, 60));
        jTBNewPro.setForeground(new java.awt.Color(255, 255, 255));
        jTBNewPro.setMaximumSize(new java.awt.Dimension(169, 480));
        jTBNewPro.setMinimumSize(new java.awt.Dimension(169, 480));
        jTBNewPro.setPreferredSize(new java.awt.Dimension(169, 487));

        tbPC.setBackground(new java.awt.Color(20, 30, 60));
        tbPC.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        tbPC.setFloatable(false);
        tbPC.setForeground(new java.awt.Color(255, 255, 255));
        tbPC.setOrientation(javax.swing.SwingConstants.VERTICAL);
        tbPC.setRollover(true);
        tbPC.setMaximumSize(new java.awt.Dimension(169, 289));
        tbPC.setMinimumSize(new java.awt.Dimension(169, 289));
        tbPC.setPreferredSize(new java.awt.Dimension(169, 480));

        btnAjouterPC.setBackground(new java.awt.Color(20, 30, 60));
        btnAjouterPC.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        btnAjouterPC.setForeground(new java.awt.Color(255, 255, 255));
        btnAjouterPC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IHM/add.png"))); // NOI18N
        btnAjouterPC.setText("Ajouter");
        btnAjouterPC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAjouterPC.setFocusPainted(false);
        btnAjouterPC.setMaximumSize(new java.awt.Dimension(169, 95));
        btnAjouterPC.setMinimumSize(new java.awt.Dimension(169, 95));
        btnAjouterPC.setName(""); // NOI18N
        btnAjouterPC.setPreferredSize(new java.awt.Dimension(169, 95));
        btnAjouterPC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAjouterPCMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAjouterPCMouseExited(evt);
            }
        });
        btnAjouterPC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAjouterPCActionPerformed(evt);
            }
        });
        tbPC.add(btnAjouterPC);

        btnModifierPC.setBackground(new java.awt.Color(20, 30, 60));
        btnModifierPC.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        btnModifierPC.setForeground(new java.awt.Color(255, 255, 255));
        btnModifierPC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IHM/pencil.png"))); // NOI18N
        btnModifierPC.setText("Modifier");
        btnModifierPC.setFocusPainted(false);
        btnModifierPC.setFocusable(false);
        btnModifierPC.setMaximumSize(new java.awt.Dimension(169, 95));
        btnModifierPC.setMinimumSize(new java.awt.Dimension(169, 95));
        btnModifierPC.setPreferredSize(new java.awt.Dimension(169, 95));
        btnModifierPC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnModifierPCMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnModifierPCMouseExited(evt);
            }
        });
        btnModifierPC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifierPCActionPerformed(evt);
            }
        });
        tbPC.add(btnModifierPC);

        btnSupprimerPC.setBackground(new java.awt.Color(20, 30, 60));
        btnSupprimerPC.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        btnSupprimerPC.setForeground(new java.awt.Color(255, 255, 255));
        btnSupprimerPC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IHM/garbagebin.png"))); // NOI18N
        btnSupprimerPC.setText("Supprimer");
        btnSupprimerPC.setFocusPainted(false);
        btnSupprimerPC.setFocusable(false);
        btnSupprimerPC.setMaximumSize(new java.awt.Dimension(169, 95));
        btnSupprimerPC.setMinimumSize(new java.awt.Dimension(169, 95));
        btnSupprimerPC.setPreferredSize(new java.awt.Dimension(169, 95));
        btnSupprimerPC.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSupprimerPC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSupprimerPCMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSupprimerPCMouseExited(evt);
            }
        });
        btnSupprimerPC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSupprimerPCActionPerformed(evt);
            }
        });
        tbPC.add(btnSupprimerPC);

        lblImageNC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IHM/icon5.jpg"))); // NOI18N
        lblImageNC.setMaximumSize(new java.awt.Dimension(169, 85));
        lblImageNC.setMinimumSize(new java.awt.Dimension(169, 85));
        lblImageNC.setPreferredSize(new java.awt.Dimension(169, 85));
        tbPC.add(lblImageNC);

        btnRetourPC.setBackground(new java.awt.Color(20, 30, 60));
        btnRetourPC.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        btnRetourPC.setForeground(new java.awt.Color(255, 255, 255));
        btnRetourPC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IHM/return.png"))); // NOI18N
        btnRetourPC.setText("Retour");
        btnRetourPC.setFocusPainted(false);
        btnRetourPC.setFocusable(false);
        btnRetourPC.setMaximumSize(new java.awt.Dimension(130, 85));
        btnRetourPC.setMinimumSize(new java.awt.Dimension(169, 85));
        btnRetourPC.setPreferredSize(new java.awt.Dimension(130, 85));
        btnRetourPC.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnRetourPC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRetourPCMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRetourPCMouseExited(evt);
            }
        });
        btnRetourPC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetourPCActionPerformed(evt);
            }
        });
        tbPC.add(btnRetourPC);

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
        tbPC.add(Quitter);

        javax.swing.GroupLayout jTBNewProLayout = new javax.swing.GroupLayout(jTBNewPro);
        jTBNewPro.setLayout(jTBNewProLayout);
        jTBNewProLayout.setHorizontalGroup(
            jTBNewProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jTBNewProLayout.createSequentialGroup()
                .addComponent(tbPC, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 56, Short.MAX_VALUE))
        );
        jTBNewProLayout.setVerticalGroup(
            jTBNewProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tbPC, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
        );

        jPanFondPC.add(jTBNewPro);
        jTBNewPro.setBounds(580, 0, 130, 580);

        btnActionPC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IHM/add.png"))); // NOI18N
        btnActionPC.setText("Ajouter");
        btnActionPC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionPCActionPerformed(evt);
            }
        });
        jPanFondPC.add(btnActionPC);
        btnActionPC.setBounds(30, 500, 100, 40);

        btnAnuPC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IHM/return.png"))); // NOI18N
        btnAnuPC.setText("Annuler");
        btnAnuPC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnuPCActionPerformed(evt);
            }
        });
        jPanFondPC.add(btnAnuPC);
        btnAnuPC.setBounds(400, 500, 100, 40);

        jPanAdresseNewCli.setBackground(new java.awt.Color(255, 153, 0));
        jPanAdresseNewCli.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Coordonnées", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 3, 24), java.awt.Color.white)); // NOI18N
        jPanAdresseNewCli.setLayout(null);

        lblEnseignePC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblEnseignePC.setText("Enseigne* : ");
        jPanAdresseNewCli.add(lblEnseignePC);
        lblEnseignePC.setBounds(20, 40, 80, 30);

        lblSiretPC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblSiretPC.setText("SIRET* :");
        jPanAdresseNewCli.add(lblSiretPC);
        lblSiretPC.setBounds(300, 40, 66, 30);

        lblNumRuePC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNumRuePC.setText("Numéro* :");
        jPanAdresseNewCli.add(lblNumRuePC);
        lblNumRuePC.setBounds(20, 80, 80, 30);

        lblVoiePC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblVoiePC.setText("Voie :");
        jPanAdresseNewCli.add(lblVoiePC);
        lblVoiePC.setBounds(150, 80, 34, 30);

        txtEnseignePC.setText("Enseigne");
        txtEnseignePC.setEnabled(false);
        jPanAdresseNewCli.add(txtEnseignePC);
        txtEnseignePC.setBounds(100, 40, 150, 30);

        txtSiretPC.setText("Siret");
        txtSiretPC.setEnabled(false);
        jPanAdresseNewCli.add(txtSiretPC);
        txtSiretPC.setBounds(360, 40, 110, 30);

        txtNumRuePC.setText("N°");
        txtNumRuePC.setEnabled(false);
        jPanAdresseNewCli.add(txtNumRuePC);
        txtNumRuePC.setBounds(100, 80, 39, 30);

        cboVoiePC.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Rue", "Allée", "Boulevard", "Avenue" }));
        cboVoiePC.setEnabled(false);
        jPanAdresseNewCli.add(cboVoiePC);
        cboVoiePC.setBounds(195, 80, 70, 30);

        txtRuePC.setText("Rue");
        txtRuePC.setEnabled(false);
        jPanAdresseNewCli.add(txtRuePC);
        txtRuePC.setBounds(280, 80, 190, 30);

        lblVillePC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblVillePC.setText("Ville* :");
        jPanAdresseNewCli.add(lblVillePC);
        lblVillePC.setBounds(20, 160, 38, 30);

        txtVillePC.setText("Ville");
        txtVillePC.setEnabled(false);
        jPanAdresseNewCli.add(txtVillePC);
        txtVillePC.setBounds(80, 160, 131, 30);

        lblCpPC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCpPC.setText("Code Postal* :");
        jPanAdresseNewCli.add(lblCpPC);
        lblCpPC.setBounds(280, 160, 100, 30);

        txtCpPC.setText("CP");
        txtCpPC.setEnabled(false);
        jPanAdresseNewCli.add(txtCpPC);
        txtCpPC.setBounds(380, 160, 90, 30);

        cboPaysPC.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "France", "Belgique", "Luxembourg", "Allemagne", "Espagne", "Portugal" }));
        cboPaysPC.setEnabled(false);
        jPanAdresseNewCli.add(cboPaysPC);
        cboPaysPC.setBounds(340, 200, 130, 30);

        lblCedexPC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCedexPC.setText("Cedex : ");
        jPanAdresseNewCli.add(lblCedexPC);
        lblCedexPC.setBounds(20, 200, 52, 30);

        txtCedexPC.setText("Cedex");
        txtCedexPC.setEnabled(false);
        jPanAdresseNewCli.add(txtCedexPC);
        txtCedexPC.setBounds(80, 200, 100, 30);

        lblCompAdPC.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblCompAdPC.setText("Comp. d'Adresse : ");
        jPanAdresseNewCli.add(lblCompAdPC);
        lblCompAdPC.setBounds(20, 130, 127, 14);

        txtCompAdPC.setText("Complément d'Adresse");
        txtCompAdPC.setEnabled(false);
        jPanAdresseNewCli.add(txtCompAdPC);
        txtCompAdPC.setBounds(140, 120, 330, 30);

        txtMailPC.setText("Mail");
        txtMailPC.setEnabled(false);
        jPanAdresseNewCli.add(txtMailPC);
        txtMailPC.setBounds(80, 240, 155, 30);

        txtTelPC.setText("Teléphone");
        txtTelPC.setEnabled(false);
        jPanAdresseNewCli.add(txtTelPC);
        txtTelPC.setBounds(340, 240, 130, 30);

        lblPaysPC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPaysPC.setText("Pays");
        jPanAdresseNewCli.add(lblPaysPC);
        lblPaysPC.setBounds(290, 197, 34, 30);

        lblTelPC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTelPC.setText("Tél* : ");
        jPanAdresseNewCli.add(lblTelPC);
        lblTelPC.setBounds(290, 240, 60, 30);

        lblMailPC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblMailPC.setText("Mail*  :");
        jPanAdresseNewCli.add(lblMailPC);
        lblMailPC.setBounds(20, 240, 50, 30);

        lblVisitePC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblVisitePC.setText("Dernière visite du Représentant* : ");
        jPanAdresseNewCli.add(lblVisitePC);
        lblVisitePC.setBounds(80, 280, 340, 30);

        txtLastVisitePC.setText("Visite");
        txtLastVisitePC.setEnabled(false);
        jPanAdresseNewCli.add(txtLastVisitePC);
        txtLastVisitePC.setBounds(340, 280, 100, 30);

        jPanFondPC.add(jPanAdresseNewCli);
        jPanAdresseNewCli.setBounds(20, 150, 500, 330);

        jLabelClient.setFont(new java.awt.Font("OCR A Extended", 0, 30)); // NOI18N
        jLabelClient.setForeground(new java.awt.Color(255, 255, 255));
        jLabelClient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IHM/icon2.jpg"))); // NOI18N
        jLabelClient.setText("Espace Prospect");
        jPanFondPC.add(jLabelClient);
        jLabelClient.setBounds(20, 10, 340, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanFondPC, javax.swing.GroupLayout.DEFAULT_SIZE, 693, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanFondPC, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnsRechPCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnsRechPCActionPerformed

        annu_champsPC();
        String mot = txtEnsRechPC.getText();
        String line;
        boolean b = false;

        switch(fct){
            case 'M':
            for(int i = 0; i < p.size() && b == false;i++){
                Prospect monPro = p.get(i);
                line = monPro.getCompAdd()+";"+monPro.getDerniereVisite()+";"+monPro.getEnseigne()+";"+monPro.getMail()+";"+monPro.getPays()+";"+monPro.getRue()+";"+monPro.getVille()+";"+monPro.getVoie()+";"+monPro.getCedex()+";"+monPro.getCp()+";"+monPro.getNumRue()+";"+monPro.getSiret()+";"+monPro.getTel();
                if(line.contains(mot)){
                    b= true;
                    txtCompAdPC.setText(monPro.getCompAdd());
                    txtLastVisitePC.setText(monPro.getDerniereVisite());
                    txtEnseignePC.setText(monPro.getEnseigne());
                    txtMailPC.setText(monPro.getMail());
                    cboPaysPC.setSelectedItem(monPro.getPays());
                    txtRuePC.setText(monPro.getRue());
                    txtVillePC.setText(monPro.getVille());
                    cboVoiePC.setSelectedItem(monPro.getVoie());
                    txtCedexPC.setText(String.valueOf(monPro.getCedex()));
                    txtCpPC.setText(String.valueOf(monPro.getCp()));
                    txtNumRuePC.setText(String.valueOf(monPro.getNumRue()));
                    txtSiretPC.setText(String.valueOf(monPro.getSiret()));
                    txtTelPC.setText(String.valueOf(monPro.getTel()));
                    init_champsPC();
                }
            }
            break;
                
            case 'S':
            for(int i = 0; i < p.size() && b == false;i++){
                Prospect monPro = p.get(i);
                line = monPro.getCompAdd()+";"+monPro.getDerniereVisite()+";"+monPro.getEnseigne()+";"+monPro.getMail()+";"+monPro.getPays()+";"+monPro.getRue()+";"+monPro.getVille()+";"+monPro.getVoie()+";"+monPro.getCedex()+";"+monPro.getCp()+";"+monPro.getNumRue()+";"+monPro.getSiret()+";"+monPro.getTel();
                if(line.contains(mot)){
                    b= true;
                    txtCompAdPC.setText(monPro.getCompAdd());
                    txtLastVisitePC.setText(monPro.getDerniereVisite());
                    txtEnseignePC.setText(monPro.getEnseigne());
                    txtMailPC.setText(monPro.getMail());
                    cboPaysPC.setSelectedItem(monPro.getPays());
                    txtRuePC.setText(monPro.getRue());
                    txtVillePC.setText(monPro.getVille());
                    cboVoiePC.setSelectedItem(monPro.getVoie());
                    txtCedexPC.setText(String.valueOf(monPro.getCedex()));
                    txtCpPC.setText(String.valueOf(monPro.getCp()));
                    txtNumRuePC.setText(String.valueOf(monPro.getNumRue()));
                    txtSiretPC.setText(String.valueOf(monPro.getSiret()));
                    txtTelPC.setText(String.valueOf(monPro.getTel()));
                    init_champsPC();
                }
            }
            break;
        }

    }//GEN-LAST:event_btnEnsRechPCActionPerformed

    private void btnAjouterPCMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAjouterPCMouseEntered

        this.btnAjouterPC.setForeground(Color.black);
    }//GEN-LAST:event_btnAjouterPCMouseEntered

    private void btnAjouterPCMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAjouterPCMouseExited

        this.btnAjouterPC.setForeground(Color.white);
    }//GEN-LAST:event_btnAjouterPCMouseExited

    private void btnAjouterPCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAjouterPCActionPerformed
        fct='A';
        init_champsPC();
    }//GEN-LAST:event_btnAjouterPCActionPerformed

    private void btnModifierPCMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModifierPCMouseEntered
        this.btnModifierPC.setForeground(Color.black);
    }//GEN-LAST:event_btnModifierPCMouseEntered

    private void btnModifierPCMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModifierPCMouseExited
        this.btnModifierPC.setForeground(Color.white);

    }//GEN-LAST:event_btnModifierPCMouseExited

    private void btnModifierPCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifierPCActionPerformed
        fct = 'M';
        lblEnseRechPC.setVisible(true);
        txtEnsRechPC.setVisible(true);
        btnEnsRechPC.setVisible(true); 
    }//GEN-LAST:event_btnModifierPCActionPerformed

    private void btnSupprimerPCMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSupprimerPCMouseEntered
        this.btnSupprimerPC.setForeground(Color.black);
    }//GEN-LAST:event_btnSupprimerPCMouseEntered

    private void btnSupprimerPCMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSupprimerPCMouseExited
        this.btnSupprimerPC.setForeground(Color.white);
    }//GEN-LAST:event_btnSupprimerPCMouseExited

    private void btnSupprimerPCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSupprimerPCActionPerformed
        fct ='S';
        lblEnseRechPC.setVisible(true);
        txtEnsRechPC.setVisible(true);
        btnEnsRechPC.setVisible(true); 
    }//GEN-LAST:event_btnSupprimerPCActionPerformed

    private void btnRetourPCMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRetourPCMouseEntered
        this.btnRetourPC.setForeground(Color.black);
    }//GEN-LAST:event_btnRetourPCMouseEntered

    private void btnRetourPCMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRetourPCMouseExited
        this.btnRetourPC.setForeground(Color.white);
    }//GEN-LAST:event_btnRetourPCMouseExited

    private void btnRetourPCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetourPCActionPerformed
        Application fp = new Application();
        this.dispose();
        
    }//GEN-LAST:event_btnRetourPCActionPerformed

    private void QuitterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QuitterMouseClicked
        System.exit(0);
    }//GEN-LAST:event_QuitterMouseClicked

    private void QuitterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QuitterMouseEntered
        this.Quitter.setForeground(Color.black);
    }//GEN-LAST:event_QuitterMouseEntered

    private void QuitterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QuitterMouseExited
        this.Quitter.setForeground(Color.white);
    }//GEN-LAST:event_QuitterMouseExited

    private void btnActionPCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActionPCActionPerformed
       
        switch(fct){
            //créer un prospect
            case 'A':
                if (txtEnseignePC.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Vous avez oublié un champs obligatoire *", "Erreur champs", JOptionPane.ERROR_MESSAGE);
                }else{
                if(txtCompAdPC.getText().equals("")){
                try {
                    Prospect pros = new Prospect(Integer.parseInt(txtCpPC.getText()),Integer.parseInt(txtTelPC.getText()),Long.parseLong(txtSiretPC.getText()),Integer.parseInt(txtNumRuePC.getText()),Integer.parseInt(txtCedexPC.getText()),txtEnseignePC.getText(),txtRuePC.getText(),txtVillePC.getText(),cboPaysPC.getSelectedItem().toString(),txtMailPC.getText()," ",cboVoiePC.getSelectedItem().toString(),txtLastVisitePC.getText());
                    p.add(pros);
                    
                   
                    Fichiers.fermer_fichier('P', "Prospect.txt");
                } catch (IOException  | FormatMailException | FormatPhoneException | FormatSiretException ex) {
                    Logger.getLogger(PanProspect.class.getName()).log(Level.SEVERE, null, ex);
                }
                annu_champsPC();
                }else if (txtCedexPC.getText().equals("")){
                   try {
                    Prospect pros = new Prospect(Integer.parseInt(txtCpPC.getText()),Integer.parseInt(txtTelPC.getText()),Long.parseLong(txtSiretPC.getText()),Integer.parseInt(txtNumRuePC.getText()),0,txtEnseignePC.getText(),txtRuePC.getText(),txtVillePC.getText(),cboPaysPC.getSelectedItem().toString(),txtMailPC.getText(),txtCompAdPC.getText(),cboVoiePC.getSelectedItem().toString(),txtLastVisitePC.getText());
                    p.add(pros);  
                    
                   
                    Fichiers.fermer_fichier('P', "Prospect.txt");
                } catch (IOException  | FormatMailException | FormatPhoneException | FormatSiretException ex) {
                    Logger.getLogger(PanProspect.class.getName()).log(Level.SEVERE, null, ex);
                }
                annu_champsPC();
                }else if(txtCompAdPC.getText().equals("") && txtCedexPC.getText().equals("")){//champs compadd et cedex vides
                   try {
                    Prospect pros = new Prospect(Integer.parseInt(txtCpPC.getText()),Integer.parseInt(txtTelPC.getText()),Long.parseLong(txtSiretPC.getText()),Integer.parseInt(txtNumRuePC.getText()),0,txtEnseignePC.getText(),txtRuePC.getText(),txtVillePC.getText(),cboPaysPC.getSelectedItem().toString(),txtMailPC.getText()," ",cboVoiePC.getSelectedItem().toString(),txtLastVisitePC.getText());
                    p.add(pros); 
                    
                   
                    Fichiers.fermer_fichier('P', "Prospect.txt");
                } catch (IOException | FormatMailException | FormatPhoneException | FormatSiretException ex) {
                    Logger.getLogger(PanProspect.class.getName()).log(Level.SEVERE, null, ex);
                }
                annu_champsPC();
                }else{//tout les champs rempli
                    try {
                    Prospect pros = new Prospect(Integer.parseInt(txtCpPC.getText()),Integer.parseInt(txtTelPC.getText()),Long.parseLong(txtSiretPC.getText()),Integer.parseInt(txtNumRuePC.getText()),Integer.parseInt(txtCedexPC.getText()),txtEnseignePC.getText(),txtRuePC.getText(),txtVillePC.getText(),cboPaysPC.getSelectedItem().toString(),txtMailPC.getText(),txtCompAdPC.getText(),cboVoiePC.getSelectedItem().toString(),txtLastVisitePC.getText());
                    p.add(pros);
                    
                   
                    Fichiers.fermer_fichier('P', "Prospect.txt");
                } catch (IOException | FormatMailException | FormatPhoneException | FormatSiretException ex) {
                    Logger.getLogger(PanProspect.class.getName()).log(Level.SEVERE, null, ex);
                }
                annu_champsPC();
                }
                }
                break;
                
            case 'M':
                String mot = txtEnsRechPC.getText();
                String line;
                boolean b = false;
        
                for(int i = 0; i < p.size() && b == false;i++){
                    Prospect monPro = p.get(i);
                    line = monPro.getCompAdd()+";"+monPro.getDerniereVisite()+";"+monPro.getEnseigne()+";"+monPro.getMail()+";"+monPro.getPays()+";"+monPro.getRue()+";"+monPro.getVille()+";"+monPro.getVoie()+";"+monPro.getCedex()+";"+monPro.getCp()+";"+monPro.getNumRue()+";"+monPro.getSiret()+";"+monPro.getTel();
                    if(line.contains(mot)){
                        b= true; 
                        monPro.setCompAdd(txtCompAdPC.getText());
                        monPro.setDerniereVisite(txtLastVisitePC.getText());
                        monPro.setEnseigne(txtEnseignePC.getText());
                        monPro.setMail(txtMailPC.getText());
                        monPro.setPays(cboPaysPC.getSelectedItem().toString());
                        monPro.setRue(txtRuePC.getText());
                        monPro.setVille(txtVillePC.getText());
                        monPro.setVoie(cboVoiePC.getSelectedItem().toString());
                        monPro.setCedex(Integer.parseInt(txtCedexPC.getText()));
                        monPro.setCp(Integer.parseInt(txtCpPC.getText()));
                        monPro.setNumRue(Integer.parseInt(txtNumRuePC.getText()));
                        monPro.setSiret(Integer.parseInt(txtSiretPC.getText()));
                        monPro.setTel(Integer.parseInt(txtTelPC.getText()));
                        p.set(i, monPro);
                        annu_champsPC();
                        try {
                            
                            Fichiers.fermer_fichier('P', "Prospect.txt");
                        } catch (IOException ex) {
                            Logger.getLogger(PanProspect.class.getName()).log(Level.SEVERE, null, ex);
                        }              
                    }
                }
                break;
                
            case 'S':
                String mot1 = txtEnsRechPC.getText();
                String line1;
                boolean b1 = false;
        
                for(int i = 0; i < p.size() && b1 == false;i++){
                    Prospect monPro = p.get(i);
                    line1 = monPro.getCompAdd()+";"+monPro.getDerniereVisite()+";"+monPro.getEnseigne()+";"+monPro.getMail()+";"+monPro.getPays()+";"+monPro.getRue()+";"+monPro.getVille()+";"+monPro.getVoie()+";"+monPro.getCedex()+";"+monPro.getCp()+";"+monPro.getNumRue()+";"+monPro.getSiret()+";"+monPro.getTel();
                    if(line1.contains(mot1)){
                        b1= true;
                        p.remove(i);
                        try {
                           
                            Fichiers.fermer_fichier('P', "Prospect.txt");
                        } catch (IOException ex) {
                            Logger.getLogger(PanProspect.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        annu_champsPC();
                    }
                }
            break;
        
        }
    }//GEN-LAST:event_btnActionPCActionPerformed

    private void btnAnuPCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnuPCActionPerformed

        annu_champsPC();
    }//GEN-LAST:event_btnAnuPCActionPerformed

    
    
    


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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PanProspect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                PanProspect dialog = new PanProspect(new javax.swing.JFrame(), true);
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
    public javax.swing.JButton btnActionPC;
    private javax.swing.JButton btnAjouterPC;
    public javax.swing.JButton btnAnuPC;
    private javax.swing.JButton btnEnsRechPC;
    private javax.swing.JButton btnModifierPC;
    private javax.swing.JButton btnRetourPC;
    private javax.swing.JButton btnSupprimerPC;
    private javax.swing.JComboBox cboPaysPC;
    private javax.swing.JComboBox cboVoiePC;
    private javax.swing.JLabel jLabelClient;
    private javax.swing.JPanel jPanAdresseNewCli;
    private javax.swing.JPanel jPanFondPC;
    private javax.swing.JPanel jTBNewPro;
    private javax.swing.JLabel lblCedexPC;
    private javax.swing.JLabel lblCompAdPC;
    private javax.swing.JLabel lblCpPC;
    private javax.swing.JLabel lblEnseRechPC;
    private javax.swing.JLabel lblEnseignePC;
    private javax.swing.JLabel lblImageNC;
    private javax.swing.JLabel lblMailPC;
    private javax.swing.JLabel lblNumRuePC;
    private javax.swing.JLabel lblPaysPC;
    private javax.swing.JLabel lblSiretPC;
    private javax.swing.JLabel lblTelPC;
    private javax.swing.JLabel lblVillePC;
    private javax.swing.JLabel lblVisitePC;
    private javax.swing.JLabel lblVoiePC;
    private javax.swing.JToolBar tbPC;
    private javax.swing.JTextField txtCedexPC;
    private javax.swing.JTextField txtCompAdPC;
    private javax.swing.JTextField txtCpPC;
    private javax.swing.JTextField txtEnsRechPC;
    private javax.swing.JTextField txtEnseignePC;
    private javax.swing.JTextField txtLastVisitePC;
    private javax.swing.JTextField txtMailPC;
    private javax.swing.JTextField txtNumRuePC;
    private javax.swing.JTextField txtRuePC;
    private javax.swing.JTextField txtSiretPC;
    private javax.swing.JTextField txtTelPC;
    private javax.swing.JTextField txtVillePC;
    // End of variables declaration//GEN-END:variables
}
