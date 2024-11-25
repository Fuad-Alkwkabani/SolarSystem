package solarsystem;

public class Planet {
    private String name;                  
    private int satellites;               
    private double mass;                  
    private double volume;                
    private int diameter;                 
    private int distanceFromSun;          
    private PlanetType type;              
    private boolean visibleToNakedEye;    
    private double orbitalPeriod;         
    private double rotationPeriod;   

    
    public Planet(String name, int satellites, double mass, double volume, int diameter, int distanceFromSun,
            PlanetType type, boolean visibleToNakedEye, double orbitalPeriod, double rotationPeriod) {
        this.name = name;
        this.satellites = satellites;
        this.mass = mass;
        this.volume = volume;
        this.diameter = diameter;
        this.distanceFromSun = distanceFromSun;
        this.type = type;
        this.visibleToNakedEye = visibleToNakedEye;
        this.orbitalPeriod = orbitalPeriod;
        this.rotationPeriod = rotationPeriod;
    }

    public String getAttributes() {
        return "Planet Name: " + name + "\n" +
               "Satellites: " + satellites + "\n" +
               "Mass (kg): " + mass + "\n" +
               "Volume (km³): " + volume + "\n" +
               "Diameter (km): " + diameter + "\n" +
               "Distance from Sun (million km): " + distanceFromSun + "\n" +
               "Type: " + type + "\n" +
               "Visible to Naked Eye: " + visibleToNakedEye + "\n" +
               "Orbital Period (years): " + orbitalPeriod + "\n" +
               "Rotation Period (days): " + rotationPeriod + "\n";
    }

    public double calculateDensity() {
        if (volume == 0) {
            return 0; 
        }
        return mass / volume;
    }

    public boolean isOuterPlanet() {
        double distanceInAU = distanceFromSun / 149.597870; 
        return distanceInAU > 3.4;
    }

    @Override
    public String toString() {
        return getAttributes() +
               "Density (kg/km³): " + calculateDensity() + "\n" +
               "Outer Planet: " + (isOuterPlanet() ? "Yes" : "No") + "\n";
    }

    

}


