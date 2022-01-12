/*
 * This file is generated by jOOQ.
 */
package com.okeicalm.simpleJournalEntry.tables.records;


import com.okeicalm.simpleJournalEntry.tables.JournalEntries;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JournalEntriesRecord extends UpdatableRecordImpl<JournalEntriesRecord> implements Record5<Long, Long, Byte, Long, Integer> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>simple_journal_entry_db.journal_entries.id</code>.
     */
    public JournalEntriesRecord setId(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>simple_journal_entry_db.journal_entries.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for
     * <code>simple_journal_entry_db.journal_entries.journal_id</code>.
     */
    public JournalEntriesRecord setJournalId(Long value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for
     * <code>simple_journal_entry_db.journal_entries.journal_id</code>.
     */
    public Long getJournalId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>simple_journal_entry_db.journal_entries.side</code>.
     */
    public JournalEntriesRecord setSide(Byte value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>simple_journal_entry_db.journal_entries.side</code>.
     */
    public Byte getSide() {
        return (Byte) get(2);
    }

    /**
     * Setter for
     * <code>simple_journal_entry_db.journal_entries.account_id</code>.
     */
    public JournalEntriesRecord setAccountId(Long value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for
     * <code>simple_journal_entry_db.journal_entries.account_id</code>.
     */
    public Long getAccountId() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>simple_journal_entry_db.journal_entries.value</code>.
     */
    public JournalEntriesRecord setValue(Integer value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>simple_journal_entry_db.journal_entries.value</code>.
     */
    public Integer getValue() {
        return (Integer) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row5<Long, Long, Byte, Long, Integer> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    @Override
    public Row5<Long, Long, Byte, Long, Integer> valuesRow() {
        return (Row5) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return JournalEntries.JOURNAL_ENTRIES.ID;
    }

    @Override
    public Field<Long> field2() {
        return JournalEntries.JOURNAL_ENTRIES.JOURNAL_ID;
    }

    @Override
    public Field<Byte> field3() {
        return JournalEntries.JOURNAL_ENTRIES.SIDE;
    }

    @Override
    public Field<Long> field4() {
        return JournalEntries.JOURNAL_ENTRIES.ACCOUNT_ID;
    }

    @Override
    public Field<Integer> field5() {
        return JournalEntries.JOURNAL_ENTRIES.VALUE;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public Long component2() {
        return getJournalId();
    }

    @Override
    public Byte component3() {
        return getSide();
    }

    @Override
    public Long component4() {
        return getAccountId();
    }

    @Override
    public Integer component5() {
        return getValue();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public Long value2() {
        return getJournalId();
    }

    @Override
    public Byte value3() {
        return getSide();
    }

    @Override
    public Long value4() {
        return getAccountId();
    }

    @Override
    public Integer value5() {
        return getValue();
    }

    @Override
    public JournalEntriesRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public JournalEntriesRecord value2(Long value) {
        setJournalId(value);
        return this;
    }

    @Override
    public JournalEntriesRecord value3(Byte value) {
        setSide(value);
        return this;
    }

    @Override
    public JournalEntriesRecord value4(Long value) {
        setAccountId(value);
        return this;
    }

    @Override
    public JournalEntriesRecord value5(Integer value) {
        setValue(value);
        return this;
    }

    @Override
    public JournalEntriesRecord values(Long value1, Long value2, Byte value3, Long value4, Integer value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached JournalEntriesRecord
     */
    public JournalEntriesRecord() {
        super(JournalEntries.JOURNAL_ENTRIES);
    }

    /**
     * Create a detached, initialised JournalEntriesRecord
     */
    public JournalEntriesRecord(Long id, Long journalId, Byte side, Long accountId, Integer value) {
        super(JournalEntries.JOURNAL_ENTRIES);

        setId(id);
        setJournalId(journalId);
        setSide(side);
        setAccountId(accountId);
        setValue(value);
    }

    /**
     * Create a detached, initialised JournalEntriesRecord
     */
    public JournalEntriesRecord(com.okeicalm.simpleJournalEntry.tables.pojos.JournalEntries value) {
        super(JournalEntries.JOURNAL_ENTRIES);

        if (value != null) {
            setId(value.getId());
            setJournalId(value.getJournalId());
            setSide(value.getSide());
            setAccountId(value.getAccountId());
            setValue(value.getValue());
        }
    }
}
