package sort;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ10825 {
    static FastReader scan = new FastReader();
    static StringBuilder sb = new StringBuilder();

    static class Elem implements Comparable<Elem> {
        public String name;
        public int korean, english, math;

        @Override
        public int compareTo(Elem o) {
            // 국어 내림차순
            if (korean != o.korean) return o.korean - korean;
            // 영어 오름차순
            if (english != o.english) return english - o.english;
            // 수학 내림차순
            if (math != o.math) return o.math - math;
            // 문자열 비교는 이렇게!
            return name.compareTo(o.name);
        }
    }

    static int N;
    static Elem[] a;

    static void input() {
        N = scan.nextInt();
        a = new Elem[N];
        for (int i=0; i<N; i++) {
            a[i] = new Elem();
            a[i].name = scan.next();
            a[i].korean = scan.nextInt();
            a[i].math = scan.nextInt();
        }
    }

    static void pro() {
        Arrays.sort(a);

        for (int i=0; i<a.length; i++) {
            sb.append(a[i].name).append('\n');
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
