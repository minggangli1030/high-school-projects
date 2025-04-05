# HW 9/22, random randint turtle
# by Martin Li
# made September 22, 2019

import turtle
from random import randint
import math

turtle.colormode(255)

s = turtle.getscreen()
s.setup(750,750)
s.title("many turtles!")
s.bgcolor(0,0,0)

t = turtle.getturtle()
t.hideturtle()

maxLength=int (math.sqrt(375**2 +375**2 ))

for i in range (2000):
    newTurt = turtle.Turtle()
    newTurt.shape("turtle")
    newTurt.pencolor(randint(0,255), randint(0,255), randint(0,255))
    newTurt.fillcolor(randint(0,255), randint(0,255), randint(0,255))
    newTurt.width(randint(2,6))
    newTurt.speed(0)
    newTurt.setheading(randint(0,359))
    newTurt.speed(0)
    newTurt.forward(randint(1,maxLength))
    print(i)

    

