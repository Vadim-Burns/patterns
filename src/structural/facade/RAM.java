package structural.facade;

public class RAM {
    private int saved = 0;

    public void save(int s) {
        this.saved = s;
    }

    public int getSaved() {
        return saved;
    }
}
