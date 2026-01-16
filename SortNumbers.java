public class SortNumbers {
    public static void main(String[] args) {
        int[] numbers = {45, 12, 89, 23, 67, 10, 5, 90, 34, 56};

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        System.out.println("Numbers in ascending order:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
