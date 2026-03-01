package ECommerceBackend;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Product> items;

    public Cart() {
        this.items = new ArrayList<>();
    }



    public void additems(Product pro){
        items.add(pro);
        System.out.println("product added to cart..!");
    }

    public void viewcart(){
        if(items.isEmpty()){
            System.out.println("cart is empty :(");
            return;
        }
        for(Product pro : items){
            System.out.println("-- " + pro.getName() + "(₹ " + pro.getPrice() + " ) --");
        }
        
    }
}
