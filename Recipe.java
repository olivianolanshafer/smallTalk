/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Data class representing a recipe in a cookbook
 * @author Olivia Nolan Shafer
 *          Mitch Seto
 *          Hiromi G.
 */
public record Recipe(String name, String[] ingredients, int preptime, String[] steps) {
    public String getName() {
        /* 
        Returns name of a recipe
        Params: none
        Returns: String name
        */
        return name;
    }

    public String[] getIngredients() {
         /* 
         Returns ingredients of a recipe
         Params: none
         Returns: String[] ingredients
         */
        return ingredients;
    }

    public int getPreptime() {
        /* 
        Returns prep time of a recipe
        Params: none
        Returns: int preptime
        */
        return preptime;
    }

    public String[] getSteps() {
        /* 
        Returns name of a recipe
        Params: none
        Returns: String name
        */
        return steps;
    }
    
    public int compareTo(Object other){
        /*
        Compares Recipe objects based on prep time alone. 
        Returns difference between prep times of two Recipe objects. 
        */
    
        if(this.getClass() != other.getClass()){
            throw new java.lang.RuntimeException("compareTo: incompatible objects");
       }
        if(this == other) return 0; 
        Recipe otherRecipe = (Recipe)other;
        return this.preptime() - otherRecipe.preptime();
    } 

    public String toString(){
        /*
        String representation of a Recipe
        */
        return "Name: " + name.toString() + "\nIngredients: " + ingredients.toString() + 
        "\nPreptime: " + preptime +  "\nSteps: " + steps.toString();

    }
    
}
