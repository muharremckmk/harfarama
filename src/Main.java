import java.util.*;
public class Main {
    public static void main (String[]args){
    Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen cümlenizi giriniz");
        String cumle="qwew";
        System.out.println("lütfen aramak istediğniz harfi girin");
    String harf="w";
    int harfsayisi=0;
    for(int i=0;i<cumle.length();i++){
        if ((cumle.charAt(i))==(harf.charAt(0))){
        harfsayisi++;
        }
    }
        System.out.println("aradığınız harf girdiğiniz cümlede geçme sayısı : "+harfsayisi);
}}