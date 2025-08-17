class Calculadora:

    def __init__(self, valorInicial=0):
        self.valor = valorInicial

    def somar(self, operador):
        self.valor += operador
        return self

    def subtrair(self, operador):
        self.valor -= operador
        return self

    def multiplicar(self, operador):
        self.valor *= operador
        return self

    def dividir(self, operador):
        try:
            self.valor /= operador
        except ZeroDivisionError:
            print("Erro: divisão por zero não é permitida.")
        return self

    def get_valor(self):
        return self.valor

    def reset(self, novo_valor=0):
        self.valor = novo_valor
        return self
