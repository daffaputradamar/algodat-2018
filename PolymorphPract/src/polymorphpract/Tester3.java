package polymorphpract;

public class Tester3 {
    public static void main(String[] args) {
        PermanentEmployee pEmp = new PermanentEmployee("Dedik", 500);
        InternshipEmployee iEmp = new InternshipEmployee("Sunarto", 5);
        ElectricityBill eBill = new ElectricityBill(5, "R-1");
        
        Employee e[] = {pEmp, iEmp};
        Payable p[] = {pEmp, eBill};
//        Employee e2[] = {pEmp, iEmp, eBill};
    }
}
