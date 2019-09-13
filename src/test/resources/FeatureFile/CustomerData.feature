Feature: Add Customer Flow 

#Scenario: 

#Given user should be in home page
#And user should click add customer 
#When user gives the valid details
#And user should click submit
#Then user should get generated id 

#Scenario: 

#Given user should be in home page
#And user should click add customer 
#When user enters the valid details
#|Sowjanya | Siva | Sowjan@gmail.com | Chennai | 8976589765|
#And user should click submit
#Then user should get generated id 

#Scenario: 

#	Given user should be in home page 
#	And user should click add customer 
#	When user enters to the valid details 
#		|Fstname|Sowjanya|
#		|Lstname|Siva|
#		|Email|Sowjan@gmail.com|
#		|Addres|Chennai|
#		|Phno|8976589765|
#	And user should click submit 
#	Then user should get generated id 

#Scenario: 

	#Given user should be in home page 
	#And user should click add customer 
	#When user enters all the valid details 
	#	|Sowjanya | Siva | Sowjan@gmail.com | Chennai | 8976589765|
	#	|Sowji | giri | Sowji@gmail.com | Chennai | 9956589765|
		
	#And user should click submit 
	#Then user should get generated id 
	
Scenario: 

	Given user should be in home page 
	And user should click add customer 
	When user enters too the valid details 
		|firstname | lastname | email | address| phno|
		|Sowjanya | Siva | Sowjan@gmail.com | Chennai | 8976589765|
		|chinni | giri | chinni@gmail.com | Chennai | 9956589765|
		
	And user should click submit 
	Then user should get generated id 
	
	
