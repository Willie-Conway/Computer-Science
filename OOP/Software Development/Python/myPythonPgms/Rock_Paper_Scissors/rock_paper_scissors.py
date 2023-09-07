# Willie Conway
# Rock Paper Scissors 
# Coding with Python 101


# Imports random class
import random

# Define the play functiion and takes input with user variable
# to determine the user choice of rock, paper or scissors

def play():
    user = input("What's your choice ?  'r' for rock, 'p' for paper, 's' for scissors\n ")
    
    # computer variable defines the random choice selected from the sequence
    
    computer = random.choice(['r', 'p', 's'])

    # if statement  determines if user input is equal to
    # computer input it will return there will be a tie 
    if user == computer:
        return 'It\'s a tie'
    

    # Clarification between the following attributes
    # using logical operaters > and <
    
    # r > s, s > p, p > r


    # If statement determines rather the user or the computer
    # is the winner or loser with the is win function with pass in parameters
    # user and computer

    if is_win(user, computer):
        return 'You won!'
    
    return 'You lost!'


# return true if the player wins

# Defines if the player or the opponent is the winner with the 
# is win function with pass in parameters player and opponent
def is_win(player, opponent):

    # r > s, s > p, p > r

    # If statement  determines dirrent outcomes
    # between the player and the opponent with 
    # r, p, s

    if (player == 'r' and opponent == 's') or (player == 's' and opponent == 'p') \
    or (player == 'p' and opponent == 'r'):
        return True
    
# Prints and calls play function
print(play())