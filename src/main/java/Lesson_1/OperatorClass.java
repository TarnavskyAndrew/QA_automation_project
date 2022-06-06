package Lesson_1;

public class OperatorClass {

    public static void main(String[] args) {

        int x = (2+2);

        int m = (x+x)+(x+x);
        boolean b = (x+x)<(++x+x);
        //int m3 = ((x--)+x); правильно: стр. 12, 13
        int m3 = 2*x - 1;
        x--;
        int m4 = (--x+x);
        int m5 = m3+m4;
        boolean b1 = m3>m4;
        boolean b2 = (m3%2)==0;
        boolean b3 = (m4%2)==0;


        System.out.println(m);
        System.out.println(b);
        System.out.println(m3);
        System.out.println(m4);
        System.out.println(m5);
        System.out.println(b1);
        System.out.println(b2 || b3);

//        System.out.println( );
//        boolean c = (10%2)==0;
//        boolean c1 = (13%2)==0;
//        System.out.println(c);
//        System.out.println(c1);
//        System.out.println(c || c1);
    }
}
