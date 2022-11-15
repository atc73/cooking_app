package com.cookingApp;

public class Main {
    public static void main(String[] args) {

        CrudDAO<Recipe> recipeCrudDAO = DaoFactory.getRecipeDao();
        System.out.println(recipeCrudDAO.findAll());
    }
}
