package com.jsm.issue.tracker.issue;

import org.springframework.stereotype.Service;

@Service
public class IssueServiceImpl implements IssueService {

    @Override
    public Issue createIssue() {
        return new Issue();
    }
}
