package com.company;

public class Main {

    public static void main(String[] args) {
        double[] n = new double[8];
        n[0] = -10;
        n[1] = -18;
        n[2] = 18;
        n[3] = 89;
        n[4] = -1;
        n[5] = -93;
        n[6] = -1;
        n[7] = 0;
        Polynom A = new Polynom(n);
        System.out.println(A);

        double[] d = new double[5];
        d[0] = 78;
        d[1] = -2;
        d[2] = 9;
        d[3] = 2;
        d[4] = -45;
        Polynom P = new Polynom(d);
        System.out.println(P);
        String C = A.addition(P);
        System.out.println(C);












    }
}
