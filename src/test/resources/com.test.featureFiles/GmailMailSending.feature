@MailSending

  Feature: Gmail Mail Sending Test Script


    @EmailSending_GMAIL
    Scenario Outline: Gmail Mail Sending
      Given  I login to Gmail application with "<MailId>" and "<Password>"
      Then   Verifying the Gmail Landing Page
      And    I Click on Compose Button in Gmail Landing Page
      Then   I enter the "<ToMailAddress>" and "<Subject>" and "<BodyOfMail>"
      And    I Click On Send Button
      Then   I close the Browser


      Examples:
        | MailId                     | Password      | ToMailAddress              | Subject  | BodyOfMail                      |
        | testincubyte2021@gmail.com | Password@1234 | testincubyte2021@gmail.com | Incubyte | Automation QA test for Incubyte |


