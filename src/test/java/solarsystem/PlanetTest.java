package solarsystem;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PlanetTest {

    @Test
    void testCalculateDensity() {
        // Arrange: Crear un planeta con masa y volumen conocidos
        Planet earth = new Planet(
            "Earth", 1, 5.972E24, 1.08321E12, 12742, 150, PlanetType.TERRESTRIAL, true, 1, 1
        );

        // Act: Calcular la densidad
        double density = earth.calculateDensity();

        // Assert: Verificar que la densidad sea correcta
        assertEquals(5514.996, density, 0.001, "La densidad calculada es incorrecta");
    }

    @Test
    void testGetAttributes() {
        // Arrange: Crear un planeta con valores conocidos
        Planet earth = new Planet(
            "Earth", 1, 5.972E24, 1.08321E12, 12742, 150, PlanetType.TERRESTRIAL, true, 1, 1
        );

        // Act: Obtener los atributos como un string
        String attributes = earth.getAttributes();

        // Assert: Verificar que el string contenga los detalles importantes
        assertTrue(attributes.contains("Earth"), "El nombre del planeta debería estar presente");
        assertTrue(attributes.contains("Satellites: 1"), "El número de satélites debería estar presente");
        assertTrue(attributes.contains("Mass (kg): 5.972E24"), "La masa del planeta debería estar presente");
    }

    @Test
    void testIsOuterPlanet() {
        // Arrange: Crear un planeta fuera del cinturón de asteroides
        Planet jupiter = new Planet(
            "Jupiter", 79, 1.898E27, 1.43128E15, 139820, 778, PlanetType.GASEOUS, true, 11.86, 0.41
        );

        // Act: Verificar si es un planeta exterior
        boolean isOuter = jupiter.isOuterPlanet();

        // Assert: Verificar que es un planeta exterior
        assertTrue(isOuter, "Júpiter debería ser un planeta exterior");
    }

    @Test
    void testToString() {
        // Arrange: Crear un planeta con valores conocidos
        Planet earth = new Planet(
            "Earth", 1, 5.972E24, 1.08321E12, 12742, 150, PlanetType.TERRESTRIAL, true, 1, 1
        );

        // Act: Obtener la representación en String del planeta
        String planetString = earth.toString();

        // Assert: Verificar que la representación en String contenga los datos correctos
        assertTrue(planetString.contains("Earth"), "El nombre del planeta debería estar presente");
        assertTrue(planetString.contains("Density"), "La densidad debería estar incluida en la representación");
        assertTrue(planetString.contains("Outer Planet: No"), "La información sobre si es un planeta exterior debería estar presente");
    }
}
