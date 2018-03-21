/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstracts;

import interfaces.Generic;
import java.util.Random;

/**
 *
 * @author gustavomiara
 */
public abstract class Creature implements Generic {
        
    protected String image;
    protected String name;
    protected String classe;
    protected int level;
    protected int life;
    protected int magic;
    protected int force;
    protected int agility;
    protected int dexterity;
    protected int intelligence;
    protected int charisma;

    public Creature(String name, String image, String classe, int level, int life, int magic, int force, int agility, int dexterity, int intelligence, int charisma) {
        this.name = name;
        this.image = image;
        this.classe = classe;
        this.level = level;
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
    
    //Methods
    public float randomizer(){
        Random r = new Random();
        float max = (float) 1.10;
        float min = (float) 1.66;
        float randomNumber = r.nextInt((int) ((max - min)+1)) + min;
        
        System.out.println("random: "+randomNumber); //method needs some tests
        
        return randomNumber;
    }
    
    public float atack(){
        float coefficient = (float) (this.level + this.force + this.agility + (this.magic*0.1)) * this.randomizer();
        if(coefficient > 100)
            return 100;
        else
            return coefficient;
    }
    
    public float defense(){
        
        float coefficient = (float) (this.agility + (this.dexterity * 0.7) + this.intelligence) * this.randomizer() + 10;
        
        if(coefficient > 100)
            return 100;
        else
            return coefficient;
    }
    
    public boolean alive(){
        return (this.getLife() > 0);
    }
    
    public void  lostLife(){
        this.setLife(this.getLife() - 8);
    }
    
    public void revitalize(){
        if((this.life + 50) > 100){
            this.life = 100;
        }else{
            this.life += 50;
        }
        if((this.magic + 30) > 100){
            this.magic = 100;
        }else{
            this.magic += 30;
        }
    }
    
    public abstract void rest();
    
    @Override
    public String toString() {
        
        return super.toString() + "Creature{" + "name=" + name + ", classe=" + classe + ", level=" + level + ", life=" + life + ", magic=" + magic + ", force=" + force + ", agility=" + agility + ", dexterity=" + dexterity + ", intelligence=" + intelligence + ", charisma=" + charisma + '}';
    }   
   
}
