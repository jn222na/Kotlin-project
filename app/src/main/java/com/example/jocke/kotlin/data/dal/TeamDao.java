package com.example.jocke.kotlin.data.dal;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "TEAM".
*/
public class TeamDao extends AbstractDao<Team, Void> {

    public static final String TABLENAME = "TEAM";

    /**
     * Properties of entity Team.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", false, "ID");
        public final static Property FirstName = new Property(1, String.class, "firstName", false, "FIRST_NAME");
        public final static Property LastName = new Property(2, String.class, "lastName", false, "LAST_NAME");
        public final static Property ThirdName = new Property(3, String.class, "thirdName", false, "THIRD_NAME");
    }


    public TeamDao(DaoConfig config) {
        super(config);
    }
    
    public TeamDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"TEAM\" (" + //
                "\"ID\" INTEGER," + // 0: id
                "\"FIRST_NAME\" TEXT NOT NULL ," + // 1: firstName
                "\"LAST_NAME\" TEXT NOT NULL ," + // 2: lastName
                "\"THIRD_NAME\" TEXT);"); // 3: thirdName
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"TEAM\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, Team entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindString(2, entity.getFirstName());
        stmt.bindString(3, entity.getLastName());
 
        String thirdName = entity.getThirdName();
        if (thirdName != null) {
            stmt.bindString(4, thirdName);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, Team entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindString(2, entity.getFirstName());
        stmt.bindString(3, entity.getLastName());
 
        String thirdName = entity.getThirdName();
        if (thirdName != null) {
            stmt.bindString(4, thirdName);
        }
    }

    @Override
    public Void readKey(Cursor cursor, int offset) {
        return null;
    }    

    @Override
    public Team readEntity(Cursor cursor, int offset) {
        Team entity = new Team( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.getString(offset + 1), // firstName
            cursor.getString(offset + 2), // lastName
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3) // thirdName
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, Team entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setFirstName(cursor.getString(offset + 1));
        entity.setLastName(cursor.getString(offset + 2));
        entity.setThirdName(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
     }
    
    @Override
    protected final Void updateKeyAfterInsert(Team entity, long rowId) {
        // Unsupported or missing PK type
        return null;
    }
    
    @Override
    public Void getKey(Team entity) {
        return null;
    }

    @Override
    public boolean hasKey(Team entity) {
        // TODO
        return false;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
