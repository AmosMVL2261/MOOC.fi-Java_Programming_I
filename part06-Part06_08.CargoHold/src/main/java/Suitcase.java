import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> items;
    private int totalWeight;
    private int maxWeight;

    public Suitcase(int maxWeight){
        items = new ArrayList<>();
        this.maxWeight=maxWeight;
        this.totalWeight=0;
    }

    public ArrayList<Item> getItems(){
        return this.items;
    }

    public void addItem(Item item){
        if(item.getWeight()+this.totalWeight<=this.maxWeight){
            this.totalWeight+=item.getWeight();
            items.add(item);
        }
    }

    public void printItems(){
        if(items.size()>0){
            for(Item item : items){
                System.out.println(item);
            }
        }
    }

    public Item heaviestItem(){
        if(items.size()>0){
            Item heavier=items.get(0);
            for(Item item : items){
                if(item.getWeight()>heavier.getWeight()){
                    heavier=item;
                }
            }
            return heavier;
        }else{
            return null;
        }
    }

    public int totalWeight(){
        return this.totalWeight;
    }

    public String toString(){
        int total=0;
        for(Item item : items){
            total+=item.getWeight();
        }
        if(items.size()==0){
            return "no items (0 kg)";
        }else if(items.size()==1){
            return items.size()+" item ("+total+" kg)";
        }else{
            return items.size()+" items ("+total+" kg)";
        }
        
    }
}
