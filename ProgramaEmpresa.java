import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class ProgramaEmpresa {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        List<Empresa> listaEmpresa = new ArrayList<Empresa>();
        List<Pessoa> listaPessoa = new ArrayList<Pessoa>();

        int opcaoSelecionada;

        do {

            System.out.println("Selecione uma opção: ");
            System.out.println("1 - Criar empresa: ");
            System.out.println("2 - Criar pessoa: ");
            System.out.println("3 - Contratar: ");
            System.out.println("4 - Demitir: ");
            System.out.println("0 - Sair ");
            opcaoSelecionada = leitor.nextInt();

            switch (opcaoSelecionada) {
                case 1:
                System.out.println("Nome da Empresa: ");
                String nome = leitor.next();
                System.out.println("CNPJ: ");
                String CNPJ = leitor.next();
                System.out.println("Endereço: ");
                String endereco = leitor.next();
                System.out.println("Data Fundação: ");
                String fundacao = leitor.next();
                System.out.println("Faturamento: ");
                Float faturamento = leitor.nextFloat();

                if(listaEmpresa.size() == 0) {
                    Empresa novaEmpresa = new Empresa(nome, CNPJ, endereco, fundacao, faturamento);
                    listaEmpresa.add(novaEmpresa);
                    System.out.println("Empresa adicionada com sucesso!");

                } else {
                    
                }
                break;
                case 2:
                System.out.println("Nome da Pessoa: ");
                String  = leitor.next();


                break;

            }

         } while (opcaoSelecionada != 0);
        
        //Empresa empresa1 = new Empresa();
        //empresa1.setNome("Empresa Bancaria");
        //empresa1.setCnpj("12.345.678/0001-99");
        //empresa1.setDataFundacao(new Date());
        //empresa1.setFaturamento(99999);
        //empresa1.setEndereco("Rua do Limoeiro, 50");

        //empresa1.imprimirResumo();

        Funcionario funcionario1 = new Funcionario(); // Herda de pessoa
        funcionario1.setNome("José Marques");
        funcionario1.setMatricula("01234");
        funcionario1.setEndereco("Rua da chuva, 99");
        funcionario1.setSalario(10000.00);

        //empresa1.contratacao(funcionario1);

        Carro carro1 = new Carro();
        carro1.setAno(2000);
        carro1.setModelo("ABC");
        carro1.setPlaca("XVC-9900");
        carro1.setValor(120000.00);

        funcionario1.setCarro(carro1);

        // Pessoa pessoa = funcionario1; // Funcionario
        // System.out.println(pessoa.getNome());
        // System.out.println(funcionario1.getNome());

        // Funcionario func = (Funcionario) pessoa;
        // System.out.println(func.getSalario());

        // Pessoa pessoaAleatorio = new Pessoa();
        // pessoaAleatorio.setNome("Charles");

        // Carro carro2 = new Carro();
        // carro2.setModelo("Ferrari");

        adicionarCarro(carro1, funcionario1);
        // adicionarCarro(carro2, pessoaAleatorio);

        //for (int contador = 0; contador < empresa1.getListaFuncionarios().size(); contador++) {
        //    Funcionario elemento = empresa1.getListaFuncionarios().get(contador);

        //    System.out.println("---- Dados dos Funcionarios ----");
        //    System.out.println(elemento.getNome());
        //    System.out.println(elemento.getSalario());
        //    System.out.println(elemento.getCarro().getModelo() + " - " + elemento.getCarro().getAno());
        }


    public static void adicionarCarro(Carro carro, Pessoa pessoa) {
        pessoa.setCarro(carro);
    }
} 
