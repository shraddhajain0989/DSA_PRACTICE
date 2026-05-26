
//laptop price each =55000 , qty =2, total-110000 
//laptop price each =55000 , qty =3, total-165000 
public class laptop_price {
private double price;
public laptop_price(double price) {
    if(price > 0){
        this.price = price;
    }else{
        this.price = 0;
        System.out.println("Price can't be negative. Set to 0.");
    }    
}
public double calculateTotalPrice(int quantity) {
    if(quantity > 0){
        return price * quantity;
    }else{
        System.out.println("Quantity must be positive");
        return 0;
    }
}
public double getPrice() {
    return price;
}
}


