@MailSending

  Feature: Gmail Mail Sending Test Script




    @TestGmailLogin
    Scenario Outline: Gmail Mail Sending
      Given I login to Gmail application with "<MailId>" and "<Password>"
      Examples:
        | MailId                           | Password      |
        | testincubyte2021@gmail.com       | Password@1234  |


