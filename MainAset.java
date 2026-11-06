import java.util.ArrayList;

public class MainAset {
    public static void main(String[] args) {
        // 6. Membuat ArrayList<AsetDigital> berisi minimal 1 objek dari masing-masing subclass
        ArrayList<AsetDigital> asetList = new ArrayList<>();
        asetList.add(new Gambar("G001", "pemandangan.jpg", 4.5, "1920x1080"));
        asetList.add(new Video("V001", "tutorial_java.mp4", 150.0, 300));
        asetList.add(new Dokumen("D001", "laporan_pbo.pdf", 2.1, 25));
        asetList.add(new VideoPromosi("VP001", "teaser_promo.mp4", 45.0, 60));

        System.out.println("=== DAFTAR SEMUA ASET DIGITAL (Polimorfisme Abstract Class) ===");
        // 7. Iterasi dan panggil tampilkanPreview() menggunakan polimorfisme via abstract class
        for (AsetDigital aset : asetList) {
            aset.getInfo();
            aset.tampilkanPreview();

            // 8. Gunakan instanceof untuk mengecek objek yang mengimplementasi DapatDipromosikan
            if (aset instanceof DapatDipromosikan) {
                System.out.println("-> Aset ini mendukung fitur promosi!");
                DapatDipromosikan promo = (DapatDipromosikan) aset;
                promo.promosikan();
                promo.infoPromosi();
            }
            System.out.println("---------------------------------------------------");
        }

        // 9. Membuat ArrayList<DapatDipromosikan> terpisah dan menambahkan VideoPromosi ke dalamnya
        System.out.println("\n=== KELOMPOK ASET YANG DIPROMOSIKAN (Polimorfisme Interface) ===");
        ArrayList<DapatDipromosikan> listPromosi = new ArrayList<>();
        listPromosi.add(new VideoPromosi("VP002", "flash_sale.mp4", 30.0, 30));

        for (DapatDipromosikan dp : listPromosi) {
            dp.promosikan();
            dp.infoPromosi();
        }
    }
}