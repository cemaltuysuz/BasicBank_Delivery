package com.thic.lib;

public class ParaIslem implements ParaI{

    private Object o;

    public ParaIslem(Object o) {
        this.o = o;
    }

    @Override
    public boolean ParaCek(int miktar) {
        boolean isOkey = false;
        if (o instanceof BireyselMusteri){
            BireyselMusteri b = (BireyselMusteri) o;
            if(b.getHesapBakiyesi()-Double.parseDouble(String.valueOf(miktar))>0){
               b.setHesapBakiyesi( b.getHesapBakiyesi()-Double.parseDouble(String.valueOf(miktar)));;
               isOkey = true;
            }else isOkey = false;

        } else {
            KurumsalMusteri k = (KurumsalMusteri) o;
            if(k.getHesapBakiyesi()-Double.parseDouble(String.valueOf(miktar))>0){
                k.setHesapBakiyesi( k.getHesapBakiyesi()-Double.parseDouble(String.valueOf(miktar)));;
                isOkey = true;
            }else isOkey = false;
        }
        return isOkey;
    }

    @Override
    public void ParaYatır(int miktar) {
        if (o instanceof BireyselMusteri){
            BireyselMusteri b = (BireyselMusteri) o;
            b.setHesapBakiyesi(b.getHesapBakiyesi()+Double.parseDouble(String.valueOf(miktar)));
        } else {
            KurumsalMusteri k = (KurumsalMusteri) o;
            k.setHesapBakiyesi(k.getHesapBakiyesi()+Double.parseDouble(String.valueOf(miktar)));
        }
    }
}
