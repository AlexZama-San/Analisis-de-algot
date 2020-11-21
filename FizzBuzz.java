public class FizzBuzz {
    public static void main(String arg[]){


        for (int c=1;c<=100;c++){
            if (c%3==0 && c%5==0){
                System.out.println(c+" Fizz Buzz");
            }else{
                if(c%3==0){
                    System.out.println(c+" Fizz");
                }else{
                    if(c%5==0){
                        System.out.println(c+" Buzz");
                    }else{
                        System.out.println(c);
                    }
                }
            }
        }
    }
}
