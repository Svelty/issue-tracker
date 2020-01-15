package com.jsm.issue.tracker.issue;

import lombok.AllArgsConstructor;
import org.apache.tomcat.jni.Time;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@AllArgsConstructor
public class IssueServiceImpl implements IssueService {

//    @Autowired
    IssueRepository issueRepository;

    @Override
    public Issue createIssue(String title, String user, String description) {
        Issue issue = new Issue(title, LocalDateTime.now(), LocalDateTime.now(), user, description, Issue.Status.TODO);
        issue = issueRepository.save(issue);
        return issue;
    }

    @Override
    public Issue getIssue(Long id) {
        return issueRepository.getOne(id);
    }

    @Override
    public List<Issue> getIssues() {
        return issueRepository.findAll();
    }

    @Override
    public Issue updateIssue(Long id) {
        Issue issue = issueRepository.getOne(id);
        issue.setUpdated(LocalDateTime.now());
        return issueRepository.save(issue);
    }

    @Override
    public Issue deleteIssue(Long id) {
        //Create "deleted" flag
        return null;
    }
}
