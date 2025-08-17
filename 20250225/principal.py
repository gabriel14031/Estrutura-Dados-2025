import pessoa, pessoa_protegida, pessoa_private

class Principal:
    pass

if __name__ == '__main__':
    pessoa = pessoa.Pessoa(cpf="099.099.099-09",nome="Marco",data_nascimento=1203913819380)
    print(pessoa.nome)
    print(pessoa.data_nascimento)
    print(pessoa.cpf)

    protegida = pessoa_protegida.PessoaProtegida(cpf="099.099.099-09",nome="Marco",data_nascimento=1203913819380)
    print(protegida._nome)
    print(protegida.getNome())
    print(protegida._data_nascimento)
    print(protegida._cpf)

    pessoa_privada = pessoa_private.PessoaPrivada(cpf="099.099.099-09",nome="Marco",data_nascimento=1203913819380)
    print(pessoa_privada.__nome)
    print(pessoa_privada.__data_nascimento)
    print(pessoa_privada.__cpf)
