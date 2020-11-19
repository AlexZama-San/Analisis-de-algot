import java.util.Scanner;

public class Tomates {
    public static void main(String []args){
        Scanner lector=new Scanner(System.in);
        Metodos xD=new Metodos();
        System.out.println("introduzca la produccion total de tomates en Mexico");
        int mt=lector.nextInt();
        System.out.println("introduzca la produccion total de tomates en USA");
        int ust=lector.nextInt();
        System.out.println("introduzca la produccion total de tomates en Canada");
        int ct=lector.nextInt();
        float sumtot=mt+ust+ct;
        float porceM= xD.RegladeTres(sumtot, mt);
        float porceUS= xD.RegladeTres(sumtot, ust);
        float porceC= xD.RegladeTres(sumtot, ct);
        System.out.println("el total de tomates es de "+sumtot+" del cual Mexico tiene el "+porceM+"%, USA tiene el "+porceUS+"% y Canada tiene el "+porceC+"%");
    }
}
