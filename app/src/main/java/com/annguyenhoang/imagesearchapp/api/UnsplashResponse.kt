package com.annguyenhoang.imagesearchapp.api

import com.annguyenhoang.imagesearchapp.data.UnsplashPhoto

data class UnsplashResponse(
    val results: List<UnsplashPhoto>
)