/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Players;

/**
 *
 * @author gustavomiara
 */
public class Monster extends Creature{

    public Monster(String name, String classe, int level, int life, int magic, int force, int agility, int dexterity, int intelligence, int charisma) {
        super(name, classe, level, life, magic, force, agility, dexterity, intelligence, charisma);
        
    }
    
    public void rest(){

        float restCoefficient = (float)(this.life + this.level ) * this.randomizer();
        
        if(this.restCoefficient > 20) this.revitalize();
    }
    
}
