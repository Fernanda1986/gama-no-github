import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class ProgramaEmpresa {
    public static void main(String[] args) throws Exception {

        Scanner leitor = new Scanner(System.in);

        List<Empresa> listaEmpresa = new ArrayList<Empresa>();
        List<Pessoa> listaPessoa = new ArrayList<Pessoa>();

        int opcaoSelecionada;

        do {

            System.out.println("Bem vindo ao Sistema de Cadastros");
            System.out.println("---------------------------------");
            System.out.println("Selecione uma opção: ");
            System.out.println("1 - Criar empresa: ");
            System.out.println("2 - Criar pessoa: ");
            System.out.println("3 - Sistema de Pessoas: ");
            System.out.println("0 - Sair ");
            opcaoSelecionada = leitor.nextInt();

            switch (opcaoSelecionada) {
                case 1:
                Empresa emp = new Empresa();
                System.out.println("Nome da Empresa: ");
                String nome = leitor.next().trim().toUpperCase();
                emp.setNome(nome);
                System.out.println("CNPJ: ");
                String cnpj = leitor.next();
                emp.setCnpj(cnpj);
                System.out.println("Endereço: ");
                String endereco = leitor.next().trim().toUpperCase();;
                emp.setEndereco(endereco);
                System.out.println("Data Fundação: ");
                Date dataFundacao = Datetime.novaData(leitor.next());
                emp.setDataFundacao(dataFundacao);
                System.out.println("Faturamento: ");
                Float faturamento = leitor.nextFloat();
                emp.setFaturamento(faturamento);          
                
                listaEmpresa.add(emp);

                System.out.println("Empresa adicionada com sucesso!");

                if(listaEmpresa.size() > 0) {

                    System.out.println("[Lista de Empresas Cadastradas]: ");

                    for (int contador = 0; contador < listaEmpresa.size(); contador++) {
 
                        Empresa empresaTemporaria = (Empresa) listaEmpresa.get(contador);
                        System.out.println("[Nome da Empresa]: " + empresaTemporaria.getNome());
                        System.out.println("[CNPJ da Empresa]: " + empresaTemporaria.getCnpj());
                        System.out.println("[Endereço da Empresa]: " + empresaTemporaria.getEndereco());
                        System.out.println("[Data da Fundação]: " + empresaTemporaria.getFundacao());
                        System.out.println("[Faturamento]: " + empresaTemporaria.getFaturamento());
                        System.out.println("-------------------------------------------------------");
                    }
                } else {

                    System.out.println("[Não existem empresas no cadastro]: ");

                    }                
                break;

                case 2:
                Pessoa pes = new Pessoa();
                System.out.println("Nome da Pessoa: ");
                String nomepes = leitor.next();
                pes.setNome(nomepes);
                System.out.println("Endereço: ");
                String endpes = leitor.next();
                pes.setEndereco(endpes);
                System.out.println("Telefone: ");
                String telefone = leitor.next();
                pes.setTelefone(telefone);
                System.out.println("Nascimento: ");
                Date nascimento = Datetime.novaData(leitor.next());
                pes.setNascimento(nascimento);
                
                System.out.println("Possui Carro? Se sim, digite 1. Se não, digite 2."); 
                
                int temcarro = leitor.nextInt(); 

                if(temcarro == 1){
                    System.out.println("Modelo Carro: ");
                    String carro = leitor.next();
                    pes.setCarro(carro);
                    
                    listaPessoa.add(pes);

                    System.out.println("Pessoa e Carro adicionados com sucesso!");

                } else {

                    listaPessoa.add(pes);

                    System.out.println("Pessoa adicionada com sucesso!");

                }
                break;

                case 3:
                System.out.println("Contratação e Desligamento de Funcionários:");
                
                System.out.println("Deseja contratar? Se sim, digite 1. Se não, digite 2 para desligar."); 
                
                int contratar = leitor.nextInt(); 

                if (contratar == 1){
                    
                    if (listaEmpresa.size()> 0 && listaPessoa.size()> 0) {
                        
                        for (int contador = 0; contador < listaEmpresa.size(); contador++) {
 
                        Empresa empresaTemporaria = (Empresa) listaEmpresa.get(contador);
                        System.out.println("[Nome da Empresa]: " + empresaTemporaria.getNome());
                        System.out.println("[CNPJ da Empresa]: " + empresaTemporaria.getCnpj());
                        System.out.println("[Endereço da Empresa]: " + empresaTemporaria.getEndereco());
                        System.out.println("[Data da Fundação]: " + empresaTemporaria.getFundacao());
                        System.out.println("[Faturamento]: " + empresaTemporaria.getFaturamento());
                        System.out.println("-------------------------------------------------------");
                       }

                       System.out.println("Selecione a empresa que deseja efetuar a contratação: ");



                        for (int contador = 0; contador < listaPessoa.size(); contador++) {
         
                        Pessoa pessoaTemporaria = (Pessoa) listaPessoa.get(contador);
                        System.out.println("[Nome]: " + pessoaTemporaria.getNome());
                        System.out.println("[Endereço]: " + pessoaTemporaria.getEndereco());
                        System.out.println("[Telefone]: " + pessoaTemporaria.getTelefone());
                        System.out.println("[Data de Nascimento]: " + pessoaTemporaria.getNascimento());
                        System.out.println("-------------------------------------------------------");
                        }   

                        System.out.println("Selecione a pessoa que deseja contratar: ");    

                } else {
                    System.out.println("Não existem pessoas ou empresas cadastradas. Favor efetuar o cadastro!");
                }

                }else {
                      
                    for (int contador = 0; contador < listaEmpresa.size(); contador++) {

                    Empresa empresaTemporaria = (Empresa) listaEmpresa.get(contador);
                    System.out.println("[Nome da Empresa]: " + empresaTemporaria.getNome());
                    System.out.println("[CNPJ da Empresa]: " + empresaTemporaria.getCnpj());
                    System.out.println("[Endereço da Empresa]: " + empresaTemporaria.getEndereco());
                    System.out.println("[Data da Fundação]: " + empresaTemporaria.getFundacao());
                    System.out.println("[Faturamento]: " + empresaTemporaria.getFaturamento());
                    System.out.println("-------------------------------------------------------");
                   }

                   System.out.println("Selecione a empresa que deseja efetuar a demissão: ");



                    for (int contador = 0; contador < listaFuncionarios.size(); contador++) {
     
                    Pessoa funcionarioTemporario = (Pessoa) listaFuncionarios.get(contador);
                    System.out.println("[Nome]: " + funcionarioTemporario.getNome());
                    System.out.println("[Endereço]: " + funcionarioTemporario.getEndereco());
                    System.out.println("[Telefone]: " + funcionarioTemporario.getTelefone());
                    System.out.println("[Data de Nascimento]: " + funcionarioTemporario.getNascimento());
                    System.out.println("[Matrícula]: " + funcionarioTemporario.getMatricula());
                    System.out.println("-------------------------------------------------------");
                    }       
                    
                    System.out.println("Selecione a pessoa que deseja demitir: ");

                }
                break;
            }

         } while (opcaoSelecionada != 0);
      
      }

      public static void adicionarCarro(Carro carro, Pessoa pessoa) {
        pessoa.setCarro(carro);
    } 

}
