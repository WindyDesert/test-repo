package room4;

public class Mine {
    private int gold;

    Mine() {
        this.gold = 40;
    }

    Mine(int gold) {
        this.gold = gold;
    }

    public int getGold() {
        this.gold -= 1;
        System.out.println("Trees = "+this.gold);
        return 1;
    }

    public boolean isEmpty() {
        return this.gold <= 0;
    }
}
