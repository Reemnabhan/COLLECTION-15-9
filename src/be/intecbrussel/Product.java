package be.intecbrussel;

import java.util.Objects;

public class Product {
    private String name;
    private int productID ;

    public Product(String name, int productID) {
        this.name = name;
        this.productID = productID;

    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", productID=" + productID +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Product other = (Product) obj;
        if (this.productID != other.productID) {
            return false;
        }
        return true;
    }



}




