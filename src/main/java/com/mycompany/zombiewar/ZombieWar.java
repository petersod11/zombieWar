import java.util.*;
import java.util.Random;

public class ZombieWar {
	
	static List<Survivor> survivorList;
    static List<Zombie> zombieList;
	
    public static void main(String[] args){
        
        survivorList = new ArrayList<>();
        zombieList = new ArrayList<>();
        
        Random rand = new Random();
        int survivorCount = rand.nextInt(10) + 20;
        int zombieCount = rand.nextInt(10) + 10;
        
        for(int i = 0; i < survivorCount; i++){
            survivorList.add(createSurvivor());
        }
        
        for (int i = 0; i < zombieCount; i++){
            zombieList.add(createZombie());
        }
        
        System.out.println("We have "+ survivorList.size() + " survivors trying to make it to saftey");
        System.out.println("But there are " + zombieList.size() + " zombies waiting for them");
        
        while((zombieList.size() > 0) && (survivorList.size() > 0)){
            war();
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
        switch (characterType) {
        case 0:
        	CommonInfected newCommonInfected = new CommonInfected();
        	return newCommonInfected;
        default:
        	Tank newTank = new Tank();
        	return newTank;
        }
    }
    
    public static Survivor createSurvivor() {
        Random rand = new Random();
        int characterType = rand.nextInt(3);
        switch (characterType) {
            case 0:
            	Child newChild = new Child();
            	return newChild;
            case 1:
            	Teacher newTeacher = new Teacher();
            	return newTeacher;
            default:
            	Soldier newSoldier = new Soldier();
            	return newSoldier;
        }
    }
    
    private static void war() {
    	for (Survivor survivor: survivorList){
            int damage;
            
            for (int i =0; i<zombieList.size();i++){
                Zombie z = zombieList.get(i);
                if (survivor.getWeapon().isTrueShot()) {
                    damage = survivor.getDamage();
                } else {
                    damage = 0;
                }
                z.setHealth(z.getHealth()-damage);
                if(z.getHealth() <= 0){
                    System.out.println(survivor.getName() + " " + " killed " + z.getName() + " using " + survivor.getWeaponName());
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
                Survivor s = survivorList.get(i);
            	s.setHealth(s.getHealth()-damage);
                if(s.getHealth() <= 0){
                	System.out.println(zombie.getName() + " " + " killed " + s.getName());
                	survivorList.remove(i);
                }
                if(survivorList.isEmpty()){
                    break;
                }
            }
        }
    }
        
}