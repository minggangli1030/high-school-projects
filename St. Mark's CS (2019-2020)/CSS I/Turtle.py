# Code to draw with turtle
# by Martin Li
# made September 11, 2019

import turtle

t = turtle.Turtle()
t.speed(0)
t.shape('turtle')

def makeSquare(size): # 定义一个子程序，方便之后执行

    for i in range(4):
        t.forward(size)
        t.right(90)


t.color('red', 'blue')



for i in range(15):
    t.begin_fill()
    makeSquare((i+1)*10)
    t.end_fill()



    

