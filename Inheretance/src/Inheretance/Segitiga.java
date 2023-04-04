package Inheretance;

public class Segitiga extends BangunDatar {

    float alas;
    float tinggi;
    float miring;

    @Override
    float luas(){
        float luas = 1/2 * (alas * tinggi);
        System.out.println("Luas Segitiga: " + luas);
        return luas;
    }

    @Override
    float keliling(){
        float keliling = alas + tinggi + miring;
        System.out.println("Keliling Segitiga: " + keliling);
        return keliling;
    
    }
}
