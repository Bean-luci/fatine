package _01_User;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App {
	
	
	private static Logger logger = LogManager.getLogger (App.class);
			

	public static void main(String[] args) {
			
			
		logger.info ("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");	
		logger.info ("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");	
		logger.info ("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");	
		logger.info ("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");	

		
		try {
				User user= new User("duck","riri",12);
				//System.out.println(user);
				
				user.setAge(-15);
				//System.out.println(user);
				user.setAge(13);
				
				
				
				
			} catch (Exception e) {
				
				//System.out.println(e.getMessage());
				
				logger.warn (e.getMessage());
				
			}
			
			finally {
				
				
				System.out.println(" Le bloc finally est execute quoiqu'il arrive.avec ou sans exception");
				System.out.println(" Il est souvent utilis� pour lib�rer des ressources.(flux, connexion de BDD..)");
			}
		
		
	}

}
