/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.livraria;

import static br.senai.sc.livraria.Principal.cliente;
import static br.senai.sc.livraria.Principal.fornecedor;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author felipe_baumgartel
 */
public class Principal {

    //Declaração dos objetos
    static Cliente[] cliente = new Cliente[999999];
    static Fornecedor[] fornecedor = new Fornecedor[999999];
    static Funcionario[] funcionario = new Funcionario[999999];
    static Livro[] livro = new Livro[999999];

    //Cadastro da entidade
    static int numcadastro;
    //Moeda utilizada no preço do livro
    static String Moeda = "";
    //Contadora de livros
    static int cont = 0;
    //Quantidade de livros comprado e vendidos
    static int quant;
    //Valor total dos livros comprado e vendidos
    static double valor;
    //Gerador de saldo aleatório
    static Random gerador = new Random();
    static int dinheiro = gerador.nextInt(200);

    public static void main(String[] args) {

        //Menu de edição de entidades(op)
        int op = 0;
        //Menu de seleção de entidades a serem editadas(op2)
        int op2 = 0;
        //Menu geral(op0)
        int op0 = 0;
        //Valor de Dinheiro aleatório para efetuar a primeira compra de livro
        JOptionPane.showMessageDialog(null, "O seu dinheiro é de R$" + dinheiro + ",00");
        do {
            do {
                try {
                    //Menu geral
                    op0 = Integer.parseInt(JOptionPane.showInputDialog("Qual ação deseja realizar:"
                            + "\n0-Sair do programa"
                            + "\n1-Edição de entidades"
                            + "\n2-Compra de livros"
                            + "\n3-Venda de livros"));
                    if (op0 == 1) {
                        do {
                            do {
                                try {
                                    //Menu principal
                                    op = Integer.parseInt(JOptionPane.showInputDialog(
                                            "Qual ação deseja realizar:"
                                            + "\n0-Sair das configurações de entidades"
                                            + "\n1-Cadastrar"
                                            + "\n2-Excluir"
                                            + "\n3-Alterar"
                                            + "\n4-Listar"));
                                    do {
                                        if (op == 1) {
                                            //Menu cadastro da entidade
                                            do {
                                                try {
                                                    op2 = Integer.parseInt(JOptionPane.showInputDialog(
                                                            "Em qual entidade deseja realizar a ação:"
                                                            + "\n0-Sair da área  de cadastros"
                                                            + "\n1-Cliente"
                                                            + "\n2-Fornecedor"
                                                            + "\n3-Funcionário"
                                                            + "\n4-Livro"));

                                                    if (op2 == 1) {
                                                        //Cadastro cliente
                                                        CadastrarCliente();
                                                    }
                                                    if (op2 == 2) {
                                                        //Cadastro fornecedor
                                                        CadastrarFornecedor();
                                                    }
                                                    if (op2 == 3) {
                                                        //Cadastro funcionário
                                                        CadastrarFuncionario();
                                                    }
                                                    if (op2 == 4) {
                                                        //Cadastro livro
                                                        CadastrarLivro();
                                                    }
                                                    if (op2 > 4 || op2 < 0) {
                                                        JOptionPane.showMessageDialog(null, "Valor Inválido");
                                                    }
                                                } catch (Exception e) {
                                                    JOptionPane.showMessageDialog(null, "Valor Inválido");
                                                }
                                            } while (op2 > 4 || op2 < 0);
                                        }
                                        if (op == 2) {
                                            do {
                                                try {
                                                    //Menu exclusão da entidade
                                                    op2 = Integer.parseInt(JOptionPane.showInputDialog(
                                                            "Em qual entidade deseja realizar a ação:"
                                                            + "\n0-Sair da área  de exclusão"
                                                            + "\n1-Cliente"
                                                            + "\n2-Fornecedor"
                                                            + "\n3-Funcionário"
                                                            + "\n4-Livro"));

                                                    if (op2 == 1) {
                                                        //Exclusão cliente
                                                        ExcluirCliente();
                                                    }
                                                    if (op2 == 2) {
                                                        //Exclusão fornecedor
                                                        ExcluirFornecedor();
                                                    }
                                                    if (op2 == 3) {
                                                        //Exclusão funcionário
                                                        ExcluirFuncionario();
                                                    }
                                                    if (op2 == 4) {
                                                        //Exclusão livro
                                                        ExcluirLivro();
                                                    }
                                                    if (op2 > 4 || op2 < 0) {
                                                        JOptionPane.showMessageDialog(null, "Valor Inválido");
                                                    }
                                                } catch (Exception e) {
                                                    JOptionPane.showMessageDialog(null, "Valor Inválido");
                                                }
                                            } while (op2 > 4 || op2 < 0);
                                        }
                                        if (op == 3) {
                                            do {
                                                try {
                                                    //Menu alteração da entidade
                                                    op2 = Integer.parseInt(JOptionPane.showInputDialog(
                                                            "Em qual entidade deseja realizar a ação:"
                                                            + "\n0-Sair da área  de alteração"
                                                            + "\n1-Cliente"
                                                            + "\n2-Fornecedor"
                                                            + "\n3-Funcionário"
                                                            + "\n4-Livro"));

                                                    if (op2 == 1) {
                                                        //Alteração cliente
                                                        AlterarCliente();
                                                    }
                                                    if (op2 == 2) {
                                                        //Alteração fornecedor
                                                        AlterarFornecedor();
                                                    }
                                                    if (op2 == 3) {
                                                        //Alteração funcionário
                                                        AlterarFuncionario();
                                                    }
                                                    if (op2 == 4) {
                                                        //Alteração livro
                                                        AlterarLivro();
                                                    }

                                                    if (op2 > 4 || op2 < 0) {
                                                        JOptionPane.showMessageDialog(null, "Valor Inválido");
                                                    }
                                                } catch (Exception e) {
                                                    JOptionPane.showMessageDialog(null, "Valor Inválido");
                                                }
                                            } while (op2 > 4 || op2 < 0);
                                        }
                                        if (op == 4) {
                                            do {
                                                try {
                                                    //Menu listagem da entidade
                                                    op2 = Integer.parseInt(JOptionPane.showInputDialog(
                                                            "Em qual entidade deseja realizar a ação:"
                                                            + "\n0-Sair da área  de listagem"
                                                            + "\n1-Cliente"
                                                            + "\n2-Fornecedor"
                                                            + "\n3-Funcionário"
                                                            + "\n4-Livro"));

                                                    if (op2 == 1) {
                                                        //Listagem cliente
                                                        ListarCliente();
                                                    }
                                                    if (op2 == 2) {
                                                        //Listagem fornecedor
                                                        ListarFornecedor();
                                                    }
                                                    if (op2 == 3) {
                                                        //Listagem funcionário
                                                        ListarFuncionario();
                                                    }
                                                    if (op2 == 4) {
                                                        //Listagem livro
                                                        ListarLivro();
                                                    }
                                                    if (op2 > 4 || op2 < 0) {
                                                        JOptionPane.showMessageDialog(null, "Valor Inválido");
                                                    }
                                                } catch (Exception e) {
                                                    JOptionPane.showMessageDialog(null, "Valor Inválido");
                                                }
                                            } while (op2 > 4 || op2 < 0);
                                        }
                                    } while (op2 != 0);
                                    if (op > 4 || op < 0) {
                                        JOptionPane.showMessageDialog(null, "Valor Inválido");
                                    }
                                } catch (Exception e) {
                                    JOptionPane.showMessageDialog(null, "Valor Inválido");
                                }
                            } while (op > 4 || op < 0);
                        } while (op != 0);
                    }
                    if (op0 == 2) {
                        ComprarLivro();
                    }
                    if (op0 == 3) {
                        VenderLivro();
                    }
                    if (op0 > 3 || op0 < 0) {
                        JOptionPane.showMessageDialog(null, "Valor Inválido");
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Valor Inválido");
                }
            } while (op0 > 3 || op0 < 0);
        } while (op0 != 0);
    }

    //Métodos Cadastro
    static void CadastrarCliente() {
        for (int i = 0; i < 999999; i++) {
            if (cliente[i] == null) {
                cliente[i] = new Cliente();
                do {
                    cliente[i].setNome(JOptionPane.showInputDialog("Digite o nome do cliente"));
                    if (cliente[i].getNome().equals("")) {
                        JOptionPane.showMessageDialog(null, "Informação inválida");
                    }
                } while (cliente[i].getNome().equals(""));
                do {
                    cliente[i].setCpf(JOptionPane.showInputDialog("Digite o CPF do cliente"));
                    if (cliente[i].getCpf().equals("")) {
                        JOptionPane.showMessageDialog(null, "Informação inválida");
                    }
                } while (cliente[i].getCpf().equals(""));
                do {
                    cliente[i].setEndereco(JOptionPane.showInputDialog("Digite o endereço do cliente"));
                    if (cliente[i].getEndereco().equals("")) {
                        JOptionPane.showMessageDialog(null, "Informação inválida");
                    }
                    do {
                    } while (cliente[i].getEndereco().equals(""));
                    cliente[i].setTelefone(JOptionPane.showInputDialog("Digite o telefone do cliente"));
                    if (cliente[i].getTelefone().equals("")) {
                        JOptionPane.showMessageDialog(null, "Informação inválida");
                    }
                } while (cliente[i].getTelefone().equals(""));
                do {
                    try {
                        cliente[i].setIdade(Integer.parseInt(JOptionPane.showInputDialog(
                                "Digite a idade do cliente")));
                        if (cliente[i].getIdade() <= 0) {
                            JOptionPane.showMessageDialog(null, "Valor Inválido");
                        }
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Valor Inválido");
                    }
                } while (cliente[i].getIdade() <= 0);

                JOptionPane.showMessageDialog(null, "Cliente com nº de cadastro: " + i);
                break;
            }
        }
    }

    static void CadastrarFornecedor() {
        for (int i = 0; i < 999999; i++) {
            if (fornecedor[i] == null) {
                fornecedor[i] = new Fornecedor();
                do {
                    fornecedor[i].setEmpresa(JOptionPane.showInputDialog("Digite o nome do fornecedor"));
                    if (fornecedor[i].getEmpresa().equals("")) {
                        JOptionPane.showMessageDialog(null, "Informação inválida");
                    }
                } while (fornecedor[i].getEmpresa().equals(""));
                do {
                    fornecedor[i].setCnpj(JOptionPane.showInputDialog("Digite o CNPJ do fornecedor"));
                    if (fornecedor[i].getCnpj().equals("")) {
                        JOptionPane.showMessageDialog(null, "Informação inválida");
                    }
                } while (fornecedor[i].getCnpj().equals(""));
                do {
                    fornecedor[i].setEndereco(JOptionPane.showInputDialog("Digite o endereço do fornecedor"));
                    if (fornecedor[i].getEndereco().equals("")) {
                        JOptionPane.showMessageDialog(null, "Informação inválida");
                    }
                } while (fornecedor[i].getEndereco().equals(""));
                do {
                    fornecedor[i].setTelefone(JOptionPane.showInputDialog("Digite o telefone do fornecedor"));
                    if (fornecedor[i].getTelefone().equals("")) {
                        JOptionPane.showMessageDialog(null, "Informação inválida");
                    }
                } while (fornecedor[i].getTelefone().equals(""));
                do {
                    fornecedor[i].setDescricaovenda(JOptionPane.showInputDialog(
                            "Digite uma descrição dos produtos vendidos por esse fornecedor"));
                    if (fornecedor[i].getDescricaovenda().equals("")) {
                        JOptionPane.showMessageDialog(null, "Informação inválida");
                    }
                } while (fornecedor[i].getDescricaovenda().equals(""));

                JOptionPane.showMessageDialog(null, "fornecedor com nº de cadastro: " + i);
                break;
            }
        }
    }

    static void CadastrarFuncionario() {
        for (int i = 0; i < 999999; i++) {
            if (funcionario[i] == null) {
                funcionario[i] = new Funcionario();
                do {
                    funcionario[i].setNome(JOptionPane.showInputDialog("Digite o nome do funcionário"));
                    if (funcionario[i].getNome().equals("")) {
                        JOptionPane.showMessageDialog(null, "Informação inválida");
                    }
                } while (funcionario[i].getNome().equals(""));
                do {
                    funcionario[i].setCpf(JOptionPane.showInputDialog("Digite o CPF do funcionário"));
                    if (funcionario[i].getCpf().equals("")) {
                        JOptionPane.showMessageDialog(null, "Informação inválida");
                    }
                } while (funcionario[i].getCpf().equals(""));
                do {
                    funcionario[i].setTelefone(JOptionPane.showInputDialog("Digite o telefone do funcionario"));
                    if (funcionario[i].getTelefone().equals("")) {
                        JOptionPane.showMessageDialog(null, "Informação inválida");
                    }
                } while (funcionario[i].getTelefone().equals(""));
                do {
                    funcionario[i].setEndereco(JOptionPane.showInputDialog("Digite o endereço do funcionario"));
                    if (funcionario[i].getEndereco().equals("")) {
                        JOptionPane.showMessageDialog(null, "Informação inválida");
                    }
                } while (funcionario[i].getEndereco().equals(""));
                do {
                    try {
                        funcionario[i].setIdade(Integer.parseInt(JOptionPane.showInputDialog(
                                "Digite a idade do funcionario")));
                        if (funcionario[i].getIdade() <= 0) {
                            JOptionPane.showMessageDialog(null, "Valor Inválido");
                        }
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Valor Inválido");
                    }
                } while (funcionario[i].getIdade() <= 0);
                do {
                    funcionario[i].setFuncao(JOptionPane.showInputDialog("Digite a função do funcionario"));
                    if (funcionario[i].getFuncao().equals("")) {
                        JOptionPane.showMessageDialog(null, "Informação inválida");
                    }
                } while (funcionario[i].getFuncao().equals(""));

                JOptionPane.showMessageDialog(null, "Funcionário com nº de cadastro: " + i);
                break;
            }
        }
    }

    static void CadastrarLivro() {
        for (int i = 0; i < 999999; i++) {
            if (livro[i] == null) {
                livro[i] = new Livro();
                do {
                    livro[i].setNomelivro(JOptionPane.showInputDialog("Digite o nome do livro"));
                    if (livro[i].getNomelivro().equals("")) {
                        JOptionPane.showMessageDialog(null, "Informação inválida");
                    }
                } while (livro[i].getNomelivro().equals(""));
                do {
                    livro[i].setSetor(JOptionPane.showInputDialog("Digite o setor em que o livro se encontra"));
                    if (livro[i].getSetor().equals("")) {
                        JOptionPane.showMessageDialog(null, "Informação inválida");
                    }
                } while (livro[i].getSetor().equals(""));
                do {
                    try {
                        livro[i].setEdicao(Double.parseDouble(JOptionPane.showInputDialog(
                                "Digite a edição do livro")));
                        if (livro[i].getEdicao() <= 0) {
                            JOptionPane.showMessageDialog(null, "Valor Inválido");
                        }
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Valor Inválido");
                    }
                } while (livro[i].getEdicao() <= 0);
                do {
                    Moeda = JOptionPane.showInputDialog("Digite a moeda que deseja utilizar para o preço");
                    if (Moeda.equals("")) {
                        JOptionPane.showMessageDialog(null, "Informação inválida");
                    }
                } while (Moeda.equals(""));
                do {
                    try {
                        livro[i].setPrecocompra(Double.parseDouble(JOptionPane.showInputDialog("Digite o preço de compra do livro")));
                        if (livro[i].getPrecocompra() <= 0) {
                            JOptionPane.showMessageDialog(null, "Valor Inválido");
                        }
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Valor Inválido");
                    }
                } while (livro[i].getPrecocompra() <= 0);
                do {
                    try {
                        livro[i].setPrecovenda(Double.parseDouble(JOptionPane.showInputDialog(
                                "Digite o preço de venda do livro")));
                        if (livro[i].getPrecovenda() <= 0) {
                            JOptionPane.showMessageDialog(null, "Valor Inválido");
                        }
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Valor Inválido");
                    }
                } while (livro[i].getPrecovenda() <= 0);
                do {
                    livro[i].setGenero(JOptionPane.showInputDialog("Digite o gênero literário do livro"));
                    if (livro[i].getGenero().equals("")) {
                        JOptionPane.showMessageDialog(null, "Informação inválida");
                    }
                } while (livro[i].getGenero().equals(""));

                livro[i].setEstoque(0);

                do {
                    livro[numcadastro].setCodfornecedor(Integer.parseInt(JOptionPane.showInputDialog(
                            "Digite o código de cadastro do fornecedor que vende este livro")));
                    if (fornecedor[livro[numcadastro].getCodfornecedor()] == null) {
                        JOptionPane.showMessageDialog(null, "Fornecedor não cadastrado");
                    }
                } while (fornecedor[livro[numcadastro].getCodfornecedor()] == null);

                JOptionPane.showMessageDialog(null, "Livro com nº de cadastro: " + i);
                break;
            }
        }
    }

    //Métodos Exclusão
    static void ExcluirCliente() {
        numcadastro = Integer.parseInt(JOptionPane.showInputDialog(
                "Digite o código do cliente para excluir"));

        if (cliente[numcadastro] == null) {
            JOptionPane.showMessageDialog(null, "Cliente não cadastrado");
        } else {
            cliente[numcadastro] = null;
            JOptionPane.showMessageDialog(null, "Cliente Excluído");
        }
    }

    static void ExcluirFornecedor() {
        numcadastro = Integer.parseInt(JOptionPane.showInputDialog(
                "Digite o código do fornecedor para excluir"
                + "\nATENÇÃO: Ao excluir um fornecedor, estará excluindo os livros vendidos por ele"));

        if (fornecedor[numcadastro] == null) {
            JOptionPane.showMessageDialog(null, "Fornecedor não cadastrad");
        } else {
            fornecedor[numcadastro] = null;
            JOptionPane.showMessageDialog(null, "Fornecedor Excluído");
        }
        for (int i = 0; i < 999999; i++) {
            if (livro[i].getCodfornecedor() == numcadastro) {
                JOptionPane.showMessageDialog(null, "O livro " + livro[i].getNomelivro()
                        + "  foi excluído pois você excluiu o fornecedor dele");
            }
            livro[i] = null;
        }
    }

    static void ExcluirFuncionario() {
        numcadastro = Integer.parseInt(JOptionPane.showInputDialog(
                "Digite o código do funcionário para excluir"));

        if (funcionario[numcadastro] == null) {
            JOptionPane.showMessageDialog(null, "Funcionário não cadastrad");
        } else {
            funcionario[numcadastro] = null;
            JOptionPane.showMessageDialog(null, "Funcionário Excluído");
        }
    }

    static void ExcluirLivro() {
        numcadastro = Integer.parseInt(JOptionPane.showInputDialog(
                "Digite o código do livro para excluir"));

        if (livro[numcadastro] == null) {
            JOptionPane.showMessageDialog(null, "Livro não cadastrad");
        } else {
            livro[numcadastro] = null;
            JOptionPane.showMessageDialog(null, "Livro Excluído");
        }
    }

    //Métodos Alteração
    static void AlterarCliente() {
        do {
            do {
                try {
                    numcadastro = Integer.parseInt(JOptionPane.showInputDialog( 
                            "Digite o número de cadastro da entidade: "));
                    if (numcadastro < 0) {
                        JOptionPane.showMessageDialog(null, "Valor Inválido");
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Valor Inválido");
                }
            } while (numcadastro > 0);
            if (cliente[numcadastro] == null) {
                JOptionPane.showMessageDialog(null, "Cliente não encontrado");
            }
        } while (cliente[numcadastro] == null);
        do {
            cliente[numcadastro].setNome(JOptionPane.showInputDialog("Digite o nome do cliente"));
            if (cliente[numcadastro].getNome().equals("")) {
                JOptionPane.showMessageDialog(null, "Informação inválida");
            }
        } while (cliente[numcadastro].getNome().equals(""));
        do {
            cliente[numcadastro].setCpf(JOptionPane.showInputDialog("Digite o CPF do cliente"));
            if (cliente[numcadastro].getCpf().equals("")) {
                JOptionPane.showMessageDialog(null, "Informação inválida");
            }
        } while (cliente[numcadastro].getCpf().equals(""));
        do {
            cliente[numcadastro].setEndereco(JOptionPane.showInputDialog("Digite o endereço do cliente"));
            if (cliente[numcadastro].getEndereco().equals("")) {
                JOptionPane.showMessageDialog(null, "Informação inválida");
            }
            do {
            } while (cliente[numcadastro].getEndereco().equals(""));
            cliente[numcadastro].setTelefone(JOptionPane.showInputDialog("Digite o telefone do cliente"));
            if (cliente[numcadastro].getTelefone().equals("")) {
                JOptionPane.showMessageDialog(null, "Informação inválida");
            }
        } while (cliente[numcadastro].getTelefone().equals(""));
        do {
            try {
                cliente[numcadastro].setIdade(Integer.parseInt(JOptionPane.showInputDialog(
                        "Digite a idade do cliente")));
                if (cliente[numcadastro].getIdade() <= 0) {
                    JOptionPane.showMessageDialog(null, "Valor Inválido");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Valor Inválido");
            }
        } while (cliente[numcadastro].getIdade() <= 0);
    }

    static void AlterarFornecedor() {
        do {
            do {
                try {
                    numcadastro = Integer.parseInt(JOptionPane.showInputDialog(
                            "Digite o número de cadastro da entidade: "));
                    if (numcadastro < 0) {
                        JOptionPane.showMessageDialog(null, "Valor Inválido");
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Valor Inválido");
                }
            } while (numcadastro > 0);
            if (fornecedor[numcadastro] == null) {
                JOptionPane.showMessageDialog(null, "Fornecedor não encontrado");
            }
        } while (fornecedor[numcadastro] == null);
        do {
            fornecedor[numcadastro].setEmpresa(JOptionPane.showInputDialog("Digite o nome do fornecedor"));
            if (fornecedor[numcadastro].getEmpresa().equals("")) {
                JOptionPane.showMessageDialog(null, "Informação inválida");
            }
        } while (fornecedor[numcadastro].getEmpresa().equals(""));
        do {
            fornecedor[numcadastro].setCnpj(JOptionPane.showInputDialog("Digite o CNPJ do fornecedor"));
            if (fornecedor[numcadastro].getCnpj().equals("")) {
                JOptionPane.showMessageDialog(null, "Informação inválida");
            }
        } while (fornecedor[numcadastro].getCnpj().equals(""));
        do {
            fornecedor[numcadastro].setEndereco(JOptionPane.showInputDialog("Digite o endereço do fornecedor"));
            if (fornecedor[numcadastro].getEndereco().equals("")) {
                JOptionPane.showMessageDialog(null, "Informação inválida");
            }
        } while (fornecedor[numcadastro].getEndereco().equals(""));
        do {
            fornecedor[numcadastro].setTelefone(JOptionPane.showInputDialog("Digite o telefone do fornecedor"));
            if (fornecedor[numcadastro].getTelefone().equals("")) {
                JOptionPane.showMessageDialog(null, "Informação inválida");
            }
        } while (fornecedor[numcadastro].getTelefone().equals(""));
        do {
            fornecedor[numcadastro].setDescricaovenda(JOptionPane.showInputDialog(
                    "Digite uma descrição dos produtos vendidos por esse fornecedor"));
            if (fornecedor[numcadastro].getDescricaovenda().equals("")) {
                JOptionPane.showMessageDialog(null, "Informação inválida");
            }
        } while (fornecedor[numcadastro].getDescricaovenda().equals(""));
    }

    static void AlterarFuncionario() {
        do {
            do {
                try {
                    numcadastro = Integer.parseInt(JOptionPane.showInputDialog(
                            "Digite o número de cadastro da entidade: "));
                    if (numcadastro < 0) {
                        JOptionPane.showMessageDialog(null, "Valor Inválido");
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Valor Inválido");
                }
            } while (numcadastro
                    > 0);
            if (funcionario[numcadastro] == null) {
                JOptionPane.showMessageDialog(null, "Funcionario não encontrado");
            }
        } while (funcionario[numcadastro] == null);
        do {
            funcionario[numcadastro].setNome(JOptionPane.showInputDialog("Digite o nome do funcionário"));
            if (funcionario[numcadastro].getNome().equals("")) {
                JOptionPane.showMessageDialog(null, "Informação inválida");
            }
        } while (funcionario[numcadastro].getNome().equals(""));
        do {
            funcionario[numcadastro].setCpf(JOptionPane.showInputDialog("Digite o CPF do funcionário"));
            if (funcionario[numcadastro].getCpf().equals("")) {
                JOptionPane.showMessageDialog(null, "Informação inválida");
            }
        } while (funcionario[numcadastro].getCpf().equals(""));
        do {
            funcionario[numcadastro].setTelefone(JOptionPane.showInputDialog("Digite o telefone do funcionario"));
            if (funcionario[numcadastro].getTelefone().equals("")) {
                JOptionPane.showMessageDialog(null, "Informação inválida");
            }
        } while (funcionario[numcadastro].getTelefone().equals(""));
        do {
            funcionario[numcadastro].setEndereco(JOptionPane.showInputDialog("Digite o endereço do funcionario"));
            if (funcionario[numcadastro].getEndereco().equals("")) {
                JOptionPane.showMessageDialog(null, "Informação inválida");
            }
        } while (funcionario[numcadastro].getEndereco().equals(""));

        do {
            funcionario[numcadastro].setFuncao(JOptionPane.showInputDialog("Digite a função do funcionario"));
            if (funcionario[numcadastro].getFuncao().equals("")) {
                JOptionPane.showMessageDialog(null, "Informação inválida");
            }
        } while (funcionario[numcadastro].getFuncao().equals(""));
        funcionario[numcadastro].setIdade(Integer.parseInt(JOptionPane.showInputDialog(
                "Digite a idade do funcionario ")));
    }

    static void AlterarLivro() {
        do {
            do {
                try {
                    numcadastro = Integer.parseInt(JOptionPane.showInputDialog(
                            "Digite o número de cadastro da entidade: "));
                    if (numcadastro < 0) {
                        JOptionPane.showMessageDialog(null, "Valor Inválido");
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Valor Inválido");
                }
            } while (numcadastro > 0);
            if (livro[numcadastro] == null) {
                JOptionPane.showMessageDialog(null, "Livro não encontrado");
            }
        } while (livro[numcadastro] == null);
        do {
            livro[numcadastro].setNomelivro(JOptionPane.showInputDialog("Digite o nome do livro"));
            if (livro[numcadastro].getNomelivro().equals("")) {
                JOptionPane.showMessageDialog(null, "Informação inválida");
            }
        } while (livro[numcadastro].getNomelivro().equals(""));
        do {
            livro[numcadastro].setSetor(JOptionPane.showInputDialog("Digite o setor em que o livro se encontra"));
            if (livro[numcadastro].getSetor().equals("")) {
                JOptionPane.showMessageDialog(null, "Informação inválida");
            }
        } while (livro[numcadastro].getSetor().equals(""));
        do {
            try {
                livro[numcadastro].setEdicao(Double.parseDouble(JOptionPane.showInputDialog(
                        "Digite a edição do livro")));
                if (livro[numcadastro].getEdicao() <= 0) {
                    JOptionPane.showMessageDialog(null, "Valor Inválido");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Valor Inválido");
            }
        } while (livro[numcadastro].getEdicao() <= 0);
        do {
            Moeda = JOptionPane.showInputDialog("Digite a moeda que deseja utilizar para o preço");
            if (Moeda.equals("")) {
                JOptionPane.showMessageDialog(null, "Informação inválida");
            }
        } while (Moeda.equals(""));
        do {
            try {
                livro[numcadastro].setPrecocompra(Double.parseDouble(JOptionPane.showInputDialog(
                        "Digite o preço de compra do livro")));
                if (livro[numcadastro].getPrecocompra() <= 0) {
                    JOptionPane.showMessageDialog(null, "Valor Inválido");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Valor Inválido");
            }
        } while (livro[numcadastro].getPrecocompra() <= 0);
        do {
            try {
                livro[numcadastro].setPrecovenda(Double.parseDouble(JOptionPane.showInputDialog(
                        "Digite o preço de venda do livro")));
                if (livro[numcadastro].getPrecovenda() <= 0) {
                    JOptionPane.showMessageDialog(null, "Valor Inválido");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Valor Inválido");
            }
        } while (livro[numcadastro].getPrecovenda() <= 0);
        do {
            livro[numcadastro].setGenero(JOptionPane.showInputDialog("Digite o gênero literário do livro"));
            if (livro[numcadastro].getGenero().equals("")) {
                JOptionPane.showMessageDialog(null, "Informação inválida");
            }
        } while (livro[numcadastro].getGenero().equals(""));
        livro[numcadastro].setEstoque(0);

        do {
            livro[numcadastro].setCodfornecedor(Integer.parseInt(JOptionPane.showInputDialog(
                    "Digite o código de cadastro do fornecedor que vende este livro")));
            if (fornecedor[livro[numcadastro].getCodfornecedor()] == null) {
                JOptionPane.showMessageDialog(null, "Fornecedor não cadastrado");
            }
        } while (fornecedor[livro[numcadastro].getCodfornecedor()] == null);
    }

    //Métodos Listagem
    static void ListarCliente() {
        numcadastro = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de cadastro da entidade:"));
        if (cliente[numcadastro] == null) {
            JOptionPane.showMessageDialog(null, "Livro não encontrado");
        } else {
            JOptionPane.showMessageDialog(null, "Informações do cliente são:\n"
                    + "\nNome: " + cliente[numcadastro].getNome()
                    + "\nCPF: " + cliente[numcadastro].getCpf()
                    + "\nEndereço: " + cliente[numcadastro].getEndereco()
                    + "\nTelefone: " + cliente[numcadastro].getTelefone()
                    + "\nIdade: " + cliente[numcadastro].getIdade());
        }
    }

    static void ListarFornecedor() {
        numcadastro = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de cadastro da entidade:"));
        if (fornecedor[numcadastro] == null) {
            JOptionPane.showMessageDialog(null, "Livro não encontrado");
        } else {
            JOptionPane.showMessageDialog(null, "Informações do fornecedor são:\n"
                    + "\nNome Empresa: " + fornecedor[numcadastro].getEmpresa()
                    + "\nCnpj: " + fornecedor[numcadastro].getCnpj()
                    + "\nEndereço: " + fornecedor[numcadastro].getEndereco()
                    + "\nTelefone: " + fornecedor[numcadastro].getTelefone()
                    + "\nDescrição do Produto: " + fornecedor[numcadastro].getDescricaovenda());
        }
    }

    static void ListarFuncionario() {
        numcadastro = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de cadastro da entidade:"));
        if (funcionario[numcadastro] == null) {
            JOptionPane.showMessageDialog(null, "Livro não encontrado");
        } else {
            JOptionPane.showMessageDialog(null, "Informações do funcionario são:\n"
                    + "\nNome Funcionario: " + funcionario[numcadastro].getNome()
                    + "\nCPF: " + funcionario[numcadastro].getCpf()
                    + "\nTelefone: " + funcionario[numcadastro].getTelefone()
                    + "\nEndereço: " + funcionario[numcadastro].getEndereco()
                    + "\nIdade: " + funcionario[numcadastro].getIdade()
                    + "\nFuncao: " + funcionario[numcadastro].getFuncao());
        }
    }

    static void ListarLivro() {
        numcadastro = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de cadastro da entidade:"));
        if (livro[numcadastro] == null) {
            JOptionPane.showMessageDialog(null, "Livro não encontrado");
        } else {
            JOptionPane.showMessageDialog(null, "Informações do livro são:\n"
                    + "\nNome Livro: " + livro[numcadastro].getNomelivro()
                    + "\nEdicao: " + livro[numcadastro].getEdicao()
                    + "\nSetor: " + livro[numcadastro].getSetor()
                    + "\nPreço de compra: " + Moeda + " " + livro[numcadastro].getPrecocompra()
                    + "\nPreco de venda: " + Moeda + " " + livro[cont].getPrecovenda()
                    + "\nGênero: " + livro[numcadastro].getGenero()
                    + "\nEstoque: " + livro[numcadastro].getEstoque()
                    + "\nFornecedor: " + fornecedor[livro[numcadastro].getCodfornecedor()].getEmpresa());
        }
    }

    //Métodos Compra e Venda de Livros
    static void ComprarLivro() {
        //Menu compra de livro
        int op3 = 0;
        cont = 0;
        JOptionPane.showMessageDialog(null, "Seu saldo é de: R$" + dinheiro);
        do {
            if (livro[cont] == null) {
                JOptionPane.showMessageDialog(null, "Não existem mais livros cadastrados");
                break;
            }
            op3 = Integer.parseInt(JOptionPane.showInputDialog("Informações do livro são:\n"
                    + "\nNome Livro: " + livro[cont].getNomelivro()
                    + "\nEdicao: " + livro[cont].getEdicao()
                    + "\nSetor: " + livro[cont].getSetor()
                    + "\nPreço de compra: " + Moeda + " " + livro[cont].getPrecocompra()
                    + "\nPreco de venda: " + Moeda + " " + livro[cont].getPrecovenda()
                    + "\nGênero: " + livro[numcadastro].getGenero()
                    + "\nEstoque: " + livro[numcadastro].getEstoque()
                    + "\nFornecedor: " + fornecedor[livro[numcadastro].getCodfornecedor()].getEmpresa()
                    + "\n\nAgora digite:"
                    + "\n0-Sair da área de compra"
                    + "\n1-Comprar"
                    + "\n2-Não comprar"));
            if (op3 == 1) {
                quant = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade que deseja comprar"));
                valor = livro[cont].getPrecocompra() * quant;
                if (valor > dinheiro) {
                    JOptionPane.showMessageDialog(null, "Saldo insufisiente");
                } else {
                    dinheiro -= valor;
                    JOptionPane.showMessageDialog(null, "Você comprou " + quant + " unidades do livro "
                            + livro[cont].getNomelivro());
                    JOptionPane.showMessageDialog(null, "Seu saldo é de: R$" + dinheiro);
                    livro[cont].setEstoque(livro[cont].getEstoque() + quant);
                }
            }
            if (op3 > 2 || op3 < 0) {
                JOptionPane.showMessageDialog(null, "Número digitado inválido!");
            }
            cont++;
        } while (op3 != 0);
    }

    static void VenderLivro() {
        //Menu venda de livro
        int op3 = 0;
        cont = 0;
        JOptionPane.showMessageDialog(null, "Seu saldo é de: R$" + dinheiro);
        do {
            if (livro[cont] == null) {
                JOptionPane.showMessageDialog(null, "Não existem mais livros cadastrados");
                break;
            }
            op3 = Integer.parseInt(JOptionPane.showInputDialog("Informações do livro são:\n"
                    + "\nNome Livro: " + livro[cont].getNomelivro()
                    + "\nEdicao: " + livro[cont].getEdicao()
                    + "\nSetor: " + livro[cont].getSetor()
                    + "\nPreço de compra: " + Moeda + " " + livro[cont].getPrecocompra()
                    + "\nPreco de venda: " + Moeda + " " + livro[cont].getPrecovenda()
                    + "\nGênero: " + livro[numcadastro].getGenero()
                    + "\nEstoque: " + livro[numcadastro].getEstoque()
                    + "\nFornecedor: " + fornecedor[livro[numcadastro].getCodfornecedor()].getEmpresa()
                    + "\n\nAgora digite:"
                    + "\n0-Sair da área de venda"
                    + "\n1-Vender"
                    + "\n2-Não vender"));
            if (op3 == 1) {
                quant = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade que deseja vender"));
                if (quant > livro[cont].getEstoque()) {
                    JOptionPane.showMessageDialog(null, "Quantidade superior ao estoque");
                    break;
                } else {
                    valor = livro[cont].getPrecovenda() * quant;
                    dinheiro += valor;
                    JOptionPane.showMessageDialog(null, "Você vendeu " + quant + " unidades do livro "
                            + livro[cont].getNomelivro());
                    JOptionPane.showMessageDialog(null, "Seu saldo é de: R$" + dinheiro);
                    livro[cont].setEstoque(livro[cont].getEstoque() - quant);
                }
            }
            if (op3 > 2 || op3 < 0) {
                JOptionPane.showMessageDialog(null, "Número digitado inválido!");
            }
            cont++;
        } while (op3 != 0);
    }
}
