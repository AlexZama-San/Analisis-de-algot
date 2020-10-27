public class Metodos {
    public float Recorreysuma(float[] x){
        float suma=0;
        for(int recorre=0;recorre<x.length;recorre++){
            suma=suma+x[recorre];
        }
        return suma;
    }
    public float[] Recorreyeleva(float[] xcc){
        for(int recorre=0;recorre<xcc.length;recorre++){
            xcc[recorre]=xcc[recorre]*xcc[recorre];
        }
        return xcc;
    }
    public float[] Recorreymultiplica(float[] zc,float[] y){
        float[] xy=zc;
        for(int recorre=0;recorre<zc.length;recorre++){
            xy[recorre]=zc[recorre]*y[recorre];
        }
        return zc;
    }
    public float RegladeTres(float x,float y){
        float result=(y*100)/x;
        return result;
    }
}
