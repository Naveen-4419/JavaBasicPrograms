package com.javacodebase.codingExercise.ExceptionalHandling;



class ParentClassException
{
    String str = "a";

    void A()
    {
        try
        {
            str +="b";
            B();

        } catch (Exception e)
        {
            str += "c";
        }
        finally
        {
            str += "e"; // gets executed after catch/try no matter what
        }

        str += "f";// gets executed after finally
    }

    void B() throws Exception
    {
        try
        {
            str += "d";
            C();
        }
        catch(Exception e)
        {
            throw new Exception();
        }
        finally
        {
            str += "e"; // always gets executed
        }

        str += "f"; // since control leaves B block and goes to A as B throw new Exception, code after finally will not be executed in this block

    }

    void C() throws Exception
    {
        throw new Exception();
    }

    void display()
    {
        System.out.println(str);
    }

    public static void main(String[] args)
    {
        ParentClassException object = new ParentClassException();
        object.A();
        object.display();
    }

}
