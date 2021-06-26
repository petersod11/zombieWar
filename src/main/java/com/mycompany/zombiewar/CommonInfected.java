public class CommonInfected extends Zombie {
    public static int count = 0;
    
    public CommonInfected(){
        setName("CommonInfected " + count++);
        setHealth(30);
        setDamage(5);
    }
}