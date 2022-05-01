import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Logging {


		
		static Logger logger=Logger.getLogger(Logging.class);
		
		public static void main(String[] args) {
			
			BasicConfigurator.configure();
			logger.debug("This is Debug message");
			logger.info("This is Info message");
			logger.warn("This is warning message");
			logger.error("This is error message");
			logger.fatal("This is fatal message");
		
		
		
		
		
		
		
	}
	
	
	
}
