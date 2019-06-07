package corejava;

class InValidVoterException extends Exception{
	InValidVoterException(String text){
	super(text);
	}
}

public class Throws_Throw {

	static void validate(int age) throws InValidVoterException{
		if(age<18)
		{
			throw new InValidVoterException("Go back, you are not adult");
		}else {
			System.out.println("Welcome, sir");
		}
	}
	
	public static void main(String[] args) {
		try {
			validate(18);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
