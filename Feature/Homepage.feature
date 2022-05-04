Feature: Application Verification

	Scenario: verify the product
	Given user is on home page
	When user hover on more products
	And click on kids brushes
	Then text Kids displayed in second brush in list
	And close the driver
		