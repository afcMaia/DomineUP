/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import ComunicacaoCliente.ComCliente;
import LogicaNegocioCliente.ReaderThread;
import LogicaNegocioCliente.musica_fundo;
import Share.GameRoom;
import Share.Hand;
import Share.User;
import UserInterface.RotatedIcon.Rotate;
import java.awt.Dimension;
import java.awt.Point;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.JLabel;
import javax.swing.ScrollPaneConstants;
import org.netbeans.lib.awtextra.AbsoluteConstraints;

/**
 *
 * @author Luciano
 */
public class UIGameRoom extends javax.swing.JFrame {

    public static musica_fundo musica;
    /**
     * Creates new form UIGameRoom
     */
    int lastY;
    int lastX;
    GameRoom gameRoom;

    public UIGameRoom() {
        initComponents();
        lastY = tabuleiro.getHeight() / 2;
        lastX = tabuleiro.getWidth() / 2;
        textAreaChatWindow.setLineWrap(true);
        textAreaChatWindow.setWrapStyleWord(true);


    }

    public UIGameRoom(Hand hand,GameRoom gr) {
        initComponents();
        lastY = tabuleiro.getHeight() / 2;
        lastX = tabuleiro.getWidth() / 2;
        textAreaChatWindow.setLineWrap(true);
        textAreaChatWindow.setWrapStyleWord(true);
        
        int roomIndex= 0;
        int i =0;
        
       Player1.setText(UIWelcomeScreen.player.getUsername());
       this.avatar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/"+UIWelcomeScreen.player.getAvatar())));
       gameRoom = gr;
       ArrayList<User> players = gr.getPlayers();
       players.remove(UIWelcomeScreen.player);
       
       Player2.setText(players.get(0).getUsername());
       avatar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/"+players.get(0).getAvatar())));
       
       JLabel[] playersLbl = new JLabel[3];
       JLabel[] avatarsLbl = new JLabel[3];
       
       playersLbl[0] = Player2;
       playersLbl[1] = Player3;
       playersLbl[2] = Player4;
       
       avatarsLbl[0] = avatar2;
       avatarsLbl[1] = avatar3;
       avatarsLbl[2] = avatar4;
       
        i = 0;
       for(User u: gr.getPlayers()){
           playersLbl[i].setText( u.getUsername());
           avatarsLbl[i++].setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/"+u.getAvatar())));
       }
       
       
       
       
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
        jScrollPane1 = new javax.swing.JScrollPane();
        textAreaChatWindow = new javax.swing.JTextArea();
        ChatLabel = new javax.swing.JLabel();
        txtChat = new javax.swing.JTextField();
        avatar2 = new javax.swing.JLabel();
        avatar1 = new javax.swing.JLabel();
        avatar3 = new javax.swing.JLabel();
        avatar4 = new javax.swing.JLabel();
        tabuleiro = new javax.swing.JPanel();
        Player2 = new javax.swing.JLabel();
        Player4 = new javax.swing.JLabel();
        Player3 = new javax.swing.JLabel();
        Player1 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        VolumeControl = new javax.swing.JSlider();
        VolumeLogoOn = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        VolumeLogoOff = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jToggleButton2 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/final_logo_mini.png"))); // NOI18N

        textAreaChatWindow.setEditable(false);
        textAreaChatWindow.setColumns(20);
        textAreaChatWindow.setRows(5);
        textAreaChatWindow.setAutoscrolls(false);
        textAreaChatWindow.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        textAreaChatWindow.setMaximumSize(new java.awt.Dimension(164, 94));
        textAreaChatWindow.setMinimumSize(new java.awt.Dimension(164, 94));
        jScrollPane1.setViewportView(textAreaChatWindow);

        ChatLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ChatLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ChatLabel.setText("Chat:");

        txtChat.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtChat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtChatActionPerformed(evt);
            }
        });
        txtChat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtChatEnterPressed(evt);
            }
        });

        avatar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/avatar5_min.png"))); // NOI18N

        avatar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/avatar5_min.png"))); // NOI18N

        avatar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/avatar5_min.png"))); // NOI18N

        avatar4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/avatar5_min.png"))); // NOI18N

        tabuleiro.setBackground(new java.awt.Color(0, 102, 0));
        tabuleiro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Player2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Player2.setText("jLabel2");

        Player4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Player4.setText("jLabel2");

        Player3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Player3.setText("jLabel2");

        Player1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Player1.setText("jLabel2");

        jToggleButton1.setText("Sair");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        VolumeControl.setMaximum(0);
        VolumeControl.setMinimum(-40);
        VolumeControl.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                VolumeControlStateChanged(evt);
            }
        });

        VolumeLogoOn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/soundon.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("PUBLICIDADE");

        VolumeLogoOff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/soundoff.png"))); // NOI18N

        jLabel9.setText("Jogos Ganhos:");

        jLabel10.setText("jLabel2");

        jToggleButton2.setText("jToggleButton2");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(115, 115, 115)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(VolumeLogoOff)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(VolumeControl, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(VolumeLogoOn)
                        .addGap(12, 12, 12))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(avatar3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(108, 108, 108)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(avatar1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(Player1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel9)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel10)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jToggleButton2)
                                                .addGap(198, 198, 198)))
                                        .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(avatar2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Player2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(avatar4))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(Player3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtChat, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(tabuleiro, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ChatLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(Player4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(16, 16, 16)))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(VolumeControl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(VolumeLogoOn)
                            .addComponent(VolumeLogoOff)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Player2)
                    .addComponent(avatar2))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(avatar4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Player4)
                        .addGap(149, 149, 149)
                        .addComponent(ChatLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtChat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(avatar3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Player3))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tabuleiro, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Player1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)
                        .addComponent(jLabel10)
                        .addComponent(jToggleButton2))
                    .addComponent(avatar1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtChatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtChatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtChatActionPerformed

    private void txtChatEnterPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtChatEnterPressed
        String message = new String();
        message = txtChat.getText();

        if (evt.getKeyCode() == 10 && (!message.equals(""))) {


            txtChat.setText("");
            System.out.println(message);

            try {
                ComCliente com = ComCliente.getInstance();
                com.GameChat(UIWelcomeScreen.player, message);

            } catch (Exception ex) {
                System.out.println("enterPressed: unable to get instance");
            }

        }
    }//GEN-LAST:event_txtChatEnterPressed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void VolumeControlStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_VolumeControlStateChanged
        // TODO add your handling code here:
        int volume = (int) VolumeControl.getValue();
        UIWelcomeScreen.musica.musica_control((float) volume);

    }//GEN-LAST:event_VolumeControlStateChanged

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        // TODO add your handling code here:
        addPeca();
    }//GEN-LAST:event_jToggleButton2ActionPerformed
    /**
     * Atualiza a área de chat com as mensagens que vão sendo introduzidas pelos
     * vários jogadores da sala.
     *
     * @param message mensagem introduzida por um dos jogadores da sala.
     */
    public void updateChat(String message) {
        this.textAreaChatWindow.append(message + '\n');
    }

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
            java.util.logging.Logger.getLogger(UIGameRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UIGameRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UIGameRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UIGameRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UIGameRoom().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ChatLabel;
    private javax.swing.JLabel Player1;
    private javax.swing.JLabel Player2;
    private javax.swing.JLabel Player3;
    private javax.swing.JLabel Player4;
    private javax.swing.JSlider VolumeControl;
    private javax.swing.JLabel VolumeLogoOff;
    private javax.swing.JLabel VolumeLogoOn;
    private javax.swing.JLabel avatar1;
    private javax.swing.JLabel avatar2;
    private javax.swing.JLabel avatar3;
    private javax.swing.JLabel avatar4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JPanel tabuleiro;
    private javax.swing.JTextArea textAreaChatWindow;
    private javax.swing.JTextField txtChat;
    // End of variables declaration//GEN-END:variables
    Rotate r = Rotate.UP;
    int x = 75;
    int y = 35;
    private void addPeca() {
        
        JLabel j = new JLabel();
        Icon i = new RotatedIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/pecas/peca31.png")), r);
        j.setIcon(i);
        
        j.setPreferredSize(new Dimension(x, y));
        tabuleiro.add(j,new AbsoluteConstraints(lastX, lastY, -1, -1));
        switch(r){
            case UP:
                 lastX += 75;
                 break;
            case NORMAL:
                lastY += 75;
                break;
            case DOWN:
                lastX -= 75;
                break;
            default: break;
                
        }
       
        if(lastX +75 > tabuleiro.getWidth()-35 && r == Rotate.UP){
            r = Rotate.NORMAL;
           
           // lastY -= 35/4;
            x = 35;
            y= 75;
            
        }else if(lastY + 75 > tabuleiro.getHeight()-35 ){
             r = Rotate.DOWN;
           
            lastX = tabuleiro.getWidth() - 150;
            x = 75;
            y= 35;
        }
        this.pack();
        

    }
}
