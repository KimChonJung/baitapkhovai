import BAITAPBUOI4.Calculator;

/**
 * test
 */
public class test {

public static void main(String[] args) {
    Calculator calculator = new Calculator();
    System.out.println(calculator.calculateSum());

System.out.println("-----------------------------------");

   int sum =calculator.calculateSumOfProduct(3);
  
   System.out.println("Tong la "+sum);

   System.out.println("-----------------------------------");

     System.out.print(" Thua so nguyen to la: ");
    calculator.printPrimeFactors(12);

    System.out.print(" Thua so nguyen to la: ");
    calculator.printPrimeFactors(35);

     System.out.print(" Thua so nguyen to la: ");
        calculator.printPrimeFactors(86);

}}