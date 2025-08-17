from node import Node

class LinkedList:
    "implementação de uma lista ligada"
    def __init__(self):
        self.head = None

    def prepend(self, data):
        novo_no = Node(data)
        novo_no.next = self.head
        self.head = novo_no
    
    def append(self, data):
        novo_no = Node(data)
        if not self.head:
            self.head = novo_no
            return
        atual =self.head
        while atual.next:
            atual = atual.next
        atual.next = novo_no

