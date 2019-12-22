package com.jsm.issue.tracker.issue;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IssueController {

    @PostMapping("/issue")
    ResponseEntity<Issue> createIssue() {
        Issue issue = new Issue();
        return new ResponseEntity(issue, HttpStatus.ACCEPTED);
    }
}
