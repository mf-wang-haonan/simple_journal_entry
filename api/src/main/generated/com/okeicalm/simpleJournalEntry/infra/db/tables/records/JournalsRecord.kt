/*
 * This file is generated by jOOQ.
 */
package com.okeicalm.simpleJournalEntry.infra.db.tables.records


import com.okeicalm.simpleJournalEntry.infra.db.tables.Journals

import java.time.LocalDate

import org.jooq.Field
import org.jooq.Record1
import org.jooq.Record2
import org.jooq.Row2
import org.jooq.impl.UpdatableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class JournalsRecord() : UpdatableRecordImpl<JournalsRecord>(Journals.JOURNALS), Record2<Long?, LocalDate?> {

    var id: Long?
        set(value): Unit = set(0, value)
        get(): Long? = get(0) as Long?

    var incurredOn: LocalDate?
        set(value): Unit = set(1, value)
        get(): LocalDate? = get(1) as LocalDate?

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    override fun key(): Record1<Long?> = super.key() as Record1<Long?>

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    override fun fieldsRow(): Row2<Long?, LocalDate?> = super.fieldsRow() as Row2<Long?, LocalDate?>
    override fun valuesRow(): Row2<Long?, LocalDate?> = super.valuesRow() as Row2<Long?, LocalDate?>
    override fun field1(): Field<Long?> = Journals.JOURNALS.ID
    override fun field2(): Field<LocalDate?> = Journals.JOURNALS.INCURRED_ON
    override fun component1(): Long? = id
    override fun component2(): LocalDate? = incurredOn
    override fun value1(): Long? = id
    override fun value2(): LocalDate? = incurredOn

    override fun value1(value: Long?): JournalsRecord {
        this.id = value
        return this
    }

    override fun value2(value: LocalDate?): JournalsRecord {
        this.incurredOn = value
        return this
    }

    override fun values(value1: Long?, value2: LocalDate?): JournalsRecord {
        this.value1(value1)
        this.value2(value2)
        return this
    }

    /**
     * Create a detached, initialised JournalsRecord
     */
    constructor(id: Long? = null, incurredOn: LocalDate? = null): this() {
        this.id = id
        this.incurredOn = incurredOn
    }
}
