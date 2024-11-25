# Sistema Solar - Modelado de Planetas

Este proyecto modela los planetas del sistema solar utilizando programación orientada a objetos en Java. El objetivo es representar los atributos y comportamientos de un planeta, como su masa, volumen, tipo y propiedades orbitales.

## Características del proyecto

- Modela un planeta con atributos como nombre, masa, volumen, tipo, periodo orbital y más.
- Implementa métodos para calcular la densidad y determinar si un planeta es exterior (más allá del cinturón de asteroides).
- Representa el tipo de planeta usando un enumerado (`PlanetType`).
- Incluye pruebas con dos planetas: **Tierra** y **Júpiter**.

---

## Diagrama de Clases
 <pre>
```plaintext
+--------------------------------------+
|               Planeta                |
+--------------------------------------+
| - name: String                       |
| - satellites: int                    |
| - mass: double                       |
| - volume: double                     |
| - diameter: int                      |
| - distanceFromSun: int               |
| - type: PlanetType (enum)            |
| - visibleToNakedEye: boolean         |
| - orbitalPeriod: double              |
| - rotationPeriod: double             |
+--------------------------------------+
| + Planeta(...)                       |  <- Constructor
| + getAttributes(): String            |
| + calculateDensity(): double         |
| + isOuterPlanet(): boolean           |
| + toString(): String                 |
+--------------------------------------+

Enum: PlanetType
+--------------------------+
| GASEOUS, TERRESTRIAL, DWARF |
+--------------------------+
 </pre>

<h2> Archivos del proyecto </h2>

- Planeta.java: Define la clase Planeta con sus atributos y métodos.
- PlanetType.java: Contiene el enumerado para los tipos de planetas.
- App.java: Contiene el método main para probar la funcionalidad.
- README.md: Explica el proyecto y su estructura.

## Cómo ejecutar el proyecto
- Clonar el repositorio o copiar los archivos en un directorio local.
- Abrir el proyecto en Visual Studio Code o cualquier IDE de Java.
- Compilar los archivos:
 <pre> javac *.java  </pre>

- Ejecutar el programa:
 <pre> java App  </pre>

## Resultado esperado:

Los detalles de dos planetas, Tierra y Júpiter, incluyendo su densidad y si son planetas exteriores.

## Ejemplo de salida

 <pre>
=== Planet Details ===
Planet Name: Earth
Satellites: 1
Mass (kg): 5.972E24
Volume (km³): 1.08321E12
Diameter (km): 12742
Distance from Sun (million km): 150
Type: TERRESTRIAL
Visible to Naked Eye: true
Orbital Period (years): 1.0
Rotation Period (days): 1.0
Density (kg/km³): 5514.9962
Outer Planet: No

Planet Name: Jupiter
Satellites: 79
Mass (kg): 1.898E27
Volume (km³): 1.43128E15
Diameter (km): 139820
Distance from Sun (million km): 778
Type: GASEOUS
Visible to Naked Eye: true
Orbital Period (years): 11.86
Rotation Period (days): 0.41
Density (kg/km³): 1326.2137
Outer Planet: Yes
 </pre>

 <h2>Ejecución de los tests</h2>
    <p>Para ejecutar los tests, usa el siguiente comando:</p>
    <pre>mvn test</pre>
    <p>Asegúrate de tener las dependencias de Hamcrest configuradas en tu archivo <code>pom.xml</code> para ejecutar las pruebas correctamente.</p>

   <h3>Captura de la cobertura de tests</h3>
    <img src="/Foto/Imagen pegada.png alt="Cobertura de Tests" />

<p><strong>Autor:</strong> FUAD AL KWKABANI  <a href="https://github.com/Fuad-Alkwkabani">GitHub</a>