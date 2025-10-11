import java.util.*;

public class TestArray2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        ArrayService.acceptData(arr);
        ArrayService.displayData(arr);
        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Search a number");
            System.out.println("2. Find max");
            System.out.println("3. Find min");
            System.out.println("4. Add all numbers");
            System.out.println("5. Find all occurrences");
            System.out.println("6. Find nth maximum");
            System.out.println("7. Find nth minimum");
            System.out.println("8. Exit");
            System.out.print("Choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter number to search: ");
                    int num = sc.nextInt();
                    int pos = ArrayService.searchByValue(arr, num);
                    if (pos != -1) {
                        System.out.println(num + " found at position: " + pos);
                    } else {
                        System.out.println("Not found.");
                    }
                    break;
                case 2:
                    int max = ArrayService.findMax(arr);
                    System.out.println("Maximum number: " + max);
                    break;
                case 3:
                    int min = ArrayService.findMin(arr);
                    System.out.println("Minimum number: " + min);
                    break;
                case 4:
                    int sum = ArrayService.adddata(arr);
                    System.out.println("Sum of numbers: " + sum);
                    break;
                case 5:
                    System.out.print("Enter number to find all occurrences: ");
                    num = sc.nextInt();
                    int[] positions = ArrayService.findAllOccurences(arr, num);
                    if (positions != null) {
                        System.out.println("All positions:");
                        ArrayService.displayData(positions);
                    } else {
                        System.out.println("Not found.");
                    }
                    break;
                case 6:
                    System.out.print("Enter n: ");
                    int n = sc.nextInt();
                    int nthMax = ArrayService.findNthMax(arr, n);
                    if (nthMax != -1)
                        System.out.println(n + "th Maximum value: " + nthMax);
                    else
                        System.out.println("Invalid n.");
                    break;
                case 7:
                    System.out.print("Enter n: ");
                    n = sc.nextInt();
                    int nthMin = ArrayService.findNthMin(arr, n);
                    if (nthMin != -1)
                        System.out.println(n + "th Minimum value: " + nthMin);
                    else
                        System.out.println("Invalid n.");
                    break;
                case 8:
                    System.out.println("Thank you for visiting...");
                    break;
                default:
                    System.out.println("Wrong choice!");
            }
        } while (choice != 8);
    }

    // Static inner utility class
    static class ArrayService {

        public static void acceptData(int[] arr) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter " + arr.length + " elements:");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
        }

        public static void displayData(int[] arr) {
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        public static int searchByValue(int[] arr, int num) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == num)
                    return i;
            }
            return -1;
        }

        public static int findMax(int[] arr) {
            int max = arr[0];
            for (int num : arr) {
                if (num > max)
                    max = num;
            }
            return max;
        }

        public static int findMin(int[] arr) {
            int min = arr[0];
            for (int num : arr) {
                if (num < min)
                    min = num;
            }
            return min;
        }

        public static int adddata(int[] arr) {
            int sum = 0;
            for (int num : arr) {
                sum += num;
            }
            return sum;
        }

        public static int[] findAllOccurences(int[] arr, int num) {
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == num) {
                    list.add(i);
                }
            }

            if (list.isEmpty()) {
                return null;
            }

            int[] result = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                result[i] = list.get(i);
            }
            return result;
        }

        public static int findNthMax(int[] arr, int n) {
            Set<Integer> set = new TreeSet<>(Collections.reverseOrder());
            for (int num : arr) {
                set.add(num);
            }
            if (n > set.size()) return -1;

            Iterator<Integer> it = set.iterator();
            for (int i = 1; i < n; i++) {
                it.next();
            }
            return it.next();
        }

        public static int findNthMin(int[] arr, int n) {
            Set<Integer> set = new TreeSet<>();
            for (int num : arr) {
                set.add(num);
            }
            if (n > set.size()) return -1;

            Iterator<Integer> it = set.iterator();
            for (int i = 1; i < n; i++) {
                it.next();
            }
            return it.next();
        }
    }
}
