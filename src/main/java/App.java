import solarsystem.Planet;
import solarsystem.PlanetType;

public class App {
    public static void main(String[] args) {
        Planet earth = new Planet(
            "Earth", 1, 5.972E24, 1.08321E12, 12742, 150, PlanetType.TERRESTRIAL, true, 1, 1
        );
        Planet jupiter = new Planet(
            "Jupiter", 79, 1.898E27, 1.43128E15, 139820, 778, PlanetType.GASEOUS, true, 11.86, 0.41
        );

        System.out.println("=== Planet Details ===");
        System.out.println(earth);
        System.out.println(jupiter);
    }
}

