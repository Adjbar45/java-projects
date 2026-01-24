public class Match {

    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight){
        this.f1 = f1;
        this.f2 = f2;
        this.maxWeight = maxWeight;
        this.minWeight = minWeight;
    }

    void run(){
        if(isCheck()){
            while(this.f1.health > 0 && this.f2.health > 0){
                this.f2.health = this.f1.hit(this.f2);
                if(isWin()){
                    break;
                }

                this.f1.health = this.f2.hit(this.f1);
                if(isWin()){
                    break;
                }
            }
        }else{
            System.out.println("Sporcularin sikleteleri uymuyor: ");
        }
    }

    boolean isCheck(){
        return (this.f1.weightr >= minWeight && this.f1.weightr <= maxWeight) && (this.f2.weightr >= minWeight && this.f2.weightr <= maxWeight);
    }

    boolean isWin(){
        if(this.f1.health ==0){
            System.out.println(this.f2.name + " kazandi !");
        }
        if(this.f2.health ==0){
            System.out.println(this.f1.name + " kazandi !");
        }

        return false;
    }
}
