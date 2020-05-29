import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input nama anda: ");
        String inputName = scanner.nextLine();
        System.out.print("umur anda: ");
        String inputUmur = scanner.nextLine();
        System.out.print("tempat tinggal anda: ");
        String inputTempat = scanner.nextLine();
        System.out.print("Tahun kelahiran anda: ");
        String inputTahun = scanner.nextLine();
        System.out.println("Nama anda adalah " + inputName + ", berumur " + inputUmur + " tahun, tinggal di "
                + inputTempat + ", lahir tahun " + inputTahun);
    }
}