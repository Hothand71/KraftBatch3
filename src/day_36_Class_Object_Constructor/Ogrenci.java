package day_36_Class_Object_Constructor;

public class Ogrenci {
    String tc;
    int okulNo;
    String ad;
    String soyad;
    int bolumNo;
    int fakulteNo;
    int yilSonuNotu;

    public boolean sinifiGectiMi(){
        if (yilSonuNotu<65){
            return false;
        }else return true;
    }
    public int getOgrenciYili(){
        return 2000+Integer.parseInt(String.valueOf(okulNo).substring(0,2));
    }
    public Ogrenci(String ad,String soyad,String tc){

        this.ad=ad;
        this.soyad=soyad;
        this.tc=tc;

    }
    public Ogrenci(){

    }

}
