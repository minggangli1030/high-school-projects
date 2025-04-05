# Assignment for 9/18
# by Martin Li
# made September 17, 2019

# 2- (p. 19) Assign a message to a variable and then print that message
f = "I am writing my Python homwork right now!"
print(f)

# 2- (p.21)  Make up an example of an "f-string" where you have 3 variable inputs, one of which
# is a number
print("\n")

first_name = "Martin"
last_name = "Li"
full_name = f"{first_name} {last_name}"
birthday = 20041030

print(full_name + " is born on " + str(birthday))
print(f"My name is {full_name}. I am born on {birthday}")

# 2=? (p.22) Print this using only one print statement:
print("\n")

print("Come to a party: \n\tBarnett Lidcap\n\t244 West St.\n\tNew York, NY 10001")

# "\n" => start a new line
# "\t" => start the line with a tab
# "\n\t" => start a new line with a tab

# 2 (pp 25-27) Write the python language statements to do this math
# (and store the result in a variable):
print("\n")

#       Q_1: forty-eight divided by three;
#       Q_2: thirty-six cubed;
#       Q_3: ninety-six times six;
#       Q_4: seventy-five plus eight;

ans_1 = 48/3
ans_2 = 36 ** 3
ans_3 = 96*6
ans_4 = 75+8

print(int(ans_1))
print(ans_2)
print(ans_3)
print(ans_4)

# 2 (p. 28) Can I do this in Python and not get an error?
print("\n")

x=345_678_900
y=4_000_000_000
print(f"the answer is: {(x+y)}")
print("Yes, you can do this without getting an error!")

# 2 (pp.30-31) type "import this"  into a file, save the file and run it (like a code). what happens
print("\n")
import this
print("\n")
print("this is amazing")

