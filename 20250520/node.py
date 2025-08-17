class Node:
    def __init__(self, data, previous=None, next=None):
        self.data = data
        self.next = next
        self.previous = previous

    def __repr__(self):
        return f"Node({self.data})"
    
