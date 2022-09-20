package recursion;

public class DecimalToBinary {
    public static void main(String[] args) {
        DecimalToBinary decimalToBinary = new DecimalToBinary();
        var number = 10;
        var binary = decimalToBinary.convertToBinary(number);
        System.out.println("Binary of " +  number + " is " + binary);
    }

    private int convertToBinary(int n) {
        if ( n == 0 ) return 0;
        return n % 2 + 10 * convertToBinary(n/2);
    }
}
