# HW pp 36, Try it yourself
# by Martin Li
# made September 22, 2019


#3-1.Names

nameList = ["Sullivan", "Will", "Seb", "Kevin","Carl", "Steven"]
print(nameList[0])
print(nameList[1])
print(nameList[2])
print(nameList[3])
print(nameList[4])
print(nameList[5])
print("\n")

#3-2.Greetings

n=0
while(n<6):
    greeting = f"Good evening {nameList[n].upper()}, I am now writing my homework!"
    print(greeting)
    n = n+1
print("\n")
    
#3-3. Your Own List

transportations = ["flying car", "rocket", "space ship"]

x = 0
while(x<3):
    TransList = f"I would like to own a {transportations[x].title()}!"
    print(TransList)
    x = x+1
print("\n")

#Food List

foodList = ["cookie", "ice-cream", "coffee", "brownie"]
print(foodList[0])
print(foodList[1])
print(foodList[2])
print(foodList[3])
print("\n")

# Food List for Hausenfeffer

del foodList [3]
foodList.append('water')
print(foodList)


