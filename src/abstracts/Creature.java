/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstracts;

import interfaces.Generic;

/**
 *
 * @author gustavomiara
 */
public abstract class Creature implements Generic {
        
    private String name;
    private String classe;
    private int nivel;
    private int life;
    private int magic;
    private int force;
    private int agility;
    private int dexterity;
    private int intelligence;
    private int charisma;

    public Creature(String name, String classe, int nivel, int life, int magic, int force, int agility, int dexterity, int intelligence, int charisma) {
        this.name = name;
        this.classe = classe;
        this.nivel = nivel;
        this.life = life;
        this.magic = magic;
        this.force = force;
        this.agility = agility;
        this.dexterity = dexterity;
        this.intelligence = intelligence;
        this.charisma = charisma;
    }
    
    public void atack(){
    
    }
    
    public void defense(){
    
    }
    
    public void vivo(){
    
    }
    
    public void  lostLife(){
    
    }
    
    public void revitalizar(){
    
    }
    
    public void descansar(){
    
    }
    
    @Override
    public String toString(){
    
        return "";
    }
    

    
    
    
    
    
}
