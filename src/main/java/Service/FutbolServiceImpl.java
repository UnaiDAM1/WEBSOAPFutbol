package Service;

import jakarta.jws.WebService;
import java.util.HashMap;
import java.util.Map;

@WebService(endpointInterface = "Service.FutbolService")
public class FutbolServiceImpl implements FutbolService{
    private static final Map<String, String> entrenadores = new HashMap<>();
    private static final Map<String, Integer> jugadores = new HashMap<>();

    static {
        entrenadores.put("Barcelona", "Hansi Flick");
        entrenadores.put("Real Madrid", "Carlo Ancelotti");
        entrenadores.put("Manchester City", "Pep Guardiola");

        jugadores.put("Barcelona", 25);
        jugadores.put("Real Madrid", 26);
        jugadores.put("Manchester City", 24);
    }

    @Override
    public String obtenerEntrenador(String equipo) {
        return entrenadores.getOrDefault(equipo, "Entrenador no encontrado");
    }

    @Override
    public int obtenerNumeroJugadores(String equipo) {
        return jugadores.getOrDefault(equipo, 0);
    }
}
