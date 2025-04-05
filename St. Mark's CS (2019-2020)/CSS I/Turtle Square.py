# Code to draw with turtle
# by Martin Li
# made September 11, 2019

import turtle

t = turtle.Turtle()
t.speed(0)
t.shape('turtle')

def makeSquare(size): # 定义一个子程序
    t.forward(size)
    t.right(90)

    t.forward(size)
    t.right(90)

    t.forward(size)
    t.right(90)

    t.forward(size)
    t.right(90)

t.color('red', 'blue')

t.begin_fill()

makeSquare(100)

t.end_fill()

t.begin_fill()

makeSquare(-50)

t.end_fill()
    

