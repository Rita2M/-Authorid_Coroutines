package dto

data class PostWithAuthorAndWithComments(
    val postAuthor: PostWithAuthor,
    val commentsAuthor: List<CommentsWithAuthor>

)
