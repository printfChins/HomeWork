public class Car30 {
    private int num;
    private double gas;

    public Car30(){
        num = 0;
        gas = 0.0;
        System.out.println("Made a Car");
    }

    public void setCar(int n, double g)throws CarException{
        if(g < 0 ){
            CarException e = new CarException();
            throw e;
        }else{
            num = n;
            gas = g;
            System.out.println("Let Car's num be " + num +
                    ", gas gauge be " + gas);
        }
    }

    public  void  show(){
        System.out.println("Car's num be " + num);
        System.out.println("Gas gauge be " + gas);
    }
}
