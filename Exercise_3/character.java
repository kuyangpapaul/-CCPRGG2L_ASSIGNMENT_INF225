public class character {

    int strength;
    int agility;
    int intelligence;
    String name;

    public void sayMyName() {

        System.out.println("Hello i am " + name);

    }
  
    public void sayMyStrength() {

        System.out.println("My strength is " + strength);

    }

    public void sayMyAgility() {

        System.out.println("My Agility is " + agility);
    }   
    public void sayMyIntelligence() {

        System.out.println("My Intelligence is " + intelligence);
    }

    public void attack() {

        System.out.println("I am attacking!");
    }

}