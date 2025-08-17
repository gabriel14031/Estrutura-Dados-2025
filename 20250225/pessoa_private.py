class PessoaPrivada:
    """ Um modelo para objetos de pessoas
    Args:
        *args: lista de argumentos posicionais
        **kwargs: dicionário de argumentos nomeados

    Attributes:
        _nome(str): nome da pessoa
        _data_nascimento(long): idade da pessoa
        _cpf(str): número do CPF da pessoa
        """
 
    __nome=""
    __data_nascimento=0
    __cpf = ""

    def __init__(self,nome="",data_nascimento=0,cpf=""):
        self.__nome = nome
        self.__data_nascimento = data_nascimento
        self.__cpf = cpf

    def getNome(self):
        return self.__nome


