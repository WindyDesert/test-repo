package room4;

public class Peon implements Runnable {
    private Mine mine;
    private Castle castle;


    Peon(Mine mine, Castle castle) {
        this.castle = castle;
        this.mine = mine;
    }


    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();

        System.out.println(threadName + " started to work");
        int gold = 0;
        while (!mine.isEmpty()) {
            synchronized (mine) {
                gold = mine.getGold();
                System.out.println(threadName + " got " + gold + " trees. Going to sleep");
                try {
                    Thread.sleep((long) (Math.random() * 5000));
                } catch (InterruptedException e) {
//                throw new RuntimeException(e);
                    break;
                }
            }
            synchronized (castle) {
                castle.addGold(gold);
                System.out.println(threadName + " added to the camp. Going to sleep");
                try {
                    Thread.sleep((long) (Math.random() * 5000));
                } catch (InterruptedException e) {
//                throw new RuntimeException(e);
                    break;
                }
            }
            gold = 0;
        }
        System.out.println(threadName + " closing himself...");
    }
}
