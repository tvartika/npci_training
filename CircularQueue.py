class Circular:
    def __init__(self):
        self.queue = list()
        self.front = 0
        self.end = 0
        self.maxSize = 10
    def enqueue(self, element):
        if self.size() == self.maxSize - 1:
            return ("Queue is full.")
        else:
            self.queue.append(element)
            self.end = (self.end+1) % self.maxSize
            return True
    def dequeue(self):
        if self.size() == 0:
            return("Queue is empty.")
        else:
            element = self.queue[self.front]
            self.front = (self.front + 1) % self.maxSize
            return element
    def size(self):
        if self.end >= self.front:
            return (self.end - self.front)
        return (self.maxSize - (self.front - self.end))
    
q = Circular()
print(q.enqueue(14))
print(q.enqueue(25))
print(q.enqueue(32))
print(q.enqueue(47))
print(q.dequeue())
print(q.size())