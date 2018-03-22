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
        Home home = new Home();
        home.setVisible(true);

        Hero DARK_GLORYSSON = new Hero("darkglorysson","Humano","darkglorysson", 5 , 8, 10, 100, 15, 100, 2, 10, 10);
        Hero MELLAYNE= new Hero("mellayne","Humano","mellayne", 10, 5, 8, 100, 2, 80, 20, 25, 10);
        Hero GRYIN= new Hero("gryin","Anão","gryin", 5 , 10, 10, 100, 5, 50, 1, 30, 10);

        Monster MONTARO = new Monster("montaro","Elfo das Trevas","montaro", 5, 7, 10, 100, 15, 100, 10, 10);
        Monster LORD_BLACK = new Monster("lordblack","Humano","lordblack", 12, 10, 10, 100, 10, 20, 1, 32);
        Monster MATILDA = new Monster("matilda","Elfa","matilda", 8, 10, 10, 100, 18, 80, 5, 10);
        

        Creature fighters[] = {DARK_GLORYSSON, MONTARO, MELLAYNE, LORD_BLACK, GRYIN, MATILDA};

        for(int i = 0; fighters.length == 1; i += 2){

            if(i => fighters.length) i = 0;

            do{
                if(fighters[i+1].atack() > fighters[i].defense()){
                    fighters[i].lostLife();
                }
                if(fighters[i].atack() > fighters[i+1].defense()){
                    fighters[i+1].lostLife();
                }
            }while(fighters[i+1].getLife() < 0 || fighters[i+1].getLife() < 0);
            
            if(fighters[i].getLife() > 0){
                fighters[i].rest();
                fighters[i+1].pop();
            }
            else{
                fighters[i+1].rest();
                fighters[i].pop();
            }            
        }
        System.out.println(fighters[0].name);
    }
    
}
