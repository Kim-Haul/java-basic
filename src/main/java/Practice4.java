class ArrayCalculation {

    int[] arr = { 0, 1, 2, 3, 4 };

    public int divide(int denominatorIndex, int numeratorIndex) throws ArithmeticException, ArrayIndexOutOfBoundsException{
        return arr[denominatorIndex] / arr[numeratorIndex];
    }
}

public class Practice4 {
    public static void main(String[] args) {
        ArrayCalculation arrayCalculation = new ArrayCalculation();

        System.out.println("2 / 1 = " + arrayCalculation.divide(2, 1));
        // java.lang.ArithmeticException: "/ by zero"
        try {
            arrayCalculation.divide(1, 0);
        } catch(ArithmeticException e) {
            System.out.println("잘못된 계산입니다.");
        }
        // java.lang.ArrayIndexOutOfBoundsException: 5
        try {
            arrayCalculation.divide(5, 0);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("잘못된 계산입니다. 현재 배열의 인덱스는 " + (arrayCalculation.arr.length - 1) + "까지 입니다.");
        }
    }
}