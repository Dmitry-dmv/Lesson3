package chernyh.company;


import java.util.Arrays;
import java.util.Scanner;

public class Main {


    public static void first(String[] args) {
        int[] mas = new int[3];
        mas[0] = 5;
        mas[1] = 17;
        mas[2] = 350;

        for (int i = 0; i < mas.length; i++) {

        }
        System.out.println(Arrays.toString(mas));

        boolean flag = true;
        for (int i = 1; i < mas.length; i++) {
            if (mas[i] <= mas[i - 1]) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("Ok");
        } else {
            System.out.println("Please, try again");
        }
    }

    public static int[] second(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int size = input.nextInt();
        int array[] = new int[size];
        System.out.println("Insert array elements:");

        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        System.out.print("Inserted array elements:");
        for (int i = 0; i < size; i++) {

            System.out.print(" " + array[i]);
        }
            public static void third (String[]args)
            int[] array_nums = {20, 30, 40};
            System.out.println("Original Array: " + Arrays.toString(array_nums));
            int x = array_nums[0];
            array_nums[0] = array_nums[array_nums.length - 1];
            array_nums[array_nums.length - 1] = x;
            System.out.println("New array after swaping the first and last elements: " + Arrays.toString(array_nums));
        }
        public static void fourth (String[]args)
        int n0 = 1;
        int n1 = 1;
        int n2;
        System.out.print(n0 + " " + n1 + " ");
        for (int i = 3; i <= 11; i++) {
            n2 = n0 + n1;
            System.out.print(n2 + " ");
            n0 = n1;
            n1 = n2;
        }
        System.out.println();


        private void SortUnsorted(int[] a, int lo, int hi) {

            if (hi <= lo)
                return;
            int mid = lo + (hi - lo) / 2;
            SortUnsorted(a, lo, mid);
            SortUnsorted(a, mid + 1, hi);

            int[] buf = Arrays.copyOf(a, a.length);

            for (int k = lo; k <= hi; k++)
                buf[k] = a[k];

            int i = lo, j = mid + 1;
            for (int k = lo; k <= hi; k++) {

                if (i > mid) {
                    a[k] = buf[j];
                    j++;
                } else if (j > hi) {
                    a[k] = buf[i];
                    i++;
                } else if (buf[j] < buf[i]) {
                    a[k] = buf[j];
                    j++;
                } else {
                    a[k] = buf[i];
                    i++;
            }
        }
    }
}





        // write your code here





