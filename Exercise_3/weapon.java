public class weapon {   
       
    String name;
    int damage;
    String rarity;

    public void statemyName() {
        System.out.println("The Weapon is "+ name);
    }

    public void statemyDamage() {
        System.out.println("The Damage of this sword is "+ damage);
    }

    public void statemyRarity() {
        System.out.println("The rarity of this sword is "+ rarity);
    }
    
    public void addDamage(int additionalDamage) {

    int newDamage = this.damage + additionalDamage;
    System.out.println("The damage is increased from "+ damage + " to "+ newDamage );

    this.damage = newDamage;
    }

    public String shownameandrarity() {
        return this.name + " " + this.rarity;
    }

    
}
       