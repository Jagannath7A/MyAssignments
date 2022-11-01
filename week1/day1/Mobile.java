package week1.day1;

public class Mobile {
	
    /*
     * reate 2 methods (makeCall() , sendMsg()) with simple print statement
- In first method create variable  mobileModel (String),mobileWeight (float)
- In second method create variable  isFullCharged (boolean),mobileCost (int)
- Create main method
Create object for class and call  from main method and print them
- print a statement---->"This is my mobile";
-run and confirm the output printed in console 


     */
	public void makeCal() {
		String mobileModel="";
		float mobileWeight=168.2f;
System.out.println("Make call");
	}
	private void sendMsg() {
		boolean isFullCharged=true;
		int mobileCost=19000;
		System.out.println("Sending message");
	}
	public static void main(String[] args) {
		Mobile obj=new Mobile();
		obj.makeCal();
		obj.sendMsg();
		System.out.println("This is my mobile");
	}
	
	
}

