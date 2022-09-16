package be.intecbrussel;

import java.util.List;
public class App {

    public static void main(String[] args) {
        ProductSorter productSorter= new ProductSorter();
        ProductFactory productFactory= new ProductFactory(productSorter);
        productFactory.createProducts(100);
        System.out.println("There are "+productSorter.getNumberOfProducts()+" products");


        List<FoodProduct> foodProducts= productSorter.getFoodProducts();
        System.out.println("\n------"+foodProducts.size()+"------");
        for( int i =0; i<foodProducts.size();i++)
            System.out.println(foodProducts.get(i));




        List<HealthProduct> healthProducts= productSorter.getHealthProducts();
        System.out.println("\n------"+healthProducts.size()+"------");
        for( int i =0; i<healthProducts.size();i++)
            System.out.println(healthProducts.get(i));

        List<ElectricProduct> electricProducts= productSorter.getElectricProducts();
        System.out.println("\n------"+electricProducts.size()+"------");
        for( int i =0; i<electricProducts.size();i++)
            System.out.println(electricProducts.get(i));



    }

}


