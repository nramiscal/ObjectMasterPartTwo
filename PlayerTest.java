public class PlayerTest {
    public static void main(String[] args){
        Human h = new Human("Human");
        Wizard w = new Wizard("Wizard");
        Samurai s = new Samurai("Samurai");
        Samurai s2 = new Samurai("Second Samurai");
        Ninja n = new Ninja("Ninja");

        w.heal(h);
        w.fireball(h);
        n.steal(h);
        n.runAway();
        s.deathBlow(h);
        s.meditate();
        s.howMany();

    }
}
