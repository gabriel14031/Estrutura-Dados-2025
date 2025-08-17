class Calculadora():

    def __init__(self, valorInicial ):
        self.valor=valorInicial

    def somar(self,operador):
        self.valor = self.valor+operador

    def subtrair(self, operador):
        self.valor = self.valor-operador
    
    def multiplicar(self, operador):
        self.valor = self.valor * operador

    def dividir(self, operador):
        try:
            self.valor = self.valor / operador
        except:
            print("Erro: não é possível realizar a operação indicada")

