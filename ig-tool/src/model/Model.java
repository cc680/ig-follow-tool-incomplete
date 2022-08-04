package model;

import java.util.ArrayList;

public class Model implements IModel {
	
	private String username;
	private ArrayList<String> followers;
	private ArrayList<String> following;
	private ArrayList<String> allowedNonfollowers;
	private ArrayList<String> allowedNotfollowing;
	
	
	public Model() {
		username = null;
		followers = null;
		following = null;
		allowedNonfollowers = null;
		allowedNotfollowing = null;
	}
	
	public Model(String username, String password) throws IllegalArgumentException {
		this.username = username;
		// do logging in stuff
		this.pullFollowData();	
	}


	@Override
	public void pullFollowData() throws IllegalStateException {
		// TODO Auto-generated method stub
		
	}


	@Override
	public String[] getFollowers() throws IllegalStateException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public String[] getFollowing() throws IllegalStateException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public String[] getNonfollowers() throws IllegalStateException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public String[] getFollowersNotFollowed() throws IllegalStateException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void allowNonfollower(String user) throws IllegalArgumentException, IllegalStateException {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void allowFollowersNotFollowed(String user) throws IllegalArgumentException, IllegalStateException {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void disallowNonfollower(String user) throws IllegalArgumentException, IllegalStateException {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void disallowFollower(String user) throws IllegalArgumentException, IllegalStateException {
		// TODO Auto-generated method stub
		
	}


	@Override
	public String[] getAllowedNonFollowers() throws IllegalStateException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public String[] getAllowFollowersNotFollowed() throws IllegalStateException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void follow(String... users) throws IllegalArgumentException, IllegalStateException {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void unfollow(String... users) throws IllegalArgumentException, IllegalStateException {
		// TODO Auto-generated method stub
		
	}

	

}
