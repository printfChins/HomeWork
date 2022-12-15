public class p55 {
    public static void main(String[] args) {
        Company55 cmp = new Company55();

        Driver55 drv1 = new Driver55(cmp);
        drv1.start();

        Driver55 drv2 = new Driver55(cmp);
        drv2.start();
    }
}
