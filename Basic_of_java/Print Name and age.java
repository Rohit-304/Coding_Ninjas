/*Problem Statement:Create a class named Person with a string variable 'name' and an integer variable 'age,' such that these variables are not accessible outside the class and implement a way to initialize the variables and print the variables.
Functions:
1.SetValue- That Sets The Variables Value.
2.GetValue- That Prints The Variables Value.
Detailed explanation (Input/output format)
Sample Input 1:
Afzal
67
Sample Output 1:
The name of the person is Afzal and the age is 67.
Sample Input 2:
Ali
30
Sample Output 2:
The name of the person is Ali and the age is 30.
*/
import java.util.Scanner;
class Person {
	
	private String name;
	private int age;
	
	public void setValue(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void getValue() {
		System.out.println("The name of the person is " + name + " and the age is " + age + ".");
	}
}

class Solution {
	
	public static void main(String args[]) {
		
		Person obj = new Person();
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		int age = sc.nextInt();
		obj.setValue(name, age);
		obj.getValue();
	}
}
