package ir.dotin.ocp17chapter7.repository;

import io.hypersistence.utils.spring.repository.BaseJpaRepository;
import ir.dotin.ocp17chapter7.model.Post;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
// For more info read Vlad Mihalcea's article: https://vladmihalcea.com/basejparepository-hypersistence-utils/
public interface PostRepository extends BaseJpaRepository<Post, Long> {
    /** <strong>What is """ ?</strong> It's text blocks. <br>
     * Text blocks are available as a standard feature since Java 15. <br>
     * Text blocks allow you to declare multi-line strings in a more readable and efficient way. <br>
     * They start with three double-quote characters (""") followed by optional whitespaces and a newline. <br>
     * The result type of a text block is still a String. <br>
     * Inside text blocks, you can freely use newlines and quotes without escaping them. <br>
     *
     * <strong>Indentation:</strong> <br>
     *  Text blocks handle indentation in a smart way. <br>
     *  The compiler checks for the minimum indentation in all non-empty lines. <br>
     *  It treats part of the indentation as source code and another part as part of the text block. <br>
     * <strong>Escaping:</strong> <br>
     *  Double-quotes inside text blocks don’t need to be escaped. <br>
     *  You can even use three double-quotes within a text block by escaping one of them <br>
     */
    @Query("""
        select p
        from Post p
        join fetch p.comments
        where p.id = :postId
        """)
    Optional<Post> findWithCommentsById(
            @Param("postId") Long postId
    );
}
