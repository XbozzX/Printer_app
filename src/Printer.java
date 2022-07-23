public class Printer {
    //declare the field
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    // declare constructor
    public Printer(int tonerLevel, boolean duplex){

        if (this.tonerLevel >=0 && this.tonerLevel <=100){ // validate the toner level which is not more  than 100 either less than 0
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
        this.pagesPrinted = 0;
        this.duplex = duplex;
    }

    // create the getter
    public int getPagesPrinted(){
        return this.pagesPrinted;
    }

    // create the add Toner function
    public int addToner(int tonerAmount){
        if (tonerAmount > 0 && tonerAmount < 100){ // validate the total toner amount use input
                if (this.tonerLevel + tonerAmount > 100){ // validate the total tonerlevel after adding them
                    return -1; // if more than 100 it will return -1
                } else {
                    return this.tonerLevel; // will update the new amount to the field
                }
        } else {
            return -1;
        }
    }

    //create the print pages function
    public int printPages(int pages){
        int pagesToPrint = pages;
        if (this.duplex == true){ // validate the printer is duplex or not
            pagesToPrint = (pages / 2) + (pages % 2) ; // calculation for determine the total pages have been printed
        }
        this.pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }
}
