public class ConsolesSales extends Consoles{
    private ConsolesSales(String ConsoleType, String Store int TotalSales){
        super (ConsoleType,Store,TotalSales);
    }


    @Override
    public void printReport(){
        System.out.println("CONSOLE SALES REPORT");
        System.out.println("***********************");
        System.out.println("CONSOLE TYPE: " + getConsoleType());
        System.out.println("STORE: " + getStore());
        System.out.println("TOTAL SALES: " + getTotalSales());
     }
}
