public class LargestNumberFunction {
    public static void main(String[] args) {
        int num1 = 11;
        int num2 = 11;

        System.out.println("The largest number is: " + largestNumber(num1, num2));
    }

    public static int largestNumber(int number1, int number2) {

        if (number1 < number2) {
            return number2;
        }
        else if (number1 == number2){
            return number1 & number2;
        }
        else {
            return number1;
        }

        }

    }

