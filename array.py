a=[]
n=int(input("Number of elements in the array: "))
for i in range(0,n):
    b=int(input())
    a.append(b)
print("Array: ", a)

for i in range(n):
    for j in range(i+1,n):
        if (a[i]>a[j]):
            temp = a[i]
            a[i] = a[j]
            a[j] = temp
print("Sorted array: ", a) 
