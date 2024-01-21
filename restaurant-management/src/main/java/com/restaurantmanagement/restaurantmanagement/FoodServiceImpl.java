package com.restaurantmanagement.restaurantmanagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class FoodServiceImpl implements FoodService {

    @Autowired
    private FoodRepository foodRepository;

    @Override
    public Optional<Food> getFoodById(Long foodId) {
        return foodRepository.findById(foodId);
    }

    @Override
    public List<Food> getAllFoods() {
        return foodRepository.findAll();
    }

    @Override
    public Food createFood(Food food) {
        return foodRepository.save(food);
    }

    @Override
    public Food updateFood(Long foodId, Food food) {
        // Implement update logic based on your requirements
        return null;
    }

    @Override
    public void deleteFood(Long foodId) {
        foodRepository.deleteById(foodId);
    }
}
