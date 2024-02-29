import java.io.IOException;
public class teste {
    public static void main(String[] args) throws IOException{
        System.out.println("Olá, Mundo");
        char ch;
        ch = 'x';
        System.out.println("ch contains " + ch);
        ch++;
        System.out.println("ch is now " +ch);
        ch =98;
        System.out.println("ch is now " + ch);
        byte tipoByte = 127;
        short tipoShort = 32767;
        char tipoChar = 'C';
        float tipoFloat = 2.6f;
        double tipoDouble = 3.59;
        int tipoInt = 2147483647;
        long tipoLong = 223372836854775807L;
        boolean tipoBooleano = true;
        System.out.println("Valor do tipoByte = " +tipoByte);
        System.out.println("Valor do tipoShort = " +tipoShort);
        System.out.println("Valor do tipoChar = " +tipoChar);
        System.out.println("Valor do tipoFloat = " +tipoFloat);
        System.out.println("Valor do tipoDouble = " +tipoDouble);
        System.out.println("Valor do tipoInt = " +tipoInt);
        System.out.println("Valor do tipoLong = " +tipoLong);
        System.out.println("Valor do tipoBooleano = " +tipoBooleano);

        System.out.println("\nFirst line \nSecond line");
        System.out.println("A\tB\tC");
        System.out.println("D\tE\tF\n");

        boolean b;
        b = false;
        System.out.println("b is + b");
        b = true;
        System.out.println("b is + b");
        if(b) System.out.println("This is executed");
        b = false;
        if(b) System.out.println("This is not executed");
        System.out.println("10 > 9 is " + (10 > 9));

        int m;
        m = 10;
        if(m == 10) {
            int n = 20;
            System.out.println("m and n: " + m + " " + n);
            m = n * 2;
        }

        System.out.println("m is " + m);

        for(int i = 0; i < 3; i++) {
            int j = -1;
            System.out.println("j is: " + j);
        }

        int i,j; boolean b1,b2;
        i = 10;
        j = 11;
        if (i < j) System.out.println("\ni<j");
        if (i <= j) System.out.println("i<=j");
        if (i != j) System.out.println("i!=j");
        if (i == j) System.out.println("this won´t execute");
        if (i >= j) System.out.println("this won´t execute");

        b1 = true;
        b2 = false;
        if (b1 & b2)

    }
}
