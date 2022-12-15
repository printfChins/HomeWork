public class p52 {
    public static void main(String[] args) {
        Company52 cmp = new Company52();

        Driver52 drv1 = new Driver52(cmp);
        drv1.start();
//        try {
//            drv1.join();
//        }catch (InterruptedException e){
//        }

        Driver52 drv2 = new Driver52(cmp);
        drv2.start();
    }
}
