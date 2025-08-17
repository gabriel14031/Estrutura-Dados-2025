import Calculadora
import CalculadoraFuncional

class UsaCalculadora:

    def __init__(self):
        inicial = float(input("Digite um valor para iniciar a calculadora: "))        
        self.calculadora = Calculadora.Calculadora(inicial)
        self.calculadoraFuncional = CalculadoraFuncional.Calculadora(inicial);

    def iniciar(self):
        print("Bem-vindo à calculadora! Digite 5 para sair.")

        opcao = 0  # Inicializa a variável para entrar no loop
        while opcao!=5:
            print(f"\nValor atual: {self.calculadora.valor}")
            print("Escolha uma operação:")
            print("1 - Somar")
            print("2 - Subtrair")
            print("3 - Multiplicar")
            print("4 - Dividir")
            print("5 - Sair")

            try:
                opcao = int(input("Digite a opção desejada: "))
                
                if opcao == 5:
                    break  # Encerra o loop quando o usuário digita 5
                
                if opcao not in [1, 2, 3, 4]:  
                    print("Opção inválida. Tente novamente.")
                    continue  # Volta ao início do loop

                operador = float(input("Digite um valor: "))

                if opcao == 1:
                    self.calculadora.somar(operador)
                elif opcao == 2:
                    self.calculadora.subtrair(operador)
                elif opcao == 3:
                    self.calculadora.multiplicar(operador)
                elif opcao == 4:
                    if operador == 0:
                        print("Erro: divisão por zero não é permitida.")
                    else:
                        self.calculadora.dividir(operador)

            except ValueError:
                print("Erro: Digite um número válido.")
        
        print("Encerrando a calculadora. Resultado final:", self.calculadora.valor)

    def iniciarFuncional(self):
        print(self.calculadoraFuncional.somar(5).subtrair(3).multiplicar(2).dividir(4).get_valor())

if __name__ == "__main__":
    usa_calculadora = UsaCalculadora()
    usa_calculadora.iniciar()