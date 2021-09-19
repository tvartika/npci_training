stack = []
n = int(input("Number of elements in the stack: "))
for i in range(0,n):
    a=int(input())
    stack.append(a)
print("The stack is: ", stack)

queue = []


b = sorted(stack, reverse=True)
print(b)
c = b.pop()
d = b.pop()

for i in b:
    if i % c == 0 or i % d == 0:
        e = queue.append(i)

print("The queue is: ", queue)

