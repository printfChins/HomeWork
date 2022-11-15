package S15;

public class Sample {
    public static void main(String[] args) {
        Car31.showSum();

        Car31 car1;
        car1 = new Car31();
        car1.setCar(1234,20.5);

        Car31.showSum();

        Car31 car2;
        car2 = new Car31();
        car2.setCar(4567,30.5);
    }
}

class Car31{
    public static int sum = 0;
    private int num;
    private double gas;

    public Car31(){
        num =0;
        gas = 0.0;
        sum++;
        System.out.println("produce car");
    }
    public void setCar(int n,double g){
        num = n;
        gas = g;
        System.out.println("produce car,car num is "+num+",gas is "+gas);
    }

    public static void showSum(){
        System.out.println("car have "+sum);
    }

    public void show()
    {
        System.out.println("car num is " + this.num);
        System.out.println("Cas gas is " + this.gas);
    }

}