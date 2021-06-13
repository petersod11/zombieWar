
package com.mycompany.zombiewar;
//Class creating Survivor and implementing objects of child, teacher, soldier
public abstract class Survivor {
    
    private int health;
    private int damage;
    private String name;
    
    Survivor(){}
    
    Survivor(int health, int damage){}
      public int getHealth(){
          return health;
      }
      public void setHealth(int health){
          this.health = health;
      }
      int getDamage(){
          return this.damage;
      }
      public void setDamage(int damage){
          this.damage = damage;
      }
      public String getName(){
          return name;
      } 
      public void setName(String name){
          this.name = name;
      }
    
}
