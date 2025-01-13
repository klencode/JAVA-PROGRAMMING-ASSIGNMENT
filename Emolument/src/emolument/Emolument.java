/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package emolument;

/**
 *
 * @author Think
 */

public class Emolument {

   private double basic_salary;
   private double tax_relief;
   
   public Emolument(double basic_salary, double tax_relief) {
       this.basic_salary = basic_salary;
       this.tax_relief = tax_relief;
   }
   
   public double getBasicSalary() {
       return basic_salary;
   }
   
   public double getTaxRelief() {
       return tax_relief;
   }
   
   public double SSNIT() {
       return basic_salary * 0.035;
   }
   
   public double taxableIncome() {
       return basic_salary - (tax_relief + SSNIT());
   }
}
