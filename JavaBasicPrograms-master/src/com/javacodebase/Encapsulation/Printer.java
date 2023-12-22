package com.javacodebase.Encapsulation;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;



    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = (tonerLevel >= 0 && tonerLevel <= 100) ? tonerLevel : -1;
        this.pagesPrinted = 0;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount){
        if(tonerLevel <= 100 && tonerLevel >= 0) {
            tonerLevel = tonerLevel + tonerAmount;
            if(tonerLevel > 100 && tonerLevel < 0){
                return tonerAmount -1;
            }
            return tonerLevel;
        } else{
            return tonerLevel;
        }
    }
    public int printPages(int pagesToBePrinted){
        if(duplex){
            System.out.println("It's a duplex printer");
            if(pagesToBePrinted > 0){
                pagesPrinted = pagesPrinted + pagesToBePrinted/2;
            }
        } else{
            pagesPrinted = pagesToBePrinted + pagesPrinted;
        }
        return pagesPrinted;


    }
}
