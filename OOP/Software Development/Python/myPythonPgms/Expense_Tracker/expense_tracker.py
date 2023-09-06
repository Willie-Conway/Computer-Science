# Willie Conway
# Expense Tracker
# Coding with Python 101

# This program creates or adds following montly expenses to a csv file.
# Calculates the name, amount, category, category number and saves the expense by
# summarizing and expenes by category and caluculating the users daily budget, remaining budget 
# and amount of money they spent the following month


# Imports calendar class
import calendar
# Imports dateime class
import datetime

# imports from expense.py the Expense class
from expense import Expense

# Main Function

# Defines main function
def main():

    # prints to file or creates file expenses.csv
    # budget variable define by integer value of 2000
    print(f"Running Expense Tracker!")
    expense_file_path = "expenses.csv"
    budget = 2000


    # Get user input for expense.
    expense = get_user_expense()
    
    # Write their expense to a file
    save_expense_to_file(expense, expense_file_path)

    # Read file and summerize expenses
    summarize_expenses(expense_file_path, budget)

  

# Functions

# Defines the user expenses by expense name using user input
def get_user_expense():
    print(f"Getting User Expense")
    expense_name = input("Enter expense name: ")

    # Cast float data type for expense amount
    expense_amount = float(input("Enter expense amount: "))

    # List categories

    expense_categories = [
        "Food", 
        "Home", 
        "Work", 
        "Fun", 
        "Misc"
    ]

    # While loop to loop through following categories

    while True:
        print("Select a category: ")

        # for loops and overwrites O index with 1 adds 1 to index placements
        # Uses enumerate to iterate the list of expense categories
        # prints and returns the category name
        for i, category_name in enumerate(expense_categories):
            print(f"  {i + 1}. {category_name}")

        value_range = f"[1 - {len(expense_categories)}]"

        # Cast int data type for category number 
        selected_index = int(input(f"Enter a category number {value_range}: ")) - 1

        # Selects the range of the expense categories 

        if selected_index in range(len(expense_categories)):
            selected_category = expense_categories[selected_index]
            new_expense = Expense(
                name=expense_name, category=selected_category, amount=expense_amount 
            )
            return new_expense
        else:
            print("Invalid category. Please try again!")

        break
  
# Saves the expenses to file expense.csv
def save_expense_to_file(expense: Expense, expense_file_path):

    # Prints user expenses to expense file 
    print(f"Saving User Expense: {expense} to {expense_file_path}")

    # Opens and write to expense file expense.csv
    with open(expense_file_path, "a") as f:
        f.write(f"{expense.name},{expense.amount}, {expense.category}\n")

# defines a summarizes expenses with the expense file path and budget
def summarize_expenses(expense_file_path, budget):
    print(f"Summarizing User Expense")

    # Creats list of expenses and open and read the expense file path
    expenses: list[Expense] = []
    with open(expense_file_path, "r") as f:
        lines = f.readlines()

        for line in lines:
            expense_name, expense_amount, expense_category  = line.strip().split(",")
            line_expense = Expense(
                name=expense_name, 
                amount=float(expense_amount), 
                category=expense_category
                
            )
            expenses.append(line_expense)
   
   # Creates a Dictionary for amount
   # of expenses by category
    amount_by_category = {}
    for expense in expenses:
        key = expense.category

        # If else statement to determine expense amount
        if key in amount_by_category:
            amount_by_category[key] += expense.amount
        else:
            amount_by_category[key] = expense.amount
    
    # Prints expenses by category
    print("Expenses By Category")

    # for loops the the key variable and any amount variable
    # in the amount by category dictonary list of the entered items 
    for key, amount in amount_by_category.items():
        print(f" {key}: ${amount:.2f}")

    # Sum function sets the list as a argument to
    # get the expenses amount for the expense in 
    # expenses of the total spent


    # total budget variable is used to define the sum function

    total_spent = sum({ex.amount for ex in expenses})
    print(f"You've Spent: ${total_spent:.2f} this month!")

    # remaining budget variable is used to define budget parameter
    # and subtracts it from the total spent varaible to retrieve
    # the remaining budget for the month

    remaining_budget = budget - total_spent
    print(f"Budget Remaining: ${remaining_budget:.2f} this month!")

    # get the current date
    now = datetime.datetime.now()

    # Get the number of days in the current month
    days_in_month = calendar.monthrange(now.year, now.month)[1]

    # Calculate the remaining number of days in the current month
    remaining_days = days_in_month - now.day

    daily_budget = remaining_budget / remaining_days

    # Prints and wraps string into a funtion to print green text
    # for daily budget
    print(green(f"Budget Per Day: ${daily_budget:.2f}"))-1
    # Takes string and returns green text with special characters
def green(text):
    return f"\033[92m{text}\033[0n"


# if statement  assigns the name to main string
# Calls main function
if __name__ == "__main__":
    main()