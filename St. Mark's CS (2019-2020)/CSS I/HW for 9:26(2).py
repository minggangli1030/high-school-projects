
# 3-7 Shrinking Guest List

Guest_List = ["Albert Einstein", "Zedong Mao", "Joseph Stalin", "Julius Caesar"]
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
