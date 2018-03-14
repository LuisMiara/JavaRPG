/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Players;

import abstracts.Creature;

/**
 *
 * @author gustavomiara, quintanilhaedu
 */
public class Hero extends Creature {
	private int bless;
	
	public Hero(String name, String className, int level, int life, int magic, int strength, int agility, int dexterity, int intelligence, int charisma, int bless) {
		super(name, className, level, life, magic, strength, agility, dexterity, intelligence, charisma);
		this.bless = bless;
	}
	
		
	
}
