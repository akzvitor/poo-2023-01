public class TesteSomaNaturais {
    public static long SomaNaturais(int n) {
        c = 1;
        s = 0;

        while(c <= n)
        {
            s = s+c;
            c = c + 1;
        }
    }

    public static void main(String[] args) {
        System.out.println(SomaNaturais(10));
    }
}