package BAITAPBUOI4;
import java.util.Scanner;

public class Calculator {

    public int calculateSum(){
        Scanner scanner = new Scanner(System.in);
        String input;
        int sum = 0;
        do {
        System.out.print("Moi nhap so : ");
        int number = scanner.nextInt();
        sum += number;
    
        System.out.print("Nhap 'n' neu muon dung .Nhap bat ky de tiep tuc chuong trinh :");
                input = scanner.next();
    
        }while( !input.equals("n"));
        return sum;
        }
    


    


        public int calculateSumOfProduct(int n) {
            int sum = 0;
            System.out.print("Bieu thuc co dang : ");
            for (int i = 1; i <= n; i++) {
                int product = 1;
                
              
                for (int j = 1; j <= i; j++) {
                    product *= j; 
                    if (j == 1) {
                        System.out.print(j); 
                    } else {
                        System.out.print(" * " + j); 
                    }
                }
                
                sum += product;
                if (i < n) {
                    System.out.print(" + "); 
                }
            }
            System.out.println();
            return sum; 


            
        }
        public void printPrimeFactors(int n) {
            
            while (n % 2 == 0) {
                System.out.print(2 + " ");
                n /= 2;
            }
            
           
            for (int i = 3; i <= Math.sqrt(n); i += 2) {
                while (n % i == 0) {
                    System.out.print(i + " ");
                    n /= i;
                }
            }
            
           
            if (n > 2) {
               
                System.out.print(n);
            }
            
           
            System.out.println();
        }
    }





 



