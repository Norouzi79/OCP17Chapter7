package ir.dotin.ocp17chapter7.service.intefaces;

import ir.dotin.ocp17chapter7.dto.PostRecord;

public interface PostService {
    PostRecord findPostRecordById(Long postId);

    PostRecord insertPostRecord(String post);

    PostRecord mergePostRecord(PostRecord postRecord);
}
