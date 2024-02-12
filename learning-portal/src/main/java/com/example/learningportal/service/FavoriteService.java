package com.example.learningportal.service;

import com.example.learningportal.dto.FavoriteDTO;

import java.util.List;

public interface FavoriteService {

    List<FavoriteDTO> getAllFavorite();

    FavoriteDTO getFavoriteById(Long id);

    FavoriteDTO createFavorite(FavoriteDTO favoriteDTO);

    FavoriteDTO updateFavorite(Long id, FavoriteDTO favoriteDTO);

    void deleteFavorite(Long id);
}
