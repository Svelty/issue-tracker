package com.jsm.issue.tracker.issue;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
public class Issue extends BaseEntity {

    String title;
    LocalDateTime created;
    LocalDateTime updated;
    String createdBy;
    String description;
    Status status;

    enum Status {TODO, DOING, DONE};
}
