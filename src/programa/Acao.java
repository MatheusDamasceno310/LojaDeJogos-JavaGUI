/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package programa;

/**
 *
 * @author mathe
 */
public class Acao extends javax.swing.JFrame {
    String[ ] jogo = new String[20];
    float[ ] preco = new float[20];
    String email,  senha;
    
    private TelaPrincipal telaPrincipal;
    /**
     * Creates new form Acao
     */
    public Acao() {
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
        LeagueOfLegends = new javax.swing.JLabel();
        Overwatch2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnHome = new javax.swing.JLabel();
        FarCry3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Overwatch = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Valorant = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Ação");

        LeagueOfLegends.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/LeagueOfLegends/5bfdc36b22e14.jpg"))); // NOI18N
        LeagueOfLegends.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LeagueOfLegends.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LeagueOfLegendsMouseClicked(evt);
            }
        });

        Overwatch2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Overwatch2/overwatch-2_x1j6.jpg"))); // NOI18N
        Overwatch2.setText("jLabel1");
        Overwatch2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Overwatch2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Overwatch2MouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("League of Legends");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Grand Theft Auto V");

        jLabel4.setText("RS 53,33");

        jLabel7.setText("Gratuito");

        btnHome.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Pacote de Icones/icons 1/house.png"))); // NOI18N
        btnHome.setText("Home");
        btnHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHomeMouseClicked(evt);
            }
        });

        FarCry3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/FarCry3/images (1).jpeg"))); // NOI18N
        FarCry3.setText("jLabel1");
        FarCry3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        FarCry3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FarCry3MouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Far Cry 3");

        jLabel9.setText("RS 59,99");

        Overwatch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/GrandTheftAutoV/Grand_Theft_Auto_V_capa.png"))); // NOI18N
        Overwatch.setText("jLabel1");
        Overwatch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Overwatch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OverwatchMouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Overwatch 2");

        jLabel11.setText("Gratuito");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Valorant");

        Valorant.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Valorant/5ec161df463ab.jpg"))); // NOI18N
        Valorant.setText("jLabel1");
        Valorant.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Valorant.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ValorantMouseClicked(evt);
            }
        });

        jLabel13.setText("Gratuito");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(btnHome)
                        .addGap(342, 342, 342)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel4)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(LeagueOfLegends, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Overwatch, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(47, 47, 47))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(FarCry3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel9)
                            .addComponent(Overwatch2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Valorant, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))))
                .addGap(0, 426, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FarCry3)
                            .addComponent(Overwatch))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel9)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Valorant)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13)))
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LeagueOfLegends)
                    .addComponent(Overwatch2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel11))
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

    private void LeagueOfLegendsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LeagueOfLegendsMouseClicked
        LeagueOfLegendsGame leagueOfLegendsGame = new LeagueOfLegendsGame();
        leagueOfLegendsGame.setVisible(true);
        leagueOfLegendsGame.setLocationRelativeTo(null);
        leagueOfLegendsGame.setTitle("league of Legends");

        for (int c = 0; c < jogo.length; c++) {
            leagueOfLegendsGame.jogo[c] = jogo[c];
            leagueOfLegendsGame.preco[c] = preco[c];
        }
        leagueOfLegendsGame.email = email;
        leagueOfLegendsGame.senha = senha;
        dispose();
    }//GEN-LAST:event_LeagueOfLegendsMouseClicked

    private void Overwatch2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Overwatch2MouseClicked
        Overwatch2Game overwatch2Game = new Overwatch2Game();
        overwatch2Game.setVisible(true);
        overwatch2Game.setLocationRelativeTo(null);
        overwatch2Game.setTitle("Overwatch 2");

        for (int c = 0; c < jogo.length; c++) {
            overwatch2Game.jogo[c] = jogo[c];
            overwatch2Game.preco[c] = preco[c];
        }
        overwatch2Game.email = email;
        overwatch2Game.senha = senha;
        dispose();
    }//GEN-LAST:event_Overwatch2MouseClicked

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

    private void FarCry3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FarCry3MouseClicked
        FarCry3Game farCry3Game = new FarCry3Game();
        farCry3Game.setVisible(true);
        farCry3Game.setLocationRelativeTo(null);
        farCry3Game.setTitle("Far Cry 3");

        for (int c = 0; c < jogo.length; c++) {
            farCry3Game.jogo[c] = jogo[c];
            farCry3Game.preco[c] = preco[c];
        }
        farCry3Game.email = email;
        farCry3Game.senha = senha;
        dispose();
    }//GEN-LAST:event_FarCry3MouseClicked

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

    private void ValorantMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ValorantMouseClicked
        ValorantGame valorantGame = new ValorantGame();
        valorantGame.setVisible(true);
        valorantGame.setLocationRelativeTo(null);
        valorantGame.setTitle("Valorant");

        for (int c = 0; c < jogo.length; c++) {
            valorantGame.jogo[c] = jogo[c];
            valorantGame.preco[c] = preco[c];
        }
        valorantGame.email = email;
        valorantGame.senha = senha;
        dispose();
    }//GEN-LAST:event_ValorantMouseClicked

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
            java.util.logging.Logger.getLogger(Acao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Acao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Acao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Acao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Acao acao = new Acao();
                acao.setVisible(true);
                acao.setLocationRelativeTo(null);
                acao.setTitle("Cartegoria");
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FarCry3;
    private javax.swing.JLabel LeagueOfLegends;
    private javax.swing.JLabel Overwatch;
    private javax.swing.JLabel Overwatch2;
    private javax.swing.JLabel Valorant;
    private javax.swing.JLabel btnHome;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
