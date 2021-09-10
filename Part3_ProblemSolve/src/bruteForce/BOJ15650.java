// N 개 중
// 중복 없이
// M 개를
// 고르기
// -> 1 4와 4 1은 같은 경우로 취급

package bruteForce;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ15650 {
    static StringBuilder sb = new StringBuilder();
    static int N, M;
    static int[] selected, used;

    static void input() {
        BOJ15651.FastReader scan = new BOJ15651.FastReader();
        N = scan.nextInt();
        M = scan.nextInt();
        selected = new int[M+1];
        used = new int[N+1];
    }

    static void rec_func(int k) {
        if (k == M+1) {
            for (int i=1; i<=M; i++) sb.append(selected[i]).append(' ');
            sb.append('\n');
        } else {
            for (int cand = selected[k-1] + 1; cand <= N; cand++) {
                selected[k] = cand;
                rec_func(k+1);
                selected[k] = 0;
            }
        }
    }

    public static void main(String[] args) {
        input();

        rec_func(1);
        System.out.println(sb.toString());
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        public FastReader(String s) throws FileNotFoundException {
            br = new BufferedReader(new FileReader(new File(s)));
        }
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
