public class MinMaxAvg {
    public static void main(String[] args) {

        int max;
        int min;
        int sum;
        double avg;
        int[] data = new int[10];

        fillingArray(data);
        max = data[0];
        min = data[0];
        sum = data[0];

        for (int i = 1; i < data.length; i++) {

            sum += data[i];
            max = findMax(max, data[i]);
            min = findMin(min, data[i]);
        }

        avg = (double) sum / data.length;

        System.out.println("Максимальное число = " + max);
        System.out.println("Минимальное число = " + min);
        System.out.println("Среднее значение = " + avg);

    }

    private static void fillingArray(int[] data) {

        for (int i = 0; i < data.length; i++) {

            data[i] = (int) (Math.random() * 100);
        }

    }

    private static int findMax(int first, int second) {

        return first > second ? first : second;
    }

    private static int findMin(int first, int second) {

        return first > second ? second : first;
    }

}