/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstracts;

import interfaces.Generic;

/**
 *
 * @author gustavomiara, quintanilhaedu
 *
 */
public abstract class Creature implements Generic {
        
    private String name;
    private String className;
    private int level;
    private int life;
    private int magic;
    private int strength;
    private int agility;
    private int dexterity;
    private int intelligence;
    private int charisma;

    public Creature(String name, String className, int level, int life, int magic, int strength, int agility, int dexterity, int intelligence, int charisma) {
        this.name = name;
        this.className = className;
        this.level = level;
        this.life = life;
        this.magic = magic;
        this.strength = strength;
        this.agility = agility;
        this.dexterity = dexterity;
        this.intelligence = intelligence;
        this.charisma = charisma;
    }
    
    public void atack(){
    
    }
    
    public void defense(){
    
    }
    
    public void alive(){
    
    }
    
    public void  losesLife(){
    
    }
    
    public void revitalize(){
    
    }
    
    public void rest(){
    
    }
    
    @Override
    public String toString(){
    
        return "";
    }
    

    
    
    
    
    
}
