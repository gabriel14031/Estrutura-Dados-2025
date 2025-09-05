public class main {
    public static void main(String[] args) {
        // Criar a árvore binária
        ArvoreBinaria<PacienteEntity> arvorePacientes = new ArvoreBinaria<>();
        
        // Criar 10 pacientes
        PacienteEntity[] pacientes = new PacienteEntity[10];
        
        pacientes[0] = criarPaciente("Carlos Silva", "1990-05-15", "12345678900");
        pacientes[1] = criarPaciente("Ana Oliveira", "1985-08-22", "98765432100");
        pacientes[2] = criarPaciente("João Santos", "1978-12-03", "45678912300");
        pacientes[3] = criarPaciente("Maria Souza", "1995-02-28", "32165498700");
        pacientes[4] = criarPaciente("Pedro Costa", "1982-07-19", "65498732100");
        pacientes[5] = criarPaciente("Julia Lima", "1992-11-08", "78912345600");
        pacientes[6] = criarPaciente("Lucas Pereira", "1988-04-17", "15975348620");
        pacientes[7] = criarPaciente("Fernanda Rocha", "1998-09-25", "35715948620");
        pacientes[8] = criarPaciente("Ricardo Alves", "1975-06-14", "25836914700");
        pacientes[9] = criarPaciente("Amanda Dias", "1993-03-07", "14725836900");
        
        System.out.println("Inserindo pacientes na árvore na seguinte ordem:");
        for (PacienteEntity paciente : pacientes) {
            System.out.println("- " + paciente.getNomeCompleto());
            arvorePacientes.inserir(paciente);
        }
        
        System.out.println("\n=== IMPRESSÃO PRÉ-FIXADA (Raiz -> Esquerda -> Direita) ===");
        arvorePacientes.imprimePreFixado();
        
        System.out.println("\n=== IMPRESSÃO EM ORDEM (Esquerda -> Raiz -> Direita) ===");
        arvorePacientes.imprimeEmOrdem();
        
        System.out.println("\n=== IMPRESSÃO PÓS-FIXADA (Esquerda -> Direita -> Raiz) ===");
        arvorePacientes.imprimePosFixado();
        
        // Teste de pesquisa
        System.out.println("\n=== TESTE DE PESQUISA ===");
        PacienteEntity pacienteBusca = criarPaciente("Maria Souza", "1995-02-28", "32165498700");
        NodoArvore<PacienteEntity> resultado = arvorePacientes.pesquisa(pacienteBusca);
        
        if (resultado != null) {
            System.out.println("Paciente encontrado: " + resultado.objeto.getNomeCompleto());
        } else {
            System.out.println("Paciente não encontrado!");
        }
    }
    
    private static PacienteEntity criarPaciente(String nome, String dataNascimento, String cpf) {
        PacienteEntity paciente = new PacienteEntity();
        paciente.setNomeCompleto(nome);
        paciente.setDataNascimento(dataNascimento);
        paciente.setCpf(cpf);
        return paciente;
    }
}