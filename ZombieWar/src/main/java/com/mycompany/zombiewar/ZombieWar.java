
package com.mycompany.zombiewar;
import java.util.*;
import java.util.Random;

public class ZombieWar {
    public static void main(String[] args){
        
        List<Survivor> survivorList = new ArrayList<>();
        List<Zombie> zombieList = new ArrayList<>();
        
        Random rand = new Random();
        int survivorCount = rand.nextInt(10) + 20;
        int zombieCount = rand.nextInt(10) + 10;
        
        for(int i = 0; i < survivorCount; i++){
            survivorList.add(createSurvivor());
        }
        
        for (int i = 0; i < zombieCount; i++){
            zombieList.add(createZombie());
        }
        
        System.out.println("We have "+ survivorList.size() + " survivors trying to make it to saftey " 
                + "(" + Child.count + " children, " + Teacher.count + " teachers, " + Soldier.count + " soldiers)");
        
        System.out.println("But there are " + zombieList.size() + " zombies waiting for them "
                + "(" + CommonInfected.count + " common infected. " + Tank.count + " tanks)");
        
        while((zombieList.size() > 0) && (survivorList.size() > 0)){
               
            for (Survivor survivor: survivorList){
                int damage = survivor.getDamage();
                
                for (int i =0; i<zombieList.size();i++){
                    Zombie z = zombieList.get(i);
                    z.setHealth(z.getHealth()-damage);
                    
                    if(zombieList.get(i).getHealth() <= 0){
                        System.out.println(
                                survivor.getName() + " killed " + 
                                zombieList.get(i).getName());
                        zombieList.remove(i);
                    }
                    if (zombieList.isEmpty()){
                        break;
                    }
                    
                }
            }
            
            for (Zombie zombie : zombieList){
                int damage = zombie.getDamage();
                
                for (int i = 0; i<survivorList.size(); i++){
                    survivorList.get(i).setHealth(survivorList.get(i).getHealth()-damage);
                    if(survivorList.get(i).getHealth() <= 0){
                        System.out.println(zombie.getName() + " killed " + survivorList.get(i).getName());
                        survivorList.remove(i);
                    }
                    if(survivorList.isEmpty()){
                        break;
                    }
                }
            }

        }
        if (survivorList.size() > 0) {
            System.out.println("It seems " + survivorList.size() + " have made it to safety.");
        }
        else {
            System.out.println("None of the survivors made it.");
        }
    }
    
    public static Zombie createZombie(){
        Random rand = new Random();
        int characterType = rand.nextInt(2);
        return switch (characterType) {
            case 0 -> new CommonInfected();
            default -> new Tank();
        };
    }
        private static Survivor createSurvivor() {
        Random rand = new Random();
        int characterType = rand.nextInt(3);
        return switch (characterType) {
            case 0 -> new Child();
            case 1 -> new Teacher();
            default -> new Soldier();
        };
    }
}
