import java.util.ArrayList;

public class Recipe {
    String name;
    int time;
    ArrayList<String> ingredients;

    public Recipe(){
        this.name="";
        this.time=0;
        this.ingredients = new ArrayList<>();
    }

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return this.name;
    }

    public void setTime(int time){
        this.time=time;
    }

    public int getTime(){
        return this.time;
    }

    public void addIngredient(String ing){
        this.ingredients.add(ing);
    }

    public ArrayList<String> getIngredients(){
        return this.ingredients;
    }

    public void printRecipe(){
        System.out.println(this.name);
        System.out.println(this.time);
        for (String ingredient : ingredients) {
            System.out.println(ingredient);
        }
    }

    public String toString(){
        return (this.name+", cooking time: "+this.time);
    }
}
