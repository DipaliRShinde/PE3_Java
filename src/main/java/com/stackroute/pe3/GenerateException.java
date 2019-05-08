package com.stackroute.pe3;

public class GenerateException {
    public static void main(String args[])
    {
        try {
            throw new NegativeArraySizeException();
        }
        catch (NegativeArraySizeException negativeArraySizeException) {
            System.out.println(negativeArraySizeException);
        }

        try {
            throw new IndexOutOfBoundsException();
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            System.out.println(indexOutOfBoundsException);
        }

        try {
            throw new NullPointerException();
        }
        catch (NullPointerException nullPointerException) {
            System.out.println(nullPointerException);
        }
    }
}
