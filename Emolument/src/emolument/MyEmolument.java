/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package emolument;

/**
 *
 * @author Think
 */
public class MyEmolument extends Emolument {
    private double basic_salary;
    private double tax_relief;
    
    public MyEmolument() {
        super(0, 0);
        this.basic_salary = 0;
        this.tax_relief = 0;
    }
    
    public MyEmolument(double basic_salary, double tax_relief) {
        super(basic_salary, tax_relief);
        this.basic_salary = basic_salary;
        this.tax_relief = tax_relief;
    }
    
    public double incomeTax() {
        double taxableInc = taxableIncome();
        double tax = 0;
        
        if (taxableInc <= 500) {
            tax = taxableInc * 0.05;
        } else if (taxableInc <= 1000) {
            tax = (500 * 0.05) + ((taxableInc - 500) * 0.125);
        } else {
            tax = (500 * 0.05) + (500 * 0.125) + ((taxableInc - 1000) * 0.175);
        }
        return tax;
    }
    
    public double totalDeduction() {
        return SSNIT() + incomeTax();
    }
    
    public double netSalary() {
        return basic_salary - totalDeduction();
    }
}
