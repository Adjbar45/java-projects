public class Car {
// Nitelikleri
    String type = "Sedan";
    String model;
    String color;
    int speed;
    int speedLimit =180;


// Davranislari
    void increaseSpeed(int incremt){
        if((speed + incremt) < speedLimit){
            speed += incremt;
        }
    }

    void decreaseSpeed(int dcrmt){
        if(speed > 0){
            speed -= dcrmt;
        }
    }

    void printSpeed(){
        System.out.println(model + " speed is: " + speed);
    }

}
