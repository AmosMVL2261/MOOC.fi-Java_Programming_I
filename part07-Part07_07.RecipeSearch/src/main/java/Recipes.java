import java.util.ArrayList;

public class Recipes {
    private ArrayList<String> stringRecipes;
    private ArrayList<Recipe> recipes;

    public Recipes(ArrayList<String> stringRecipes){
        this.stringRecipes=stringRecipes; //Recive the strings 
        this.recipes = new ArrayList<>(); //Final recipes list
        fromStringToRecipes(); //Create the recipies objects from strings
    }

    public void fromStringToRecipes(){
        int beggining = 1;
        Recipe recipe = new Recipe();
        for (int i = 0;i<stringRecipes.size();i++) {
            String line = stringRecipes.get(i);
            if(line.equals("") || i == stringRecipes.size()-1){
                //Add the recipe
                //The first line isn't '\n', so no void recipe will be added at the beggining
                //of the program because the first line is a title.
                //If it's the last line, will add the last recipe with the second condition
                recipes.add(recipe);
                beggining=1;
                recipe = new Recipe();
                continue;
            }
            if(beggining==1){
                //Add the name
                recipe.setName(line);
                beggining=2;
                continue;
            }
            if(beggining==2){
                //Add the time
                recipe.setTime(Integer.valueOf(line));
                beggining=3;
                continue;
            }
            if(beggining==3){
                //Add the ingredients
                recipe.addIngredient(line);
                continue;
            }
        }
    }

    public void searchName(String name){
        System.out.println("\nRecipes:");
        for (Recipe recipe : this.recipes) {
            if(recipe.getName().toLowerCase().contains(name)){
                System.out.println(recipe);;
            }
        }
    }

    public void searchTime(int time){
        System.out.println("\nRecipes:");
        for (Recipe recipe : this.recipes) {
            if(recipe.getTime()<=time){
                System.out.println(recipe);
            }
        }
    }

    public void searchIngredient(String ingredient){
        System.out.println("\nRecipes:");
        for (Recipe recipe : this.recipes) {
            ArrayList<String> ingredients = recipe.getIngredients();
            for (String ingredientElement : ingredients) {
                if(ingredientElement.equals(ingredient)){
                    System.out.println(recipe);
                    break;
                }
            }
            
        }
    }

    public void printAll(){
        for (Recipe line : this.recipes) {
            System.out.println(line);
        }
    }
}
