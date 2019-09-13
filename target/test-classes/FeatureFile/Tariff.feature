Feature: Add Tariff plan Flow 

#Scenario: 

#	Given user should be in home page 
#	And user should click tariff plans 
#	When user choose tariff plans 
#	And user click on submit button 
#	Then user should get displayed congratulation 
#Scenario: 

#	Given user should be in home page 
#	And user should click tariff plans 
#	When user chooses tariff plans 
#		|8000 | 50| 70 | 40 | 5|150|200|
#	And user click on submit button 
#	Then user should get displayed congratulation 
#Scenario: 

#	Given user should be in home page 
#	And user should click tariff plans 
#	When user chooses to tariff plans 
#		|re|8000 |
#		|lm |50| 
#		|im|70 | 
#		|sp|40 |
#		|mc| 5|
#		|ic|150|
#		|sc|200|
#	And user click on submit button 
#	Then user should get displayed congratulation
 
#Scenario: 
#	Given user should be in home page 
#	And user should click tariff plans 
#	When user chooses the tariff plans 
#		|8000 | 50| 70 | 40 | 5|150|200|
#		|9000 | 10| 20 | 60 | 15|1500|20|
#	And user click on submit button 
#	Then user should get displayed congratulation

Scenario: 
	Given user should be in home page 
	And user should click tariff plans 
	When user check the tariff plans 
		|ren | lme| ime | sps | mcs|ics|scs|
		|8000 | 50| 70 | 40 | 5|150|200|
		|9000 | 10| 20 | 60 | 15|1500|20|
	And user click on submit button 
	Then user should get displayed congratulation