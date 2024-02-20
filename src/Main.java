import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
                Scanner input= new Scanner (System.in);
                        System.out.println("Tutar Giriniz : ");
                double tutar=input.nextDouble();
//0 ile 1000 arasındaki tutar için
                if (tutar>0 && tutar<1000) {
                    double kdv1 = tutar * 0.18;
                    System.out.println("Kdv1: " + kdv1);
                    System.out.println("Toplam Tutar: " + (kdv1 + tutar));
//1000 ve yukarısında girilen tutarlar için
                }
                else if (tutar>=1000){
                        double kdv2= tutar*0.08;
                        System.out.println("Kdv2: " + kdv2);
                        System.out.println("Toplam Tutar: " + (kdv2+tutar));
                    }
                }
    }
