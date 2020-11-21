public class FizzBuzz {
    public static void main(String arg[]){

        String fiz=" Fizz";
        String buz=" Buzz";

        for (int c=0;c<=100;c++){
            if (c%3==0 && c%5==0){
                System.out.println(c+""+fiz+""+buz);
            }else{
                if(c%3==0){
                    System.out.println(c+""+fiz);
                }else{
                    if(c%5==0){
                        System.out.println(c+""+buz);
                    }else{
                        System.out.println(c);
                    }
                }
            }
        }
    }
}
