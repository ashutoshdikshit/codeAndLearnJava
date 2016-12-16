package com.adikshit;

/**
 * Created by adikshit on 11/29/16.
 */
public class Printer {
    private int level = 10;
    private boolean isDuplex;
    private int numberOfPages = 0;

    public Printer(int level, boolean isDuplex) {
        if(level > -1 && level<=100) {
            this.level = level;
        }
        else {
            this.level = -1;
        }

        this.isDuplex = isDuplex;
        this.numberOfPages = 0;
    }

    public int fillToner(int inkUnit) {
        if(inkUnit > 0 && inkUnit <=100) {
            if(this.level + inkUnit > 100) {
                return -1;
            }
            this.level += inkUnit;
            return this.level;
        }
        else {
            return -1;
        }

    }

    public int printPages(int pages) {
       if(this.isDuplex) {
           pages = pages/2;
           System.out.println("Pages to print is "+ pages);
       }
       this.numberOfPages = pages;
       return pages;

    }

    public int getNumberOfPages() {
        return numberOfPages;
    }
}
