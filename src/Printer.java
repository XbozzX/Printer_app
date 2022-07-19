public class Printer {

    private int tonerLevel;
    private int numberOfPagesPrinted = 0;
    private boolean duplexPrinter;

    public Printer(int tonerLevel, boolean duplexPrinter){

        if (this.tonerLevel >=0 && this.tonerLevel <=100){
            this.tonerLevel = tonerLevel;
        } else {
            System.out.println("Pls input the correct toner input");
        }
        this.duplexPrinter = duplexPrinter;
    }

    public int getTonerLevel(){
       return this.tonerLevel;
    }
    public int getNumberOfPagesPrinted(){
        return this.numberOfPagesPrinted;
    }
    public boolean isDuplexPrinter(){
        return this.duplexPrinter;
    }

    public void addToner(int toner){

        this.tonerLevel += toner;
        if (this.tonerLevel > 100){
                System.out.println("Toner level is at 100%");
                this.tonerLevel -= toner;
        } else {
            System.out.println("Toner level is at " + this.tonerLevel + "%");
        }
    }

    public void startPrinting(int totalPage){

        if (this.duplexPrinter == true){
            System.out.println("Printing= " + totalPage * 2);
            this.numberOfPagesPrinted += totalPage * 2;
        } else{
            System.out.println("Printing= " + totalPage);
            this.numberOfPagesPrinted += totalPage;
        }
    }


}
