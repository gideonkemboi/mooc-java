
public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
        //write some code here

        int great;
        if (number1 > number2) {
            great = number1;
        } else {
            great = number2;
        }

        if (great > number3) {
            return great;
        } else {
            return number3;
        }
    }

    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
}
