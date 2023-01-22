public class app {
  public static void main(String[] args) {


        character knight = new character();

 
        knight.strength = 10;

        knight.agility = 5;

        knight.intelligence = 0;

        knight.name = "Leomord";

        character mage = new character();

        mage.strength = 0;

        mage.agility = 5;

        mage.intelligence = 10;

        mage.name = "Harith";

        character thief = new character();

        thief.strength = 5;

        thief.agility = 10;

        thief.intelligence = 0;

        mage.name = "Dexter";

        character marksman = new character();

        marksman.strength = 22;

        marksman.agility = 20;

        marksman.intelligence = 18;

        marksman.name = "Pipoy";

        marksman.sayMyName();
        marksman.sayMyStrength();
        marksman.sayMyAgility();
        marksman.sayMyIntelligence();
        
        
        weapon sword = new weapon();

        sword.name = "Batuta ni Popop";

        sword.damage = 120;

        sword.rarity = "Legendary";

        sword.statemyName();

        sword.statemyDamage();

        sword.statemyRarity();

        sword.addDamage(102); 

        System.out.println( sword.shownameandrarity());   
        
        character Archer = new character();

        Archer.name = "Popop";
        Archer.attack();
  }
}
