public class Samurai extends Human {
    private static int count = 0;

    public Samurai(String name){
        super(name);
        setHealth(200);
        this.count++;
        System.out.println(getName() + " has health of " + getHealth());
    }

    public void deathBlow(Human human){
        human.setHealth(0);
        setHealth(getHealth()/2);
        System.out.println(human.getName() + " is killed by " + this.getName() + "'s death blow.");
        System.out.println(getName() + "'s health is now " + getHealth());
    }
    public void meditate(){
        this.setHealth(this.getHealth() + this.getHealth()/2);
        System.out.println("Ommmmmmmmmm...");
        System.out.println(this.getName() + " now has health of " + this.getHealth());
    }

    public int howMany(){
        System.out.println("Samurai count: " + count);
        return count;
    }


}
