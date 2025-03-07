Fruit_shop = {
    "Banana": 10,
    "Apple": 15, 
    "Pineapple": 13, 
    "Chikku": 32
    }
Check_fruit = input ("What are you looking for? ").lower()

if (Check_fruit in Fruit_shop):
    print("yes, available")

else:
    print("Not available")