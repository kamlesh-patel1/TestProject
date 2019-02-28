package nt.exeception;

public class ExeceptionTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	try {
    int a=Integer.parseInt(args[0]);
    int b=Integer.parseInt(args[1]); 
    int c=a/b;
    System.out.println("result:"+c);
    }catch(ArrayIndexOutOfBoundsException ea) {
		System.out.println("plese enter two numbers");
		}
	catch(NumberFormatException enfe) {
		System.out.println("enter integer value");
	}
	catch(ArithmeticException eae) {
		System.out.println("don't enter scond value as zero");
	}
	}
}
