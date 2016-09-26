/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IHM;

import Entites.*;
import Exception.FormatMailException;
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
public class PanClient extends javax.swing.JDialog {
    
    //Variable de controle d'action ajouter/modifier/supprimer
    public char fct;
    //Définition d'un nouveau modèle pour le tableau JTable
    private final ModeleDynamiqueCli modele = new ModeleDynamiqueCli();

    public PanClient(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("OverridableMethodCallInConstructor")
    public PanClient(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        setModal(modal); 
        this.setLocationRelativeTo(null);
        initComponents();
    }
    
    /**
     * Méthode servant à activer les textField/combo box et les boutons Ajouter/Annuler
     * selon le bouton cliqué
     * A : Ajouter
     * M : Modifier
     * S : Supprimer
     */
    public void init_champsNC(){

        switch(fct){
            
            case 'A':
                JTextField[] txtFieldNC = {txtCedexNC,txtCompAdNC,txtCpNC,txtEnseigneNC,txtMailNC,txtNumRepNC,txtNumRueNC,txtRueNC,txtSiretNC,txtTelNC,txtVilleNC,txtNbComNC};
                cboPaysNC.setEnabled(true);
                cboVoieNC.setEnabled(true);
                for (JTextField txtFieldNC1 : txtFieldNC) {
                    txtFieldNC1.setEnabled(true);
                    txtFieldNC1.setText("");
                }
                btnActionNC.setText("Ajouter");
                btnActionNC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IHM/add.png")));
                break;
            case 'M':
                JTextField[] txtFieldNC1 = {txtCedexNC,txtCompAdNC,txtCpNC,txtEnseigneNC,txtMailNC,txtNumRepNC,txtNumRueNC,txtRueNC,txtSiretNC,txtTelNC,txtVilleNC,txtNbComNC};
                cboPaysNC.setEnabled(true);
                cboVoieNC.setEnabled(true);
                for (JTextField txtFieldNC2 : txtFieldNC1) {
                    txtFieldNC2.setEnabled(true);
                }
                btnActionNC.setText("Modifier");
                btnActionNC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IHM/pencil.png")));
                break;
            case 'S':
                JTextField[] txtFieldNC3 = {txtCedexNC,txtCompAdNC,txtCpNC,txtEnseigneNC,txtMailNC,txtNumRepNC,txtNumRueNC,txtRueNC,txtSiretNC,txtTelNC,txtVilleNC,txtNbComNC};
                cboPaysNC.setEnabled(true);
                cboVoieNC.setEnabled(true);
                for (JTextField txtFieldNC4 : txtFieldNC3) {
                    txtFieldNC4.setEnabled(true);
                }
                btnActionNC.setText("Supprimer");
                btnActionNC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IHM/garbagebin.png")));
                break;
        }

        btnActionNC.setVisible(true);
        btnAnuNC.setVisible(true);   
    }
    
    /**
     * Rend les champs, combobox et bouton Ajouter/Annuler non activés
     */
    public void annu_champsNC(){

        JTextField[] txtFieldNC = {txtNumCliNC,txtCedexNC,txtCompAdNC,txtCpNC,txtEnseigneNC,txtMailNC,txtNumRepNC,txtNumRueNC,txtRueNC,txtSiretNC,txtTelNC,txtVilleNC,txtNbComNC};
                cboPaysNC.setEnabled(false);
                cboVoieNC.setEnabled(false);
                for (JTextField txtFieldNC1 : txtFieldNC) {
                    txtFieldNC1.setEnabled(false);
                    txtFieldNC1.setText("");
                }
                btnActionNC.setVisible(false);
                btnAnuNC.setVisible(false);

    }
    
    /**
     * Méthode servant à afficher dans les champs correspondant à la ligne 
     * sélectionnée dans le JTable    
     * 
     */
    public void affiche_champsNC(){
        //Récupère le numéro de la ligne du tableau
        int ligneSelectionne = tableNC.getSelectedRow();
        
        /*
        Parcours la collection a la recherche du numéro client à la ligne sélectionnée
        
        */
        for (Client c1 : c) {
            if (c1.getNumCli() == (int)tableNC.getValueAt(ligneSelectionne, 0)) {
                cboPaysNC.setSelectedItem((String) c1.getPays());
                cboVoieNC.setSelectedItem((String) c1.getVoie());
                txtCedexNC.setText(String.valueOf(c1.getCedex()));
                txtCompAdNC.setText((String) c1.getCompAdd());
                txtCpNC.setText(String.valueOf(c1.getCp()));
                txtEnseigneNC.setText((String) c1.getEnseigne());
                txtMailNC.setText((String) c1.getMail());
                txtNbComNC.setText(String.valueOf(c1.getNbCom()));
                txtNumCliNC.setText(String.valueOf(c1.getNumCli()));
                txtNumRepNC.setText(String.valueOf(c1.getNumRep()));
                txtNumRueNC.setText(String.valueOf(c1.getNumRue()));
                txtRueNC.setText((String) c1.getRue());
                txtSiretNC.setText(String.valueOf(c1.getSiret()));
                txtTelNC.setText(String.valueOf(c1.getTel()));
                txtVilleNC.setText((String) c1.getVille());
            }
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanFondNewCli = new javax.swing.JPanel();
        jPanAdresseNewCli = new javax.swing.JPanel();
        lblEnseigneNC = new javax.swing.JLabel();
        lblSiretNC = new javax.swing.JLabel();
        lblNumRueNC = new javax.swing.JLabel();
        lblVoieNC = new javax.swing.JLabel();
        txtEnseigneNC = new javax.swing.JTextField();
        txtSiretNC = new javax.swing.JTextField();
        txtNumRueNC = new javax.swing.JTextField();
        cboVoieNC = new javax.swing.JComboBox();
        txtRueNC = new javax.swing.JTextField();
        lblVilleNC = new javax.swing.JLabel();
        txtVilleNC = new javax.swing.JTextField();
        lblCpNC = new javax.swing.JLabel();
        txtCpNC = new javax.swing.JTextField();
        cboPaysNC = new javax.swing.JComboBox();
        lblCedexNC = new javax.swing.JLabel();
        txtCedexNC = new javax.swing.JTextField();
        lblCompAdNC = new javax.swing.JLabel();
        txtCompAdNC = new javax.swing.JTextField();
        txtMailNC = new javax.swing.JTextField();
        txtTelNC = new javax.swing.JTextField();
        lblPaysNC = new javax.swing.JLabel();
        lblTelNC = new javax.swing.JLabel();
        lblMailNC = new javax.swing.JLabel();
        jTBNewCli = new javax.swing.JPanel();
        tbNC = new javax.swing.JToolBar();
        btnAjouterCli = new javax.swing.JButton();
        btnModifierCli = new javax.swing.JButton();
        btnSupprimerCli = new javax.swing.JButton();
        lblImageNC = new javax.swing.JLabel();
        btnRetourCli = new javax.swing.JButton();
        Quitter = new javax.swing.JButton();
        spNC = new javax.swing.JScrollPane();
        tableNC = new javax.swing.JTable();
        jLabelClient = new javax.swing.JLabel();
        btnAnuNC = new javax.swing.JButton();
        btnActionNC = new javax.swing.JButton();
        txtNumCliNC = new javax.swing.JTextField();
        lblNumCliNC = new javax.swing.JLabel();
        lblNbComNC = new javax.swing.JLabel();
        txtNbComNC = new javax.swing.JTextField();
        lblNumRepNC = new javax.swing.JLabel();
        txtNumRepNC = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Espace Client");
        setIconImage(new ImageIcon("tbIcon.png").getImage());
        setResizable(false);

        jPanFondNewCli.setBackground(new java.awt.Color(204, 0, 51));
        jPanFondNewCli.setMaximumSize(new java.awt.Dimension(842, 505));
        jPanFondNewCli.setMinimumSize(new java.awt.Dimension(842, 505));
        jPanFondNewCli.setLayout(null);

        jPanAdresseNewCli.setBackground(new java.awt.Color(204, 0, 51));
        jPanAdresseNewCli.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Coordonnées", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 3, 24), java.awt.Color.white)); // NOI18N
        jPanAdresseNewCli.setLayout(null);

        lblEnseigneNC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblEnseigneNC.setText("Enseigne* : ");
        jPanAdresseNewCli.add(lblEnseigneNC);
        lblEnseigneNC.setBounds(20, 40, 80, 30);

        lblSiretNC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblSiretNC.setText("SIRET* :");
        jPanAdresseNewCli.add(lblSiretNC);
        lblSiretNC.setBounds(310, 40, 66, 30);

        lblNumRueNC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNumRueNC.setText("Numéro* :");
        jPanAdresseNewCli.add(lblNumRueNC);
        lblNumRueNC.setBounds(20, 80, 80, 30);

        lblVoieNC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblVoieNC.setText("Voie :");
        jPanAdresseNewCli.add(lblVoieNC);
        lblVoieNC.setBounds(150, 80, 34, 30);

        txtEnseigneNC.setText("Enseigne");
        txtEnseigneNC.setEnabled(false);
        jPanAdresseNewCli.add(txtEnseigneNC);
        txtEnseigneNC.setBounds(100, 40, 150, 30);

        txtSiretNC.setText("Siret");
        txtSiretNC.setEnabled(false);
        jPanAdresseNewCli.add(txtSiretNC);
        txtSiretNC.setBounds(370, 40, 100, 30);

        txtNumRueNC.setText("N°");
        txtNumRueNC.setEnabled(false);
        jPanAdresseNewCli.add(txtNumRueNC);
        txtNumRueNC.setBounds(100, 80, 39, 30);

        cboVoieNC.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Rue", "Allée", "Boulevard", "Avenue" }));
        cboVoieNC.setEnabled(false);
        jPanAdresseNewCli.add(cboVoieNC);
        cboVoieNC.setBounds(200, 80, 65, 30);

        txtRueNC.setText("Rue");
        txtRueNC.setEnabled(false);
        jPanAdresseNewCli.add(txtRueNC);
        txtRueNC.setBounds(280, 80, 190, 30);

        lblVilleNC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblVilleNC.setText("Ville* :");
        jPanAdresseNewCli.add(lblVilleNC);
        lblVilleNC.setBounds(20, 160, 50, 30);

        txtVilleNC.setText("Ville");
        txtVilleNC.setEnabled(false);
        jPanAdresseNewCli.add(txtVilleNC);
        txtVilleNC.setBounds(80, 160, 131, 30);

        lblCpNC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCpNC.setText("Code Postal* :");
        jPanAdresseNewCli.add(lblCpNC);
        lblCpNC.setBounds(280, 160, 110, 30);

        txtCpNC.setText("CP");
        txtCpNC.setEnabled(false);
        jPanAdresseNewCli.add(txtCpNC);
        txtCpNC.setBounds(380, 160, 90, 30);

        cboPaysNC.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "France", "Belgique", "Luxembourg", "Allemagne", "Espagne", "Portugal" }));
        cboPaysNC.setEnabled(false);
        jPanAdresseNewCli.add(cboPaysNC);
        cboPaysNC.setBounds(340, 200, 130, 30);

