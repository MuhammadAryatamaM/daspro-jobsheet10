import java.util.Scanner;
public class BioskopWithScanner15Modif5 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int baris, kolom, menu;
        String nama, next;

        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan data penonton");
            System.out.println("3. Exit");
            System.out.print("Apa yang ingin Anda lakukan? : ");
            menu = sc.nextInt();
            sc.nextLine();

            if (menu == 1) {
                while (true) {
                    System.out.print("Masukkan nama: ");
                    nama = sc.nextLine();
                    System.out.print("Masukkan baris (1-4): ");
                    baris = sc.nextInt();
                    if (baris > 4) {
                        System.out.println("Baris tidak valid, silakan input ulang");
                        continue;
                    }
                    System.out.print("Masukkan kolom (1-2): ");
                    kolom = sc.nextInt();
                    if (kolom > 2) {
                        System.out.println("Kolom tidak valid, silakan input ulang");
                        continue;
                    }
                    sc.nextLine();

                    if (penonton[baris-1][kolom-1] == null) {
                        penonton[baris-1][kolom-1] = nama;
                    } else {
                        System.out.println("Kursi telah diisi, mohon pilih kursi yang lain");
                        continue;
                    }
                
                    System.out.print("Input penonton lainnya? (y/n): ");
                    next = sc.nextLine();
                
                    if (next.equalsIgnoreCase("n")) {
                        break;
                    }
                }
                continue;
            } else if (menu == 2) {
                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[0].length; j++) {
                        if (penonton[i][j] == null) {
                            System.out.println("Penonton baris " + i + " kolom " + j + " adalah ***");
                        } else {
                            System.out.println("Penonton baris " + i + " kolom " + j + " adalah " + penonton[i][j]);
                        }
                    }
                }
                continue;
            } else if (menu == 3) {
                System.out.println("Program dihentikan");
                break;
            } else {
                System.out.println("Input salah, mohon input ulang");
                continue;
            }
        }
    }
}