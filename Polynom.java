package com.company;


import static java.lang.String.*;

public class Polynom {

    int n;
    double[] coef;
    double[] mas;


    public Polynom(double[] coef) {

        this.coef = coef;
    }





    @Override
    public String toString() {
        String result = "";
        if (coef[0] < 0) {
            coef[0] = -1 * coef[0];
            result = "" + " - " + coef[0];
        } else if (coef[0] == 0) {
            result = "";
        } else result = " + " + coef[0];


        if ((coef.length >= 2) & (coef[1] == 0)) {
            result = "" + result;
        } else if ((coef.length >= 2) & (coef[1] == 1)) {
            result = "" + " + " + "x " + result;
        } else if ((coef.length >= 2) & (coef[1] == -1)) {
            result = " " + "x " + result;
        } else if ((coef.length >= 2) & ((coef[1] != -1) || (coef[1] != 1)) & (coef[1] <= 0)) {
            coef[1] = -1 * coef[1];
            result = "" + " - " + coef[1] + "x " + result;
            coef[1] = -1 * coef[1];
        } else result = " " + " + " + coef[1] + "x " + result;

        for (int i = 2; i < coef.length; i++) {
            if (coef[i] == 0) {
                result = "" + result;
            } else if ((coef[i] < 0) & (coef[i] != -1)) {
                coef[i] = -1 * coef[i];
                result = "" + " - " + coef[i] + "x^" + i + result;
                coef[i] = -1 * coef[i];
            } else if ((coef[i] < 0) & (coef[i] == -1)) {
                result = "" + " - " + "x^" + i + result;
            } else if ((coef[i] > 0) & (coef[i] == 1)) {
                result = "" + " + " + "x^" + i + result;
            } else result = "" + " + " + coef[i] + "x^" + i + result;

        }
        return result;

    }

    public void P(double[] mas){
        this.mas = mas;

    }


    public String addition(Polynom P) {

        int k;
        int m;

        boolean f = false;

        if (n < P.n) {
            k = n;
            m = P.n;
        } else {
            k = P.n;
            m = n;
            f = true;
        }


        String result = "";
        double[] mas = new double[1 + m];

        for (int i = 0; i < mas.length; i++) {
            if (i < k + 1) {
                mas[i] = coef[i] + P.coef[i];
                result = "" + mas[i] + "x^" + i + result;

            } else {
                if (f) {
                    mas[i] = coef[i];
                    result = "" + mas[i] + "x^" + 1 + result;

                } else {
                    mas[i] = P.coef[i];
                    result = "" + mas[i] + "x^" + i + result;

                }
            }
        }

        return result;
    }
}






























