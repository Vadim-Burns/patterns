package structural.proxy;

public class Main {
    public static void main(String[] args) {
        // Предположим что нам нужно выполнять некие Yandex запросы
        // Для этого у нас есть ApiRequest
        ApiRequest apiRequest = new YandexRequest();
        apiRequest.execute("ya.ru");

        System.out.println("-------------------------------");

        // Но вдруг нам понадобилось собирать мета информацию о запросах
        // и чтобы не мешать сбор информации с бизнес логикой мы используем прокси
        apiRequest = new ApiRequestProxy(new YandexRequest());
        apiRequest.execute("ya.ru");
    }
}
