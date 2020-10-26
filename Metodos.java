public class Metodos {
    public int Recorreysuma(int[] x){
        int suma=0;
        for(int recorre=0;recorre<x.length;recorre++){
            suma=suma+x[recorre];
        }
        return suma;
    }
    public int[] Recorreyeleva(int[] xcc){
        for(int recorre=0;recorre<xcc.length;recorre++){
            xcc[recorre]=xcc[recorre]*xcc[recorre];
        }
        return xcc;
    }
    public int[] Recorreymultiplica(int[] zc,int[] y){
        int[] xy=zc;
        for(int recorre=0;recorre<zc.length;recorre++){
            xy[recorre]=zc[recorre]*y[recorre];
        }
        return zc;
    }
}
