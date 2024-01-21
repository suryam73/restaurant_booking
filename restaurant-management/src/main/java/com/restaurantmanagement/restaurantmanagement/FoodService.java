package com.restaurantmanagement.restaurantmanagement;

import java.util.List;
import java.util.Optional;

public interface FoodService {

    Optional<Food> getFoodById(Long foodId);

    List<Food> getAllFoods();

    Food createFood(Food food);

    Food updateFood(Long foodId, Food food);

    void deleteFood(Long foodId);
}
