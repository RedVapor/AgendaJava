import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        String query;
        Scanner read = new Scanner(System.in);
        Agenda agenda = new Agenda();
        int intQuery;
        //// / ///
        /// // //
        // Inicia a Agenda
        do {
            System.out.println(
                    "Funções\n A = Adicionar Contato\n B = Buscar Contato\n E = Editar Contato\n L = Listar Contatos\n R = Remover Contato\n\n\n Q = Fechar programa");
            query = read.nextLine();
            // Cria um contato e um endereço
            if (query.toLowerCase().equals("a")) {
                System.out.println("++Adicionando Contato++");
                System.out.println("Insira o Nome");
                String nomeContato = read.nextLine();
                System.out.println("Insira o Telefone");
                String telefoneContato = read.nextLine();
                System.out.println("Insira o Endereço...");
                System.out.println("Insira a Rua");
                String ruaEndereco = read.nextLine();
                System.out.println("Insira a Cidade");
                String cidadeEndereco = read.nextLine();
                System.out.println("Insira o Estado");
                String estadoEndereco = read.nextLine();
                System.out.println("Insira o CEP");
                String cepEndereco = read.nextLine();
                Endereco enderecoContato = new Endereco(ruaEndereco, cidadeEndereco, estadoEndereco, cepEndereco);
                System.out.println("Insira o Email");
                String emailContato = read.nextLine();
                System.out.println("Qual tipo de Contato?");
                System.out.println("Digite 1 para Profissional e 2 para Pessoal.");
                query = read.nextLine();
                if (query.equals("1")) {
                    System.out.println("Insira a Empresa");
                    String empresaProf = read.nextLine();
                    System.out.println("Insira o Cargo");
                    String cargoProf = read.nextLine();
                    ContatoProfissional contatoProfissional = new ContatoProfissional(nomeContato, telefoneContato,
                            enderecoContato, emailContato, empresaProf, cargoProf);
                    agenda.adicionarContato(contatoProfissional);
                    System.out.println("Contato adicionado");
                }
                if (query.equals("2")) {
                    System.out.println("Insira a data de aniversário");
                    String dataAniverPess = read.nextLine();
                    ContatoPessoal contatoPessoal = new ContatoPessoal(nomeContato, telefoneContato, enderecoContato,
                            emailContato, dataAniverPess);
                    agenda.adicionarContato(contatoPessoal);
                    System.out.println("Contato adicionado");
                }
            }
            // Lista todos os contatos
            if (query.toLowerCase().equals("l")) {
                agenda.listarTodos();
            }
            // Edita um contato
            if (query.toLowerCase().equals("e")) {
                System.out.println("Qual o Indíce do contato que você quer editar");
                intQuery = read.nextInt();
                read.nextLine();
                //
                System.out.println("Insira o Nome");
                String nomeContato = read.nextLine();
                System.out.println("Insira o Telefone");
                String telefoneContato = read.nextLine();
                System.out.println("Insira o Endereço...");
                System.out.println("Insira a Rua");
                String ruaEndereco = read.nextLine();
                System.out.println("Insira a Cidade");
                String cidadeEndereco = read.nextLine();
                System.out.println("Insira o Estado");
                String estadoEndereco = read.nextLine();
                System.out.println("Insira o CEP");
                String cepEndereco = read.nextLine();
                Endereco enderecoContato = new Endereco(ruaEndereco, cidadeEndereco, estadoEndereco, cepEndereco);
                System.out.println("Insira o Email");
                String emailContato = read.nextLine();
                System.out.println("Qual tipo de Contato?");
                System.out.println("Digite 1 para Profissional e 2 para Pessoal.");
                query = read.nextLine();
                if (query.equals("1")) {
                    System.out.println("Insira a Empresa");
                    String empresaProf = read.nextLine();
                    System.out.println("Insira o Cargo");
                    String cargoProf = read.nextLine();
                    ContatoProfissional contatoProfissional = new ContatoProfissional(nomeContato, telefoneContato,
                            enderecoContato, emailContato, empresaProf, cargoProf);
                    agenda.editarContato(intQuery, contatoProfissional);
                    System.out.println("Contato editado");
                }
                if (query.equals("2")) {
                    System.out.println("Insira a data de aniversário");
                    String dataAniverPess = read.nextLine();
                    ContatoPessoal contatoPessoal = new ContatoPessoal(nomeContato, telefoneContato, enderecoContato,
                            emailContato, dataAniverPess);
                    agenda.editarContato(intQuery, contatoPessoal);
                    System.out.println("Contato editado");
                }
            }
            // remove um contato
            if (query.toLowerCase().equals("r")) {
                System.out.println("Digite o indíce do Contato");
                int index;
                index = read.nextInt();
                agenda.removerContato(index);
            }
            // busca um contato
            if (query.toLowerCase().equals("b")) {
                System.out.println("Insira o Nome do Contato");
                query = read.nextLine();
                agenda.buscarPorNome(query);
            }
        } while (!query.toLowerCase().equals("q"));
        read.close();
    }
}
