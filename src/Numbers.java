public class Numbers {
    public static void main(String[] args) {
        // -128 ... 127
        byte b = 49;
        // +- 32 tys
        short s = 100;

        System.out.println("byte: " + b);
        System.out.println("short: " + s);

        // zamiana na wiekszy zakres jest "za darmo"
        int x = b;
        int y = s;
        System.out.println("x: " + x);
        System.out.println("y: " + y);

        //L - sugeruje typ long
        long l = 1100L;
        long l1 = x;

        System.out.println("l: " + l);
        System.out.println("l1: " + l1);

        System.out.println("################");

        int a = 123;
        float f = a;

        System.out.println("a: " + a);
        System.out.println("f: " + f);

        //standard IEEE
        a = 2147483647;
        f = a;

        System.out.println("a: " + a);
        System.out.println("f: " + f);

        double d = 128.0;
        double d2 = 128.98;

        //rzutowanie - zamiana typów

        //nie da sie tak
        //int i = d;

        //da sie tak
        int i = (int) d;
        System.out.println("i: " + i);

        int i2 = (int) d2;
        System.out.println("i2: " + i2);

        //tak samo by było z float do int
        float f1 = 123.45f;

        //tak nie moge
        //int i3 = f1;

        int i3 = (int) f1;

        int xyz = 101;
        short s2 = (short) xyz;
        System.out.println("s2: " + s2);

        //zaokraglanie
        double d3 = 128.98;

        //Math.round zwraca wartosc typu double
        double d4 = Math.round(d3);
        int z = (int) Math.round(d3);

        int i4 = (int) d4;
        System.out.println("i4: " + i4);
        System.out.println("z: "+z);

    }
}