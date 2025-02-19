package Client;

import Service.FutbolService;

import javax.xml.namespace.QName;

import jakarta.xml.ws.Service;

import java.net.URL;
import java.util.Scanner;

public class Cliente {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            URL url = new URL("http://localhost:8080/FutbolService?wsdl");
            QName qname = new QName("http://Service/", "FutbolServiceImplService");

            Service service = Service.create(url, qname);
            FutbolService equipoService = service.getPort(FutbolService.class);

            menu(equipoService);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void menu(FutbolService equipoService) {
        System.out.println("¿Qué desea hacer hacer?" +
                "\n1. Obtener nombre del entrenador de un equipo." +
                "\n2. Jugadores de un equipo.");
        int opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Introduzca un equipo: ");
                String equipo = sc.next();
                System.out.println("Entrenador de " + equipo + ": " + equipoService.obtenerEntrenador(equipo));
                break;
            case 2:
                System.out.println("Introduzca un equipo: ");
                String equipo2 = sc.next();
                System.out.println("Número de jugadores en " + equipo2 + ": " + equipoService.obtenerNumeroJugadores(equipo2));
                break;
            default:
                break;
        }
    }
}
