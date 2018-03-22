/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Players.Hero;
import Players.Monster;
import abstracts.Creature;
import battle.Battles;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author gustavomiara
 */
public class Arena extends javax.swing.JFrame {

    Battles battles;

    /**
     * Creates new form Arena
     */
    public Arena() {
        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
        initComponents();
        loadLifes();

    }

    public void battle() {
        ArrayList<Creature> fighters = new ArrayList();

        Hero DARK_GLORYSSON = new Hero("darkglorysson", "Humano", "darkglorysson", 5, 8, 10, 100, 15, 100, 2, 10, 10);
        Hero MELLAYNE = new Hero("mellayne", "Humano", "mellayne", 10, 5, 8, 100, 2, 80, 20, 25, 10);
        Hero GRYIN = new Hero("gryin", "Anão", "gryin", 5, 10, 10, 100, 5, 50, 1, 30, 10);

        Monster MONTARO = new Monster("montaro", "Elfo das Trevas", "montaro", 5, 7, 10, 100, 15, 100, 10, 10);
        Monster LORD_BLACK = new Monster("lordblack", "Humano", "lordblack", 12, 10, 10, 100, 10, 20, 1, 32);
        Monster MATILDA = new Monster("matilda", "Elfa", "matilda", 8, 10, 10, 100, 18, 80, 5, 10);
//        name, image, classe, level, life, magic, force, agility, dexterity, intelligence, charisma

        fighters.add(DARK_GLORYSSON);
        fighters.add(MONTARO);
        fighters.add(MELLAYNE);
        fighters.add(LORD_BLACK);
        fighters.add(GRYIN);
        fighters.add(MATILDA);

        System.out.println(fighters.size());

        for (int i = 0; fighters.size() != 1; i++) {
            if (i + 1 >= fighters.size()) {
                i = 0;
            }
            this.jTextArea.append("\n**************************************************\n");
            this.jTextArea.append("Jogador 1 =>" + fighters.get(i).getName() + "\nVS\nJogador 2 =>" + fighters.get(i + 1).getName());
            this.jTextArea.append("\n**************************************************\n");
            this.jTextArea.append("\t" + fighters.get(i).getName() + "\n");
            this.jTextArea.append(fighters.get(i).toString() + "\n");
            this.jTextArea.append("\t" + fighters.get(i + 1).getName() + "\n");
            this.jTextArea.append(fighters.get(i + 1).toString() + "\n");
            ImageIcon imgThisImg = new ImageIcon(fighters.get(i).getImage());
            this.jLabelPayer1.setIcon(imgThisImg);
            imgThisImg = new ImageIcon(fighters.get(i + 1).getImage());
            this.jLabelPLayer2.setIcon(imgThisImg);

            do {
                try {
                    if (fighters.get(i + 1).atack() > fighters.get(i).defense()) {
                       
                        this.jTextArea.append(fighters.get(i + 1).getName() + " atack "+ fighters.get(i).getName() + "\n");
                        this.jTextArea.append(fighters.get(i).getName() + " lost 8\n");
                        
                        fighters.get(i).lostLife();
                        setComponents(fighters.get(i), fighters.get(i + 1));
                    }
                    
                    TimeUnit.SECONDS.sleep(1);
                    
                    if (fighters.get(i).atack() > fighters.get(i + 1).defense()) {
                        
                        this.jTextArea.append(fighters.get(i).getName() + " atack "+ fighters.get(i + 1).getName() + "\n");
                        this.jTextArea.append(fighters.get(i + 1).getName() + " lost 8\n");
                        fighters.get(i + 1).lostLife();
                        setComponents(fighters.get(i), fighters.get(i + 1));
                    }
                    
                    TimeUnit.SECONDS.sleep(1);
                    
                } catch (InterruptedException ex) {
                    Logger.getLogger(Battles.class.getName()).log(Level.SEVERE, null, ex);
                }

            } while (fighters.get(i + 1).getLife() >= 0 && fighters.get(i).getLife() >= 0);

            if (fighters.get(i).getLife() > 0) {
               this.jTextArea.append(fighters.get(i).getName() + " wins! "+ fighters.get(i + 1).getName() + " lost!\n");
                
                fighters.get(i).rest();
                fighters.remove(i + 1);

            } else {
                this.jTextArea.append(fighters.get(i + 1).getName() + " wins! "+ fighters.get(i).getName() + " lost!\n");

                fighters.get(i + 1).rest();
                fighters.remove(i);

            }
        }
    }

