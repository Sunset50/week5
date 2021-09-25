package week5;

public class App {

	public static void main(String[] args) {
		// put my code here
		Logger logger  = new AsteriskLogger();
		logger.log("Shavonne");
		logger.error("Name");
		Logger logger1 = new SpacedLogger();
		logger1.log("DOB");
		logger1.error("3269");

		}

}