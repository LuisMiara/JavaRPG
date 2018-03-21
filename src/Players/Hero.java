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
public class Hero extends Creature{
        
    private int blessing;

    public Hero(String name,String image, String classe, int level, int life, int magic, int force, int agility, int dexterity, int intelligence, int charisma, int blessing) {
        super(name, image, classe, level, life, magic, force, agility, dexterity, intelligence, charisma);
        this.blessing = blessing;
        
    }

    @Override
    public void rest(){
        float restCoefficient = (float)(this.life + this.level + this.blessing) * this.randomizer();

        if(restCoefficient > 20) this.revitalize();
    }
    
    
    
}
