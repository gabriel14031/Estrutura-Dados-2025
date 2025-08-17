class Contador:

    def __init__(self, valorInicial=0):
        self.valor = valorInicial

    def setarLimite(self):
        self.limite = input("Digite o número de itens que deseja contar")

    def incrementar(self):
        self.valor += 1
        if self.valor == int(self.limite):
            print("Limite atingido")
        return self    
    

if __name__ == '__main__':
    contador = Contador()
    contador.setarLimite()
    while contador.valor <= int(contador.limite):
        contador.incrementar()
