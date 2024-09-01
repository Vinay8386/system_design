package SOLIDPrincipal.D_DIP.L_LSP;

public class ContractualEmployee extends Employee{
    @Override
    public int calculateSalary() {
        return 15000;
    }

    @Override
    public int calculateBonus() {
        // Return 0 to indicate no bonus for contractual employees
        return 0;
    }
}

