
import Pacotes.Cidade;
import Pacotes.Enderecos;
import Pacotes.Estado;
import Pacotes.Funcionario;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bem vindo ao cadastro Funcionario:");
        Funcionario funcionario= new Funcionario();
        funcionario.nome = "bruno  ";
        funcionario.cpf = "754841862 ";
        funcionario.rg= " 7321653";
        funcionario.nascimento= new Date();
        funcionario.enderecos = new Enderecos();
        funcionario.enderecos.rua = " ";
        funcionario.enderecos.bairro = " ";
        funcionario.enderecos.cep = " ";
        funcionario.enderecos.numero= 10;
        funcionario.enderecos.cidade= new Cidade();
        funcionario.enderecos.cidade.nome= "";
        funcionario.enderecos.cidade.estado = new Estado();
        funcionario.enderecos.cidade.estado.sigla= " ";
        funcionario.enderecos.cidade.estado.nome = " ";

        System.out.println(funcionario.toString());





    }
}