package S13;

public class Sample {
    public static void main(String[] args) {
        Car car1;
        car1 = new Car();
        car1.show();

        Car car2;
        car2 = new Car(1234,25.0);
        car2.show();
    }
}
class Car{
    int num;
    double gas;
    public Car(){
        num = 0;
        gas = 0.0;
        System.out.println("產生了車子");
    }
    public Car(int n,double g){
        num = n;
        gas = g;
        System.out.println("產生了車號為"+num+"汽油量為"+gas+"的車子");
    }
    public void show(){
        System.out.println("車號是"+this.num);
        System.out.println("汽油量是"+this.gas);
    }
}
