package ir.dotin.ocp17chapter7.controller;

import io.swagger.v3.oas.annotations.Operation;
import ir.dotin.ocp17chapter7.dto.PostRecord;
import ir.dotin.ocp17chapter7.dto.TestDto;
import ir.dotin.ocp17chapter7.dto.TestUpdateDto;
import ir.dotin.ocp17chapter7.service.intefaces.PostService;
import ir.dotin.ocp17chapter7.service.intefaces.TestService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("/")
public class PostController {
    private final PostService service;

    @PostMapping("/insert")
    @Operation(summary = "inserting post with comment")
    public PostRecord save(@RequestBody String post) {
        return service.insertPostRecord(post);
    }

    @PutMapping("/updateComments")
    @Operation(summary = "update post comments")
    public PostRecord update(@RequestBody PostRecord postRecord) {
        return service.mergePostRecord(postRecord);
    }

    @GetMapping("/getPostById/{id}")
    @Operation(summary = "get post with comments by id")
    public PostRecord getById(@PathVariable Long id) {
        return service.findPostRecordById(id);
    }
}
