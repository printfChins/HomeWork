public class Company55 {
    private int sum = 0;

    public synchronized void add(int a){
        int temp = sum;
        System.out.println("Total Amount is " + temp +
                " dollars from now on");
        System.out.println("Added " + a + " dollars");
        temp = temp + a;
        System.out.println("Total Amount is " + temp +
                " dollars");
        sum = temp;
    }
}
