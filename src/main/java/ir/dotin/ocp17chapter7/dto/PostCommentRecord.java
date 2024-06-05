package ir.dotin.ocp17chapter7.dto;

import ir.dotin.ocp17chapter7.model.Post;
import ir.dotin.ocp17chapter7.model.PostComment;

public record PostCommentRecord(Long id,
                                String review) {
    public PostComment toPostComment(Long postId) {
        return new PostComment(new Post(id), review);
    }
}
