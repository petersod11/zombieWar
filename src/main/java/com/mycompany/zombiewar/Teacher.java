public class Teacher extends Survivor{
    public static int count = 0;
    
    public Teacher(){
        setName("Teacher " + count++);
        setHealth(50);
        pickUpWeapon();
    }
}