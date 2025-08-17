class Pessoa:
    """ Um modelo para objetos de pessoas
    Args:
        *args: lista de argumentos posicionais
        **kwargs: dicionário de argumentos nomeados

    Attributes:
        nome(str): nome da pessoa
        data_nascimento(long): idade da pessoa
        cpf(str): número do CPF da pessoa
        """
 
    nome=""
    data_nascimento=0
    cpf = ""

    def __init__(self,nome="",data_nascimento=0,cpf=""):
        self.nome = nome
        self.data_nascimento = data_nascimento
        self.cpf = cpf