        lblCedexNC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCedexNC.setText("Cedex : ");
        jPanAdresseNewCli.add(lblCedexNC);
        lblCedexNC.setBounds(20, 200, 52, 30);

        txtCedexNC.setText("Cedex");
        txtCedexNC.setEnabled(false);
        jPanAdresseNewCli.add(txtCedexNC);
        txtCedexNC.setBounds(80, 200, 100, 30);

        lblCompAdNC.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblCompAdNC.setText("Comp. d'Adresse : ");
        jPanAdresseNewCli.add(lblCompAdNC);
        lblCompAdNC.setBounds(20, 130, 127, 14);

        txtCompAdNC.setText("Complément d'Adresse");
        txtCompAdNC.setEnabled(false);
        jPanAdresseNewCli.add(txtCompAdNC);
        txtCompAdNC.setBounds(140, 120, 330, 30);

        txtMailNC.setText("Mail");
        txtMailNC.setEnabled(false);
        jPanAdresseNewCli.add(txtMailNC);
        txtMailNC.setBounds(80, 240, 155, 30);

        txtTelNC.setText("Teléphone");
        txtTelNC.setEnabled(false);
        jPanAdresseNewCli.add(txtTelNC);
        txtTelNC.setBounds(340, 240, 130, 30);

        lblPaysNC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPaysNC.setText("Pays");
        jPanAdresseNewCli.add(lblPaysNC);
        lblPaysNC.setBounds(290, 197, 34, 30);

