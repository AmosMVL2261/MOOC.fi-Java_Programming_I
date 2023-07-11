import java.util.ArrayList;

public class BirdCollection {
    ArrayList<Bird> birdCollection;

    public BirdCollection(){
        this.birdCollection = new ArrayList<>();
    }

    public void addBird(String name, String latinName){
        Bird bird = new Bird(name, latinName);
        birdCollection.add(bird);
    }

    public void printAll(){
        for(int i=0; i<birdCollection.size(); i++){
            System.out.println(birdCollection.get(i));
        }
    }

    public void addObservation(String name){
        for(int i=0; i<birdCollection.size(); i++){
            if(birdCollection.get(i).getName().equals(name)){
                System.out.println(birdCollection.get(i));
                birdCollection.get(i).addObservation();
                System.out.println(birdCollection.get(i));
            }
        }
    }

    public void printOne(String name){
        for(int i=0; i<birdCollection.size(); i++){
            if(birdCollection.get(i).getName().equals(name)){
                System.out.println(birdCollection.get(i));
            }
        }        
    }
}
