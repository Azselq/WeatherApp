package com.example.weatherapp.domain.usecase

import com.example.weatherapp.domain.repository.FavouriteRepository
import javax.inject.Inject

class GetFavoriteCitiesUseCase @Inject constructor(
    private val repository: FavouriteRepository
) {
    operator fun invoke() = repository.favouriteCities
}