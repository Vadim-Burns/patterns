package structural.proxy;

public class YandexRequest implements ApiRequest {
    @Override
    public void execute(String url) {
        try {
            Thread.sleep(1000);
            System.out.println("executing yandex request");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
