public class p24 {
    public static void main(String[] args) {
        try{
            int[] test = new int[5];

            System.out.println("Give the value to test[10]");

            test[10] = 80;
            System.out.println("Give 80 to test[10]");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Out Of Bounds");
        }finally {
            System.out.println("Absolutely execute this code");
        }

        System.out.println("Finish code");
    }
}
