package es2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     System.out.println("Inserire il numero interi random da generare");
     int n = scanner.nextInt();
     ;
        System.out.println("Array di "+n+" numeri casuali da 1 a 100");
        System.out.println(getNumbers(n));
        System.out.println("Nuovo Array crato dal'array precedente + l'array precedente in ordine decrescente");
        System.out.println(printNumbers(getNumbers(n)));
        System.out.println("Scegliere true per stampare gli elementi con indice pari o false per stampare gli elementi con indice dispari");
        boolean sc = scanner.nextBoolean();

        printNumbers(sc,getNumbers(n));

    }
    public static ArrayList<Integer> getNumbers(int n) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        while (n > 0) {
           Random random = new Random();
           numbers.add(random.nextInt(1,100));
           n--;
        }

        Collections.sort(numbers);

        return numbers;
    }
//    public static ArrayList<ArrayList<Integer>> printNumbers(ArrayList<Integer> numbers) {
//    ArrayList<ArrayList<Integer>> result = new ArrayList<>();
//    result.add(numbers);
//        ArrayList<Integer> descending = new ArrayList<>(numbers);
//        Collections.sort(descending,Collections.reverseOrder());
//    result.add(descending);
//    return result;
//   }
   public static void printNumbers(boolean sc, ArrayList<Integer> numbers) {
        if (sc) {
            System.out.println("Lista di numeri con indice pari");
            for (int i = 0; i < numbers.size(); i++) {
                if (i % 2 == 0) {
                    System.out.println(numbers.get(i));
                }else{continue;}
            }

        } else{
            System.out.println("Lista di numeri con indice dispari");
            for (int i = 0; i < numbers.size(); i++) {
                if (i % 2 != 0) {
                    System.out.println(numbers.get(i));
                }else{continue;}
            }

        }

   }

   public static ArrayList<Integer> printNumbers(ArrayList<Integer> numbers) {
        ArrayList<Integer> total= new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            total.add(numbers.get(i));
        }
        for (int i = numbers.size(); i >0; i--) {
            total.add(numbers.get(i-1));
        }

        return total;

   }
}
