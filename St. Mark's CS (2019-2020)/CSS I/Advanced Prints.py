# Advanced Prints
# by Martin Li
# made September 11, 2019

name = "Martin JOKer CAESAR clown"

print(name.title()) # it capitalizes everything in the string
print(name.lower()) # it lower-case everything
print(name.upper()) # it upper-case everything

print("\n")

bottingAvg = 0.290
fname = "mookie"
lname = "betts"

print('Hi, my name is ' + fname.title() + " " + lname.title() + ' and my botting average is '
      + str(int(bottingAvg * 1000)))

print('Hi, my name is {} {} and my botting average is {}'.format(fname.title(), lname.title(),
        int(bottingAvg*1000)))
