from linked_list import LinkedList
from node import Node

class Principal:
    pass


if __name__ == "__main__":
    lista_ligada = LinkedList()
    lista_ligada.prepend("A")
    lista_ligada.prepend("B")
    lista_ligada.prepend("C")
    print(lista_ligada.head)
    while lista_ligada.head.next:
        atual = lista_ligada.head.next
        print(atual)
        lista_ligada.head.next = atual.next


