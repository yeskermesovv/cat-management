package com.example.cat_management.controller;

import com.example.cat_management.model.Cat;
import com.example.cat_management.service.CatService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/cats")
@RequiredArgsConstructor
public class CatController {

    private final CatService catService;

    @GetMapping
    public ResponseEntity<?> getAllCats() {
        return new ResponseEntity<>(catService.getAllCats(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getCatById(@PathVariable Long id) {
        Optional<Cat> cat = catService.getCatById(id);
        if (cat.isPresent()) {
            return new ResponseEntity<>(cat.get(), HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PostMapping
    public ResponseEntity<?> createCat(@RequestBody Cat cat) {
        return new ResponseEntity<>(catService.createCat(cat) ,HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateCat(@PathVariable Long id, @RequestBody Cat cat) {
        Optional<Cat> existingCat = catService.getCatById(id);
        if (existingCat.isPresent()) {
            return new ResponseEntity<>(catService.updateCat(cat), HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteCat(Long id) {
        catService.deleteCat(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<?> deleteAllCats() {
        catService.deleteAllCats();
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