        lblTelNC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTelNC.setText("Tél* : ");
        jPanAdresseNewCli.add(lblTelNC);
        lblTelNC.setBounds(286, 240, 38, 30);

        lblMailNC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblMailNC.setText("Mail* :");
        jPanAdresseNewCli.add(lblMailNC);
        lblMailNC.setBounds(20, 240, 50, 30);

        jPanFondNewCli.add(jPanAdresseNewCli);
        jPanAdresseNewCli.setBounds(20, 70, 490, 280);

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

        btnAjouterCli.setBackground(new java.awt.Color(20, 30, 60));
        btnAjouterCli.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        btnAjouterCli.setForeground(new java.awt.Color(255, 255, 255));
        btnAjouterCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IHM/add.png"))); // NOI18N
        btnAjouterCli.setText("Ajouter");
        btnAjouterCli.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAjouterCli.setFocusPainted(false);
        btnAjouterCli.setMaximumSize(new java.awt.Dimension(169, 95));
        btnAjouterCli.setMinimumSize(new java.awt.Dimension(169, 95));
        btnAjouterCli.setName(""); // NOI18N
        btnAjouterCli.setPreferredSize(new java.awt.Dimension(169, 95));
        btnAjouterCli.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAjouterCliMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAjouterCliMouseExited(evt);
            }
        });
        btnAjouterCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAjouterCliActionPerformed(evt);
            }
        });
        tbNC.add(btnAjouterCli);

        btnModifierCli.setBackground(new java.awt.Color(20, 30, 60));
        btnModifierCli.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        btnModifierCli.setForeground(new java.awt.Color(255, 255, 255));
        btnModifierCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IHM/pencil.png"))); // NOI18N
        btnModifierCli.setText("Modifier");
        btnModifierCli.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnModifierCli.setFocusPainted(false);
        btnModifierCli.setFocusable(false);
        btnModifierCli.setMaximumSize(new java.awt.Dimension(169, 95));
        btnModifierCli.setMinimumSize(new java.awt.Dimension(169, 95));
        btnModifierCli.setPreferredSize(new java.awt.Dimension(169, 95));
        btnModifierCli.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnModifierCliMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnModifierCliMouseExited(evt);
            }
        });
        btnModifierCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifierCliActionPerformed(evt);
            }
        });
        tbNC.add(btnModifierCli);

        btnSupprimerCli.setBackground(new java.awt.Color(20, 30, 60));
        btnSupprimerCli.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        btnSupprimerCli.setForeground(new java.awt.Color(255, 255, 255));
        btnSupprimerCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IHM/garbagebin.png"))); // NOI18N
        btnSupprimerCli.setText("Supprimer");
        btnSupprimerCli.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnSupprimerCli.setFocusPainted(false);
        btnSupprimerCli.setFocusable(false);
        btnSupprimerCli.setMaximumSize(new java.awt.Dimension(169, 95));
        btnSupprimerCli.setMinimumSize(new java.awt.Dimension(169, 95));
        btnSupprimerCli.setPreferredSize(new java.awt.Dimension(169, 95));
        btnSupprimerCli.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSupprimerCli.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSupprimerCliMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSupprimerCliMouseExited(evt);
            }
        });
        btnSupprimerCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSupprimerCliActionPerformed(evt);
            }
        });
        tbNC.add(btnSupprimerCli);

        lblImageNC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IHM/icon5.jpg"))); // NOI18N
        lblImageNC.setMaximumSize(new java.awt.Dimension(169, 85));
        lblImageNC.setMinimumSize(new java.awt.Dimension(169, 85));
        lblImageNC.setPreferredSize(new java.awt.Dimension(169, 85));
        tbNC.add(lblImageNC);

        btnRetourCli.setBackground(new java.awt.Color(20, 30, 60));
        btnRetourCli.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        btnRetourCli.setForeground(new java.awt.Color(255, 255, 255));
        btnRetourCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IHM/return.png"))); // NOI18N
        btnRetourCli.setText("Retour");
        btnRetourCli.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnRetourCli.setFocusPainted(false);
        btnRetourCli.setFocusable(false);
        btnRetourCli.setMaximumSize(new java.awt.Dimension(130, 85));
        btnRetourCli.setMinimumSize(new java.awt.Dimension(169, 85));
        btnRetourCli.setPreferredSize(new java.awt.Dimension(130, 85));
        btnRetourCli.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnRetourCli.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRetourCliMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRetourCliMouseExited(evt);
            }
        });
        btnRetourCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetourCliActionPerformed(evt);
            }
        });
        tbNC.add(btnRetourCli);

        Quitter.setBackground(new java.awt.Color(20, 30, 60));
        Quitter.setFont(new java.awt.Font("OCR A Std", 0, 14)); // NOI18N
        Quitter.setForeground(new java.awt.Color(255, 255, 255));
        Quitter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IHM/delete.png"))); // NOI18N
        Quitter.setText("Quitter");
        Quitter.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
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
            .addComponent(tbNC, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
        );

        jPanFondNewCli.add(jTBNewCli);
        jTBNewCli.setBounds(740, 0, 130, 580);

        tableNC.setModel(modele);
        spNC.setViewportView(tableNC);

        jPanFondNewCli.add(spNC);
        spNC.setBounds(10, 420, 720, 130);

        jLabelClient.setFont(new java.awt.Font("OCR A Extended", 0, 30)); // NOI18N
        jLabelClient.setForeground(new java.awt.Color(255, 255, 255));
        jLabelClient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IHM/icon1.jpg"))); // NOI18N
        jLabelClient.setText("Espace Client");
        jPanFondNewCli.add(jLabelClient);
        jLabelClient.setBounds(20, 10, 300, 50);

        btnAnuNC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IHM/return.png"))); // NOI18N
        btnAnuNC.setText("Annuler");
        btnAnuNC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnuNCActionPerformed(evt);
            }
        });
        jPanFondNewCli.add(btnAnuNC);
        btnAnuNC.setBounds(400, 360, 100, 40);

        btnActionNC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IHM/add.png"))); // NOI18N
        btnActionNC.setText("Ajouter");
        btnActionNC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionNCActionPerformed(evt);
            }
        });
        jPanFondNewCli.add(btnActionNC);
        btnActionNC.setBounds(30, 360, 100, 40);

        txtNumCliNC.setText("N° Client");
        txtNumCliNC.setEnabled(false);
        jPanFondNewCli.add(txtNumCliNC);
        txtNumCliNC.setBounds(650, 110, 70, 30);

        lblNumCliNC.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblNumCliNC.setText("Numero Client :");
        jPanFondNewCli.add(lblNumCliNC);
        lblNumCliNC.setBounds(540, 110, 88, 30);

        lblNbComNC.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblNbComNC.setText("Nb Commande(s)* : ");
        jPanFondNewCli.add(lblNbComNC);
        lblNbComNC.setBounds(520, 190, 114, 30);

        txtNbComNC.setText("Nb Commandes");
        txtNbComNC.setEnabled(false);
        jPanFondNewCli.add(txtNbComNC);
        txtNbComNC.setBounds(650, 190, 70, 30);

        lblNumRepNC.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblNumRepNC.setText("N° Représentant* :");
        jPanFondNewCli.add(lblNumRepNC);
        lblNumRepNC.setBounds(520, 280, 110, 30);

        txtNumRepNC.setText("Num Rep");
        txtNumRepNC.setEnabled(false);
        jPanFondNewCli.add(txtNumRepNC);
        txtNumRepNC.setBounds(650, 280, 70, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanFondNewCli, javax.swing.GroupLayout.DEFAULT_SIZE, 852, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanFondNewCli, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getAccessibleContext().setAccessibleParent(null);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
/**
 * En fonction du choix effectué (Ajouter, Modifier/Supprimer)
 * Le bouton btnActionNC agit sur la collection pour la modifier
 * @param evt 
 */
    private void btnActionNCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActionNCActionPerformed

        switch(fct){
            //Création d'un client
            case 'A':
                try {
                    
                    Client clis = new Client(Integer.parseInt(txtCpNC.getText()),Integer.parseInt(txtTelNC.getText()),Integer.parseInt(txtSiretNC.getText()),Integer.parseInt(txtNumRepNC.getText()),Integer.parseInt(txtNbComNC.getText()),Integer.parseInt(txtNumRueNC.getText()),Integer.parseInt(txtCedexNC.getText()),txtEnseigneNC.getText(),txtRueNC.getText(),txtVilleNC.getText(),cboPaysNC.getSelectedItem().toString(),txtMailNC.getText(),txtCompAdNC.getText(),cboVoieNC.getSelectedItem().toString());
                    c.add(clis);
                    Fichiers.fermer_fichier('C', "Client.txt");
                } catch (IOException | FormatMailException ex) {
                    Logger.getLogger(PanClient.class.getName()).log(Level.SEVERE, null, ex);
                }

                annu_champsNC();
                //Rafraichis le modele du tableau
                modele.fireTableDataChanged();
                break;
               
            //modifie un client    
            case 'M':
            int ligneSelectionnee = tableNC.getSelectedRow();  
            Client cli = new Client();
            int numCli = (Integer)tableNC.getValueAt(ligneSelectionnee, 0);
            cli.setNumCli(numCli);
            cli.setEnseigne(txtEnseigneNC.getText());
            cli.setVille(txtVilleNC.getText());
            cli.setTel(Integer.parseInt(txtTelNC.getText()));
            cli.setNumRep(Integer.parseInt(txtNumRepNC.getText()));
            cli.setNbCom(Integer.parseInt(txtNbComNC.getText()));
            c.set(ligneSelectionnee, cli);
                try {
                    Fichiers.fermer_fichier('C', "Client.txt");
                } catch (IOException ex) {
                    Logger.getLogger(PanClient.class.getName()).log(Level.SEVERE, null, ex);
                }
            annu_champsNC();
            modele.fireTableDataChanged();
            break;
                
            //Supprime un client
            case 'S':
            ligneSelectionnee = tableNC.getSelectedRow();
             
            //on récupére la valeur de la première colonne de la ligne sélectionné
            tableNC.getValueAt(ligneSelectionnee, 0);
            c.remove(ligneSelectionnee);
                try {
                    Fichiers.fermer_fichier('C', "Client.txt");
                } catch (IOException ex) {
                    Logger.getLogger(PanClient.class.getName()).log(Level.SEVERE, null, ex);
                }
            annu_champsNC();
            modele.fireTableDataChanged();
            break;
        }
    }//GEN-LAST:event_btnActionNCActionPerformed

    /**
     * Appelle la méthode annu_champsNC pour remettre à l'état initial la fenetre
     * @param evt 
     */
    private void btnAnuNCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnuNCActionPerformed

        annu_champsNC();
    }//GEN-LAST:event_btnAnuNCActionPerformed

    /**
     * Permet de fermer le fichier pour enregistrer
     * Puis de retourner à la Fenetre Principale
     * @param evt 
     */
    private void btnRetourCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetourCliActionPerformed
            
        for(int i =0; i<c.size();i++){
            c.removeAll(c);
        }
        
        Application fp = new Application();     
        this.dispose();
       
    }//GEN-LAST:event_btnRetourCliActionPerformed

    /**
     * Change la couleur du text en survolant le bouton
     * @param evt 
     */
    private void btnRetourCliMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRetourCliMouseExited

        this.btnRetourCli.setForeground(Color.white);
    }//GEN-LAST:event_btnRetourCliMouseExited

    /**
     * Change la couleur du text en survolant le bouton
     * @param evt 
     */
    private void btnRetourCliMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRetourCliMouseEntered

        this.btnRetourCli.setForeground(Color.black);
    }//GEN-LAST:event_btnRetourCliMouseEntered

    /**
    * Active les champs et bouton Ajouter et Annuler
    * Et appelle affiche_champsNC
    * @param evt 
    */
    private void btnSupprimerCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSupprimerCliActionPerformed

        fct ='S';
        init_champsNC();
        affiche_champsNC();
    }//GEN-LAST:event_btnSupprimerCliActionPerformed

    /**
     * Change la couleur du text en survolant le bouton
     * @param evt 
     */
    private void btnSupprimerCliMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSupprimerCliMouseExited

        this.btnSupprimerCli.setForeground(Color.white);
    }//GEN-LAST:event_btnSupprimerCliMouseExited

    /**
     * Change la couleur du text en survolant le bouton
     * @param evt 
     */
    private void btnSupprimerCliMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSupprimerCliMouseEntered

        this.btnSupprimerCli.setForeground(Color.black);
    }//GEN-LAST:event_btnSupprimerCliMouseEntered

   /**
    * Active les champs et bouton Ajouter et Annuler
    * Et appelle affiche_champsNC
    * @param evt 
    */
    private void btnModifierCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifierCliActionPerformed

        fct = 'M';
        init_champsNC();
        affiche_champsNC();
    }//GEN-LAST:event_btnModifierCliActionPerformed

    /**
     * Change la couleur du text en survolant le bouton
     * @param evt 
     */
    private void btnModifierCliMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModifierCliMouseExited

        this.btnModifierCli.setForeground(Color.white);     
    }//GEN-LAST:event_btnModifierCliMouseExited

    /**
     * Change la couleur du text en survolant le bouton
     * @param evt 
     */
    private void btnModifierCliMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModifierCliMouseEntered
    
        this.btnModifierCli.setForeground(Color.black);
    }//GEN-LAST:event_btnModifierCliMouseEntered

    /**
     * Change la couleur du text en survolant le bouton
     * @param evt 
     */
    private void btnAjouterCliMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAjouterCliMouseExited

        this.btnAjouterCli.setForeground(Color.white);
    }//GEN-LAST:event_btnAjouterCliMouseExited

    /**
     * Change la couleur du text en survolant le bouton
     * @param evt 
     */
    private void btnAjouterCliMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAjouterCliMouseEntered

        this.btnAjouterCli.setForeground(Color.black);
    }//GEN-LAST:event_btnAjouterCliMouseEntered

    private void btnAjouterCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAjouterCliActionPerformed

        fct='A';
        for(Client c1 : c){
            txtNumCliNC.setText(String.valueOf(c1.getNumCli()+1));
        }
        init_champsNC();
    }//GEN-LAST:event_btnAjouterCliActionPerformed

    private void QuitterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QuitterMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_QuitterMouseClicked

    private void QuitterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QuitterMouseEntered

        this.Quitter.setForeground(Color.black);
    }//GEN-LAST:event_QuitterMouseEntered

    private void QuitterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QuitterMouseExited

        this.Quitter.setForeground(Color.white);
    }//GEN-LAST:event_QuitterMouseExited


    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(PanClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                PanClient dialog = new PanClient(new javax.swing.JFrame(), true);
                
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
    public javax.swing.JButton btnActionNC;
    private javax.swing.JButton btnAjouterCli;
    public javax.swing.JButton btnAnuNC;
    private javax.swing.JButton btnModifierCli;
    private javax.swing.JButton btnRetourCli;
    private javax.swing.JButton btnSupprimerCli;
    private javax.swing.JComboBox cboPaysNC;
    private javax.swing.JComboBox cboVoieNC;
    private javax.swing.JLabel jLabelClient;
    private javax.swing.JPanel jPanAdresseNewCli;
    private javax.swing.JPanel jPanFondNewCli;
    private javax.swing.JPanel jTBNewCli;
    private javax.swing.JLabel lblCedexNC;
    private javax.swing.JLabel lblCompAdNC;
    private javax.swing.JLabel lblCpNC;
    private javax.swing.JLabel lblEnseigneNC;
    private javax.swing.JLabel lblImageNC;
    private javax.swing.JLabel lblMailNC;
    private javax.swing.JLabel lblNbComNC;
    private javax.swing.JLabel lblNumCliNC;
    private javax.swing.JLabel lblNumRepNC;
    private javax.swing.JLabel lblNumRueNC;
    private javax.swing.JLabel lblPaysNC;
    private javax.swing.JLabel lblSiretNC;
    private javax.swing.JLabel lblTelNC;
    private javax.swing.JLabel lblVilleNC;
    private javax.swing.JLabel lblVoieNC;
    private javax.swing.JScrollPane spNC;
    private javax.swing.JTable tableNC;
    private javax.swing.JToolBar tbNC;
    private javax.swing.JTextField txtCedexNC;
    private javax.swing.JTextField txtCompAdNC;
    private javax.swing.JTextField txtCpNC;
    private javax.swing.JTextField txtEnseigneNC;
    private javax.swing.JTextField txtMailNC;
    private javax.swing.JTextField txtNbComNC;
    public javax.swing.JTextField txtNumCliNC;
    private javax.swing.JTextField txtNumRepNC;
    private javax.swing.JTextField txtNumRueNC;
    private javax.swing.JTextField txtRueNC;
    private javax.swing.JTextField txtSiretNC;
    private javax.swing.JTextField txtTelNC;
    private javax.swing.JTextField txtVilleNC;
    // End of variables declaration//GEN-END:variables
}
