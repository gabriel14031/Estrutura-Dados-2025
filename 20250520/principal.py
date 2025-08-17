from node import Node
from double_linked_list import DoubleLinkedList

class Principal:
    pass


if __name__ == "__main__":
    listaLigadaDupla = DoubleLinkedList()
    listaLigadaDupla.prepend("A")
    listaLigadaDupla.prepend("B")
    listaLigadaDupla.prepend("C")
    listaLigadaDupla.prepend("D")
    print(listaLigadaDupla)
