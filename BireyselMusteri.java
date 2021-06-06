package com.thic.lib;

public class BireyselMusteri {

    // Define Variable
    private int müşteriNo;
    private int tcKimlikNo;
    private String adi;
    private String soyadi;
    private String sirketAdi;
    private String adres;
    private double hesapBakiyesi;

    // Constructor and Shadowing
    public BireyselMusteri(int müşteriNo,int tcKimlikNo, String adi, String soyadi, String sirketAdi, String adres,double hesapBakiyesi) {
        this.müşteriNo = müşteriNo;
        this.tcKimlikNo = tcKimlikNo;
        this.adi = adi;
        this.soyadi = soyadi;
        this.sirketAdi = sirketAdi;
        this.adres = adres;
        this.hesapBakiyesi = hesapBakiyesi;
    }

    // Getter and Setters
    public int getTcKimlikNo() {
        return tcKimlikNo;
    }

    public void setTcKimlikNo(int tcKimlikNo) {
        this.tcKimlikNo = tcKimlikNo;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    public String getSirketAdi() {
        return sirketAdi;
    }

    public void setSirketAdi(String sirketAdi) {
        this.sirketAdi = sirketAdi;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public int getMüşteriNo() {
        return müşteriNo;
    }

    public void setMüşteriNo(int müşteriNo) {
        this.müşteriNo = müşteriNo;
    }

    public double getHesapBakiyesi() {
        return hesapBakiyesi;
    }

    public void setHesapBakiyesi(double hesapBakiyesi) {
        this.hesapBakiyesi = hesapBakiyesi;
    }
}
