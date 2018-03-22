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

/**
 *
 * @author gustavomiara
 */
public class battle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        /*
        * here begins all the role
         */
//        Home home = new Home();
//        home.setVisible(true);

        Hero DARK_GLORYSSON = new Hero("darkglorysson", "Humano", "darkglorysson", 5, 8, 10, 100, 15, 100, 2, 10, 10);
        Hero MELLAYNE = new Hero("mellayne", "Humano", "mellayne", 10, 5, 8, 100, 2, 80, 20, 25, 10);
        Hero GRYIN = new Hero("gryin", "Anão", "gryin", 5, 10, 10, 100, 5, 50, 1, 30, 10);

        Monster MONTARO = new Monster("montaro", "Elfo das Trevas", "montaro", 5, 7, 10, 100, 15, 100, 10, 10);
        Monster LORD_BLACK = new Monster("lordblack", "Humano", "lordblack", 12, 10, 10, 100, 10, 20, 1, 32);
        Monster MATILDA = new Monster("matilda", "Elfa", "matilda", 8, 10, 10, 100, 18, 80, 5, 10);
//        name, image, classe, level, life, magic, force, agility, dexterity, intelligence, charisma

        ArrayList<Creature> fighters = new ArrayList();
        fighters.add(DARK_GLORYSSON);
        fighters.add(MONTARO);
        fighters.add(MELLAYNE);
        fighters.add(LORD_BLACK);
        fighters.add(GRYIN);
        fighters.add(MATILDA);

        System.out.println(fighters.size());
//        Creature fighters[] = {DARK_GLORYSSON, MONTARO, MELLAYNE, LORD_BLACK, GRYIN, MATILDA};

        for (int i = 0; fighters.size() != 1; i++) {
            System.out.println("*****************************************************************\n");
            System.out.println("Jogador 1 =>" + fighters.get(i).getName() + " VS Jogador 2 =>" + fighters.get(i + 1).getName());
            System.out.println("*****************************************************************\n");

            if (i >= fighters.size()) {
                i = 0;
            }

            do {
                if (fighters.get(i + 1).atack() > fighters.get(i).defense()) {
                    fighters.get(i).lostLife();
                }
                if (fighters.get(i).atack() > fighters.get(i + 1).defense()) {
                    fighters.get(i + 1).lostLife();
                }


            } while (fighters.get(i + 1).getLife() >= 0 && fighters.get(i).getLife() >= 0);

            if (fighters.get(i).getLife() > 0) {
                fighters.get(i).rest();

                System.out.println(fighters.get(i).getName() + "ganhou");
                fighters.remove(i + 1);
                System.out.println(fighters.get(i + 1).getName() + "perdeu");
            } else {
                fighters.get(i + 1).rest();
                System.out.println(fighters.get(i + 1).getName() + "ganhou");
                fighters.remove(i);
                System.out.println(fighters.get(i).getName() + "perdeu");
            }
        }
        System.out.println(fighters.get(0).getName() + "perdeu");
    }

}
