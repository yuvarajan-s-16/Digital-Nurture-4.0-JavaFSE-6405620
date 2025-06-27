package com.yuvarajan;

public class MyService {
    private ExternalApi api;

    public MyService(ExternalApi api) {
        this.api = api;
    }

    public String fetchData() {
        return api.getData();
    }

    public void triggerSend(String data) {
        api.sendData(data);
    }
}
