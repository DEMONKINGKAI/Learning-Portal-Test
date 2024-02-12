package com.example.learningportal.controller;

import com.example.learningportal.dto.FavoriteDTO;
import com.example.learningportal.service.FavoriteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/favorite")
public class FavoriteController {

    private final FavoriteService favoriteService;

    @Autowired
    public FavoriteController(FavoriteService favoriteService) {
        this.favoriteService = favoriteService;
    }

    @GetMapping
    public ResponseEntity<List<FavoriteDTO>> getAllFavorite() {
        List<FavoriteDTO> favorite = favoriteService.getAllFavorite();
        return new ResponseEntity<>(favorite, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<FavoriteDTO> getFavoriteById(@PathVariable Long id) {
        FavoriteDTO favorite = favoriteService.getFavoriteById(id);
        return new ResponseEntity<>(favorite, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<FavoriteDTO> createFavorite(@RequestBody FavoriteDTO favoriteDTO) {
        FavoriteDTO createdFavorite = favoriteService.createFavorite(favoriteDTO);
        return new ResponseEntity<>(createdFavorite, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<FavoriteDTO> updateFavorite(@PathVariable Long id, @RequestBody FavoriteDTO favoriteDTO) {
        FavoriteDTO updatedFavorite = favoriteService.updateFavorite(id, favoriteDTO);
        return new ResponseEntity<>(updatedFavorite, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteFavorite(@PathVariable Long id) {
        favoriteService.deleteFavorite(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
