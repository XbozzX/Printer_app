public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(80,true);
        printer.addToner(10);
        printer.startPrinting(10);
        System.out.println(printer.getNumberOfPagesPrinted());
        System.out.println(printer.isDuplexPrinter());

        printer.startPrinting(20);
        System.out.println(printer.getNumberOfPagesPrinted());

        printer.addToner(20);
    }
}