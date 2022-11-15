package com.cookingApp;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class RecipeJdbcDao implements CrudDAO<Recipe> {
    @Override
    public List<Recipe> findAll() {
        List<Recipe> recipesList = new ArrayList<>();
        Connection connection = ConnectionManager.getConnectionInstance();
        try (Statement statement = connection.createStatement()) {

            String query = """
                    SELECT `Id_recipe`, recipe.name, `description`, category.categoryName, keyWordName
                    FROM `recipe`
                    JOIN `category` ON recipe.Id_category = category.Id_category
                    JOIN `keyword` ON recipe.Id_recipe = keyword.Id_keyWord
                    JOIN `ingredient` ON recipe.Id_recipe = ingredient.Id_ingredient
                    """;

            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                Recipe recipe = new Recipe(
                        rs.getLong("Id_Recipe"),
                        rs.getString("name"),
                        rs.getString("description"),
                        rs.getString("categoryName"),
                        Collections.singletonList(rs.getString("keyWordName")),
                        Collections.synchronizedMap()
                );
                recipesList.add(recipe);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return recipesList;
    }

    @Override
    public Optional<Recipe> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Recipe create(Recipe element) {
        return null;
    }
}
