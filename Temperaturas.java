import java.util.Scanner;
import java.util.Vector;

public class Temperaturas {
    public static void main(String []args){
    Vector<Float> tempe = new Vector<Float>(5,1);
    Scanner lector=new Scanner(System.in);
    byte mayor=0,menor=0;
    float media=0,sumatempe=0;
        for(byte cont=0;cont<5;cont++){
            System.out.println("introduzca la temperatura en celcius numero "+cont);
            tempe.add(lector.nextFloat());
            sumatempe=sumatempe+tempe.get(cont);
        }
        for(int cont=0;cont<tempe.size();cont++){
            if(tempe.get(cont)>=30){
                mayor++;
            }
            else
                menor++; 
        }
        media=sumatempe/tempe.size();
        System.out.println("en total hay "+mayor+" temperaturas mayores a 30 y "+menor+" temperaturas menores a 30, la media de temperaturas es de "+media);
    }
}
