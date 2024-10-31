package com.example.sistemacaixa;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class ProductController {

    public List<Product> Products = Arrays.asList(
            new Product("Arroz Branco", 1, 5.99),
            new Product("Feijão Preto", 2, 4.49),
            new Product("Açúcar Cristal", 3, 2.99),
            new Product("Sal Refinado", 4, 1.99),
            new Product("Farinha de Trigo", 5, 3.29),
            new Product("Macarrão Espaguete", 6, 2.49),
            new Product("Óleo de Soja", 7, 6.99),
            new Product("Vinagre de Álcool", 8, 2.29),
            new Product("Leite Integral", 9, 3.99),
            new Product("Queijo Mussarela", 10, 14.99),
            new Product("Presunto", 11, 12.49),
            new Product("Frango Congelado", 12, 10.99),
            new Product("Carne Bovina", 13, 22.99),
            new Product("Pão Francês", 14, 0.50),
            new Product("Manteiga", 15, 5.49),
            new Product("Iogurte Natural", 16, 3.29),
            new Product("Suco de Laranja", 17, 4.99),
            new Product("Cerveja Lata", 18, 2.49),
            new Product("Refrigerante 2L", 19, 5.99),
            new Product("Chocolate ao Leite", 20, 3.99),
            new Product("Biscoito Recheado", 21, 4.49),
            new Product("Papel Toalha", 22, 2.99),
            new Product("Detergente Líquido", 23, 3.19),
            new Product("Sabão em Pó", 24, 6.49),
            new Product("Desinfetante", 25, 4.99),
            new Product("Shampoo", 26, 8.99),
            new Product("Condicionador", 27, 8.49),
            new Product("Creme Dental", 28, 2.89),
            new Product("Sabonete", 29, 1.79),
            new Product("Fósforos", 30, 0.99),
            new Product("Pilhas AA", 31, 4.29),
            new Product("Baterias", 32, 5.99),
            new Product("Vassoura", 33, 7.49),
            new Product("Rodo", 34, 6.99),
            new Product("Esponja de Louça", 35, 1.29),
            new Product("Saco de Lixo", 36, 2.19),
            new Product("Alho", 37, 3.49),
            new Product("Cebola", 38, 1.49),
            new Product("Tomate", 39, 4.99),
            new Product("Batata", 40, 2.99)
    );

    @FXML
    private TextField TextProduto;
    @FXML
    private Label LabelDescricaoProduto;
    @FXML
    private Label LabelPreco;

    @FXML
    public void onTextProdutoKeyTyped(){
        Product product;
        List<Product> products = Products.stream().filter(x -> x.Codigo == Integer.parseInt(TextProduto.getText())).toList();
        if(products.stream().count() > 0){
            product = products.get(0);
            LabelDescricaoProduto.setText(product.Name);
            LabelPreco.setText(String.valueOf(product.Preco));
        }
        else{
            LabelDescricaoProduto.setText("");
            LabelPreco.setText("");
        }


    }

}
