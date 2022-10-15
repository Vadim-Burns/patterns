package structural.adapter;

public class Main {
    public static void main(String[] args) {
        // Предположим у нас есть объект MovableKM, который возвращает скорость в KM
        MovableKM movableKM = new MovableKM() {
            @Override
            public float getSpeed() {
                return 431;
            }
        };

        // А нам необходимо выполниться функцию showMPH, которая принимает только принимает только объект
        // MovableMPH. Тут нас спасает адаптер MovableKM -> Adapter -> MovableMPH
        MovableKMtoMPHAdapter adapter = new MovableKMtoMPHAdapter(movableKM);
        showMPH(adapter);
    }

    private static void showMPH(MovableMPH movableMPH) {
        System.out.println(movableMPH.getSpeed());
    }
}
