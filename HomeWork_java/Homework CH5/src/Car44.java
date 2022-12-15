public class Car44 extends Thread{
    private String name;
    public Car44(String nm){
        name = nm;
    }
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Working on " + name);
        }
    }
}
