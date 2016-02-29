package com.commonrail.mtf.db;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import com.commonrail.mtf.db.Files;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table FILES.
*/
public class FilesDao extends AbstractDao<Files, Long> {

    public static final String TABLENAME = "FILES";

    /**
     * Properties of entity Files.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, long.class, "id", true, "_id");
        public final static Property FileType = new Property(1, String.class, "fileType", false, "FILE_TYPE");
        public final static Property FileUrl = new Property(2, String.class, "fileUrl", false, "FILE_URL");
        public final static Property FileLocalUrl = new Property(3, String.class, "fileLocalUrl", false, "FILE_LOCAL_URL");
        public final static Property FileLen = new Property(4, String.class, "fileLen", false, "FILE_LEN");
        public final static Property FileStatus = new Property(5, int.class, "fileStatus", false, "FILE_STATUS");
    };


    public FilesDao(DaoConfig config) {
        super(config);
    }
    
    public FilesDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'FILES' (" + //
                "'_id' INTEGER PRIMARY KEY NOT NULL UNIQUE ," + // 0: id
                "'FILE_TYPE' TEXT NOT NULL ," + // 1: fileType
                "'FILE_URL' TEXT NOT NULL ," + // 2: fileUrl
                "'FILE_LOCAL_URL' TEXT NOT NULL ," + // 3: fileLocalUrl
                "'FILE_LEN' TEXT NOT NULL ," + // 4: fileLen
                "'FILE_STATUS' INTEGER NOT NULL );"); // 5: fileStatus
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'FILES'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, Files entity) {
        stmt.clearBindings();
        stmt.bindLong(1, entity.getId());
        stmt.bindString(2, entity.getFileType());
        stmt.bindString(3, entity.getFileUrl());
        stmt.bindString(4, entity.getFileLocalUrl());
        stmt.bindString(5, entity.getFileLen());
        stmt.bindLong(6, entity.getFileStatus());
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public Files readEntity(Cursor cursor, int offset) {
        Files entity = new Files( //
            cursor.getLong(offset + 0), // id
            cursor.getString(offset + 1), // fileType
            cursor.getString(offset + 2), // fileUrl
            cursor.getString(offset + 3), // fileLocalUrl
            cursor.getString(offset + 4), // fileLen
            cursor.getInt(offset + 5) // fileStatus
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, Files entity, int offset) {
        entity.setId(cursor.getLong(offset + 0));
        entity.setFileType(cursor.getString(offset + 1));
        entity.setFileUrl(cursor.getString(offset + 2));
        entity.setFileLocalUrl(cursor.getString(offset + 3));
        entity.setFileLen(cursor.getString(offset + 4));
        entity.setFileStatus(cursor.getInt(offset + 5));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(Files entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(Files entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
}