    public void setComponents(Creature player1, Creature player2) {
        JOptionPane.showMessageDialog(this, "Set image!");
        ImageIcon imgThisImg = new ImageIcon(player1.getImage());
        jLabelPayer1.setIcon(imgThisImg);
        imgThisImg = new ImageIcon(player2.getImage());
        jLabelPLayer2.setIcon(imgThisImg);
        LifeBarPlayer1.setValue(player1.getLife());
        LifeBarPlayer1.setString(player1.getLife() + "%");
        LifeBarPlayer2.setValue(player2.getLife());
        LifeBarPlayer2.setString(player2.getLife() + "%");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LifeBarPlayer1 = new javax.swing.JProgressBar();
        jPanel1 = new javax.swing.JPanel();
        jLabelPayer1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabelPLayer2 = new javax.swing.JLabel();
        LifeBarPlayer2 = new javax.swing.JProgressBar();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JavaRPG - Arena");
        setPreferredSize(new java.awt.Dimension(1210, 500));
        setResizable(false);
        setSize(new java.awt.Dimension(1210, 500));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        LifeBarPlayer1.setBackground(new java.awt.Color(249, 8, 24));
        getContentPane().add(LifeBarPlayer1);
        LifeBarPlayer1.setBounds(50, 360, 220, 20);

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(139, 132, 132), new java.awt.Color(139, 132, 132), new java.awt.Color(156, 152, 152), new java.awt.Color(141, 134, 134)));

        jLabelPayer1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/darkglorysson.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelPayer1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelPayer1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(60, 20, 201, 304);

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(136, 131, 131), new java.awt.Color(138, 133, 133), new java.awt.Color(137, 130, 130), new java.awt.Color(133, 130, 130)));

        jLabelPLayer2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/montaro.png"))); // NOI18N
        jLabelPLayer2.setPreferredSize(new java.awt.Dimension(196, 299));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelPLayer2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 195, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabelPLayer2, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(540, 20, 201, 304);
        getContentPane().add(LifeBarPlayer2);
        LifeBarPlayer2.setBounds(540, 360, 210, 20);

        jTextArea.setColumns(20);
        jTextArea.setRows(5);
        jScrollPane1.setViewportView(jTextArea);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(870, 10, 300, 470);

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 4, 4));
        jLabel2.setText("Life");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 340, 220, 21);

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(253, 10, 10));
        jLabel3.setText("Life");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(540, 340, 210, 21);

        jButton1.setText("Iniciar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(70, 450, 52, 29);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg3.jpg"))); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(1210, 500));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-6, 0, 1210, 510);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked

        battle();

    }//GEN-LAST:event_jButton1MouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:


    }//GEN-LAST:event_formWindowOpened

    private void loadLifes() {
        LifeBarPlayer1.setBackground(new java.awt.Color(1, 1, 1));
        LifeBarPlayer1.setForeground(new java.awt.Color(255, 0, 0));
        LifeBarPlayer1.setStringPainted(true);

        LifeBarPlayer2.setBackground(new java.awt.Color(1, 1, 1));
        LifeBarPlayer2.setForeground(new java.awt.Color(255, 0, 0));
        LifeBarPlayer2.setStringPainted(true);
        LifeBarPlayer1.setValue(100);
        LifeBarPlayer1.setString(100 + "%");
        LifeBarPlayer2.setValue(100);
        LifeBarPlayer2.setString(100 + "%");
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
            java.util.logging.Logger.getLogger(Arena.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Arena.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Arena.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Arena.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Arena().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar LifeBarPlayer1;
    private javax.swing.JProgressBar LifeBarPlayer2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelPLayer2;
    private javax.swing.JLabel jLabelPayer1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea;
    // End of variables declaration//GEN-END:variables
}
