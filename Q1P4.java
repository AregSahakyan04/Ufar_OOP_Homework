// Write a program that displays the following table
// a  a^2 a^3
// 1   1   1
// 2   4   8
// 3   9  27
// 4  16  64


public class Q1P4{
    public static void main (String[] args) {
        int a = 1;
        System.out.print("a   a^2 a^3 \n");
        
        for (int i = 0; i < 4; i++){
            System.out.println(a + "   " + (a * a) + "   " + (a * a * a));
            a++;
        }
    }
}
