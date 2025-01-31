/*
 * This file is generated by jOOQ.
 */
package com.okeicalm.simpleJournalEntry.infra.db.keys

import com.okeicalm.simpleJournalEntry.infra.db.tables.Accounts
import com.okeicalm.simpleJournalEntry.infra.db.tables.FollowerFollowee
import com.okeicalm.simpleJournalEntry.infra.db.tables.JournalEntries
import com.okeicalm.simpleJournalEntry.infra.db.tables.Journals
import com.okeicalm.simpleJournalEntry.infra.db.tables.records.AccountsRecord
import com.okeicalm.simpleJournalEntry.infra.db.tables.records.FollowerFolloweeRecord
import com.okeicalm.simpleJournalEntry.infra.db.tables.records.JournalEntriesRecord
import com.okeicalm.simpleJournalEntry.infra.db.tables.records.JournalsRecord
import org.jooq.ForeignKey
import org.jooq.UniqueKey
import org.jooq.impl.DSL
import org.jooq.impl.Internal

// -------------------------------------------------------------------------
// UNIQUE and PRIMARY KEY definitions
// -------------------------------------------------------------------------

val KEY_ACCOUNTS_CODE: UniqueKey<AccountsRecord> = Internal.createUniqueKey(Accounts.ACCOUNTS, DSL.name("KEY_accounts_code"), arrayOf(Accounts.ACCOUNTS.CODE), true)
val KEY_ACCOUNTS_PRIMARY: UniqueKey<AccountsRecord> = Internal.createUniqueKey(Accounts.ACCOUNTS, DSL.name("KEY_accounts_PRIMARY"), arrayOf(Accounts.ACCOUNTS.ID), true)
val KEY_FOLLOWER_FOLLOWEE_PRIMARY: UniqueKey<FollowerFolloweeRecord> = Internal.createUniqueKey(FollowerFollowee.FOLLOWER_FOLLOWEE, DSL.name("KEY_follower_followee_PRIMARY"), arrayOf(FollowerFollowee.FOLLOWER_FOLLOWEE.ID), true)
val KEY_FOLLOWER_FOLLOWEE_UNIQUE_INDEX: UniqueKey<FollowerFolloweeRecord> = Internal.createUniqueKey(FollowerFollowee.FOLLOWER_FOLLOWEE, DSL.name("KEY_follower_followee_unique_index"), arrayOf(FollowerFollowee.FOLLOWER_FOLLOWEE.FOLLOWEE_ID, FollowerFollowee.FOLLOWER_FOLLOWEE.FOLLOWER_ID), true)
val KEY_JOURNAL_ENTRIES_PRIMARY: UniqueKey<JournalEntriesRecord> = Internal.createUniqueKey(JournalEntries.JOURNAL_ENTRIES, DSL.name("KEY_journal_entries_PRIMARY"), arrayOf(JournalEntries.JOURNAL_ENTRIES.ID), true)
val KEY_JOURNALS_PRIMARY: UniqueKey<JournalsRecord> = Internal.createUniqueKey(Journals.JOURNALS, DSL.name("KEY_journals_PRIMARY"), arrayOf(Journals.JOURNALS.ID), true)

// -------------------------------------------------------------------------
// FOREIGN KEY definitions
// -------------------------------------------------------------------------

val FOLLOWEE_ACCOUNTS_ID_FK: ForeignKey<FollowerFolloweeRecord, AccountsRecord> = Internal.createForeignKey(FollowerFollowee.FOLLOWER_FOLLOWEE, DSL.name("followee_accounts_id_fk"), arrayOf(FollowerFollowee.FOLLOWER_FOLLOWEE.FOLLOWEE_ID), com.okeicalm.simpleJournalEntry.infra.db.keys.KEY_ACCOUNTS_PRIMARY, arrayOf(Accounts.ACCOUNTS.ID), true)
val FOLLOWER_ACCOUNTS_ID_FK: ForeignKey<FollowerFolloweeRecord, AccountsRecord> = Internal.createForeignKey(FollowerFollowee.FOLLOWER_FOLLOWEE, DSL.name("follower_accounts_id_fk"), arrayOf(FollowerFollowee.FOLLOWER_FOLLOWEE.FOLLOWER_ID), com.okeicalm.simpleJournalEntry.infra.db.keys.KEY_ACCOUNTS_PRIMARY, arrayOf(Accounts.ACCOUNTS.ID), true)
val JOURNAL_ENTRIES_IBFK_1: ForeignKey<JournalEntriesRecord, JournalsRecord> = Internal.createForeignKey(JournalEntries.JOURNAL_ENTRIES, DSL.name("journal_entries_ibfk_1"), arrayOf(JournalEntries.JOURNAL_ENTRIES.JOURNAL_ID), com.okeicalm.simpleJournalEntry.infra.db.keys.KEY_JOURNALS_PRIMARY, arrayOf(Journals.JOURNALS.ID), true)
val JOURNAL_ENTRIES_IBFK_2: ForeignKey<JournalEntriesRecord, AccountsRecord> = Internal.createForeignKey(JournalEntries.JOURNAL_ENTRIES, DSL.name("journal_entries_ibfk_2"), arrayOf(JournalEntries.JOURNAL_ENTRIES.ACCOUNT_ID), com.okeicalm.simpleJournalEntry.infra.db.keys.KEY_ACCOUNTS_PRIMARY, arrayOf(Accounts.ACCOUNTS.ID), true)
