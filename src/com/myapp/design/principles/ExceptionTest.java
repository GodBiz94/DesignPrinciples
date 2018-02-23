package com.myapp.design.principles;

public class ExceptionTest {

	public static void main(String[] args) {
		
		try {
			
		} catch (ArrayIndexOutOfBoundsException ae) {
			// TODO: handle exception
		} catch (NullPointerException npe) {
			// TODO: handle exception
		} catch (Exception e) {
			// TODO: handle exception
		}

		
		try{
			
		}catch(NullPointerException  | ArrayIndexOutOfBoundsException e){
			
		}
	}

}
