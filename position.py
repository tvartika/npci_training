a=[]
n=int(input("Number of elements in the array: "))
for i in range(0,n):
    b=int(input())
    a.append(b)
print("Array: ", a)

s = int(input("To find position of: "))

if s in a:
    u = a.index(s)
    pos  = u+1
print(pos)
    
