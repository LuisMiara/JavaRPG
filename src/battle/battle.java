/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battle;

import Views.Home;

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

        Hero DARK_GLORYSSON = new Hero("darkglorysson",]"Humano","darkglorysson", 5 , 8, 10, 100, 15, 100, 2, 10, 10);
        Hero MELLAYNE= new Hero("mellayne","Humano","mellayne", 10, 5, 8, 100, 2, 80, 20, 25, 10);
        Hero GRYIN= new Hero("gryin","Anão","gryin", 5 , 10, 10, 100, 5, 50, 1, 30, 10);

        Monster MONTARO = new Monster("montaro","Elfo das Trevas","montaro", 5, 7, 10, 100, 15, 100, 10, 10
        Monster LORD_BLACK = new Monster(,"lordblack","Humano","lordblack", 12, 10, 10, 100, 10, 20, 1, 32
        Monster MATILDA = new Monster("matilda","Elfa","matilda", 8, 10, 10, 100, 18, 80, 5, 10
        

        Creature hero[] = new Hero()[DARK_GLORYSSON,MELLAYNE, GRYIN ];
        Monster monsters[] =new Monster() [MONTARO, LORD_BLACK, MATILDA];
        hero[0].lostLife();
        hero[0].rest();
        System.out.println(hero[0].getLife())
        // for(int i = 0; i<4 ; i++){
        //     do{
        //         if(hero[i].atack() > monsters[i].defense()){
        //             monsters[i].lostLife();
        //         }
        //         if(monsters[i].atack() > hero[i].defense()){
        //             hero[i].lostLife();
        //         }
        //     }while(hero[i].getLife() != 0 || monsters[i].getLife() != 0);
        //     hero[i].rest();
        // }


        Hero heroi = (Hero)vencedor;
    }
    
}
