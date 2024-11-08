package com.example.sistemacaixa;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CaixaController extends ProductController {

    public List<Product> ShoppingList = new ArrayList<>();

    @FXML
    TextField TextCodigo;
    @FXML
    TextField TextQuantidade;
    @FXML
    Label LabelDescricaoProduto;
    @FXML
    ListView<Product> LabelListaProdutos;
    @FXML
    Label LabelTotal;
    @FXML
    Label LabelValorPago;
    @FXML
    Label LabelTroco;

    public CaixaController() {

    }

    @FXML
    @Override
    public Product GetProduct(){

        Product product;
        Optional<Product> aux = Products.stream().filter(x -> x.Codigo == Integer.parseInt(TextCodigo.getText())).findFirst();

        if(aux.isPresent()){
            product = aux.get();
            LabelDescricaoProduto.setText(product.Name + "--" + product.Preco);
        }
        else{
            product = null;
            LabelDescricaoProduto.setText("");
        }
        return product;
    }

    //Fazendo Atualizar o ListView sempre que é adicionado um item a lista ShoppingList
    @FXML
    public void OnButtonAdicionaListaClicked(){
        ShoppingList.add(GetProduct());
        //ShoppingList.forEach(product -> LabelListaProdutos.setItems());
    }

    @FXML
    public void OnButtonExluiListaClicked(){

    }


}
