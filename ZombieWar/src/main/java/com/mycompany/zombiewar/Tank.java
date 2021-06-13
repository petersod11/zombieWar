
package com.mycompany.zombiewar;
// create Tank object of class Zombie
public class Tank extends Zombie{
    public static int count = 0;
    
    public Tank(){
        setName("Tank " + count ++);
        setHealth(150);
        setDamage(20);
    }
    
}
