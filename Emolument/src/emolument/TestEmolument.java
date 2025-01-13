/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package emolument;

import javax.swing.JOptionPane;

public class TestEmolument {
    public static void main(String[] args) {
    String basicSalaryStr = JOptionPane.showInputDialog("Enter Basic Salary:");
    String taxReliefStr = JOptionPane.showInputDialog("Enter Tax Relief:");
    
    double basicSalary = Double.parseDouble(basicSalaryStr);
    double taxRelief = Double.parseDouble(taxReliefStr);
    
    MyEmolument Staff_Salary = new MyEmolument(basicSalary, taxRelief);
    
    String output = String.format(
        "Salary Details:\n\n" +
        "Basic Salary: %.2f\n" +
        "Tax Relief: %.2f\n" +
        "SSNIT Contribution: %.2f\n" +
        "Taxable Income: %.2f\n" +
        "Income Tax: %.2f\n" +
        "Total Deduction: %.2f\n" +
        "Net Salary: %.2f\n",
        Staff_Salary.getBasicSalary(),
        Staff_Salary.getTaxRelief(),
        Staff_Salary.SSNIT(),
        Staff_Salary.taxableIncome(),
        Staff_Salary.incomeTax(),
        Staff_Salary.totalDeduction(),
        Staff_Salary.netSalary()
    );
    
    JOptionPane.showMessageDialog(null, output);
    }
}
