package Arrays;

public class MaxPopulation {
    public static void main(String[] args) {
        int[][] years={{1993,1999},{2000,2010}};
        System.out.println(maxPopulationYear(years));
    }
    static int maxPopulationYear(int[][] people) {
        int[] population = new int[202]; // assuming years are between 1900 and 2000
        for (int[] person : people) {
            int birth = person[0];
            int death = person[1];
            for (int i = birth; i <= death; i++) {
                population[i - 1900]++;
            }
        }
        int maxYear = 1900;
        int maxPopulation = population[0];
        for (int i = 1; i < population.length; i++) {
            if (population[i] > maxPopulation) {
                maxYear = i + 1900;
                maxPopulation = population[i];
            }
        }
        return maxYear;
    }
}
