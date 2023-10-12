/*Problem Statement:Create a class Square which has both default constructor and parameterized constructor,
a length parameter,and a printArea method which take the length as an argument and prints the area. 
In the case of the default parameter, the default value of length will be equal to 10.
All the Input and Output methods are take care by compiler you don't have to worry about it.
Sample Output 1:
100
49
Explanation Of Sample Output 1:
In the above case first, we are creating the object of the default constructor after that creating the object of 
parameterized constructor and passing the value of length equal to 7 and calling the calculateArea method respectively.
*/ 
import java.util.* ;
import java.io.*; 
class Square {
	// Write your code here
  int length;
	Square(){
        this.length=10;
	}
	Square(int length){
        this.length=length;
	}
	void printArea(){
        System.out.println(length*length);
	}
}
	
class Solution {
	
	public static void main(String args[]) {
		
		// Write your code here
		Square ob1=new Square();
		Square ob2=new Square(7);
		ob1.printArea();
		ob2.printArea();
	}
}
