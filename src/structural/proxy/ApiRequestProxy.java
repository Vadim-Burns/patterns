package structural.proxy;

import java.util.Date;

public class ApiRequestProxy implements ApiRequest {
    private final ApiRequest apiRequest;

    public ApiRequestProxy(ApiRequest apiRequest) {
        this.apiRequest = apiRequest;
    }

    @Override
    public void execute(String url) {
        Date d1 = new Date();
        System.out.println("Start executing request on " + url);
        apiRequest.execute(url);
        System.out.println("Request executing finished");
        System.out.println("Estimated time = " + String.valueOf(new Date().getTime() - d1.getTime()) + "ms");
    }
}
