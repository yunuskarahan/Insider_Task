Feature: Insider Task

  @test1
  Scenario: task
    Given  the user is on the home page
    Then the user should see the "#1 Leader in Individualized, Cross-Channel CX — Insider"in the title on the homepage
    When  user click on the more menu
   Then the user should see the Careers menu in the other menu
    And the user clicks on the career page
    Then the user should see the page title is "Insider Careers"
    And the user should see the  "Find your calling" teams header
    And the user should see the "Our Locations" location header
    And the user should see the "Life at Insider" life at inseder header
    And the user clicks on the see all teams button
    Then the user should see all the jobs
      | Customer Success            |
      | Sales                       |
      | Product & Engineering       |
      | Finance & Business Support  |
      | Marketing                   |
      | CEO’s Executive Office      |
      | Purchasing & Operations     |
      | People and Culture          |
      | Business Intelligence       |
      | Security Engineering        |
      | Partnership                 |
      | Quality Assurance           |
      | Mobile Business Unit        |
      | Partner Support Development |
      | Product Design              |
    And the user clicks on the quality assurance menu
    Then the user should be see the header "Quality Assurance"
    Then the user should be See all QA jobs button
    And the user clicks on the See all QA jobs button
    Then the user should see that the department name is "Quality Assurance" in the filtering
    And the user clicks on the location filtering button
    Then the user should see that the entire location filter menu opens
    And the user clicks on Istanbul, Turkey
    Then the user should see that the location name is "Istanbul, Turkey" in the filtering
    Then the user should only see the "Istanbul, Turkey" and "Quality Assurance"  results
    Then the user should see the Apply Now button
    And the user clicks on Apply Now Button
    Then the user should see the "jobs.lever.co" url













