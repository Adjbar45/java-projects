public class Teacher {
    String name;
    String phoneNum;
    String branch;

    Teacher(String name, String branch, String phoneNum){
        this.name = name;
        this.phoneNum = phoneNum;
        this.branch = branch;
    }

    void print(){
        System.out.println("Adi: " + this.name);
        System.out.println("Telephon: " + this.phoneNum);
        System.out.println("Bolum: " + this.branch);


    }
}
