package com.example.implementing_server_side_kotlin_development.presentation.model

/**
 * 新規作成のリクエストモデル
 *
 * @param article
 */
data class NewArticleRequest(
    @field:Valid
    @Schema(required = true, description = "")
    @field:NotNull
    @field:JsonProperty("article", required = true) private val article: NewArticle? = null,
) {
    /**
     * 新規作成記事のプロパティ
     *
     * @NotNull アノテーションを付与しているため、null 非許容型に変換
     */
    @get:Schema(hidden = true)
    val validatedArticle: NewArticle
        get() = article!!
}