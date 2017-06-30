/*
 * This file is generated by jOOQ.
*/
package sages.bootcamp.tracker.jooq.tables;


import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;

import sages.bootcamp.tracker.jooq.Keys;
import sages.bootcamp.tracker.jooq.Public;
import sages.bootcamp.tracker.jooq.tables.records.ProjectsRecord;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Projects extends TableImpl<ProjectsRecord> {

    private static final long serialVersionUID = -1366887292;

    /**
     * The reference instance of <code>public.projects</code>
     */
    public static final Projects PROJECTS = new Projects();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ProjectsRecord> getRecordType() {
        return ProjectsRecord.class;
    }

    /**
     * The column <code>public.projects.id</code>.
     */
    public final TableField<ProjectsRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('projects_id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>public.projects.name</code>.
     */
    public final TableField<ProjectsRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>public.projects.created</code>.
     */
    public final TableField<ProjectsRecord, Timestamp> CREATED = createField("created", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * Create a <code>public.projects</code> table reference
     */
    public Projects() {
        this("projects", null);
    }

    /**
     * Create an aliased <code>public.projects</code> table reference
     */
    public Projects(String alias) {
        this(alias, PROJECTS);
    }

    private Projects(String alias, Table<ProjectsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Projects(String alias, Table<ProjectsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<ProjectsRecord, Long> getIdentity() {
        return Keys.IDENTITY_PROJECTS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ProjectsRecord> getPrimaryKey() {
        return Keys.PROJECTS_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ProjectsRecord>> getKeys() {
        return Arrays.<UniqueKey<ProjectsRecord>>asList(Keys.PROJECTS_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Projects as(String alias) {
        return new Projects(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Projects rename(String name) {
        return new Projects(name, null);
    }
}
