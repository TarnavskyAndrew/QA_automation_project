package Lesson_13;

public enum Planet {

    SUN("SUN", 1.989 * 1030, 696_000, 0, null, 1),
    MERCURY("MERCURY", 3.302 * 1023, 2_439, 58, SUN, 2),
    VENUS("VENUS", 4.869 * 1024, 6_050, 50, MERCURY, 3),
    EARTH("EARTH", 5.974 * 1024, 6_371, 42, VENUS, 4),
    LUNA("LUNA",7.35 * 1022, 1_737, 0.407, EARTH, 4.1),
    MARS("MARS", 6.419 * 1023, 3_397, 78, EARTH, 5),
    JUPITER("JUPITER", 1.899 * 1027, 69_911, 550, MARS, 6),
    SATURN("SATURN", 5.685 * 1026, 58_000, 651, JUPITER, 7),
    URANUS("URANUS", 8.683 * 1025, 25_400, 1446, SATURN, 8),
    NEPTUNE("NEPTUNE", 1.024 * 1026, 24_300, 1622, URANUS, 9),
    PLUTO("PLUTO", 1.310 * 1026, 1_137, 1416, NEPTUNE, 10);

    final String name;
    final double mass;   // in nonillion kg
    final double radius; // in km
    double remotenessFromTheSun; // mln km
    final double remotenessFromPrevious; // mln km
    final Planet previousPlanet;
    Planet nextPlanet;
    final double number;

    Planet(String name, double mass, double radius, double remotenessFromPrevious, double remotenessFromTheSun, Planet previousPlanet, double number) {

        this.name = name;
        this.mass = mass;
        this.radius = radius;
        this.remotenessFromPrevious = remotenessFromPrevious;
        this.remotenessFromTheSun = remotenessFromTheSun;
        this.previousPlanet = previousPlanet;
        this.number = number;
        //previousPlanet.nextPlanet = this;
    }

    Planet(String name, double mass, double radius, double remotenessFromPrevious, Planet previousPlanet, double number) {

        this.name = name;
        this.mass = mass;
        this.radius = radius;
        this.remotenessFromPrevious = remotenessFromPrevious;
        this.previousPlanet = previousPlanet;
        this.number = number;
        //previousPlanet.nextPlanet = this;

        if (previousPlanet != null){
            previousPlanet.nextPlanet = this;
            remotenessFromTheSun = previousPlanet.remotenessFromTheSun + remotenessFromPrevious;
        }
    }

}