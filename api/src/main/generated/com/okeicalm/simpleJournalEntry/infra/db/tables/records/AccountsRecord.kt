/*
 * This file is generated by jOOQ.
 */
package com.okeicalm.simpleJournalEntry.infra.db.tables.records

import com.okeicalm.simpleJournalEntry.infra.db.tables.Accounts
import org.jooq.Field
import org.jooq.Record1
import org.jooq.Record4
import org.jooq.Row4
import org.jooq.impl.UpdatableRecordImpl

/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class AccountsRecord() : UpdatableRecordImpl<AccountsRecord>(Accounts.ACCOUNTS), Record4<Long?, String?, String?, Int?> {

    var id: Long?
        set(value): Unit = set(0, value)
        get(): Long? = get(0) as Long?

    var code: String?
        set(value): Unit = set(1, value)
        get(): String? = get(1) as String?

    var name: String?
        set(value): Unit = set(2, value)
        get(): String? = get(2) as String?

    var elementType: Int?
        set(value): Unit = set(3, value)
        get(): Int? = get(3) as Int?

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    override fun key(): Record1<Long?> = super.key() as Record1<Long?>

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    override fun fieldsRow(): Row4<Long?, String?, String?, Int?> = super.fieldsRow() as Row4<Long?, String?, String?, Int?>
    override fun valuesRow(): Row4<Long?, String?, String?, Int?> = super.valuesRow() as Row4<Long?, String?, String?, Int?>
    override fun field1(): Field<Long?> = Accounts.ACCOUNTS.ID
    override fun field2(): Field<String?> = Accounts.ACCOUNTS.CODE
    override fun field3(): Field<String?> = Accounts.ACCOUNTS.NAME
    override fun field4(): Field<Int?> = Accounts.ACCOUNTS.ELEMENT_TYPE
    override fun component1(): Long? = id
    override fun component2(): String? = code
    override fun component3(): String? = name
    override fun component4(): Int? = elementType
    override fun value1(): Long? = id
    override fun value2(): String? = code
    override fun value3(): String? = name
    override fun value4(): Int? = elementType

    override fun value1(value: Long?): AccountsRecord {
        this.id = value
        return this
    }

    override fun value2(value: String?): AccountsRecord {
        this.code = value
        return this
    }

    override fun value3(value: String?): AccountsRecord {
        this.name = value
        return this
    }

    override fun value4(value: Int?): AccountsRecord {
        this.elementType = value
        return this
    }

    override fun values(value1: Long?, value2: String?, value3: String?, value4: Int?): AccountsRecord {
        this.value1(value1)
        this.value2(value2)
        this.value3(value3)
        this.value4(value4)
        return this
    }

    /**
     * Create a detached, initialised AccountsRecord
     */
    constructor(id: Long? = null, code: String? = null, name: String? = null, elementType: Int? = null) : this() {
        this.id = id
        this.code = code
        this.name = name
        this.elementType = elementType
    }
}
