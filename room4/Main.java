package room4;

public class Main {
    public static void main(String[] args) {
        Mine mine = new Mine();
        Castle castle = new Castle();

        Thread[] workers = new Thread[5];
        for (int i = 0; i < workers.length; i++) {
            workers[i] = new Thread(new Peon(mine, castle), "Worker " + (i + 1));
            workers[i].start();
        }

    }
}
