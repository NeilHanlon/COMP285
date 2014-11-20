import java.io.Serializable;
import java.util.Scanner;

/**
 * Class for data on endangered species.
 * Includes a main method.
 */
public class Species implements Serializable {
    private String name;
    private int population;
    private double growthRate;


    public String getOutput(){
        return "Name = " + name + "\n" +
                "Population = " +population + "\n" +
                "Growth Rate = " + growthRate + "%\n";
    }
    public void writeOutput() {
        System.out.print(getOutput());
    }

    /**
     * Precondition: years is a nonnegative number.
     * Returns the projected population of the calling object
     * after the specified number of years.
     */
    public int predictPopulation(int years) {
        int result = 0;
        double populationAmount = population;
        int count = years;
        while ((count > 0) && (populationAmount > 0)) {
            populationAmount = (populationAmount +
                    (growthRate / 100) * populationAmount);
            count--;
        }
        if (populationAmount > 0)
            result = (int) populationAmount;

        return result;
    }

    public void setSpecies(String newName, int newPopulation,
                           double newGrowthRate) {
        if (newPopulation >= 0) {
            population = newPopulation;
        } else {
            System.err.println("ERROR: using a negative population.");
            return;
        }
        name = newName;
        growthRate = newGrowthRate;
    }

    public Species(String name, int population, double growthRate) {
        setSpecies(name, population, growthRate);
    }

    public Species() {

    }

    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }

    public double getGrowthRate() {
        return growthRate;
    }

    public boolean equals(Species otherObject) {
        return (name.equalsIgnoreCase(otherObject.name)) &&
                (population == otherObject.population) &&
                (growthRate == otherObject.growthRate);
    }

}
