package com.jsm.issue.tracker.issue;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class IssueController {

    IssueService issueService;

    @PostMapping("/issue")
    ResponseEntity<Issue> createIssue() {
        Issue issue = issueService.createIssue();
        return new ResponseEntity(issue, HttpStatus.ACCEPTED);
    }
}
