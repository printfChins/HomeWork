package S8;

public class Sample {
    public static void main(String[] args) {
        Car car1;
        car1 = new Car();
        car1.setNumGas();

    }
}
class Car{
    int num;
    double gas;
    int getNum(){
        System.out.println("調查車號");
        return num;
    }
    double getGas(){
        System.out.println("調查汽油量");
        return gas;
    }
    void setNumGas(int n, double g){
        num = n;
        gas = g;
        System.out.println("將車號設為"+num+",汽油量設為"+gas);
    }

}
