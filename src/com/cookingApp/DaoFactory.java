package com.cookingApp;

public class DaoFactory {

    private DaoFactory() {
    }


    public static CrudDAO<Recipe> getRecipeDao() {
        return new RecipeJdbcDao();
    }
}
