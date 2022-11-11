public class OrangBeraksi {
    public static void main(String[] args) {
        Orang anton = new Orang();

        anton.setNama("Anton");
        anton.setJenisKelamin("Laki-laki");
        anton.setUmur(23);

        System.out.println("Nama: " + anton.getNama());
        System.out.println("Jenis Kelamin: " + anton.getJenisKelamin());
        System.out.println("Umur: " + anton.getUmur());

        Orang riko = new Orang();

        riko.setNama("Riko");
        riko.setJenisKelamin("Laki-laki");
        riko.setUmur(20);

        System.out.println("Nama: " + riko.getNama());
        System.out.println("Jenis Kelamin: " + riko.getJenisKelamin());
        System.out.println("Umur: " + riko.getUmur());
    }
}