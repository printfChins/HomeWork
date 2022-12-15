public class p50 {
    public static void main(String[] args) {
        Car50 car1 = new Car50("First Car");

        Thread th1 = new Thread(car1);
        th1.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("Working on main()" );
        }
    }
}
