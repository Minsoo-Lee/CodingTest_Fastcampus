package sort_Application;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ1015 {
    static FastReader scan = new FastReader();
    static StringBuilder sb = new StringBuilder();

    static class Elem implements Comparable<Elem> {
        public int num, idx;
        @Override
        public int compareTo(Elem o) {
            if (num != o.num) return num - o.num;
            return idx - o.idx;
        }
    }

    static int N;
    static int[] P;
    static Elem[] B;

    static void input() {
        N = scan.nextInt();
        B = new Elem[N];
        for (int i=0; i<N; i++) {
            B[i] = new Elem();

            B[i].num = scan.nextInt();
            B[i].idx = i;
        }
    }

    static void pro() {
        Arrays.sort(B);

        for (int b_idx = 0; b_idx < N; b_idx++) {
            P[B[b_idx].idx] = b_idx;
        }
        for (int i=0; i<N; i++) {
            sb.append(P[i]).append(' ');
        }
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
