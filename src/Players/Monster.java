/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Players;

import abstracts.Creature;

/**
 *
 * @author gustavomiara
 */
public class Monster extends Creature{

<<<<<<< HEAD
    public Monster(String name, String classe,String image, int agility,int level, int dexterity, int life, int intelligence, int magic, int charisma, int force) {
        super(name, classe, image, agility, level, dexterity, life, intelligence, magic, charisma, force);

=======
    public Monster(String name, String classe, String image, int level, int life, int magic, int force, int agility, int dexterity, int intelligence, int charisma) {
        super(name, classe,image, level, life, magic, force, agility, dexterity, intelligence, charisma);
>>>>>>> 239afa5378a2be28563dd7af7ca7be88c40dc46b
        
    }
    
    @Override
    public void rest(){

        float restCoefficient = (float)(this.life + this.level ) * this.randomizer();
        
        if(restCoefficient > 20) this.revitalize();
    }
    
}
