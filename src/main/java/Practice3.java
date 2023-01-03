public class Practice3 {
    public static void main(String[] args) {
        // write your code here
        
        // 1부터 100까지의 합
        int i = 1;
        int sum = 0;

        while ( i <= 100 ) {
            sum += i;
            i ++ ;
        }
        System.out.println(sum);

        // 5초 카운트다운
        for ( int j = 5; j > 0; j --) {
            System.out.println(j + "초");
        }

        // 1부터 30까지 홀수의 합과 짝수의 합
        int odd = 0;
        int even = 0;

        for ( int k = 1; k <= 30; k ++ ) {
            if ( k % 2 == 0) {
                even += k;
            } else {
                odd += k;
            }
        }
        System.out.println("홀수: " + odd);
        System.out.println("짝수: " + even);
    }
}


