package yichang;

import javax.swing.JOptionPane;

public class MyException extends Exception{
	String message;
	
	public MyException(String message) {
	     super(message);
	     this.message = message;
	}
	
	public void printStackTrace() {
		super.printStackTrace();
		JOptionPane.showMessageDialog(null,message,"�����쳣",JOptionPane.ERROR_MESSAGE);
	}
	
}
