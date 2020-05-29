import java.util.Arrays;
import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        // System.out.println("Hello World!");
        // System.out.println("Halo Dunia!");

        // PRIMITIVE DATA TYPES
        // umur -> byte
        byte umur = 45;

        // short
        short iniShort = 128;

        // int
        int iniInt = 1_142_342;
        // gaboleh decimal

        // long
        long iniLong = 1231423432;

        // float
        float iniFloat = 147.32F;

        // double
        double iniDouble = 142.32D;

        // string
        String nama = "Seto";

        // char
        char grade = 'B';

        boolean isVerified = true;

        // REFERENCE DATA TYPES
        int people[] = new int[5];

        // int people[] = { 3, 6, 8, 7, 2 };

        people[4] = 1;

        // System.out.println(Arrays.toString(people));

        // for (int i = 0; i < people.length; i++) {
        // people[i] = i * 3;
        // }

        int matrix[][] = new int[4][3];

        matrix[0][1] = 17;
        matrix[1][0] = 7;

        // System.out.println(Arrays.deepToString(matrix));

        // CONSTANT VARIABLE
        final float PI = 3.14F;

        Scanner scanner = new Scanner(System.in);
        byte inputAge = scanner.nextByte();
        // System.out.println("Age: " + inputAge);

        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Input nama anda: "); // output
        // String inputName = scanner.nextLine(); // input
        // System.out.println("Nama anda adalah: " + inputName); // output

        System.out.println(
                "Nama anda adalah <NAMA>, berumur <UMUR> tahun, tinggal di <TEMPAT_TINGGAL>, lahir tahun <TAHUN_LAHIR>");
    }
}