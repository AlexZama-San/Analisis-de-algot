import java.util.Vector;

public class EcuacionyCoeficiente {

    public static void EcuacionLineal(){
        Metodos xD = new Metodos();
        //obtencion de vectores
    float[] x={100,90,80,45,50,50,60,40,25,20};
    float[] xc={100,90,80,45,50,50,60,40,25,20};
    float[] xcc={100,90,80,45,50,50,60,40,25,20};
    float[] y={3,5,9,10,20,21,24,24,27,35};
    float[] x2=xD.Recorreyeleva(xc);
    float[] xy=xD.Recorreymultiplica( xcc, y);

    //Procedimiento de ecuacion (sumas y formulas)
    Vector<Float> sumas=new Vector<Float>(5,1);
    sumas.add(xD.Recorreysuma(x));
    sumas.add(xD.Recorreysuma(y));
    sumas.add(xD.Recorreysuma(y));
    sumas.add(xD.Recorreysuma(x2));
    sumas.add(xD.Recorreysuma(xy));
    //sumas de formula a
    Vector<Float> formulas=new Vector<Float>(4,1);
    formulas.add(xy.length*(sumas.get(4)));
    formulas.add(sumas.get(0)*sumas.get(1));
    formulas.add(x2.length*(sumas.get(3)));
    formulas.add((sumas.get(0))*sumas.get(0));
    float a=(formulas.get(0)-formulas.get(1))/(formulas.get(2)-formulas.get(3));
    //sumas de formula b
    float suma5=a*sumas.get(0);
    float b=sumas.get(1)-suma5;
    b=b/x.length;
    System.out.println("y="+a+"x+"+b);
    
    }
    public static void CoeficienteLineal(){
        Metodos xD = new Metodos();
        Vector<Float> sumastot=new Vector<Float>(5,1);
        //obtencion de Arreglos y sumas totales
        float[] x={100,90,80,45,50,50,60,40,25,20};
        sumastot.add(xD.Recorreysuma(x));
        float[] xc={100,90,80,45,50,50,60,40,25,20};
        float[] xcc={100,90,80,45,50,50,60,40,25,20};
        float[] y={3,5,9,10,20,21,24,24,27,35};
        sumastot.add(xD.Recorreysuma(y));
        float[] yc={3,5,9,10,20,21,24,24,27,35};
        float[] ycc={3,5,9,10,20,21,24,24,27,35};
        float[] xmenosx2=xD.MediaX2(xc);
        sumastot.add(xD.Recorreysuma(xmenosx2));
        float[] ymenosy2=xD.MediaY2(yc);
        sumastot.add(xD.Recorreysuma(ymenosy2));
        float[] xporY=xD.Mediaxpormediay(xcc, ycc);
        sumastot.add(xD.Recorreysuma(xporY));
        //formula del coeficiente
        float raizX=(float) Math.sqrt(sumastot.get(2));
        float raizY=(float) Math.sqrt(sumastot.get(3));
        float r=sumastot.get(4)/(raizX*raizY);
        System.out.println("el coeficiente lineal es igual a "+r);
    }
    public static void main(String []args) {
        EcuacionLineal();
        CoeficienteLineal();
    }
}
