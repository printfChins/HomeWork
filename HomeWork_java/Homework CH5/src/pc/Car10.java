package pc;

public class Car10 {
    private int num;
    private double gas;

    public Car10(){
        num = 0;
        gas = 0.0;
        System.out.println("Made a Car");
    }

    public void setCar(int n, double g){
        num = n;
        gas = g;
        System.out.println("Let Car's num be " + num +
                ", gas gauge be " + gas);
    }

    public  void  show(){
        System.out.println("Car's num be " + num);
        System.out.println("Gas gauge be " + gas);
    }
}
