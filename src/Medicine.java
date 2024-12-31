/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class Medicine {
    private int id, quantity;
    private float buyingPrice, sellingPrice;
    private String name, description;

    public Medicine() {
        this.id = 0;
        this.quantity = 0;
        this.buyingPrice = 0;
        this.sellingPrice = 0;
        this.name = "";
        this.description = "";
    }

    
    public Medicine(int id, int quantity, float buyingPrice, float sellingPrice, String name, String description) {
        this.id = id;
        this.quantity = quantity;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
        this.name = name;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getBuyingPrice() {
        return buyingPrice;
    }

    public void setBuyingPrice(float buyingPrice) {
        this.buyingPrice = buyingPrice;
    }

    public float getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(float sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Medicine{" + "id=" + id + ", quantity=" + quantity + ", buyingPrice=" + buyingPrice + ", sellingPrice=" + sellingPrice + ", name=" + name + ", description=" + description + '}';
    }
    
    
}
