Feature: Visa checks

  @Sanity @Regression


  Scenario: An Australian coming to the UK for Tourism.
    Given I am on the Check UK visa website
    When  I start visa check
    And I select a nationality of 'australia'
    And I click on next button
    And I select reason 'tourism'
    And I click on continue button
    Then I will be informed 'You will not need a visa to come to the UK'

  @Smoke @Regression

  Scenario: A Chilean coming to the UK for Work and plans on staying for longer than 6 months.
    Given I am on the Check UK visa website
    When  I start visa check
    And   I select a nationality of 'chile'
    And I click on next button
    And I select reason 'Work, academic visit or business'
    And I click on next button
    And I state I am intending to stay for 'more' than 6 months
    And I click on next button
    And I state I have planning to work 'health' types of job
    And I click on next button
    Then I will be informed 'You need a visa to work in health and care'

  @Regression
  Scenario: A Columbian national coming to the UK to join a partner for a long stay. They do have an Article 10 or 20 card.
    Given I am on the Check UK visa website
    When  I start visa check
    And    I select a nationality  of 'colombia'
    And I click on next button
    And I select reason 'family'
    And I click on next button
    And I state My partner or family member have uk immigration status 'yes'
    And I click on next button
    Then I will be informed 'You’ll need a visa to join your family or partner in the UK'