
public class EcuacionyCoeficiente {

    public static void main(String []args){
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
    int suma1=xy.length*(sumaxy);
    int suma2=sumax*sumay;
    int suma3=x2.length*(sumax2);
    int suma4=(sumax)*sumax;
    float ecua1=suma1-suma2;
    float ecua2=suma3-suma4;
    float a=ecua1/ecua2;
    float suma5=a*sumax;
    float b=sumay-suma5;
    b=b/x.length;
    System.out.println("y="+a+"x+"+b);
    
    }
}
