/*
 * This file is generated by jOOQ.
 */
package org.jooq.sources.tables;


import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row7;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;
import org.jooq.sources.Keys;
import org.jooq.sources.Public;
import org.jooq.sources.tables.records.MovieRecord;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Movie extends TableImpl<MovieRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.movie</code>
     */
    public static final Movie MOVIE = new Movie();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MovieRecord> getRecordType() {
        return MovieRecord.class;
    }

    /**
     * The column <code>public.movie.movie_id</code>.
     */
    public final TableField<MovieRecord, Integer> MOVIE_ID = createField(DSL.name("movie_id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>public.movie.title</code>.
     */
    public final TableField<MovieRecord, String> TITLE = createField(DSL.name("title"), SQLDataType.VARCHAR(100).nullable(false), this, "");

    /**
     * The column <code>public.movie.release_year</code>.
     */
    public final TableField<MovieRecord, Integer> RELEASE_YEAR = createField(DSL.name("release_year"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.movie.genre</code>.
     */
    public final TableField<MovieRecord, String[]> GENRE = createField(DSL.name("genre"), SQLDataType.VARCHAR(100).getArrayDataType(), this, "");

    /**
     * The column <code>public.movie.duration</code>.
     */
    public final TableField<MovieRecord, Integer> DURATION = createField(DSL.name("duration"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.movie.link</code>.
     */
    public final TableField<MovieRecord, String> LINK = createField(DSL.name("link"), SQLDataType.VARCHAR(100).nullable(false), this, "");

    /**
     * The column <code>public.movie.link_pic</code>.
     */
    public final TableField<MovieRecord, String> LINK_PIC = createField(DSL.name("link_pic"), SQLDataType.VARCHAR(200), this, "");

    private Movie(Name alias, Table<MovieRecord> aliased) {
        this(alias, aliased, null);
    }

    private Movie(Name alias, Table<MovieRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.movie</code> table reference
     */
    public Movie(String alias) {
        this(DSL.name(alias), MOVIE);
    }

    /**
     * Create an aliased <code>public.movie</code> table reference
     */
    public Movie(Name alias) {
        this(alias, MOVIE);
    }

    /**
     * Create a <code>public.movie</code> table reference
     */
    public Movie() {
        this(DSL.name("movie"), null);
    }

    public <O extends Record> Movie(Table<O> child, ForeignKey<O, MovieRecord> key) {
        super(child, key, MOVIE);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public Identity<MovieRecord, Integer> getIdentity() {
        return (Identity<MovieRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<MovieRecord> getPrimaryKey() {
        return Keys.MOVIE_PKEY;
    }

    @Override
    public Movie as(String alias) {
        return new Movie(DSL.name(alias), this);
    }

    @Override
    public Movie as(Name alias) {
        return new Movie(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Movie rename(String name) {
        return new Movie(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Movie rename(Name name) {
        return new Movie(name, null);
    }

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row7<Integer, String, Integer, String[], Integer, String, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }
}
