#Sophia Colonello
#this will be a review for the test

#import random
import random

#random number for months
numMonths = random.randint(1,12)

#variables
counter = 0
rain = 0
total = 0

#while loop
while counter < numMonths:
    rain = float(input("\n\n\tHow much ran for this month: "))

    #validate
    while rain < 0:
        rain = print("\n\t\tERROR! Please enter a positive number: ")

    #adding
    total += rain

#printing the output
print("\n\n\tThe average is:",format((total/numMonths),".2f"),"inches")
