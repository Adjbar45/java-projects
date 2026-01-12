public class Car {
// Nitelikleri
    String type ;
    String model;
    String color;
    int speed;
    int speedLimit;

    Car(String model, int speed){
        this.model = model;
        this.speed = speed;
        this.type = "Sedan";
        this.speedLimit = 180;
    }
    Car(){

    }



// Davranislari
    void increaseSpeed(int incremt){
        if((this.speed + incremt) < speedLimit){
            this.speed += incremt;
        }
    }

    void decreaseSpeed(int dcrmt){
        if(this.speed > 0){
            this.speed -= dcrmt;
        }
    }

    void printSpeed(){
        System.out.println(this.model + " speed is: " + this.speed);
    }

}
