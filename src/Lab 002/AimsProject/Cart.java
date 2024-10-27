public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private int qtyOrdered = 0;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    public int getQtyOrdered() {
        return qtyOrdered;
    }
    public void addDigitalVideoDisc(DigitalVideoDisc item) {
        if(qtyOrdered < MAX_NUMBERS_ORDERED) {
            itemsOrdered[qtyOrdered] = item;
            qtyOrdered++;
            System.out.println("The disc has been added");
        }
        else{
            System.out.println("The cart is full");
        }
    }
    public void removeDigitalVideoDisc(DigitalVideoDisc item) {
        for(int i = 0; i < qtyOrdered; i++) {
            if(itemsOrdered[i] == item) {
                for(int j = i; j < qtyOrdered-1; j++) {
                    itemsOrdered[j] = itemsOrdered[j+1];
                }
                qtyOrdered--;
                itemsOrdered[qtyOrdered] = null;
            }
        }
        System.out.println("The disc has been removed");
    }
    public float totalCost(){
        float total = 0;
        for(int i = 0; i < qtyOrdered; i++) {
                total += itemsOrdered[i].getCost();
        }
        return total;
    }
}
