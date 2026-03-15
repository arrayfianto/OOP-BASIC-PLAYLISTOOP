import java.util.Scanner;

public class PlaylistOOP {
  public static void tekanEnter(Scanner input) {
    System.out.println("\nTekan ENTER untuk kembali ke menu...");
    input.nextLine();
    input.nextLine();
    System.out.println("Kembali...");
    delay(800);
  }

  public static void delay(int time) {
    try {
      Thread.sleep(time);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  public static void run() {

    Scanner input = new Scanner(System.in);
    int pilihanUtama;

    do {
      System.out.println("===== Sistem Playlist Musik =====");
      System.out.println("1. Login sebagai Admin");
      System.out.println("2. Login sebagai Member");
      System.out.println("3. Exit");
      System.out.print("Pilih menu: ");

      pilihanUtama = input.nextInt();

      switch (pilihanUtama) {

        case 1:
          int menuAdmin;
          do {
            System.out.println("=== Akses Admin ===");
            System.out.println("1. Lihat Semua Lagu");
            System.out.println("2. Tambah Lagu");
            System.out.println("3. Back");
            System.out.print("Pilih menu: ");

            menuAdmin = input.nextInt();

            switch (menuAdmin) {
              case 1:
                System.out.println("== Daftar Semua Lagu ==");
                // viewAllSong();
                tekanEnter(input);
                break;

              case 2:
                System.out.println("== Tambah Lagu ==");
                // addSong();
                tekanEnter(input);
                break;

              case 3:
                System.out.println("Kembali ke menu utama...");
                delay(1500);
                break;

              default:
                System.out.println("Pilihan tidak valid!");
                delay(1500);
            }

          } while (menuAdmin != 3);
          break;

        case 2:
          int menuMember;
          do {
            System.out.println("== Akses Member ==");
            System.out.println("1. Lihat Semua Lagu");
            System.out.println("2. Cari Lagu");
            System.out.println("3. Back");
            System.out.print("Pilih menu: ");

            menuMember = input.nextInt();

            switch (menuMember) {
              case 1:
                System.out.println("== Daftar Semua Lagu ==");
                // viewAllSong();
                tekanEnter(input);
                break;

              case 2:
                System.out.println("== Cari Lagu ==");
                // findSong();
                tekanEnter(input);
                break;

              case 3:
                System.out.println("Kembali ke menu utama...");
                delay(1500);
                break;

              default:
                System.out.println("Pilihan tidak valid!");
                delay(1500);
            }

          } while (menuMember != 3);
          break;

        case 3:
          System.out.println("Program selesai.");
          break;

        default:
          System.out.println("Pilihan tidak valid!");
          delay(1500);
      }

      System.out.println();

    } while (pilihanUtama != 3);

    input.close();
  }
}