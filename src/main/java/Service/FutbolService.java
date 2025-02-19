package Service;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService
public interface FutbolService {
    @WebMethod
    String obtenerEntrenador(String equipo);

    @WebMethod
    int obtenerNumeroJugadores(String equipo);
}