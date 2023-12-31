/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package programa;

/**
 *
 * @author mathe
 */
public class Aventura extends javax.swing.JFrame {
    String[ ] jogo = new String[20];
    float[ ] preco = new float[20];
    String email,  senha;

    private TelaPrincipal telaPrincipal;
    /**
     * Creates new form Aventura
     */
    public Aventura() {
        initComponents();
        this.telaPrincipal = new TelaPrincipal();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Celeste = new javax.swing.JLabel();
        Minecraft = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnHome = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Overwatch = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Aventura");

        Celeste.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Celeste/4358-Celeste-capa-1.jpg"))); // NOI18N
        Celeste.setText("jLabel1");
        Celeste.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Celeste.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CelesteMouseClicked(evt);
            }
        });

        Minecraft.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Minecraft/Minecraft_capa.png"))); // NOI18N
        Minecraft.setText("jLabel1");
        Minecraft.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Minecraft.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MinecraftMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Celeste");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Minecraft");

        jLabel4.setText("RS 22,99");

        jLabel7.setText("RS 33,99");

        btnHome.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Pacote de Icones/icons 1/house.png"))); // NOI18N
        btnHome.setText("Home");
        btnHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHomeMouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Grand Theft Auto V");

        jLabel9.setText("RS 53,33");

        Overwatch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/GrandTheftAutoV/Grand_Theft_Auto_V_capa.png"))); // NOI18N
        Overwatch.setText("jLabel1");
        Overwatch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Overwatch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OverwatchMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(btnHome)
                        .addGap(323, 323, 323)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel4)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Minecraft, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Celeste, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9)
                                    .addComponent(Overwatch, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(19, 19, 19))
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 397, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(btnHome))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel2)))
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Minecraft)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Overwatch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)))
                .addGap(38, 38, 38)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Celeste)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MinecraftMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinecraftMouseClicked
        MinecraftGame minecraftGame = new MinecraftGame();
        minecraftGame.setVisible(true);
        minecraftGame.setLocationRelativeTo(null);
        minecraftGame.setTitle("Minecraft");
        
        for (int c = 0; c < jogo.length; c++) {
            minecraftGame.jogo[c] = jogo[c];
            minecraftGame.preco[c] = preco[c];
        }
        minecraftGame.email = email;
        minecraftGame.senha = senha;
        dispose();
    }//GEN-LAST:event_MinecraftMouseClicked

    private void CelesteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CelesteMouseClicked
        Celeste celeste = new Celeste();
        celeste.setVisible(true);
        celeste.setLocationRelativeTo(null);
        celeste.setTitle("Minecraft");
        
        for (int c = 0; c < jogo.length; c++) {
            celeste.jogo[c] = jogo[c];
            celeste.preco[c] = preco[c];
        }
        celeste.email = email;
        celeste.senha = senha;
        dispose();
    }//GEN-LAST:event_CelesteMouseClicked

    private void btnHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeMouseClicked
        telaPrincipal.setVisible(true);
        telaPrincipal.setLocationRelativeTo(null);
        telaPrincipal.setTitle("Tela Principal");
        
        for (int c = 0; c < jogo.length; c++) {
            telaPrincipal.jogos[c] = jogo[c];
            telaPrincipal.precos[c] = preco[c];
        }
        telaPrincipal.email = email;
        telaPrincipal.senha = senha;
        dispose();
    }//GEN-LAST:event_btnHomeMouseClicked

    private void OverwatchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OverwatchMouseClicked
        GrandTheftAutoVGame grandTheftAutoVGame = new GrandTheftAutoVGame();
        grandTheftAutoVGame.setVisible(true);
        grandTheftAutoVGame.setLocationRelativeTo(null);
        grandTheftAutoVGame.setTitle("Grand Theft Auto V");

        for (int c = 0; c < jogo.length; c++) {
            grandTheftAutoVGame.jogo[c] = jogo[c];
            grandTheftAutoVGame.preco[c] = preco[c];
        }
        grandTheftAutoVGame.email = email;
        grandTheftAutoVGame.senha = senha;
        dispose();
    }//GEN-LAST:event_OverwatchMouseClicked

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Aventura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Aventura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Aventura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Aventura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Aventura aventura = new Aventura();
                aventura.setVisible(true);
                aventura.setLocationRelativeTo(null);
                aventura.setTitle("Cartegoria");
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Celeste;
    private javax.swing.JLabel Minecraft;
    private javax.swing.JLabel Overwatch;
    private javax.swing.JLabel btnHome;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
