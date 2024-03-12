package es1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Inserire il numero di parole che vuoi inserire nella lista di parole");
        Set<String> set = new HashSet<>();
        List<String> ripetute =new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int j=1;
        while (n >0 ) {
            n--;

            System.out.println("Inserire la parola " + j + " della lista di parole");
            scanner = new Scanner(System.in);
            String word = scanner.next();
            if (set.contains(word)) {
                System.out.println("La parola " + word + " è già presente nella lista di parole");
                ripetute.add(word);
            } else {
                System.out.println("La parola " + word + " è stata aggiunta con successo alla lista di parole");
            }
            set.add(word);
            System.out.println("Lista set di parole");
            for (String s : set) {

                System.out.println(s);
            }
            System.out.println("Le parole distinte sono :"+set.size());

            j++;
            System.out.println("Lista parole ripetute");
           for (String s : ripetute) {

               System.out.println("Parola ripetuta: "+s);
           }
        }
    }
}