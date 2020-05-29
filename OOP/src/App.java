package OOP.src;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static Scanner scanner = new Scanner(System.in);
    public static ArrayList<Buah> listBuah = new ArrayList<Buah>();

    public static void main(String[] args) throws Exception {
        while (true) {
            System.out.println("========== MAIN MENU ==========");
            System.out.println("1. Tambah buah");
            System.out.println("2. List buah");
            System.out.println("3. Exit");
            String mainMenuOption = scanner.next();

            if (mainMenuOption.equals("1")) {
                Menu.tambahBuah();
            } else if (mainMenuOption.equals("2")) {
                Menu.tampilListBuah();
            } else {
                break;
            }
        }
    }

}