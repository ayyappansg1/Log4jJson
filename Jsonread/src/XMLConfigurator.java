import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class XMLConfigurator {
	static Logger logger=Logger.getLogger(XMLConfigurator.class);
	
	public static void main(String[] args) {
		DOMConfigurator.configure("log.xml");
		logger.debug("This is normal Message");
		logger.info("This is normal Message");
		logger.warn("This is normal Message");
		logger.error("This is normal Message");
		logger.fatal("This is normal Message");
		
		
		
		
	}
	
	

}
