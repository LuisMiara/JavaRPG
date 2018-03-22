/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battle;

import Players.Hero;
import Players.Monster;
import Views.Home;
import abstracts.Creature;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JTextArea;

/**
 *
 * @author gustavomiara
 */
public class Battles {
    
    public JLabel jLabelPayer1;
    public JLabel jLabelPLayer2;
    public JProgressBar LifeBarPlayer1;
    public JProgressBar LifeBarPlayer2;
    public JTextArea jTextArea;

    public Battles(JLabel jLabelPayer1, JLabel jLabelPLayer2, JProgressBar LifeBarPlayer1, JProgressBar LifeBarPlayer2, JTextArea jTextArea) {
        this.jLabelPayer1 = jLabelPayer1;
        this.jLabelPLayer2 = jLabelPLayer2;
        this.LifeBarPlayer1 = LifeBarPlayer1;
        this.LifeBarPlayer2 = LifeBarPlayer2;
        this.jTextArea = jTextArea;
    }
    
    
    
    
    ArrayList<Creature> fighters = new ArrayList();
    
    
    public void loadPlayers(){
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
    }
    
    public void battles(){
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
            ImageIcon imgThisImg = new ImageIcon(fighters.get(i).getName());
            this.jLabelPayer1.setIcon(imgThisImg);
            imgThisImg = new ImageIcon(fighters.get(i + 1).getName());
            this.jLabelPLayer2.setIcon(imgThisImg);
                       
            
            do {
                try {
                    if (fighters.get(i + 1).atack() > fighters.get(i).defense()) {
                        fighters.get(i).lostLife();
                        //System.out.println("LostLife =>" + fighters.get(i).getLife());
                    }
                    if (fighters.get(i).atack() > fighters.get(i + 1).defense()) {
                        fighters.get(i + 1).lostLife();
                        //System.out.println("LostLife =>" + fighters.get(i + 1).getLife());
                    }
                    
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Battles.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            } while (fighters.get(i + 1).getLife() >= 0 && fighters.get(i).getLife() >= 0);

            if (fighters.get(i).getLife() > 0) {
                fighters.get(i).rest();

                System.out.println(fighters.get(i).getName() + "ganhou");
                System.out.println(fighters.get(i + 1).getName() + "perdeu");
                fighters.remove(i + 1);

            } else {
                fighters.get(i + 1).rest();
                System.out.println(fighters.get(i + 1).getName() + "ganhou");
                System.out.println(fighters.get(i).getName() + "perdeu");
                fighters.remove(i);

            }
        }
        System.out.println(fighters.get(0).getName() + "venceu");
    }
    
}
