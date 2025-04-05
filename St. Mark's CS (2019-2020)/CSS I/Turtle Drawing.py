# Homework for Thurs (9/12) Turtle Drawing
# by Martin Li
# made September 11, 2019

import turtle

s = turtle.getscreen() # get the screen
s.setup(1000,500) # size of the window
s.bgcolor("#9ef542")

t = turtle.getturtle()
t.speed(0)
t.shape('turtle')
t.color('white','red')

def reposition(newX, newY): # this put the turtle in the correct position
    t.hideturtle()
    t.penup()
    t.goto(newX, newY)
    t.showturtle()
    t.pendown()
    

def makeSquareright(size1): # 定义一个子程序，方便之后执行

    for i in range(4):
        t.forward(size1)
        t.right(90)


def makeSquareleft(size2): # 定义一个子程序，方便之后执行

    for i in range(4):
        t.backward(size2)
        t.left(90)

reposition (-500,250) # left pattern

for i in range(19,0,-1): # go from 19 to 0 by -1 step (backward 1)
    t.begin_fill()
    makeSquareright((i+1)*25)
    t.end_fill()
    
t.color('white','blue')

# t.setheading(90) 调整箭头指向的方向

reposition (500,250) # right pattern

for i in range(19,0,-1): # go from 19 to 0 by -1 step (backward 1)
    t.begin_fill()
    makeSquareleft((i+1)*25)
    t.end_fill()


