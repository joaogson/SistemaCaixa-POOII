package com.example.sistemacaixa;

import java.util.Objects;

public class Product {
    public String Name;
    public int Codigo;
    public double Preco;

    public Product(String name, int codigo, double preco){
        Name = name;
        Codigo = codigo;
        Preco = preco;
    }

    public String GetName(){
        return Name;
    }

    public int GetCodigo(){
        return Codigo;
    }
    public double GetPreco(){
        return Preco;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj)
            return true;
        if(obj.getClass() != getClass())
            return false;

        Product other = (Product) obj;
        return Objects.equals(Name, other.Name) && Codigo == other.Codigo;
    }

    @Override
    public String toString(){
        return "Product: " + Name
                + "Price: " + Preco
                + "Codigo: " + Codigo;
    }


}
