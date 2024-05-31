package ir.dotin.ocp17chapter7.model;

import ir.dotin.ocp17chapter7.dto.PostCommentRecord;
import ir.dotin.ocp17chapter7.dto.PostRecord;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "Post")
@Table(name = "post")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;

    @OneToMany(
            mappedBy = "post",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<PostComment> comments = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public Post setId(Long id) {
        this.id = id;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public Post setTitle(String title) {
        this.title = title;
        return this;
    }

    public List<PostComment> getComments() {
        return comments;
    }

    public void addComment(PostComment comment) {
        comments.add(comment);
        comment.setPost(this);
    }

    public void removeComment(PostComment comment) {
        comments.remove(comment);
        comment.setPost(null);
    }

    public PostRecord toRecord() {
        return new PostRecord(
                id,
                title,
                comments.stream().map(comment ->
                        new PostCommentRecord(
                                comment.getId(),
                                comment.getReview()
                        )
                ).toList()
        );
    }

    public Post(Long id) {
        this.id = id;
    }
}
