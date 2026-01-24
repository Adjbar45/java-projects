public class Fighter {

    String name;
    int damage;
    int health;
    int weightr;

    Fighter(String name, int damage, int health, int weightr){
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weightr = weightr;
    }

    int hit(Fighter foe){
        System.out.println(this.name + " => " + foe.name + " " + this.damage + " hasar vurdu.");

        if(foe.health - this.damage < 0){
            return 0;
        }
        return foe.health - this.damage;
    }
}
