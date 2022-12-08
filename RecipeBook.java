/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Olivia Nolan Shafer
 *          Mitch Seto
 *          Hiromi G.
 */
public class RecipeBook {
    private Recipe[] book;
    int numrecipes = 0;
    
    public void loadRecipes(String filename){
        //open file reader

        //read json data and assign fields: name, ingredients, tags, etc.
        
        //Recipe r = new Recipe(name, ingredients, tags)

        //add r to book 
    }
    
    public Recipe[] searchByName(String name){
        /*
        Returns String array of all recipes whose names contain parameter name
        Params:  String name
        Returns: Recipe[] arr
        */
        
        //Public static Recipe[] searchbyName(String dishName, Recipe [] array) {
        //dishName = String.parseString(SEARCHBOXTEXTFIELD.getTest());
        
        for (int i = 0; i<book.length;i++) {
        // If the current recipe object’s name matches dishName, display in left column
            if((book[i].getName()).equals(name)) { 
                //display (book[i].getName());
            } 
        }
        
        return null;
        }
    
    public Recipe[] searchByIngredient(String[] ingredients){
        /* 
        TO BE IMPLEMENTED IF WE HAVE TIME
        Return Recipe[] whose ingredients are present in String[] ingredients
        Params: String[] ingredients
        Returns: Recipe[]
        */

        return book;
    }
    
    public void sortByPreptime(Recipe[] book){
        /* 
        Sorts elements in book by preptime (using bubble sort algorithm)
        Params: Recipe[] book
        Returns: none
        */  
    }
    
    public String displayRecipe(int i){
        /*
        Calls toString() for recipe at index
        Params: int i
        Returns: String
        */
        return "";
    }
    
}
