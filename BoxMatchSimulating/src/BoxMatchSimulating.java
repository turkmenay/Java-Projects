public class BoxMatchSimulating {
    public static void main(String[] args) {

        Fighter f1 = new Fighter("Tyson",100,98,15,40);
        Fighter f2 = new Fighter("Ali", 100,95,10,70);
        Match match = new Match(f1,f2,90,100);
        match.start();
    }
}