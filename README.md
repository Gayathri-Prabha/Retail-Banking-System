# Retail-Banking-System
Project Name: Retail-Banking-System

Project Overview: Retail Banking System helps customer to register and create an account with the help of employee. Customer will perform withdrawal, deposit and transfer amount within the retail bank.

Total Microservices:
-----------------------
1.Authentication Microservice

2.Customer Microservice

3.Account Microservice

4.Transaction Microservice

5.Rules Microservice

6.Bank Portal

Functionalities
-----------------
1.Authentication Microservice:
--------------------------------
Main Functionality---> To Generate the token and Validate the token.

Step-1: Open Postman and follow the steps below:

Step-2: Go to Url section and paste---> http://localhost:8084/auth-ms/login

Method: POST

Step-3: Body Section: {"userid": "EMPLOYEE101","username": "emp","password": "emp","authToken" : null,"role": "EMPLOYEE"}

Step-4: Click Send button,then a token will be generated.Copy the token.

Step-5: Open New tab in postman.

Step-6: Paste the Url--> http://localhost:8084/auth-ms/validateToken

Method: GET

Step-7: Go to Authorization Section: Select token type as Bearer ,next paste the token there.

Step-8: Output:
{
    "userid": "EMPLOYEE101",
    "name": "emp",
    "valid": true
}

2.Customer Microservice:
--------------------------
Main Functionality--->

a)Creating a customer profile based on the details provided by the customer

b)Dispaying customer’s profile

a)Creating a customer profile based on the details provided by the customer:
--------------------------------------------------------------------------------
Step-1: Open Postman and follow the steps below:

Step-2: Go to Url section and paste---> http://localhost:8085/customer/createCustomer

Method: POST

Step-3: Body Section: 
{
    
    "userid" : "CUSTOMER129",
    "username" : "Nithisha",
    "password" : "Nithisha",
    "dateOfBirth" : "1999-06-14",
    "pan" : "KJGOT6879P",
    "address" : "Hyderabad",
     "accounts" : [{
        "accountId" : 9879879871,
        "customerId" : "CUSTOMER129",
        "currentBalance" : 20000,
        "accountType" : "Savings",
        "openingDate" : "2015-10-18",
        "ownerName" : "Nithisha",
        "transactions":null

    }]
}

Step-4: Go to Authorization Section: Select token type as Bearer ,next paste the token there.

Step-5: Output:
{
    "userid": "CUSTOMER129",
    "username": "Nithisha",
    "password": "Nithisha",
    "dateOfBirth": "1999-06-14",
    "pan": "KJGOT6879P",
    "address": "Hyderabad",
    "accounts": [
        {
            "accountId": 9879879871,
            "customerId": "CUSTOMER129",
            "currentBalance": 20000.0,
            "accountType": "Savings",
            "openingDate": "2015-10-18T00:00:00.000+00:00",
            "ownerName": "Nithisha",
            "transactions": null
        }
    ]
}

b)Dispaying customer’s profile:
---------------------------------
Step-1: Open Postman and follow the steps below:

Step-2: Go to Url section and paste---> http://localhost:8085/customer/getCustomerDetails/CUSTOMER129

Method: GET

Step-3: Go to Authorization Section: Select token type as Bearer ,next paste the token there.

Step-4: Output:
{
    "userid": "CUSTOMER129",
    "username": "Nithisha",
    "password": null,
    "dateOfBirth": "1999-06-13",
    "pan": "KJGOT6879P",
    "address": "Hyderabad",
    "accounts": [
        {
            "accountId": 1000000004,
            "customerId": "CUSTOMER129",
            "currentBalance": 20000.0,
            "accountType": "Savings",
            "openingDate": "2015-10-18T00:00:00.000+00:00",
            "ownerName": "Nithisha",
            "transactions": []
        }
    ]
}

3.Account Microservice:
-------------------------
Main Functionality--->

a)Depositing to a customer’s account

b)Fetching Accounts related to a Customer as a summary information

c)Withdrawing from a customer’s account

a)Depositing to a customer’s account:
---------------------------------------
Step-1: Open Postman and follow the steps below:

Step-2: Go to Url section and paste---> http://localhost:8086/account-ms/deposit

Method: POST

Step-3: Body Section: 
{
    "accountId" :1000000004,
    "amount":50000
}

Step-4: Go to Authorization Section: Select token type as Bearer ,next paste the token there.

Step-5: Output:
{
    "accountId": 1000000004,
    "customerId": "CUSTOMER129",
    "currentBalance": 70000.0,
    "accountType": "Savings",
    "openingDate": "2015-10-18T00:00:00.000+00:00",
    "ownerName": "Nithisha",
    "transactions": [
        {
            "id": 2,
            "sourceAccountId": 1000000004,
            "sourceOwnerName": "Nithisha",
            "targetAccountId": 1000000004,
            "targetOwnerName": "Nithisha",
            "amount": 50000.0,
            "initiationDate": "2021-07-04T10:52:06.959815",
            "reference": "deposit"
        }
    ]
}

b)Fetching Accounts related to a Customer as a summary information
------------------------------------------------
Step-1: Open Postman and follow the steps below:

Step-2: Go to Url section and paste---> http://localhost:8086/account-ms/getAccount/1000000004

Method: GET

Step-3:  Go to Authorization Section: Select token type as Bearer ,next paste the token there.

Step-4: Output:
{
    "accountId": 1000000004,
    "customerId": "CUSTOMER129",
    "currentBalance": 70000.0,
    "accountType": "Savings",
    "openingDate": "2015-10-18T00:00:00.000+00:00",
    "ownerName": "Nithisha",
    "transactions": null
}

c)Withdrawing from a customer’s account:
-------------------------------------------
Step-1: Open Postman and follow the steps below:

Step-2: Go to Url section and paste---> http://localhost:8086/account-ms/withdraw

Method: POST

Step-3: Body Section: 
{
    "accountId" :1000000004,
    "amount":25000
}

Step-4: Go to Authorization Section: Select token type as Bearer ,next paste the token there.

Step-5: Output:
{
    "accountId": 1000000004,
    "customerId": "CUSTOMER129",
    "currentBalance": 45000.0,
    "accountType": "Savings",
    "openingDate": "2015-10-18T00:00:00.000+00:00",
    "ownerName": "Nithisha",
    "transactions": [
        {
            "id": 2,
            "sourceAccountId": 1000000004,
            "sourceOwnerName": "Nithisha",
            "targetAccountId": 1000000004,
            "targetOwnerName": "Nithisha",
            "amount": 50000.0,
            "initiationDate": "2021-07-04T10:52:06.959815",
            "reference": "deposit"
        },
        {
            "id": 3,
            "sourceAccountId": 1000000004,
            "sourceOwnerName": "Nithisha",
            "targetAccountId": 1000000004,
            "targetOwnerName": "Nithisha",
            "amount": 25000.0,
            "initiationDate": "2021-07-04T10:53:30.08247",
            "reference": "withdrawl"
        }
    ]
}

6.Bank Portal:
-------------------
Functionality:

Bank Portal  must allow a customer to Login. Once successfully logged in, the customer can perform the following operations:

a)View his accounts and balances

b)Transact ( Withdraw(Online transaction), Transfer)

c)View statements

d)View Transactions
