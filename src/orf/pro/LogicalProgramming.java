package orf.pro;

public class LogicalProgramming {

	public static void main(String[] args) {
		/*
		 * // print the give number is even or not int num = 55; if (num % 2 == 0) {
		 * System.out.println("Print the even num");
		 * 
		 * } else { System.out.println("print odd"); }
		 */
		// ================================================================//
		/*
		 * //print number 1 to 100 for (int i = 0; i <=100; i++) {
		 * System.out.println(i); }
		 */

		// =============================================================//
		// print even number from 1 to 100
		/*
		 * for (int i = 0; i <=100; i++) { if (i%2==0) { System.out.println(i); } }
		 */

		// =============================================================//
		// cout of the even num
		/*
		 * int count=0; for (int i = 1; i <=100; i++) { if (i%2==0) { count++; } }
		 * System.out.println(count);
		 */
		// ==============================================================//
		// sum of the even number from 1 to 100

		/*
		 * int sum = 0; for (int i = 1; i <= 100; i++) { if (i%2==0) {
		 * 
		 * sum=sum+i; } } System.out.println(sum);
		 */
		// ============================================================//

		// swapping the numbers a=10, b=20 without third variable
		/*
		 * int a=10,b=20,temp=0; System.out.println("before swap a:"+a);
		 * System.out.println("before swap b:"+b); temp =a; a=b; b= temp;
		 * System.out.println("After swap a:"+a); System.out.println("After swap b:"+b);
		 */
		// ===========================================================//
		// without swap

		/*
		 * int a=10 ,b=20; a=a+b; b=a-b; a=a-b;
		 * 
		 * System.out.println(a); System.out.println(b);
		 */
		// ==========================================================//
		// Reverse the number 123 to 321
		/*
		 * int num =123; int rem=0; int rev=0; while (num>0) { rem=num%10; rev
		 * =rev*10+rem; num=num/10; } System.out.println(rev);
		 */
		// ========================================================//
		// Palindrome number
		/*
		 * int num = 121; int temp = num; int rem =0; int rev =0; while (num>0) { rem=
		 * num/ 10; rev = rev * 10 + rem; num=num / 10;
		 * 
		 * }if (temp==rev) { System.out.println("Is a polindrome"); }else {
		 * System.out.println("Not a polindrome"); }
		 * 
		 * 
		 */

	}

}
