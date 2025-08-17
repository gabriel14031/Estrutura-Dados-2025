class PessoaProtegida:
    """ Um modelo para objetos de pessoas
    Args:
        *args: lista de argumentos posicionais
        **kwargs: dicionário de argumentos nomeados

    Attributes:
        _nome(str): nome da pessoa
        _data_nascimento(long): idade da pessoa
        _cpf(str): número do CPF da pessoa
        """
 
    _nome=""
    _data_nascimento=0
    _cpf = ""

    def __init__(self,nome="",data_nascimento=0,cpf=""):
        self._nome = nome
        self._data_nascimento = data_nascimento
        self._cpf = cpf

    def getNome(self):
        return self._nome


