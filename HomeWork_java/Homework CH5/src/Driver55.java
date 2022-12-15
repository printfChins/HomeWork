public class Driver55 extends Thread{
    private Company55 comp;
    public Driver55(Company55 c){
        comp = c;
    }
    public void run(){
        for (int i = 0; i < 3; i++) {
            comp.add(50);
        }
    }
}
