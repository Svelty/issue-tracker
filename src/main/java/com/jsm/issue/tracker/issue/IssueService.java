package com.jsm.issue.tracker.issue;

import java.util.List;

public interface IssueService {
    /**
     * Create a new issue to be tracked
     * @return Issue
     */
    Issue createIssue(String title, String user, String description);

    Issue getIssue(Long id);

    List<Issue> getIssues();

    Issue updateIssue(Long id);

    Issue deleteIssue(Long id);
}
