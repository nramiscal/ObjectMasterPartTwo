public class Wizard extends Human {

    public Wizard(String name){
        super(name);
        setHealth(50);
        setIntelligence(8);
        System.out.println(getName() + " has health of " + getHealth() + " and intelligence of " + getIntelligence());
    }

    public void heal(Human human){
        human.setHealth(human.getHealth() + this.getIntelligence());
        System.out.println(this.getName() + " healed " + human.getName() + ".");
        System.out.println(human.getName() + "'s health is now " + human.getHealth());
    }

    public void fireball(Human human){
        System.out.println(this.getName() + " threw a fireball at " + human.getName() + "!");
        human.setHealth(human.getHealth() - this.getIntelligence());
        System.out.println(human.getName() + "'s health is now " + human.getHealth());
    }
}
