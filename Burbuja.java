public class Burbuja 
{
  
    public static int[] ejecutaProceso1(int[] arreglo)
    {
      int auxiliar;
      int[] arregloOrdenado;
      for(int i = 2; i < arreglo.length; i++)
      {
        for(int j = 0;j < arreglo.length-i;j++)
        {
          if(arreglo[j] > arreglo[j+1])
          {
            auxiliar = arreglo[j];
            arreglo[j] = arreglo[j+1];
            arreglo[j+1] = auxiliar;
          }   
        }
      }
      arregloOrdenado = arreglo;
      return arregloOrdenado;
    }
    
    public static void main(String[] args) 
    {
      //Valores que tiene el arreglo desordenado.
      int arreglo[] = {8,6,7,2,1,8,6,8,7,1,9,7,7,10};
      int arregloOrdenado[] = ejecutaProceso1(arreglo);
 

      long tiempoejecuini=System.currentTimeMillis();
      arregloOrdenado = ejecutaProceso1(arreglo);
            //imprimimos el arreglo ordenado.
            for(int i = 0; i < arregloOrdenado.length;i++){
              System.out.println(arregloOrdenado[i]);
            }
      long tiempoejecutotal=System.currentTimeMillis()-tiempoejecuini;
      System.out.println("el tiempo de ejecucion es "+tiempoejecutotal+" mili segundos");
    }

}
//micodigoholaxD