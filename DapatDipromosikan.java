public interface DapatDipromosikan {
    void promosikan();

    // Default method (Java 8+)
    default void infoPromosi() {
        System.out.println("[STATUS] Aset digital ini sedang dalam program promosi khusus!");
    }
}