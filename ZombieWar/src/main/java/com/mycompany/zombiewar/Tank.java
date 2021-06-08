
package com.mycompany.zombiewar;

public class Tank extends Zombie{
    public static int count = 0;
    
    public Tank(){
        setName("Tank " + count ++);
        setHealth(150);
        setDamage(20);
    }
    
}
