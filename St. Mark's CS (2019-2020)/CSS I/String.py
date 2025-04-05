# String
# by Martin Li
# made September 16, 2019

feelings = "poorly"
name = "Martin"
myPhoneNumber = "911"
x = 24

# String is a data type for text
# means "string of characters"
# with print statements you have to watch out for data types

# string.upper()
# string.lower()
# string.capitalize(): upper the first letter of the first word
# string.title(): upper the first letter of every word

# use one of these methods to convert
print (x)
print("this is " + str(x))
print ("CAESAR is feeling {} ".format(feelings) + "today!")
print ("JOKer feels like he is " + str(x) + " years old")
print (f"clown is feeling {feelings} today!".upper())
print(name.upper())

x = True
Ans = input("do you want to continue?")
while(x):
    if (Ans.lower() == "yes"):
        print("this works!")
        x= False
    else:
        print("THIS IS NOT WORKING")
        break
    





