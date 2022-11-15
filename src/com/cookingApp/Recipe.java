package com.cookingApp;

import java.util.HashMap;
import java.util.List;

public class Recipe {
    private Long recipeId;
    private String recipeName;
    private String description;
    private String categoryName;
    private List keyWords;
    private HashMap recipeIngredients;

    public Recipe(Long recipeId, String recipeName, String description, String categoryName, List keyWords, HashMap recipeIngredients) {
        this.recipeId = recipeId;
        this.recipeName = recipeName;
        this.description = description;
        this.categoryName = categoryName;
        this.keyWords = keyWords;
        this.recipeIngredients = recipeIngredients;
    }



    public Long getRecipeId() {
        return recipeId;
    }

    public void setRecipeId(Long recipeId) {
        this.recipeId = recipeId;
    }

    public String getRecipeName() {
        return recipeName;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public List getKeyWords() {
        return keyWords;
    }

    public void setKeyWords(List keyWords) {
        this.keyWords = keyWords;
    }

    public HashMap getRecipeIngredients() {
        return recipeIngredients;
    }

    public void setRecipeIngredients(HashMap recipeIngredients) {
        this.recipeIngredients = recipeIngredients;
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "recipeId=" + recipeId +
                ", recipeName='" + recipeName + '\'' +
                ", description='" + description + '\'' +
                ", categoryName='" + categoryName + '\'' +
                ", keyWords=" + keyWords +
                ", recipeIngredients=" + recipeIngredients +
                '}';
    }
}
