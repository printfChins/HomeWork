package S11;

public class Sample {
    public static void main(String[] args) {
        Car car1;
        car1 = new Car();
        car1.setCar(1234,20.5);
        car1.show();
        System.out.println("變更車號");
        car1.setCar(1234);
        car1.show();
        System.out.println("變更汽油");
        car1.setCar(20.5);
        car1.show();
    }
}
class Car{
    int num;
    double gas;
    public void setCar(int n){
        num = n;
        System.out.println("將車號設為"+num);
    }
    public void setCar(double g){
        gas = g;
        System.out.println("將汽油設為"+gas);
    }
    public void setCar(int n,double g){
        num = n;
        gas = g;
        System.out.println("將車號設為"+num+",將車號設為"+gas);
    }
    public void show(){
        System.out.println("車號是"+this.num);
        System.out.println("汽油量是"+this.gas);
    }
}
