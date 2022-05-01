import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class ProperityFilConfig {


		
		static Logger logger=Logger.getLogger(ProperityFilConfig.class);
		
		public static void main(String[] args) {
			
			PropertyConfigurator.configure("config2.properties");
			logger.debug("this is sangar");
			logger.info("This is Info message");
			logger.warn("This is warning message");
			logger.error("This is error message");
			logger.fatal("This is fatal message");
		
		
		
		
		
		
	}
	
	
	
}
