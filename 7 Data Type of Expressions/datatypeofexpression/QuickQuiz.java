package datatypeofexpression;

public class QuickQuiz {
    public static void main(String[] args) {
        // a++ First use of value and then increment
        int a = 5;
        System.out.println(a++);
        System.out.println(a);

        // First increment the value then use it

        int c = 6;
        System.out.println(++c);
        System.out.println(c);

        //what will be the value of the following expression of x

        int y = 7;
        int x = ++y * 8;
        System.out.println(x);

        // char a = b

        char ch = 'a';
        System.out.println(++ch);

    }
}
