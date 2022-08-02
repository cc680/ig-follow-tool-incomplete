# IG-Follow-Tool

8/1/2022 remake notes:

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
