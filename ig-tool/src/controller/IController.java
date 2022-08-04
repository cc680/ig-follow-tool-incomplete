package controller;
/**
 * 
 */

/**
 * @author wxc
 *
 */
public interface IController {

	
	/**
	 * 
	 * @param username
	 * @param password
	 * @throws IllegalArgumentException
	 * @throws IllegalStateException
	 */
	void login(String username, String password) throws IllegalArgumentException, IllegalStateException;	
	
	/**
	 * 
	 * @throws IllegalStateException
	 */
	void logout() throws IllegalStateException;
	
	/**
	 * @throws IllegalStateException
	 */
	void pause() throws IllegalStateException;
	
	/**
	 * @throws IllegalStateException
	 */
	void unpause() throws IllegalStateException;		
}
