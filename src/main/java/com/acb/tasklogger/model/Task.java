package com.acb.tasklogger.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "TASK")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "TIMESPENTINMIN")
    private Integer timeSpentInMin;

    @Column(name = "TASKGROUP")
    private String taskGroup;

    @Column(name = "ASSIGNEE")
    private String assignee;

    @Column(name = "ISTASKFINISHED")
    private boolean isTaskFinished;

    @ElementCollection
    private List<Integer> subTaskIds;
}
