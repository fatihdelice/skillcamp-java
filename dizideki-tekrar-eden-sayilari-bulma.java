public class Main {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 2, 10, 4, 12, 6, 6};

        System.out.println("Tekrar Eden Cift Sayilar:");

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
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

                    if (count > 1) {
                        System.out.println(numbers[i]);
                    }
                }
            }
        }
    }
}
