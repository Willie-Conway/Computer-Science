#string concatenation (aka how to put strings together)
# suppose we wnt to create a string that says "subscribe to ______"
# youtuber = " Willie Conway" # some string variable

# a few ways to do this 
# print("subscribe to " + youtuber)
# print("subscribe to {}".format(youtuber))
# print(f"subscirbe to {youtuber}")

adj =  input("Adjective: ")
verb1 = input("Verb: ")
verb2 = input("Verb: ")
famous_person = input("Famous Person: ")

madlib = f"Computer programming is so {adj}! It makes me so excited all the time because \
I love to {verb1}. Stay hydrated and {verb2} likje you are {famous_person}!"

print(madlib)