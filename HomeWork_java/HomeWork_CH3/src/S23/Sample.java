package S23;

public class Sample {
    public static void main(String[] args) {

        Car47 car1;
        car1 = new Car47();

        car1.show();

        int number = 1234;
        double gasoline = 20.5;
        String str = "1號車";

        car1.setCar(number,gasoline);
        car1.setName(str);

        car1.show();
    }
}

class Car47{
    private int num;
    private double gas;
    private String name;

    public Car47(){
        num = 0;
        gas = 0.0;
        name = "沒有名稱";
        System.out.println("生產了車子");
    }
    public void setCar(int n,double g){
        num = n;
        gas = g;
        System.out.println("將車號設為"+num+"，汽油量設為"+gas);
    }
    public void setName(String nm){
        name = nm;
        System.out.println("將車名設設為" + name);
    }
    public void show(){
        System.out.println("car num is "+num);
        System.out.println("gas is "+gas);
        System.out.println("car name is "+name);
    }
}
