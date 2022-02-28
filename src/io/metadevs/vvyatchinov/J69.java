package io.metadevs.vvyatchinov;

public class J69 {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        System.out.println(a + " " + b);
        String as = a + " ";
        String bs = b + " ";
        System.out.println(as + " " + bs);
        a = Boolean.parseBoolean(as);
        b = Boolean.parseBoolean (bs);

        System.out.println(a + " " + b);

    }
}