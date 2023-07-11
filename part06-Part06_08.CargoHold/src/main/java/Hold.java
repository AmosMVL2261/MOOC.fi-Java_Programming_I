import java.util.ArrayList;

public class Hold {
    private ArrayList<Suitcase> suitcases;
    private int totalWeight;
    private int maxWeight;

    public Hold(int maxWeight){
        this.suitcases = new ArrayList<>();
        this.totalWeight=0;
        this.maxWeight=maxWeight;
    }

    public void addSuitcase(Suitcase suitcase){
        if(this.totalWeight+suitcase.totalWeight()<=this.maxWeight){
            this.totalWeight+=suitcase.totalWeight();
            suitcases.add(suitcase);
        }
    }

    public void printItems(){
        if(this.suitcases.size()>0){
            for(Suitcase suitcase : suitcases){
                ArrayList<Item> a =suitcase.getItems();
                for(Item item : a){
                    System.out.println(item);
                }
            }
        }
    }

    public String toString(){
        return  this.suitcases.size()+" suitcases ("+this.totalWeight+" kg)";
    }
}
