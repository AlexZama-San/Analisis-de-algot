
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
    public float[] MediaX2(float[] x){
        float sumatot=Recorreysuma(x);
        float[] mediaXX2=x;
        for(int cont=0;cont<x.length;cont++){
            float mediaX=(x[cont]-(sumatot/x.length));
            mediaX= (float) Math.pow(mediaX,2);
            mediaXX2[cont]=mediaX;
        }
        return mediaXX2;
    }
    public float[] MediaY2(float[] y){
        float sumatot=Recorreysuma(y);
        float[] mediaYY2=y;
        for(int cont=0;cont<y.length;cont++){
            float mediaY=(y[cont]-(sumatot/y.length));
            mediaY=(float) Math.pow(mediaY, 2);
            mediaYY2[cont]=mediaY;
        }
        return mediaYY2;
    }
    public float[] Mediaxpormediay(float[] x,float[] y){
        float sumatotx=Recorreysuma(x);
        float sumatoty=Recorreysuma(y);
        float[] mediaXporMediaY=x;
        for(int cont=0;cont<x.length;cont++){
            float mediaX=(x[cont]-(sumatotx/x.length));
            float mediaY=(y[cont]-(sumatoty/y.length));
            float xpory=mediaX*mediaY;
            mediaXporMediaY[cont]=xpory;
        }
        return mediaXporMediaY;
    }
}
