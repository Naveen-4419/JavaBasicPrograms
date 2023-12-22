package com.javacodebase;

import java.io.FileNotFoundException;

class JavaExceptionExample {
    public static void main(String args[]) throws CustomException {
        try{
//below code do not throw any exception  
            throw new FileNotFoundException();

        }
//catch won't be executed  
        catch(FileNotFoundException e){
            System.out.println("FFE");
            throw new CustomException();
        }
        catch(CustomException e) {
            System.out.println("EE");
        }
//executed regardless of exception occurred or not  
        finally {
            System.out.println("finally block is always executed");
        }

    }
}
class CustomException extends RuntimeException {
    public CustomException() {
        System.out.println("exception");
    }
}

