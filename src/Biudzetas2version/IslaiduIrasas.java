package Biudzetas2version;

import java.util.Date;

public class IslaiduIrasas {
    private double suma;
    private String kategorijosIndeksas;
    private Date dataSuLaiku;
    private String atsiskaitymoBudas;
    private String bankoKortele;
    private String papildomaInformacija;

    public IslaiduIrasas(
            double suma,
            String kategorijosIndeksas,
            Date dataSuLaiku,
            String atsiskaitymoBudas,
            String bankoKortele,
            String papildomaInformacija) {
        this.suma = suma;
        this.kategorijosIndeksas = kategorijosIndeksas;
        this.dataSuLaiku = dataSuLaiku;
        this.atsiskaitymoBudas = atsiskaitymoBudas;
        this.bankoKortele = bankoKortele;
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

    public Date getDataSuLaiku() {
        return dataSuLaiku;
    }

    public void setDataSuLaiku(Date dataSuLaiku) {
        this.dataSuLaiku = dataSuLaiku;
    }

    public String getAtsiskaitymoBudas() {
        return atsiskaitymoBudas;
    }

    public void setAtsiskaitymoBudas(String atsiskaitymoBudas) {
        this.atsiskaitymoBudas = atsiskaitymoBudas;
    }

    public String getBankoKortele() {
        return bankoKortele;
    }

    public void setBankoKortele(String bankoKortele) {
        this.bankoKortele = bankoKortele;
    }

    public String getPapildomaInformacija() {
        return papildomaInformacija;
    }

    public void setPapildomaInformacija(String papildomaInformacija) {
        this.papildomaInformacija = papildomaInformacija;
    }
}
