package S6;

public class Sample {
    public static void main(String[] args) {
        Car car1;
        car1 = new Car();
        car1.num = 1234;
        car1.gas = 20.5;
        car1.showCar();
    }
}
class Car{
    int num;
    double gas;
    void show(){
        System.out.println("車號是"+num);
        System.out.println("車號是"+gas);
    }
    void showCar(){
        System.out.println("開始顯示車子資料");
        this.show();
    }

    void setNum(int n){
        num = n;
        System.out.println("將車號設為"+num);
    }

    void setGas(double g){
        gas = g;
        System.out.println("將汽油量設為"+gas);
    }
}
