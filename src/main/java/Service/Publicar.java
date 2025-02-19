package Service;

import jakarta.xml.ws.Endpoint;

public class Publicar {
    public static void main(String[] args) {
        String url = "http://localhost:8080/FutbolService";
        System.out.println("Publicando servicio en " + url);
        Endpoint.publish(url, new FutbolServiceImpl());
    }
}