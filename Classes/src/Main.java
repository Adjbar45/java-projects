public class Main {

    public static void main(String[] args){
        Car audi = new Car("Sudi", 10);
        audi.model = "Audi A3";
        audi.speed = 10;
        audi.increaseSpeed(20);
        audi.decreaseSpeed(10);
        audi.printSpeed();


        Car bmw = new Car();
        bmw.model = "Bmw";
        bmw.speed = 20;
        bmw.increaseSpeed(30);
        bmw.decreaseSpeed(20);
        bmw.printSpeed();

        Car mercedes = new Car();
        mercedes.model = "Mercedes";
        mercedes.speed = 40;
        mercedes.increaseSpeed(40);
        mercedes.decreaseSpeed(50);
        audi.printSpeed();


    }
}
