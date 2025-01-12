/*
 * This file is generated by jOOQ.
 */
package com.databasir.dao.tables.pojos;


import com.databasir.dao.enums.ProjectSyncTaskStatus;

import java.io.Serializable;
import java.time.LocalDateTime;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ProjectSyncTaskPojo implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer               id;
    private Integer               projectId;
    private Integer               userId;
    private ProjectSyncTaskStatus status;
    private String                result;
    private LocalDateTime         runAt;
    private LocalDateTime         updateAt;
    private LocalDateTime         createAt;

    public ProjectSyncTaskPojo() {}

    public ProjectSyncTaskPojo(ProjectSyncTaskPojo value) {
        this.id = value.id;
        this.projectId = value.projectId;
        this.userId = value.userId;
        this.status = value.status;
        this.result = value.result;
        this.runAt = value.runAt;
        this.updateAt = value.updateAt;
        this.createAt = value.createAt;
    }

    public ProjectSyncTaskPojo(
        Integer               id,
        Integer               projectId,
        Integer               userId,
        ProjectSyncTaskStatus status,
        String                result,
        LocalDateTime         runAt,
        LocalDateTime         updateAt,
        LocalDateTime         createAt
    ) {
        this.id = id;
        this.projectId = projectId;
        this.userId = userId;
        this.status = status;
        this.result = result;
        this.runAt = runAt;
        this.updateAt = updateAt;
        this.createAt = createAt;
    }

    /**
     * Getter for <code>databasir.project_sync_task.id</code>.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for <code>databasir.project_sync_task.id</code>.
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Getter for <code>databasir.project_sync_task.project_id</code>.
     */
    public Integer getProjectId() {
        return this.projectId;
    }

    /**
     * Setter for <code>databasir.project_sync_task.project_id</code>.
     */
    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    /**
     * Getter for <code>databasir.project_sync_task.user_id</code>.
     */
    public Integer getUserId() {
        return this.userId;
    }

    /**
     * Setter for <code>databasir.project_sync_task.user_id</code>.
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * Getter for <code>databasir.project_sync_task.status</code>. NEW  RUNNING 
     * FINISHED  FAILED  CANCELED
     */
    public ProjectSyncTaskStatus getStatus() {
        return this.status;
    }

    /**
     * Setter for <code>databasir.project_sync_task.status</code>. NEW  RUNNING 
     * FINISHED  FAILED  CANCELED
     */
    public void setStatus(ProjectSyncTaskStatus status) {
        this.status = status;
    }

    /**
     * Getter for <code>databasir.project_sync_task.result</code>.
     */
    public String getResult() {
        return this.result;
    }

    /**
     * Setter for <code>databasir.project_sync_task.result</code>.
     */
    public void setResult(String result) {
        this.result = result;
    }

    /**
     * Getter for <code>databasir.project_sync_task.run_at</code>.
     */
    public LocalDateTime getRunAt() {
        return this.runAt;
    }

    /**
     * Setter for <code>databasir.project_sync_task.run_at</code>.
     */
    public void setRunAt(LocalDateTime runAt) {
        this.runAt = runAt;
    }

    /**
     * Getter for <code>databasir.project_sync_task.update_at</code>.
     */
    public LocalDateTime getUpdateAt() {
        return this.updateAt;
    }

    /**
     * Setter for <code>databasir.project_sync_task.update_at</code>.
     */
    public void setUpdateAt(LocalDateTime updateAt) {
        this.updateAt = updateAt;
    }

    /**
     * Getter for <code>databasir.project_sync_task.create_at</code>.
     */
    public LocalDateTime getCreateAt() {
        return this.createAt;
    }

    /**
     * Setter for <code>databasir.project_sync_task.create_at</code>.
     */
    public void setCreateAt(LocalDateTime createAt) {
        this.createAt = createAt;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ProjectSyncTaskPojo (");

        sb.append(id);
        sb.append(", ").append(projectId);
        sb.append(", ").append(userId);
        sb.append(", ").append(status);
        sb.append(", ").append(result);
        sb.append(", ").append(runAt);
        sb.append(", ").append(updateAt);
        sb.append(", ").append(createAt);

        sb.append(")");
        return sb.toString();
    }
}
