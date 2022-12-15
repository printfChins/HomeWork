public class p47 {
    public static void main(String[] args) {
        Car44 car1 = new Car44("First car");
        car1.start();

        for (int i = 0; i < 5; i++) {
            try{
                Thread.sleep(1000);
                System.out.println("Working on main()" );
            }catch (InterruptedException e){
            }
        }
    }
}
