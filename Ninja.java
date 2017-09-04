public class Ninja extends Human {

    public Ninja(String name){
        super(name);
        setStealth(10);
        System.out.println(getName() + " has stealth of " + getStealth());
    }

    public void steal(Human human){
        human.setHealth(human.getHealth() - this.getStealth());
        this.setHealth(this.getHealth() + this.getStealth());
        System.out.println(this.getName() + " stole health from " + human.getName());
        System.out.println(human.getName() + "'s health is now " + human.getHealth());
        System.out.println(this.getName() + "'s health is now " + this.getHealth());
    }

    public void runAway(){
        System.out.println(getName() + " has disappeared into the night.");
        setHealth(getHealth() - 10);
        System.out.println(getName() + "'s health is now " + getHealth());
    }

}
