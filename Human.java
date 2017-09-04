public class Human {
    String name;
    int strength = 3;
    int stealth = 3;
    int intelligence = 3;
    int health = 100;

    public Human(String name) {
        setName(name);
        System.out.println(getName() + " has entered the game.");
    }

    // getters
    public int getStrength(){
        return strength;
    }

    public int getStealth(){
        return stealth;
    }

    public int getIntelligence(){
        return intelligence;
    }

    public int getHealth(){
        return health;
    }

    public String getName(){
        return name;
    }

    // setters
    public void setStrength(int strength){
        this.strength = strength;
    }

    public void setStealth(int stealth){
        this.stealth = stealth;
    }
    public void setIntelligence(int i){
        intelligence = i;
    }
    public void setHealth(int health){
        this.health = health;
    }

    public void setName(String name){
        this.name = name;
    }

    public void attack(Human human){
        human.setHealth(human.getHealth() - this.getStrength());
        System.out.println(this.getName() + " attacked " + human.getName() + "!");
        System.out.println(human.getName() + "'s health is now " + human.getHealth());
    }

}
