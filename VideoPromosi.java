public class VideoPromosi extends Video implements DapatDipromosikan {

    public VideoPromosi(String id, String namaFile, double ukuranMB, int durasiDetik) {
        super(id, namaFile, ukuranMB, durasiDetik);
    }

    @Override
    public void promosikan() {
        System.out.println("Aksi: Video Promosi '" + namaFile + "' disiarkan ke beranda utama pengguna!");
    }
}