package ir.dotin.ocp17chapter7.service.impl;

import ir.dotin.ocp17chapter7.dto.PostRecord;
import ir.dotin.ocp17chapter7.model.Post;
import ir.dotin.ocp17chapter7.repository.PostRepository;
import ir.dotin.ocp17chapter7.service.intefaces.PostService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
@Transactional(readOnly = true)
public class PostServiceImpl implements PostService {
    private final PostRepository repository;

    public PostRecord findPostRecordById(Long postId) {
        return repository
                .findWithCommentsById(postId)
                .map(Post::toRecord)
                .orElse(null);
    }

    @Transactional
    public PostRecord insertPostRecord(String post) {
        return repository.persist(new Post().setTitle(post)).toRecord();
    }

    @Transactional
    public PostRecord mergePostRecord(PostRecord postRecord) {
        return repository.merge(postRecord.toPost()).toRecord();
    }
}
