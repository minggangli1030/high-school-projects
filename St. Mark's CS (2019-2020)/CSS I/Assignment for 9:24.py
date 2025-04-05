# Assignment for 9/24, PCC #36-48
# by Martin Li
# made September 24, 2019


Guest_List = ["Albert Einstein", "Zedong Mao", "Joseph Stalin", "Julius Caesar"]

def MakeInvites():
    for guest in Guest_List:
        spaceLoc = guest.find(" ")
        firstname = guest [ : spaceLoc]
        print("Dear " + firstname.title() + ", \n\tPlease come to my dinner: \n\tSep 25, 2019 \n\tAt my house")
        print("\n")
        
# 3-4 Guest List

MakeInvites()

print("\n")

# 3-5 Changing Guest List

print(Guest_List[2] + " can't come to the dinner")
del Guest_List[2]
Guest_List.insert(2, "JOKer")
print("\n")
for name in Guest_List:
    print(name + ", please come to dinner with Martin Li on Sep 25, 2019")

print("\n")

# 3-6 More Guests

for name in Guest_List:
    print("Hi "+ name + ", I just found a larger dinner table!")

print("\n")

Guest_List.append("‎Alexander the Great")
Guest_List.insert(0, "King Arthur")
Guest_List.insert(3, "Merlin")

for name in Guest_List:
    print(name + ", please come to dinner with Martin Li on Sep 25, 2019")

print("\n")

# 3-7 Shrinking Guest List

for name in Guest_List:
    print("Hi, " + name + ", I just found out that my new dinner table won't arrive on time for the dinner so I can invite"+
              "only two people")
    
print("\n")
    
for i in range(len(Guest_List)-2):
    popped_GuestList = Guest_List.pop()
    print("I am so sorry " + popped_GuestList + ", the table is full and I will invite you next time")

print("\n")

for name in Guest_List:
    print("Hey, " + name + ", you are still invited!")

del Guest_List[0]
del Guest_List[0]

print("\n")

print(Guest_List)
print (" This is an empty name list !!!")



