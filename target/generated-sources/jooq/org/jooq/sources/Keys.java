/*
 * This file is generated by jOOQ.
 */
package org.jooq.sources;


import org.jooq.ForeignKey;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;
import org.jooq.sources.tables.Movie;
import org.jooq.sources.tables.Stream;
import org.jooq.sources.tables.Users;
import org.jooq.sources.tables.records.MovieRecord;
import org.jooq.sources.tables.records.StreamRecord;
import org.jooq.sources.tables.records.UsersRecord;


/**
 * A class modelling foreign key relationships and constraints of tables in
 * public.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<MovieRecord> MOVIE_PKEY = Internal.createUniqueKey(Movie.MOVIE, DSL.name("movie_pkey"), new TableField[] { Movie.MOVIE.MOVIE_ID }, true);
    public static final UniqueKey<StreamRecord> STREAM_PKEY = Internal.createUniqueKey(Stream.STREAM, DSL.name("stream_pkey"), new TableField[] { Stream.STREAM.STREAM_ID }, true);
    public static final UniqueKey<UsersRecord> USERS_PKEY = Internal.createUniqueKey(Users.USERS, DSL.name("users_pkey"), new TableField[] { Users.USERS.USER_ID }, true);
    public static final UniqueKey<UsersRecord> USERS_USERNAME_KEY = Internal.createUniqueKey(Users.USERS, DSL.name("users_username_key"), new TableField[] { Users.USERS.USERNAME }, true);

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<StreamRecord, UsersRecord> STREAM__STREAM_USER_ID_FKEY = Internal.createForeignKey(Stream.STREAM, DSL.name("stream_user_id_fkey"), new TableField[] { Stream.STREAM.USER_ID }, Keys.USERS_PKEY, new TableField[] { Users.USERS.USER_ID }, true);
}
