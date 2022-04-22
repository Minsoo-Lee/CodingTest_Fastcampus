package JAVA;

class Dynamic {
    public int fibo_rec(int data) {
        if (data <= 1)
            return data;
        return this.fibo_rec(data - 1) + this.fibo_rec(data - 2);
    }
    public int fibo_dp(int data) {
        Integer[] cache = new Integer[data + 1];
        cache[0] = 0;
        cache[1] = 1;
        for (int index = 2; index < data + 1; index++) 
            cache[index] = cache[index - 1] + cache[index - 2];
        return cache[data];
    }

    public static void main(String[] args) {
        Dynamic fibo = new Dynamic();
        System.out.println(fibo.fibo_rec(10));
        System.out.println(fibo.fibo_dp(10));
    }
}
