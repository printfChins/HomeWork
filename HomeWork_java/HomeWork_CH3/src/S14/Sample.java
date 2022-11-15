package S14;

public class Sample {
    public static void main(String[] args) {
        Car28 car1;
        car1 = new Car28();
        car1.show();

        Car28 car2;
        car2 = new Car28(1234,25.0);
        car2.show();
    }
}

class Car28{
    private int num;
    private double gas;

    public Car28(){
        num =0;
        gas = 0.0;
        System.out.println("produce car");
    }
    public Car28(int n,double g){
        this();
        num = n;
        gas = g;
        System.out.println("produce car,car num is "+num+",gas is "+gas);
    }

    public void show()
    {
        System.out.println("car num is " + this.num);
        System.out.println("Cas gas is " + this.gas);
    }

}
