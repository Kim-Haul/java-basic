public class Practice1 {
    public static void main(String[] args) {
        // write your code here
        char variable = 'S';
        int num = 10;

        System.out.println(variable);
        System.out.println(num);
        System.out.println(variable + "" + num);
        // System.out.println(variable + "\n" + num);

        int[] intEmptyArray = new int[]{10, 20, 30};
        System.out.println("정수 배열의 제일 마지막 값은 : " + intEmptyArray[intEmptyArray.length - 1] + " 입니다" );
    }
}