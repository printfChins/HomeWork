public class Car50 implements Runnable{
    private String name;
    public Car50(String nm){
        name = nm;
    }
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Working on " + name);
        }
    }
}
