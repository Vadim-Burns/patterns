package structural.adapter;

public class MovableKMtoMPHAdapter implements MovableMPH {
    private final MovableKM movableKM;

    public MovableKMtoMPHAdapter(MovableKM movableKM) {
        this.movableKM = movableKM;
    }


    @Override
    public float getSpeed() {
       return (float) (movableKM.getSpeed() / 1.60934);
    }
}
