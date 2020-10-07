public class MainTugas {

    public static void main(String[] args) {
        
        Dosen dos = new Dosen();
        dos.setNama("ARHAM");
        dos.setSKS(12);
        
        Pegawai pega = new Pegawai();
        pega.setNama("IZZA");
        
        DaftarGaji daftar_gaji = new DaftarGaji(3);
        daftar_gaji.addPegawai(dos);
        daftar_gaji.addPegawai(pega);
        daftar_gaji.printSemuaGaji();
    }     
    
}
