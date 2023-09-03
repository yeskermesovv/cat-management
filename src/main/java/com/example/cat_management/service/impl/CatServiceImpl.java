package com.example.cat_management.service.impl;

import com.example.cat_management.model.Cat;
import com.example.cat_management.repository.CatRepository;
import com.example.cat_management.service.CatService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CatServiceImpl implements CatService {

    private final CatRepository catRepository;

    @Override
    public List<Cat> getAllCats() {
        return catRepository.findAll();
    }

    @Override
    public Optional<Cat> getCatById(Long id) {
        return catRepository.findById(id);
    }

    @Override
    public Cat createCat(Cat cat) {
        return catRepository.save(cat);
    }

    @Override
    public Cat updateCat(Cat cat) {
        return catRepository.save(cat);
    }

    @Override
    public void deleteCat(Long id) {
        catRepository.deleteById(id);
    }

    @Override
    public void deleteAllCats() {
        catRepository.deleteAll();
    }
}
