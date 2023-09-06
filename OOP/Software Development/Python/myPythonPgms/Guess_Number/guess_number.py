# Willie Conway
# The Guessing Game
# Coding with Python 101


# Imports the random number class
import random


# Guess the number user

# Defines guess function and pass in parameter x two define random number
def guess(x):

    # random number variable is define by the random module that defines a integer
    # and is appended to the randint (random integer) function to define pass in parameters (1, x)
    random_number = random. randint(1, x)

    # guess variable is set a zero
    guess = 0


    # Whille loop guess function to search for random numer
    # within the loop

    while guess != random_number:

        # Cast integer for user input for a number from 1 to 10
        guess = int(input(f"Guess a number between 1 and {x}: "))

        # If else statment that determines is the guess number is to
        # hgh or to low. Then prints the following response
        if guess < random_number:
            print("Sorry guess again. Too low.")
        elif guess > random_number:
            print("Sorry, guess again. Too high.")

      # Prints line text and output the random number that was selected from the loop      

    print(f"Yay, congrats! You have guesses the numeber {random_number} correctly. ")



# # Guess the number computer
# def computer_guess(x):
#     low = 1
#     high = x
#     feedback = ""
#     while feedback != "c":
#         if low != high:
#          guess = random.randint(low, high)
#     else:
#         guess = low # could also be high b/c low = high
#         feedback = input(f"Is {guess} too high (H), too low (L), or correct (C)??").lower()
#         if feedback == "h":
#             high = guess - 1
#         elif feedback == "l":
#             low = guess + 1

#     print(f"Yay! The computer guessed your number, {guess}, correctly!")


# #  Calls computer guess
# computer_guess(10)



# Calls guess function
guess(10)
