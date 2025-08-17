from node import Node

class DoubleLinkedList:
    def __init__(self):
        self.head = None
        self.tail = None
        self._len = 0
        
    def append(self, value):
        new = Node(value, previous=self.tail)
        if self.tail:
            self.tail.next=new
        else:
            self.head = new
        self.tail = new
        self._len +=1

    def prepend(self, value):
        new = Node(value, next=self.head)
        if self.head:
            self.head.previous = new
        else:
            self.tail = new
        self.head = new
        self._len += 1
    
    def __iter__(self):
        cur = self.head
        while cur:
            yield cur.data
            cur = cur.next
    
    def __len__(self):
        return self._len

    def __repr__(self):
        elems = ", ".join(map(str, self))
        return f"[{elems}] :: (len={self._len})"
        
