package Lesson_13;

public class Main {

    public static void main(String[] args) {

        for (Planet planet : Planet.values()) {
            System.out.println();

            System.out.println(planet.name() + ": №: " + planet.number + ", Rem. from prev. planet: " + planet.remotenessFromPrevious + " mln.km." +
                    ", Rem. from the Sun: " + planet.remotenessFromTheSun + " mln.km." + ", Radius: " + planet.radius + " km." + ", Mass planet: " + planet.mass + " non.kg." + ", Previous planet: " + planet.previousPlanet +
                    ", Next planet: " + planet.nextPlanet);

        }
    }
}