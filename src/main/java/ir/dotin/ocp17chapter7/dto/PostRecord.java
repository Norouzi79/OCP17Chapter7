package ir.dotin.ocp17chapter7.dto;

import ir.dotin.ocp17chapter7.model.Post;

import java.util.List;

public record PostRecord(Long id,
                         String title,
                         List<PostCommentRecord> comments) {
    public Post toPost() {
        Post post = new Post()
                .setId(id)
                .setTitle(title);
        comments.forEach(
                comment -> post.addComment(comment.toPostComment(id))
        );
        return post;
    }
}
