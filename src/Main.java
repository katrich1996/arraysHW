public class Main {
    static int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
            sum += arr[i];
        System.out.println("Monthly sum of money is " +sum+ " rubles." );
        int minValue = arr[0];
        int maxValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
            }
            else if (arr[i]>maxValue) {
                maxValue = arr[i];
            }
        }
        System.out.println("Minimum sum of spendings per day is " +minValue+ " rubles.");
        System.out.println("Maximum sum of spendings per day is " +maxValue+ " rubles.");
        int arrAvg = sum/30;
        System.out.println("Average sum of spendings per day is " +arrAvg+ " rubles.");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = 10; i >= 0 ; i--) {
            System.out.print(reverseFullName[i]);

        }
    }
}