package ECommerceBackend;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<product> items;

    public Cart() {
        this.items = new ArrayList<>();
    }



    public void additems(product pro){
        items.add(pro);
        System.out.println("product added to cart..!");
    }

    public void viewcart(){
        if(items.isEmpty()){
            System.out.println("cart is empty :(");
            return;
        }
        for(product pro : items){
            System.out.println("-- " + pro.getName() + "(₹ " + pro.getPrice() + " ) --");
        }
        
    }
}
