package Model.DAO;

import Model.*;
import java.util.ArrayList;

public class Persiste {
  
            private static Persiste instance;
            
            public static  ArrayList<Bairro> bairroList;
            public static  ArrayList<Caixa> caixaList;
            public static  ArrayList<Carteirinha> carteirinhaList;
            public static  ArrayList<Cidade> cidadeList;
            public static  ArrayList<Cliente> clienteList;
            public static  ArrayList<Compra> compraList;
            public static  ArrayList<Contas> contasList;
            public static  ArrayList<Endereco> enderecoList;
            public static  ArrayList<Fornecedor> fornecedorList;
            public static  ArrayList<Funcionario> funcionarioList;
            public static  ArrayList<ItemCompra> itemCompraList;
            public static  ArrayList<ItemVenda> itemVendaList;
            public static  ArrayList<MovimentacaoEstoque> movimentacaoEstoqueList;
            public static  ArrayList<MovimentoCaixa> movimentoCaixaList;
            public static  ArrayList<Produto> produtoList;
            public static  ArrayList<Venda> vendaList;
      
    private Persiste(){
    
            bairroList = new ArrayList();
            caixaList = new ArrayList();
            carteirinhaList = new ArrayList();
            cidadeList = new ArrayList();
            clienteList = new ArrayList();
            compraList = new ArrayList();
            contasList = new ArrayList();
            enderecoList = new ArrayList();
            fornecedorList = new ArrayList();
            funcionarioList = new ArrayList();
            itemCompraList = new ArrayList();
            itemVendaList = new ArrayList();
            movimentacaoEstoqueList = new ArrayList();
            movimentoCaixaList = new ArrayList();
            produtoList = new ArrayList();
            vendaList = new ArrayList();
            
            
            
            Carteirinha carteirinha = new Carteirinha(1, "asd", "asdd", "asdasd");
           Cidade cidade = new Cidade(1, "Tubarão", "asd");
           Cliente cliente = new Cliente("asd", "asd", "asd", "asd", 1, "asd", "asd", "asd", "asd", 'a', "asd");
            Bairro bairro = new Bairro(1, "Centro");
           Endereco endereco = new Endereco(1, "asd", "asd", "1", bairro, cidade);
          Fornecedor fornecedor = new Fornecedor("asd", "asd", "asd", 1, "asd", "asd", "asd", "asd", 'a', "asd", endereco);
           Funcionario funcionario = new Funcionario("asd","asd", "asd", "asd", 1, "asd", "asd", "asd", "asd", 'a', "asd", endereco);
            Produto produto = new Produto(1, "asd", "asd", "aa");
            Bairro bairro2 = new Bairro(2, "Oficinas");
            Bairro bairro3 = new Bairro(3, "Dehon");
            Bairro bairro4 = new Bairro(4, "Morrotes");
            
           // carteirinhaList.add(carteirinha);
           cidadeList.add(cidade);
           // clienteList.add(cliente);
            bairroList.add(bairro);
            //enderecoList.add(endereco);
          //  fornecedorList.add(fornecedor);
            //funcionarioList.add(funcionario);
            produtoList.add(produto);
            bairroList.add(bairro2);
            bairroList.add(bairro3);
            bairroList.add(bairro4);
            
    }

    public static synchronized Persiste getInstance() {
        if (instance == null) {
            instance = new Persiste(); 
        }
        return instance;
    }

    
}
