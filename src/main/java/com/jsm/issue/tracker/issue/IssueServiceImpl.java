package com.jsm.issue.tracker.issue;

import org.apache.tomcat.jni.Time;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class IssueServiceImpl implements IssueService {

    @Autowired
    IssueRepository issueRepository;

    @Override
    public Issue createIssue() {
        Issue issue = new Issue("x", LocalDateTime.now(), LocalDateTime.now(), "y", "des", Issue.Status.TODO);

        issue = issueRepository.save(issue);
        return issue;
    }
}
