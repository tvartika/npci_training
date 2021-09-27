n = int(input("Enter the height of the tower: "))
a = int(input("Enter the difference between two levels: "))

l1 = 1
s = n-1

for i in range(0,n):
    for j in range(0,s):
        print(end=" ")
    s = s-1

    for j in range(0,i+1):
        print(l1, end=" ")
    l1 = l1+a
    print("")


r1 = 1
for i in range(0,n):
    
    print("Sum of the row ", i+1, ": ",r1, "s = ", (i+1)*r1)
    r1 = r1+a