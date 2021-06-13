
package com.mycompany.zombiewar;
//creates Child object in class survivor
public class Child extends Survivor {
    public static int count = 0;
    
    public Child(){
        setName("Child "+ count++);
        setHealth(20);
        setDamage(2);
    }
}
