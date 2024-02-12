# Final Project Website

# Overview
This document provides an overview of the testing conducted for the Katalon project. The testing covers two main test suites: User Management and Shopping Suite. Each test suite contains specific test cases with detailed steps to ensure the functionality of the application.

# User Management Test Suite
## Login Test
1. Open URL : Navigate to the application URL.
2. Click Profile icon : Locate and click on the Profile icon.
3. Login by username & password : Enter valid username and password.
4. Click remember me : Check the "Remember Me" checkbox.
5. Click Log-in button : Submit the login form.
6. Verify username in profile button: Confirm that the username is displayed on the profile button.

## Register Test
1. Open URL : Navigate to the application URL.
2. Click Profile Icon : Locate and click on the Profile icon.
3. Click Create Account : Navigate to the account creation page.
4. Fill Account Details : Enter account information.
5. Fill Personal Details : Enter personal details.
6. Fill Address : Enter address information.
7. Click Register : Submit the registration form.
8. Login : Log in with the newly created account.
9. Verify username in profile button : Confirm that the username on the profile button matches the one created during registration.

# Shopping Suite
## Filter Search
1. Open URL : Navigate to the application URL.
2. Click Speaker : Select the "Speaker" category.
3. Click Manufacturer button : Open the Manufacturer filter options.
4. Click Manufacturer (Bose, HP, Logitech) : Choose one or more manufacturers.
5. Page menampilkan hasil search : Confirm that the search results are displayed.
6. Click Color button : Open the Color filter options.
7. Click Color (Black, Blue, Red, White) : Choose one or more colors.
8. Page menampilkan hasil search : Confirm that the search results are updated based on the selected filters.

## Checkout Test
1. Open URL : Navigate to the application URL.
2. Login : Log in with valid credentials.
3. Click Speaker : Select the "Speaker" category.
4. Click Buy Now : Purchase a selected item.
5. Click Add to Cart : Add the item to the shopping cart.
6. Click Cart button : Open the shopping cart.
7. Click Checkout : Initiate the checkout process.
8. Choose CashPay or Mastercredit : Choose between payment options.
9. Fill form : Enter the required information.
10. Checkout : Complete the checkout process.
11. Verify that the checkout is successful.
    
## Conclusion
This documentation provides a comprehensive overview of the testing conducted for the Katalon project. Each test case within the test suites was executed to ensure the functionality and reliability of the application. Additional tests and scenarios can be added as needed for further coverage.
