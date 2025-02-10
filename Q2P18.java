public class Q2P18 {
    public static void main(String[] args) {
        System.out.println("a    b    pow(a,b)");
        
        int a = 1, b = 2;

        for (int i = 0; i < 5; i++) {
            System.out.println(a + "    " + b + "    " + (int) Math.pow(a, b));
            a++;
            b++;
        }
    }
}
