package baekjoon_git;

public class baekjoon_4673 {

        public static void main(String[] args) {
            baekjoon_4673 test = new baekjoon_4673();
            int [] save = new int [10000];


            for (int i = 1; i < 10000; i++) {
                for( int x = 1; x<10000;x++){
                    if(i==test.d(x)) save[i]=i;
                }
                if(save[i]==0) System.out.println(i);
            }

        }




        int d(int n) {
            if (n < 10) {
                return n + n;
            } else if (n < 100) {
                return n + (n / 10) + (n % 10);
            } else if (n < 1000) {
                return n + (n / 100) + ((n % 100) / 10) + (n % 10);
            } else {
                return n + (n / 1000) + ((n % 1000) / 100) + ((n % 100) / 10) + (n % 10);
            }

        }
    }



