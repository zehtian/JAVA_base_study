package practice;

public class Practice5 {
	public static void main(String[] args) {
	System.out.println(new Practice5().exceptionTest());}
	String exceptionTest(){
	try {
		System.out.println("try_Before");
		System.out.println("try_after");
		return "step_try";
	} catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("ArrayIndexOutofBounds");
		return "step_ArrayIndexOutofBounds";
	} catch (Exception e) {
		System.out.println("ExceptionError");
		return "step_ ExceptionError";
	} finally {
		System.out.println("finally");
		return "step_finally";
}}}
