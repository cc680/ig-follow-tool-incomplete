package model;
/**
 * 
 */

/**
 * @author wxc
 *
 */

public interface IModel {
	
	/**
	 * 
	 * @throws IllegalStateException
	 */
	void pullFollowData() throws IllegalStateException;
	
	/**
	 * 
	 * @return
	 * @throws IllegalStateException
	 */
	String[] getFollowers() throws IllegalStateException;
	
	/**
	 * @return
	 * @throws IllegalStateException
	 */
	String[] getFollowing() throws IllegalStateException;
	
	/**
	 * @return
	 * @throws IllegalStateException
	 */
	String[] getNonfollowers() throws IllegalStateException;
	
	/**
	 * @return
	 * @throws IllegalStateException
	 */
	String[] getFollowersNotFollowed() throws IllegalStateException;
	
	/**
	 * @param user
	 * @throws IllegalArgumentException
	 * @throws IllegalStateException
	 */
	void allowNonfollower(String user) throws IllegalArgumentException, IllegalStateException;
	
	/**
	 * @param user
	 * @throws IllegalArgumentException
	 * @throws IllegalStateException
	 */
	void allowFollowersNotFollowed(String user) throws IllegalArgumentException, IllegalStateException;
	
	
	/**
	 * @param user
	 * @throws IllegalArgumentException
	 * @throws IllegalStateException
	 */
	void disallowNonfollower(String user) throws IllegalArgumentException, IllegalStateException;
	
	/**
	 * @param user
	 * @throws IllegalArgumentException
	 * @throws IllegalStateException
	 */
	void disallowFollower(String user) throws IllegalArgumentException, IllegalStateException;	
	
	/**
	 * @return
	 * @throws IllegalStateException
	 */
	String[] getAllowedNonFollowers() throws IllegalStateException;
	
	/**
	 * @return
	 * @throws IllegalStateException
	 */
	String[] getAllowFollowersNotFollowed() throws IllegalStateException;
	
	/**
	 * @param users
	 * @throws IllegalArgumentException
	 * @throws IllegalStateException
	 */
	void follow(String... users) throws IllegalArgumentException, IllegalStateException;
	
	/**
	 * @param users
	 * @throws IllegalArgumentException
	 * @throws IllegalStateException
	 */
	void unfollow(String... users) throws IllegalArgumentException, IllegalStateException;

}
