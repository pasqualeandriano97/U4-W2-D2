package es3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Map<String, Integer> phoneRegister  = new HashMap<>();
    private static int sc;

    public static void main(String[] args) {
//    addPhoneNumber("Mario", 123456789);
//    addPhoneNumber("Luigi", 987654321);
//    addPhoneNumber("Marco", 123456789);
//    addPhoneNumber("Maria", 123456789);
        stop:
        while (true) {
            System.out.println("Scegliere una delle seguenti opzioni: ");
            System.out.println("0 - Aggiungi un contatto");
            System.out.println("1 - Cerca un contatto per nome");
            System.out.println("2 - Cerca un contatto per numero");
            System.out.println("3 - Exit");
            sc = new Scanner(System.in).nextInt();

            switch (sc) {
                case 0:
                    System.out.println("Inserire il nome del contatto che si vuole salvare ");
                    Scanner scanner = new Scanner(System.in);
                    String name = scanner.next();
                    System.out.println("Comporre il numero di telefono");
                    int number = scanner.nextInt();
                    System.out.println("Rubrica corrente: "+addPhoneNumber(name, number));
                    break;
                case 1:
                    System.out.println("Inserire il nome del contatto che si vuole cercare ");
                    scanner = new Scanner(System.in);
                    String nameSearch = scanner.next();
                    System.out.println("Rubrica corrente: "+ searchByName(nameSearch));

                    break;
                case 2:
                    System.out.println("Inserire il numero di telefono che si vuole cercare ");
                    scanner = new Scanner(System.in);
                    int numberSearch = scanner.nextInt();
                    System.out.println("Rubrica corrente: "+searchByNumber(numberSearch));

                    break;
                case 3:
                    break stop;
            }
        }
    }
    public static Map<String, Integer> addPhoneNumber(String name, int number) {

    if (phoneRegister.containsKey(name)) {
        System.out.println("Il numero di telefono è già presente");
    } else {System.out.println("Numero di telefono inserito correttamente");
        phoneRegister.put(name, number);
    }

    return phoneRegister;
    }
    public static Map<String, Integer> searchByName(String name) {
        if (phoneRegister.containsKey(name)) {        System.out.println("Il numero di telefono è " + phoneRegister.get(name));
    } else

    {
        System.out.println("Il numero di telefono non è presente");
    }
        return phoneRegister;

    }
    public static Map<String, Integer> searchByNumber(int number) {
        if (phoneRegister.containsValue(number)) {
            for (Map.Entry<String, Integer> entry : phoneRegister.entrySet()) {
                if (entry.getValue().equals(number)) {
                    String key=entry.getKey();
                    System.out.println("Il nome del contatto è " + key);

                break;
            }
            }


    } else

    {
        System.out.println("Il numero di telefono non è presente");
    }
        return phoneRegister;
    }
}
