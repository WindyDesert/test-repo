package room4;

public class Castle {
    private int gold;

    Castle() {
        this.gold = 0;
    }

    public void addGold(int value) {
        this.gold += value;
        System.out.println("Fortifications: "+this.gold);
    }
}
