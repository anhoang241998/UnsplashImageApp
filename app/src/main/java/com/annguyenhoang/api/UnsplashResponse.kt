package com.annguyenhoang.api

import com.annguyenhoang.data.UnsplashPhoto

data class UnsplashResponse(
    val results: List<UnsplashPhoto>
)