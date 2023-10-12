/*Problem Statement:A ComplexNumber class contains two data members: one is the real part (R) and the other is imaginary (I) (both integers). Implement the Complex numbers class that contains the following functions -
1. Constructor - You need to create the appropriate constructor.
2. Plus - This function adds two given complex numbers and updates the first complex number.
e.g.:-if C1=4+i5 and C2=3+i1
      C1. plus (C2) results in:
      C1=7+i6 and  C2=3+i1
3. Multiply - This function multiplies two given complex numbers and updates the first complex number.
e.g.:-if C1 =4+i5 and C2=1+i2
      C1. multiply (C2) results in:
      C1=-6+i13 and C2=1+i2
4. Print - This function prints the given complex number in the following format: a + ib 
Note:There is space before and after '+' (plus sign) and no space between 'i' (iota symbol) and b.
Sample Input 1:
4 5
6 7
1
Sample Output 1:
10 + i12
Sample Input 2:
4 5
6 7
2
Sample Output 2 :
-11 + i58
*/
import java.util.* ;
import java.io.*; 
import java.util.Scanner;

class ComplexNumbers {
    int real;
    int imaginary;
    ComplexNumbers(int real,int imaginary){
        this.real=real;
        this.imaginary=imaginary;
    }
    void plus(ComplexNumbers c2){ 
        this.real =(this.real+c2.real);
        this.imaginary=this.imaginary+c2.imaginary;
     
    }
    void multiply(ComplexNumbers c2){
        int temp=this.real;  
        this.real = (this.real*c2.real)-(this.imaginary*c2.imaginary);
        this.imaginary =temp*c2.imaginary+this.imaginary*c2.real; 
            
    }
    void print(){
        System.out.println(this.real+" + "+"i"+this.imaginary );
    }
}
class Solution{

    public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int real1 = s.nextInt();
		int imaginary1 = s.nextInt();

		int real2 = s.nextInt();
		int imaginary2 = s.nextInt();

		ComplexNumbers c1 = new ComplexNumbers(real1, imaginary1);
		ComplexNumbers c2 = new ComplexNumbers(real2, imaginary2);

		int choice = s.nextInt();
		 
		if(choice == 1) {
			c1.plus(c2);
			c1.print();
		}
		else if(choice == 2) {
			c1.multiply(c2);
			c1.print();
		}
		else {
			return;
		}
	}
}
