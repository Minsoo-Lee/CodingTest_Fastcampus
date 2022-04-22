package JAVA;

class Recursive {
    public int factorial_func1(int n) {
        if (n > 1)
            return n * this.factorial_func1(n - 1);
        else
            return 1;
    }

    public int factorial_func2(int n) {
        if (n <= 1)
            return 1;
        return n * this.factorial_func2(n - 1);
    }

    public int one_two_three(int data) {
        if (data == 1)
            return 1;
        else if (data == 2)
            return 2;
        else if (data == 3)
            return 4;
        return this.one_two_three(data - 1) + one_two_three(data - 2) + one_two_three(data - 3);
    }

    public static void main(String[] args) {
        Recursive fact = new Recursive();
        System.out.println(fact.factorial_func1(10));
        System.out.println(fact.factorial_func2(10));
    }
}