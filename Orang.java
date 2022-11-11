public class Orang {
    private String nama, jenisKelamin;
    private int umur;

    public void setNama (String nama) {
        this.nama = nama;
    }
    public void setJenisKelamin (String jenis) {
        this.jenisKelamin = jenis; 
    }
    public void setUmur (int umur) {
        this.umur = umur;
    }

    public String getNama (){
        return this.nama;
    }
    public String getJenisKelamin (){
        return this.jenisKelamin;
    }
    public int getUmur (){
        return this.umur;
    }
}