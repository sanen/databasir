/*
 * This file is generated by jOOQ.
 */
package com.databasir.dao.tables.pojos;


import java.io.Serializable;
import java.time.LocalDateTime;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DocumentRemarkPojo implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer       id;
    private String        remark;
    private Integer       userId;
    private Integer       projectId;
    private String        tableName;
    private String        columnName;
    private LocalDateTime createAt;

    public DocumentRemarkPojo() {}

    public DocumentRemarkPojo(DocumentRemarkPojo value) {
        this.id = value.id;
        this.remark = value.remark;
        this.userId = value.userId;
        this.projectId = value.projectId;
        this.tableName = value.tableName;
        this.columnName = value.columnName;
        this.createAt = value.createAt;
    }

    public DocumentRemarkPojo(
        Integer       id,
        String        remark,
        Integer       userId,
        Integer       projectId,
        String        tableName,
        String        columnName,
        LocalDateTime createAt
    ) {
        this.id = id;
        this.remark = remark;
        this.userId = userId;
        this.projectId = projectId;
        this.tableName = tableName;
        this.columnName = columnName;
        this.createAt = createAt;
    }

    /**
     * Getter for <code>databasir.document_remark.id</code>.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for <code>databasir.document_remark.id</code>.
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Getter for <code>databasir.document_remark.remark</code>.
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * Setter for <code>databasir.document_remark.remark</code>.
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * Getter for <code>databasir.document_remark.user_id</code>. user.id
     */
    public Integer getUserId() {
        return this.userId;
    }

    /**
     * Setter for <code>databasir.document_remark.user_id</code>. user.id
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * Getter for <code>databasir.document_remark.project_id</code>.
     */
    public Integer getProjectId() {
        return this.projectId;
    }

    /**
     * Setter for <code>databasir.document_remark.project_id</code>.
     */
    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    /**
     * Getter for <code>databasir.document_remark.table_name</code>.
     */
    public String getTableName() {
        return this.tableName;
    }

    /**
     * Setter for <code>databasir.document_remark.table_name</code>.
     */
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * Getter for <code>databasir.document_remark.column_name</code>.
     */
    public String getColumnName() {
        return this.columnName;
    }

    /**
     * Setter for <code>databasir.document_remark.column_name</code>.
     */
    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    /**
     * Getter for <code>databasir.document_remark.create_at</code>.
     */
    public LocalDateTime getCreateAt() {
        return this.createAt;
    }

    /**
     * Setter for <code>databasir.document_remark.create_at</code>.
     */
    public void setCreateAt(LocalDateTime createAt) {
        this.createAt = createAt;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("DocumentRemarkPojo (");

        sb.append(id);
        sb.append(", ").append(remark);
        sb.append(", ").append(userId);
        sb.append(", ").append(projectId);
        sb.append(", ").append(tableName);
        sb.append(", ").append(columnName);
        sb.append(", ").append(createAt);

        sb.append(")");
        return sb.toString();
    }
}