package com.stackroute.pe3;

public class ExceptionMain {
    ExceptionMain(String message)
    {
        message="throws an object of class ExceptionMain inside a try block";
        System.out.println(message);
    }

    public static void main(String args[]) throws Exception
    {
        try{
            throw new Exception();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        finally {
            System.out.println("Printed a message to prove we are here.");
        }
    }

}
