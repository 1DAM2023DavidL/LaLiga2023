import java.util.ArrayList;

public class Main {

    // Entrenadores
    Entrenador entrenador1 = new Entrenador("Entenador1","Entrenador1","Entrenador","1990");
    Entrenador entrenador2 = new Entrenador("Entrenador2","Entrenador2","Entrenador","1984");

    //Presidente
    Presidente presidente1 = new Presidente("Presidente1","Presidente1","Presidente","Presidente");
    Presidente presidente2 = new Presidente("Presidente2","Presidente2","Presidente","Presidente");

    //Juadores
    Jugador jugador1 = new Jugador("Jugador1","Jugador1","Jugador","14");
    Jugador jugador2 = new Jugador("Jugador2","Jugador2","Jugador","7");

    //ArrayList<Jugador> jugadores = new ArrayList<>();

    //Equipos
    Equipo equipo1 = new Equipo("001","Equipo1","98765432","C/ Equipo1,1",presidente1,entrenador1);
    Equipo equipo2 = new Equipo("002","Equipo2","12345678","C/ Equipo2,2",presidente2,entrenador2);

    //Partidos
    Partido partido1 = new Partido("001","24/11/2023",equipo1,equipo2);

}