public abstract class Survivor {
    
    private int health;
    private Weapon weapon;
    private String name;
    
    Survivor(){}
    
    Survivor(int health){}
      public int getHealth(){
          return health;
      }
      public void setHealth(int health){
          this.health = health;
      }
      public int getDamage(){
          return this.weapon.getDamage();
      }
      public void pickUpWeapon() {
          this.weapon = new Weapon();
      }
      public String getWeaponName() {
          return this.weapon.getName();
      }
      public Weapon getWeapon() {
          return this.weapon;
      }
      public String getName(){
          return name;
      } 
      public void setName(String name){
          this.name = name;
      }
}