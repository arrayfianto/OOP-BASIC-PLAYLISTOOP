import java.util.Scanner; // import scanner untuk terima inputan

class Admin {

    public void addSong(Lagu[] songList, int lastIndex) {
        // START INPUT Judul Lagu, Nama Artis & Durasi Lagu (Detik)
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Judul Lagu: ");
        String judulLagu = input.nextLine();

        System.out.print("Masukkan Nama Artis: ");
        String namaArtis = input.nextLine();

        System.out.print("Masukkan Durasi Lagu: ");
        Double durasiLagu = input.nextDouble();
        // END INPUT Judul Lagu, Nama Artis & Durasi Lagu (Detik)

        // Menambahkan data lagu ke object songlist dengan index lastIndex
        songList[lastIndex] = new Lagu(judulLagu, namaArtis, durasiLagu);
        System.out.println("Lagu berhasil ditambahkan");
    }
}
