package com.jsm.issue.tracker.issue;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Issue {

    String title;
    LocalDateTime created;
    LocalDateTime updated;
    String createdBy;
    String description;
    Status status;

    enum Status {TODO, DOING, DONE};
}
