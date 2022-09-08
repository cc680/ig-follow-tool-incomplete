# IG-Follow-Tool

9/8/2022 remake notes:
- Based off "ig_scrape_follow_tool," but with a GUI & additional features

# Features
- login/logout
- comparing followers vs following
- enables automatic following/unfollowing
- pause, continue, stop
- allows whitelist of certain accounts to remain unchanged

# Design
- MVC framework

# Workflow
- user logs in
- gets follower, following list 
  - displays stats
  - shows 2 scrollable lists: follower/following
    - in each section, top of list shows whitelist
- button to follow/unfollow automatically
  - built-in delay
- pause/continue & stop button
- refresh data button
- logout

# Deliverables
- method of logging in (opening chrome -> taking username/password, 
loging, delay)
- method of scraping following/follower list
  - upload html/json
  - scrape from html?
- automate following/unfollowing
- 
