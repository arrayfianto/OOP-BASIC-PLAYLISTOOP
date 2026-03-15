public class Lagu {

    // atribut private (enkapsulasi)
    private String judul;
    private String artis;
    private double durasi;

    // constructor
    public Lagu(String judul, String artis, double durasi) {
        this.judul      = judul;
        this.artis      = artis;
        setDurasi(durasi); // pakai setter agar validasi berjalan
    }

    // getter dan setter

    public String getJudul() { return judul; }
    public void   setJudul(String judul) {
        if (judul == null || judul.isBlank())
            throw new IllegalArgumentException("silahkan isi judul lagu");
        this.judul = judul;
    }

    public String getArtis() { return artis; }
    public void   setArtis(String artis) {
        if (artis == null || artis.isBlank())
            throw new IllegalArgumentException("Silahkan isi nama artis");
        this.artis = artis;
    }

    public double getDurasi() { return durasi; }
    public void   setDurasi(double durasi) {
        if (durasi <= 0)
            throw new IllegalArgumentException("minimal durasi 1");
        this.durasi = durasi;
    }
    // Method tampilkanInfo()
    public void tampilkanInfo() {
        int menit  = (int) durasi;
        int detik  = (int) Math.round((durasi - menit) * 60);

        System.out.println("INFORMASI LAGU");
        System.out.printf ("Judul       : %-15s%n", judul);
        System.out.printf ("Artis       : %-15s%n", artis);
        System.out.printf ("Durasi      : %02d:%02d%n", menit, detik);
    }
     public static void main(String[] args) {
        Lagu lagu1 = new Lagu("Kota Ini Tak Sama Tanpa Mu", "Nadhif Basalamah",4.33);
        lagu1.tampilkanInfo();

        System.out.println();

        // setter
        lagu1.setJudul("Alamak");
        lagu1.setArtis("Rizky Febian");
        lagu1.setDurasi(4.19);
        lagu1.tampilkanInfo();
    }
