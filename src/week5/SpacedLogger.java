package week5;

public class SpacedLogger implements Logger {

	@Override
	public void log(String log) {
		
		for (int i=0; i < log.length(); i++) {
			System.out.print(log.charAt(i) + " "); 
		}	
		System.out.println();
	}
       
	@Override
	public void error(String log) {
	
        	 System.out.print("ERROR:");
		for (int i=0; i< log.length(); i++) {
			System.out.print(log.charAt(i) + " "); 
		}
		
	} 


}
