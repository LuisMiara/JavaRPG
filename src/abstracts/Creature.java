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
    private int level;
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
        this.level = nivel;
        this.life = life;
        this.magic = magic;
        this.force = force;
        this.agility = agility;
        this.dexterity = dexterity;
        this.intelligence = intelligence;
        this.charisma = charisma;
    }
    
    //Name set & get
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }
    
    //Classe set & get
    public void setClasse(String classe){
        this.classe = classe;
    }
    
    public String getClasse(){
        return this.classe;
    }
    
    //Level set & get
    public void setLevel(int level){
        this.level = level;
    }
    
    public int getLevel(){
        return this.level;
    }
    
    //Life set & get
    public void setLife(int life){
        this.life = life;
    }
    
    public int getLife(){
        return this.life;
    }
    
    //Magic set & get
    public void setMagic(int magic){
        this.magic = magic;
    }
    
    public int getMagic(){
        return this.magic;
    }
    
    //Force set & get
    public void setForce(int force){
        this.force = force;
    }
    
    public int getForce(){
        return this.force;
    }
    
    //Agility set & get
    public void setAgility(int agility){
        this.agility = agility;
    }
    
    public int getAgility(){
        return this.agility;
    }
    
    //Dexterity set & get
    public void setDexterity(int dexterity){
        this.dexterity = dexterity;
    }
    
    public int getDexterity(){
        return this.dexterity;
    }
    
    //Intelligence set & get
    public void setIntelligence(int intelligence){
        this.intelligence = intelligence;
    }
    
    public int getIntelligence(){
        return this.intelligence;
    }
    
    //Charisma set & get
    public void setCharisma(int charisma){
        this.charisma = charisma;
    }
    
    public int getCharisma(){
        return this.charisma;
    }
    
    public void atack(){

    }
    
    public void defense(){
    
    }
    
    public void alive(){
    
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
