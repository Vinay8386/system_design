package SOLIDPrincipal.D_DIP.L_LSP;

public class Main {
    public static void main(String[] args) {
        Employee emp=new ContractualEmployee();
        System.out.println(emp.calculateSalary());
        System.out.println(emp.calculateBonus());
    }
}
