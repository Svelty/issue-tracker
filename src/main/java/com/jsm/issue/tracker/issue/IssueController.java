package com.jsm.issue.tracker.issue;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/issues")
@AllArgsConstructor
public class IssueController {

    IssueService issueService;

    @PostMapping
    ResponseEntity<Issue> createIssue(@RequestBody String title, @RequestBody String description, @RequestBody String user) {
        Issue issue = issueService.createIssue(title, description, user);
        return new ResponseEntity(issue, HttpStatus.ACCEPTED);
    }

    @GetMapping("/{id}")
    ResponseEntity<Issue> getIssue(@PathVariable Long id) {
        Issue issue = issueService.getIssue(id);
        return new ResponseEntity(issue, HttpStatus.ACCEPTED);
    }

    @GetMapping("/{id}")
    ResponseEntity<List<Issue>> getIssues() {
        List<Issue> issues = issueService.getIssues();
        return new ResponseEntity(issues, HttpStatus.ACCEPTED);
    }
}
