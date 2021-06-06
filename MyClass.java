package com.thic.lib;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyClass {

    public static void main (String[]args){

        List<Object> customers = new ArrayList<>();

        int inputNo;
        ParaI para = null;

        // List add variable

        // individual client
        customers.add(new BireyselMusteri(1,10,"ahmet","demir","apple","A mahallesi",100));
        customers.add(new BireyselMusteri(2,20,"akif","sıcak","samsung","B mahallesi",200));
        customers.add(new BireyselMusteri(3,30,"mehmet","kağıtçı","huawei","C mahallesi",300));

        // corporate client
        customers.add(new KurumsalMusteri(4,40,"asım","ışık","sony",500));
        customers.add(new KurumsalMusteri(5,50,"bedirhan","kalay","asus",600));
        customers.add(new KurumsalMusteri(6,60,"burak","alay","logitech",700));

        System.out.println("Müşterinin bankaya kayıtlı müşteri numarasını giriniz :");

        // Bu kısımda ben input noyu kendim verdim ama siz Scanner sınıfını kullanarak numarayı almanız daha mantıklı olacak
        inputNo = 2;

        for (Object o : customers){

            if (o instanceof BireyselMusteri){
                // Down Casting
                BireyselMusteri b = (BireyselMusteri) o;

                if (b.getMüşteriNo() == inputNo){
                    para = new ParaIslem(o);

                    System.out.println("Hesap BireyselMüşteri tipinde. Hesap Bilgileri :");
                    System.out.println("Tc no :"+b.getTcKimlikNo());
                    System.out.println("Adı-Soyadı:"+b.getAdi()+" "+b.getSoyadi());
                    System.out.println("Sirket Adi :"+b.getSirketAdi());
                    System.out.println("Adresi :"+b.getAdres());
                    System.out.println("Bakiye :"+String.valueOf(b.getHesapBakiyesi()));
                }
            }else {
                // Down Casting
                KurumsalMusteri k = (KurumsalMusteri) o;
                if (k.getMüşteriNo() == inputNo){
                    para = new ParaIslem(o);

                    System.out.println("Hesap Kurumsal müşteri tipinde. Hesap Bilgileri :");
                    System.out.println("Tc no :"+k.getTcKimlikNo());
                    System.out.println("Adı-Soyadı:"+k.getAdi()+" "+k.getSoyadi());
                    System.out.println("Sirket Adi :"+k.getSirketAdi());
                    System.out.println("Adresi :"+k.getHesapBakiyesi());
                    System.out.println("Bakiye :"+String.valueOf(k.getHesapBakiyesi()));
                }
            }
        }
        //Loop finished

        System.out.println("Para yatırmak için [1] , Para çekme için [2]");

        // Burada scanner sınıfı kullanılacak. Ben 1 giriyorum
        int yanıt = 2;

        if (yanıt ==1){
            System.out.println("Yatırmak istediğiniz tutar :");
            // Ben 200 giriyorum siz scanner sınıfını kullanın

            para.ParaYatır(200);
            System.out.println("Para Yatırıldı");
            }else {
            if (para.ParaCek(300)){
                System.out.println("Para cekme islemi tamalandı.");
            }else{
                System.out.println("Hata, hesapta yeterli bakiye yok!");
            }
             }
        }
    }
