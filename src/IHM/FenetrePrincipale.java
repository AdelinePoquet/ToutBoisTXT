/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IHM;


import Entites.*;
import Traitements.*;
import java.awt.*;
import javax.swing.*;
import static toutbois.Application.*;

/**
 *
 * @author ajugnon
 */
public class FenetrePrincipale extends javax.swing.JFrame {


    public FenetrePrincipale() {

        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanFond = new javax.swing.JPanel();
        lblImage = new javax.swing.JLabel();
        tbPan = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        btnClient = new javax.swing.JButton();
        btnProspect = new javax.swing.JButton();
        btnRepresentant = new javax.swing.JButton();
        lblIcon = new javax.swing.JLabel();
        btnQuitter = new javax.swing.JButton();
        mnuBarFP = new javax.swing.JMenuBar();
        mnuCatalogueFP = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Interface Principale");
        setAlwaysOnTop(true);
        setIconImage(new ImageIcon("tbIcon.png").getImage());
        setMaximumSize(new java.awt.Dimension(798, 600));
        setMinimumSize(new java.awt.Dimension(790, 500));
        setPreferredSize(new java.awt.Dimension(798, 530));
        setResizable(false);

        jPanFond.setBackground(new java.awt.Color(204, 204, 204));
        jPanFond.setMaximumSize(new java.awt.Dimension(750, 510));
        jPanFond.setMinimumSize(new java.awt.Dimension(750, 510));
        jPanFond.setOpaque(false);
        jPanFond.setPreferredSize(new java.awt.Dimension(798, 535));
        jPanFond.setLayout(null);

        lblImage.setBackground(new java.awt.Color(0, 0, 51));
        lblImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IHM/Logo3.jpg"))); // NOI18N
        lblImage.setMaximumSize(new java.awt.Dimension(650, 480));
        lblImage.setMinimumSize(new java.awt.Dimension(0, 0));
        lblImage.setPreferredSize(new java.awt.Dimension(650, 480));
        jPanFond.add(lblImage);
        lblImage.setBounds(0, 0, 650, 480);

        tbPan.setBackground(new java.awt.Color(0, 0, 51));
        tbPan.setForeground(new java.awt.Color(255, 255, 255));
        tbPan.setMaximumSize(new java.awt.Dimension(169, 480));
        tbPan.setMinimumSize(new java.awt.Dimension(169, 480));
        tbPan.setPreferredSize(new java.awt.Dimension(169, 487));

        jToolBar1.setBackground(new java.awt.Color(20, 30, 60));
        jToolBar1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jToolBar1.setFloatable(false);
        jToolBar1.setForeground(new java.awt.Color(255, 255, 255));
        jToolBar1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jToolBar1.setRollover(true);
        jToolBar1.setMaximumSize(new java.awt.Dimension(169, 289));
        jToolBar1.setMinimumSize(new java.awt.Dimension(169, 289));
        jToolBar1.setPreferredSize(new java.awt.Dimension(169, 480));

        btnClient.setBackground(new java.awt.Color(0, 0, 51));
        btnClient.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        btnClient.setForeground(new java.awt.Color(255, 255, 255));
        btnClient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IHM/icon1.jpg"))); // NOI18N
        btnClient.setText("Client");
        btnClient.setToolTipText("");
        btnClient.setBorder(null);
        btnClient.setDisabledIcon(null);
        btnClient.setDisabledSelectedIcon(null);
        btnClient.setFocusPainted(false);
        btnClient.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnClient.setMaximumSize(new java.awt.Dimension(169, 95));
        btnClient.setMinimumSize(new java.awt.Dimension(169, 95));
        btnClient.setPreferredSize(new java.awt.Dimension(169, 95));
        btnClient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnClientMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnClientMouseExited(evt);
            }
        });
        btnClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientActionPerformed(evt);
            }
        });
        jToolBar1.add(btnClient);

        btnProspect.setBackground(new java.awt.Color(0, 0, 51));
        btnProspect.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        btnProspect.setForeground(new java.awt.Color(255, 255, 255));
        btnProspect.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IHM/icon2.jpg"))); // NOI18N
        btnProspect.setText("Prospect");
        btnProspect.setToolTipText("");
        btnProspect.setBorder(null);
        btnProspect.setFocusPainted(false);
        btnProspect.setFocusable(false);
        btnProspect.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnProspect.setMaximumSize(new java.awt.Dimension(169, 95));
        btnProspect.setMinimumSize(new java.awt.Dimension(169, 95));
        btnProspect.setPreferredSize(new java.awt.Dimension(169, 95));
        btnProspect.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnProspectMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnProspectMouseExited(evt);
            }
        });
        btnProspect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProspectActionPerformed(evt);
            }
        });
        jToolBar1.add(btnProspect);

        btnRepresentant.setBackground(new java.awt.Color(0, 0, 51));
        btnRepresentant.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        btnRepresentant.setForeground(new java.awt.Color(255, 255, 255));
        btnRepresentant.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IHM/icon3.jpg"))); // NOI18N
        btnRepresentant.setText("Représentant");
        btnRepresentant.setToolTipText("");
        btnRepresentant.setBorder(null);
        btnRepresentant.setFocusPainted(false);
        btnRepresentant.setFocusable(false);
        btnRepresentant.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnRepresentant.setMaximumSize(new java.awt.Dimension(169, 95));
        btnRepresentant.setMinimumSize(new java.awt.Dimension(169, 95));
        btnRepresentant.setPreferredSize(new java.awt.Dimension(169, 95));
        btnRepresentant.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRepresentantMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRepresentantMouseExited(evt);
            }
        });
        btnRepresentant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRepresentantActionPerformed(evt);
            }
        });
        jToolBar1.add(btnRepresentant);

        lblIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IHM/icon4.jpg"))); // NOI18N
        lblIcon.setMaximumSize(new java.awt.Dimension(169, 85));
        lblIcon.setMinimumSize(new java.awt.Dimension(169, 85));
        lblIcon.setPreferredSize(new java.awt.Dimension(169, 85));
        jToolBar1.add(lblIcon);

        btnQuitter.setBackground(new java.awt.Color(0, 0, 51));
        btnQuitter.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        btnQuitter.setForeground(new java.awt.Color(255, 255, 255));
        btnQuitter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IHM/delete.png"))); // NOI18N
        btnQuitter.setText("Quitter");
        btnQuitter.setToolTipText("");
        btnQuitter.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnQuitter.setFocusPainted(false);
        btnQuitter.setFocusable(false);
        btnQuitter.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnQuitter.setMaximumSize(new java.awt.Dimension(169, 95));
        btnQuitter.setMinimumSize(new java.awt.Dimension(169, 95));
        btnQuitter.setPreferredSize(new java.awt.Dimension(169, 95));
        btnQuitter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnQuitterMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnQuitterMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnQuitterMouseExited(evt);
            }
        });
        jToolBar1.add(btnQuitter);

        javax.swing.GroupLayout tbPanLayout = new javax.swing.GroupLayout(tbPan);
        tbPan.setLayout(tbPanLayout);
        tbPanLayout.setHorizontalGroup(
            tbPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tbPanLayout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 30, Short.MAX_VALUE))
        );
        tbPanLayout.setVerticalGroup(
            tbPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tbPanLayout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 519, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanFond.add(tbPan);
        tbPan.setBounds(649, 0, 140, 530);

        mnuCatalogueFP.setText("Catalogue");

        jMenuItem11.setText("jMenuItem11");
        mnuCatalogueFP.add(jMenuItem11);

        jMenuItem12.setText("jMenuItem12");
        mnuCatalogueFP.add(jMenuItem12);

        jMenuItem13.setText("jMenuItem13");
        mnuCatalogueFP.add(jMenuItem13);

        jMenuItem14.setText("jMenuItem14");
        mnuCatalogueFP.add(jMenuItem14);

        mnuBarFP.add(mnuCatalogueFP);

        setJMenuBar(mnuBarFP);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanFond, javax.swing.GroupLayout.PREFERRED_SIZE, 798, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanFond, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void btnQuitterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQuitterMouseClicked
        //Quitte le programme
        System.exit(0);
    }//GEN-LAST:event_btnQuitterMouseClicked

    private void btnRepresentantMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRepresentantMouseExited

        this.btnRepresentant.setForeground(Color.white);
    }//GEN-LAST:event_btnRepresentantMouseExited

    private void btnRepresentantMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRepresentantMouseEntered

        this.btnRepresentant.setForeground(Color.black);
    }//GEN-LAST:event_btnRepresentantMouseEntered

    private void btnProspectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProspectActionPerformed
        
        Fichiers.ouvrir_fichier('P', "Prospect.txt");
        this.dispose();
        PanProspect panPro = new PanProspect(new javax.swing.JDialog(),true);
        panPro.annu_champsPC();
        panPro.setVisible(true);
    }//GEN-LAST:event_btnProspectActionPerformed

    private void btnProspectMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProspectMouseExited

        this.btnProspect.setForeground(Color.white);
    }//GEN-LAST:event_btnProspectMouseExited

    private void btnProspectMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProspectMouseEntered

        this.btnProspect.setForeground(Color.black);
    }//GEN-LAST:event_btnProspectMouseEntered

    private void btnClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientActionPerformed
        
        Fichiers.ouvrir_fichier('C', "Client.txt");
        for (Client monCli : c) {
            System.out.println("Numero = "+monCli.getNumCli()+" Enseigne = "+monCli.getEnseigne()+" Ville = "+monCli.getVille());
        }
        this.dispose();
        PanClient panCli = new PanClient(new javax.swing.JDialog(),true);
        panCli.annu_champsNC();
        panCli.setVisible(true);
    }//GEN-LAST:event_btnClientActionPerformed

    private void btnClientMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClientMouseExited

        this.btnClient.setForeground(Color.white);
    }//GEN-LAST:event_btnClientMouseExited

    private void btnClientMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClientMouseEntered
  
        this.btnClient.setForeground(Color.black);
    }//GEN-LAST:event_btnClientMouseEntered

    private void btnQuitterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQuitterMouseExited
   
        this.btnQuitter.setForeground(Color.white);
    }//GEN-LAST:event_btnQuitterMouseExited

    private void btnQuitterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQuitterMouseEntered
        
         this.btnQuitter.setForeground(Color.black);
    }//GEN-LAST:event_btnQuitterMouseEntered

    private void btnRepresentantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRepresentantActionPerformed
        
        Fichiers.ouvrir_fichier('R', "Representant.txt");
        for (Representant monRep : r) {
        }
        this.dispose();
        PanRepresentant panRep = new PanRepresentant(new javax.swing.JDialog(),true);
        panRep.annu_champsRP();
        panRep.setVisible(true);
        
    }//GEN-LAST:event_btnRepresentantActionPerformed

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
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FenetrePrincipale().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClient;
    private javax.swing.JButton btnProspect;
    private javax.swing.JButton btnQuitter;
    private javax.swing.JButton btnRepresentant;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JPanel jPanFond;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lblIcon;
    private javax.swing.JLabel lblImage;
    private javax.swing.JMenuBar mnuBarFP;
    private javax.swing.JMenu mnuCatalogueFP;
    private javax.swing.JPanel tbPan;
    // End of variables declaration//GEN-END:variables
}
