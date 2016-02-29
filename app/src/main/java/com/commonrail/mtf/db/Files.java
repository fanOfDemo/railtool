package com.commonrail.mtf.db;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table FILES.
 */
public class Files {

    private long id;
    /** Not-null value. */
    private String fileType;
    /** Not-null value. */
    private String fileUrl;
    /** Not-null value. */
    private String fileLocalUrl;
    /** Not-null value. */
    private String fileLen;
    private int fileStatus;

    public Files() {
    }

    public Files(long id) {
        this.id = id;
    }

    public Files(long id, String fileType, String fileUrl, String fileLocalUrl, String fileLen, int fileStatus) {
        this.id = id;
        this.fileType = fileType;
        this.fileUrl = fileUrl;
        this.fileLocalUrl = fileLocalUrl;
        this.fileLen = fileLen;
        this.fileStatus = fileStatus;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    /** Not-null value. */
    public String getFileType() {
        return fileType;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    /** Not-null value. */
    public String getFileUrl() {
        return fileUrl;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }

    /** Not-null value. */
    public String getFileLocalUrl() {
        return fileLocalUrl;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setFileLocalUrl(String fileLocalUrl) {
        this.fileLocalUrl = fileLocalUrl;
    }

    /** Not-null value. */
    public String getFileLen() {
        return fileLen;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setFileLen(String fileLen) {
        this.fileLen = fileLen;
    }

    public int getFileStatus() {
        return fileStatus;
    }

    public void setFileStatus(int fileStatus) {
        this.fileStatus = fileStatus;
    }

}
