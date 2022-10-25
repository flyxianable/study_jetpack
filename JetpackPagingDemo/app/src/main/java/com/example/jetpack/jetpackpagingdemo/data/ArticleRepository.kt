package com.example.jetpack.jetpackpagingdemo.data

import android.os.Build
import androidx.annotation.RequiresApi
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf
import java.time.LocalDateTime

@RequiresApi(Build.VERSION_CODES.O)
private val firstArticleCreatedTime = LocalDateTime.now()

class ArticleRepository {

    @RequiresApi(Build.VERSION_CODES.O)
    val isempty = (0..500).map {
        number ->
        Article(
            id = number,
            title = "Article $number",
            description =  "This description article $number",
            created =  firstArticleCreatedTime.minusDays(number.toLong())

        )
    }

}