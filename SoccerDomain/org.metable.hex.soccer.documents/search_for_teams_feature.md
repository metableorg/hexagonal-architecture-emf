# Feature: Search for a soccer player's club team
As a soccer fan who prefers to follow a player over a team 

I want to search for a player's club team and position by their name

So that I can easily stay informed about about a player

## Scenario: Soccer fan searches on a name that does not match a player's name 
Given a name that does not match a player's name

When the fan requests the search results

Then the fan is informed that there is no matching player's name 

## Scenario: Soccer fan finds the name of a player's club team and position
Given a name that matches a player's name

When the fan requests the search results

Then fan is shown the name of the player's club team

And the fan is shown the player's position on their club team