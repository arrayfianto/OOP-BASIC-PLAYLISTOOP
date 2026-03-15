import java.util.Scanner; // Import scanner untuk input nama lagu

class Member extends User {

    public void findSong(Lagu[] playlist, int lastIndex){
        Scanner sc = new Scanner(System.in); // Inisialisasi scanner
        System.out.print("Cari judul lagu: ");
        String keyword = sc.nextLine().toLowerCase();
        
        boolean found = false;
        for (int i = 0; i < lastIndex; i++) { // menjalankan looping for object lagu sampai index terakhir
            if (playlist[i].getJudul().toLowerCase().contains(keyword)) { // jika daftar lagu dengan index ke i mengandung kata keyword
                System.out.println("\n Lagu ditemukan:");
                playlist[i].tampilkanInfo(); // Run function tampilkanInfo dari class lagu
                found = true;
            }
        }
        if (!found) System.out.println("Lagu Tidak ditemukan!"); // jika found berisi false, maka print "Lagu tidak ditemukan"
    }
}