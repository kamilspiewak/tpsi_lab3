/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpsi_lab3;

/**
 *
 * @author Kamil
 */
public class Product {
    public String id;
    public String name;
    public double price;
    public String category;
    Product(String id, String name, double price, String category){
        this.category = category;
        this.price = price;
        this.name = name;
        this.id = id;
    }
}
