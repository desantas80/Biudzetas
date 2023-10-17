package Biudzetas2version;

public class PajamuIrasas {
    private double suma;
    private String kategorijosIndeksas;
    private String dataSuLaiku;
    private boolean gautaIBankoSaskaita;
    private String papildomaInformacija;

    public PajamuIrasas(double suma, String kategorijosIndeksas, String dataSuLaiku, boolean gautaIBankoSaskaita, String papildomaInformacija) {
        this.suma = suma;
        this.kategorijosIndeksas = kategorijosIndeksas;
        this.dataSuLaiku = dataSuLaiku;
        this.gautaIBankoSaskaita = gautaIBankoSaskaita;
        this.papildomaInformacija = papildomaInformacija;
    }

    public double getSuma() {
        return suma;
    }

    public void setSuma(double suma) {
        this.suma = suma;
    }

    public String getKategorijosIndeksas() {
        return kategorijosIndeksas;
    }

    public void setKategorijosIndeksas(String kategorijosIndeksas) {
        this.kategorijosIndeksas = kategorijosIndeksas;
    }

    public String getDataSuLaiku() {
        return dataSuLaiku;
    }

    public void setDataSuLaiku(String dataSuLaiku) {
        this.dataSuLaiku = dataSuLaiku;
    }

    public boolean isGautaIBankoSaskaita() {
        return gautaIBankoSaskaita;
    }

    public void setGautaIBankoSaskaita(boolean gautaIBankoSaskaita) {
        this.gautaIBankoSaskaita = gautaIBankoSaskaita;
    }

    public String getPapildomaInformacija() {
        return papildomaInformacija;
    }

    public void setPapildomaInformacija(String papildomaInformacija) {
        this.papildomaInformacija = papildomaInformacija;
    }
}
