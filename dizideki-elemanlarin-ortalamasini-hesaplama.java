public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        int sum = 0;
        double harmonicSeries = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            harmonicSeries += 1.0 / numbers[i];
        }

        double average = (double) sum / numbers.length;
        double harmonicAverage = numbers.length / harmonicSeries;

        System.out.println("Aritmetik Ortalama: " + average);
        System.out.println("Harmonik Ortalama: " + harmonicAverage);
    }
}
