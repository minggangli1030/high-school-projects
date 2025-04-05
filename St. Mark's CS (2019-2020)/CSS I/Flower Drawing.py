# by Martin Li
# made September 12, 2019

import turtle

s = turtle.getscreen() # get the screen
s.setup(1000,500) # size of the window
s.bgcolor("#7cfc00")

t = turtle.getturtle()
t.speed(0)
t.shape('turtle')
t.color('white','pink')

       
def makePetal():
    for i in range(2):
 
        t.forward(100)
        t.right(60)
        t.forward(100)
        t.right(120)
    
t.begin_fill()

for i in range (360):
    makePetal()
    t.right(1)

t.end_fill()
    
    

