package com.javacodebase.codingExercise.ExceptionalHandling;


class MultiTryandCatch
{   int count = 0;

    void A() throws Exception
    {
        try
        {
            count++; //1

            try
            {
                count++; //2

                try
                {
                    count++; //3
                    throw new Exception();

                }

                catch(Exception ex)
                {
                    count++;//4
                    throw new Exception();
                }
            }

            catch(Exception ex)
            {
                count++;//5
            }
        }

        catch(Exception ex)
        {
            count++;
        }

    }

    void display()
    {
        System.out.println(count);
    }

    public static void main(String[] args) throws Exception
    {
        MultiTryandCatch obj = new MultiTryandCatch();
        obj.A();
        obj.display();
    }
}
