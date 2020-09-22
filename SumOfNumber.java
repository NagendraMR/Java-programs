public class SumOfNumber {
    int a,b;

    public int SumOfNumber1(int a){
        System.out.println("a:" +a);
        return 0;
    }
    public int SumOfNumber2(int b){
        System.out.println("b: " +b);
        return 0;
    }
    public int SumOfNumber3(int a, int b) {
        int sum =a+b;
        int square = (a+b)* (a+b);
        System.out.println("Sum of two numbers : " +sum);
        System.out.println("Square of sum of Two number : " +square);
        return 0;
    }

    public static void main(String[] args) {
        SumOfNumber SumOfNumber = new SumOfNumber();
        SumOfNumber.SumOfNumber1( 3);
        SumOfNumber.SumOfNumber2(4);
        SumOfNumber.SumOfNumber3(3,4);
    }
}
