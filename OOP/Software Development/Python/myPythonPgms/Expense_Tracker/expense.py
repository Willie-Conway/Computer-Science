# Expense class which is the blueprint
# for the expense tracker
class Expense:
# Defines parameters self (user), name (expense), category (expense), amount (expense)
# Creates constructor
    def __init__(self, name, category, amount) -> None:

        # Appends parameters to define variables
        self.name = name
        self.category = category
        self.amount  = amount

# Return the Expenese of variable form user
# Uses string to define the function
    def __repr__(self) -> str:
        return f"<Expense: {self.name}, {self.category}, ${self.amount:.2f}>"

    