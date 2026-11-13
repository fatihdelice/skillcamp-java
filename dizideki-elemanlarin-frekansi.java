public class Main {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 20, 10, 10, 20, 5, 20};

        System.out.println("Tekrar Sayilari:");

        for (int i = 0; i < numbers.length; i++) {
            boolean isDuplicate = false;

            for (int j = 0; j < i; j++) {
                if (numbers[i] == numbers[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                int count = 0;

                for (int j = 0; j < numbers.length; j++) {
                    if (numbers[i] == numbers[j]) {
                        count++;
                    }
                }

                System.out.println(numbers[i] + " sayisi " + count + " kere tekrar edildi.");
            }
        }
    }
}
