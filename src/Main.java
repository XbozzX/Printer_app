public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(50,true);
        System.out.println(printer.addToner(10));
        System.out.println("Intial page count = " + printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(120);
        System.out.println("Pages printed was " + pagesPrinted + "new total print count for printer = " + printer.getPagesPrinted());
        pagesPrinted = printer.printPages(20);
        System.out.println("Pages printed was " + pagesPrinted + "new total print count for printer = " + printer.getPagesPrinted());
    }
}