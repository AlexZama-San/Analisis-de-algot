
public class EcuacionyCoeficiente {

    public static void EcuacionLineal(){
        Metodos xD = new Metodos();
        //obtencion de vectores
    int[] x={100,90,80,45,50,50,60,40,25,20};
    int[] xc={100,90,80,45,50,50,60,40,25,20};
    int[] xcc={100,90,80,45,50,50,60,40,25,20};
    int[] y={3,5,9,10,20,21,24,24,27,35};
    int[] x2=xD.Recorreyeleva(xc);
    int[] xy=xD.Recorreymultiplica( xcc, y);

    //Procedimiento de ecuacion (sumas y formulas)
    int sumax=xD.Recorreysuma(x);
    int sumay=xD.Recorreysuma(y);
    int sumax2=xD.Recorreysuma(x2);
    int sumaxy=xD.Recorreysuma(xy);
    //sumas de formula a
    float suma1=xy.length*(sumaxy);
    float suma2=sumax*sumay;
    float suma3=x2.length*(sumax2);
    float suma4=(sumax)*sumax;
    float a=(suma1-suma2)/(suma3-suma4);
    //sumas de formula b
    float suma5=a*sumax;
    float b=sumay-suma5;
    b=b/x.length;
    System.out.println("y="+a+"x+"+b);
    
    }
    public static void CoeficienteLineal(){

    }
}
