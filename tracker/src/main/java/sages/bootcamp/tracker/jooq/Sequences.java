/*
 * This file is generated by jOOQ.
*/
package sages.bootcamp.tracker.jooq;


import javax.annotation.Generated;

import org.jooq.Sequence;
import org.jooq.impl.SequenceImpl;


/**
 * Convenience access to all sequences in public
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Sequences {

    /**
     * The sequence <code>public.projects_id_seq</code>
     */
    public static final Sequence<Long> PROJECTS_ID_SEQ = new SequenceImpl<Long>("projects_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

    /**
     * The sequence <code>public.tasks_id_seq</code>
     */
    public static final Sequence<Long> TASKS_ID_SEQ = new SequenceImpl<Long>("tasks_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

    /**
     * The sequence <code>public.users_id_seq</code>
     */
    public static final Sequence<Long> USERS_ID_SEQ = new SequenceImpl<Long>("users_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));
}
