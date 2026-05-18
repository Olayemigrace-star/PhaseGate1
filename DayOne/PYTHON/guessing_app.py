import random

for number in range(0, 6):
    value = int(input("Enter your guess: "))
    sort = random.randint(1, 100)
    print(sort)
    if(value < 0 or value > 100):
        print("You Entered An Invalid Number: ")
    elif (value < sort):
        print("Your answer is less than the actual value")
    elif(value > sort):
        print("Your answer is greater than the actual value")
    elif(value == sort):
        print("You Entered the right Number: ")
        print("Legendary")
    elif(value == sort):
        print("You Entered the right Number: ")
        print("Legendary")
    else:
        print("Error!!!")
    
      
        break;
     
