package SOLIDPrincipal.D_DIP.I_ISP;

//Before applying Interface segregation Principal
/*interface ISalaryCalculator {  //responsible to calculate salary
    int calculateSalary();
    int calculateBonus();  //unnecessary method
}

class Salarycalculator implements ISalaryCalculator{

    @Override
    public int calculateSalary() {
        return 0;
    }

    @Override
    public int calculateBonus() {
        return 0;
    }
}*/
//Now apply Interface Segregation Principal
interface ISalaryCalculator {
    int calculateSalary();
}

interface IBonusCalculator {
    int calculateBonus();
}

class SalaryCalculator implements ISalaryCalculator {
    @Override
    public int calculateSalary() {
        // Implementation for calculating salary
        return 0;
    }
}

// Another class implementing the bonus calculation
class BonusCalculator implements IBonusCalculator {
    @Override
    public int calculateBonus() {
        // Implementation for calculating bonus
        return 0;
    }
}
