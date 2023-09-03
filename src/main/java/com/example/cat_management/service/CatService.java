package com.example.cat_management.service;

import com.example.cat_management.model.Cat;

import java.util.List;
import java.util.Optional;

public interface CatService {
    List<Cat> getAllCats();
    Optional<Cat> getCatById(Long id);
    Cat createCat(Cat cat);
    Cat updateCat(Cat cat);
    void deleteCat(Long id);

    void deleteAllCats();
}
