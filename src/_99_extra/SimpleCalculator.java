package _99_extra;


import javax.swing.JOptionPane;

public class SimpleCalculator {
	public static void main(String[] args) {

		// 1. Get 2 numbers from the user and convert them to integer.
String a = JOptionPane.showInputDialog("input a number");
String b = JOptionPane.showInputDialog("input another number");
int one = Integer.parseInt(a);
int two = Integer.parseInt(b);
		// 2. Customize pop-up to support add/subtract/multiply/divide operations.
		int operation = JOptionPane.showOptionDialog(null, "question", " ", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "divide", "multiply", "subtract", "add" },
				null);

		// 5. Call the methods created in steps 3 and 4 to perform the appropriate operation.

		// 6. Wrap steps 1, 2 and 5 in a for loop to repeat calculator operations
	
	}
	// 3. Create method for addition operation.
	//    Method should create pop-up that shows equation and solution, eg. 45 + 25 = 70.
	//    HINT: use 'static void add(int num1, num2) { ... }
static void add(int one, int two) {
	int add = one+two;
	JOptionPane.showMessageDialog(null, +one +" + " +two +" = " +add);
}
static void subtract(int one,int two) {
	int subtract = one-two;
	JOptionPane.showMessageDialog(null, +one +" - " +two +" = " +subtract);
}
static void multiply(int one, int two) {
	int multiply = one*two;
	JOptionPane.showMessageDialog(null, +one +" * " +two +" = " +multiply);
}
static void divide(int one, int two) {
	int divide = one/two;
	JOptionPane.showMessageDialog(null, +one +" / " +two +" = " +divide);
}
	// 4. Create similar methods for subtraction, multiplication and division.

}
//int subtract = one-two;
//JOptionPane.showMessageDialog(null, +one +" - " +two +" = " +subtract);
//int multiply = one*two;
//JOptionPane.showMessageDialog(null, +one +" * " +two +" = " +multiply);
//int divide = one/two;
//JOptionPane.showMessageDialog(null, +one +" / " +two +" = " +divide);
