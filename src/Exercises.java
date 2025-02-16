import java.util.*;

public class Exercises {
    public static int sumInt(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum = sum + i;
        }
        return sum;
    }
    public static int factorialInt(int n) {
        int ret = 1;
        for (int i = 1; i <= n; i++) {
            ret = ret * i;
        }
        return ret;
    }
    public static int nthPower(int number, int power) {
        int ret = number;
        for (int i = 1; i < power; i++) {
            ret = ret * number;
        }
        return ret;
    }
    public static int sumElements(ArrayList<Integer> list) {
        int ret = 0;
        for (int i : list) {
            ret += i;
        }
        return ret;
    }

    public static float arithmeticMean(ArrayList<Integer> list) {
        int count = 0;
        float ret = 0;
        
        for (int i : list) {
            count+= 1;
            ret += i;
        }

        ret = ret / count;

        return ret;
    }

    public static double standardDeviation(ArrayList<Double> list) {
        int size = list.size();
        double sum = 0.0;

        for (double i : list) {
            sum += i;
        }
        double mean = sum/size;

        double sqrdiffsum = 0.0;

        for (double i : list) {
            sqrdiffsum += Math.pow(i - mean, 2);
        }
        double variance = sqrdiffsum/size;

        return Math.sqrt(variance);
    }

    public static int sumEven(int n) {
        int ret = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                ret += i;
            }
        }
        return ret;
    }

    public static int sumEvenList(ArrayList<Integer> list) {
        int ret = 0; 
        for (int i : list) {
            if (i % 2 == 0) {
                ret += i;
            }
        }
        return ret;
    }

    public static ArrayList<Integer> getEvenList(ArrayList<Integer> list) {
        ArrayList<Integer> ret = new ArrayList<>();

        for (int i : list) {
            if (i % 2 == 0) {
                ret.add(i);
            }
        }

        return ret;
    }
    
    public static ArrayList<Integer> evenList(int n) {
        ArrayList<Integer> ret = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0 && i >= 2) {
                ret.add(i);
            }
        }
        
        return ret;
    }

    public static int dotProduct(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        if (list1.size() == list2.size()) {
            int ret = 0;
            for (int i = 0; i < list1.size(); i++) {
                int mult = list1.get(i) * list2.get(i);
                ret += mult;
            }
            return ret;
        }
        return 0;
    }

    public static void main(String[] args) {

        System.out.println("The sum 0 + 1 + 2 + ... + n of 9: " + sumInt(9));
        System.out.println("Factorial of 9: " + factorialInt(9));
        System.out.println("The 5-th power of 9: " + nthPower(9, 5));

        ArrayList<Integer> list0 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
       
        System.out.println("The sum of the elements in a list of numbers. [1,2,3,4,5]: " + sumElements(list0));

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
       
        System.out.println("The arithmetic mean of a list of numbers [1,2,3,4,5]: " + arithmeticMean(list));

        ArrayList<Double> list2 = new ArrayList<>(Arrays.asList(1.0,2.0,3.0,4.0,5.0));
       
        System.out.println("The standard deviation of a list of numbers. [1,2,3,4,5]: " + standardDeviation(list2));

        System.out.println("The even sum of numbers up until 8: " + sumEven(8));

        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        System.out.println("The even sum of numbers in a list of numbers. [1,2,3,4,5]: " + sumEvenList(list3));

        ArrayList<Integer> list4 = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        System.out.println("Getting a even list from a list of numbers. [1,2,3,4,5]: " + getEvenList(list4));

        System.out.println("Getting an even list from the numbers up to 8: " + evenList(8));

        ArrayList<Integer> list5 = new ArrayList<>(Arrays.asList(5,4,3,2,1));
        ArrayList<Integer> list6 = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        System.out.println("Getting the dot product of two lists. List 1 [5,4,3,2,1] and List 2 [1,2,3,4,5]: " + dotProduct(list5, list6));

    }

}
