package week5;

public class AsteriskLogger implements Logger {
	// start1

	@Override
	public void log(String log) {
		// TODO Auto-generated method stub Start
		System.out.println( "***" + log + "***" );
		
	}

	@Override
	public void error(String error) {
		// TODO Auto-generated method stub Start
		System.out.println( "****************");
		System.out.println( "***" + "Error:" + error + "***");
		System.out.println( "****************");
	
	}
	
// end1
}
