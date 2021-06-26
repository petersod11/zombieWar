public class Soldier extends Survivor {
     public static int count = 0;
    
    public Soldier (){
        setName("Soldier " + count++);
        setHealth(100);
        setDamage(10);
    }
}