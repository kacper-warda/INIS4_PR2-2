package com.company.devices;

import java.net.MalformedURLException;
import java.net.URL;

public class Phone extends Device {

    @Override
    void turnOn() {
        System.out.println("Hello");
    }

    @Override
    public void sell() {
        System.out.println("Phone sold");
    }


    public void installAnApp(String[] apps) {
        for (String app : apps) {
            installAnApp(app);
        }
    }

    public void installAnApp(String app) {
        installAnApp(app, "latest");
    }

    public void installAnApp(String app, String version) {
        try {
            URL url = new URL("https", "https://defaultstore.com", 443, app + "_" + version);
            installAnApp(url);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    public void installAnApp(URL url) {
        //walidacje
        //sprawdzanie czy ktoś podał dane karty
        //logi
        System.out.println("app installed " + url.getFile());
    }

}
