package com.example.project.model;

import lombok.SneakyThrows;

import java.sql.SQLException;

public class AnimalHistoryComments {
    private int recordId;
    private int commentId;
    private String description;

//    private JDBCConnect myJDBC;

    public AnimalHistoryComments(int recordId, int commentId, String description) {
        this.recordId = recordId;
        this.commentId = commentId;
        this.description = description;
    }

    @Override
    public String toString() {
        return "AnimalHistoryComments{" +
                "recordId=" + recordId +
                ", commentId=" + commentId +
                ", description='" + description + '\'' +
                '}';
    }

    //    public AnimalHistoryComments(int recordId) throws SQLException {
//        myJDBC = new JDBCConnect();
//        myJDBC.createConnection();
//        this.recordId = recordId;
//        setComments();
//    }
//
//    public void setComments() throws SQLException {
//        this.commentId = this.getCommentId();
//        this.description = this.getDescription();
//    }
//
//    public int getRecordId() {
//        return recordId;
//    }
//
//    public void setRecordId(int recordId) {
//        this.recordId = recordId;
//    }
//
//    public int getCommentId() throws SQLException {
//        return Integer.parseInt(myJDBC.animalGetComment(recordId, "Record_ID"));
//    }
//
//    public void setCommentId(int commentId) {
//        this.commentId = commentId;
//    }
//
//    public String getDescription() throws SQLException {
//        return myJDBC.animalGetComment(recordId, "Description");
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
//
//    @SneakyThrows
//    @Override
//    public String toString() {
//        return "AnimalHistoryComments{" +
//                "recordId=" + this.getRecordId() +
//                ", commentId=" + this.getCommentId() +
//                ", description='" + this.getDescription() + '\'' +
//                '}';
//    }
}
