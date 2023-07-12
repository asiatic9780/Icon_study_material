public class Wrapper
{
    public static void main(String[] args) {
        int num = 7;
        Integer num1 = num;     //autoboxing


        int num2 = num1.intValue();   //autounboxing
        System.out.println(num2);
    }
}