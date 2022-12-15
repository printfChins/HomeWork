public class Car46 extends Thread{
    private String name;
    public Car46(String nm){
        name = nm;
    }
    public void run(){
        for (int i = 0; i < 5; i++) {
            try{
                sleep(1000);
                System.out.println("Working on " + name);
            }catch (InterruptedException e){
            }
        }
    }
}
