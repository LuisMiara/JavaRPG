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

    public Hero(String name, String classe,String image, int agility,int level, int dexterity, int life, int intelligence, int magic, int charisma, int force,int blessing) {
        super(name, classe,image, agility, level, dexterity, life, intelligence, magic, charisma, force);
        this.blessing = blessing;
        
    }

    @Override
    public void rest(){
        float restCoefficient = (float)(this.life + this.level + this.blessing) * this.randomizer();

        if(restCoefficient > 20) this.revitalize();
    }
    
    
    
}
