Feature: Button Find a Speaker

Scenario: Find TED Speaker
Given Initialize the browser
And User navigate to "https://www.ted.com/"
And Click on TED Talks on Watch tab
And Select Technology topic on Topics dropdown
And Select English language on Languages dropdown
And Click on More button
And Click on Find a speaker button
When Choose one of the speakers in the page
Then The page of the chosen speaker is displayed