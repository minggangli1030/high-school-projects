# Code to play with print and input (strings)
# by Martin Li
# made September 9, 2019

print ("Hi")
print ("I am so happy to be doing Python today")

name = input ("so great, what is your name?\n")
print("great," + name + " is a great name")

age = input ("Cool, how old are you?\n")

ageAt2050 = (2050-2019)+ int(age)

#print ("then, you will be " + str(ageAt2050) + " in 2050")

print("You are going to be {} when it is 2050".format(ageAt2050))
