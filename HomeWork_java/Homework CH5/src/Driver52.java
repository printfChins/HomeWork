public class Driver52 extends Thread{
    private Company52 comp;
    public Driver52(Company52 c){
        comp = c;
    }
    public void run(){
        for (int i = 0; i < 3; i++) {
            comp.add(50);
        }
    }
}
