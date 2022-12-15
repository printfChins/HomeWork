public class p48 {
    public static void main(String[] args) {
        Car44 car1 = new Car44("First car");
        car1.start();

        try{
            car1.join();
        }catch (InterruptedException e){
        }

        System.out.println("End the main() work" );
    }
}
