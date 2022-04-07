package com.okeicalm.simpleJournalEntry.repository

import com.okeicalm.simpleJournalEntry.entity.Account
import com.okeicalm.simpleJournalEntry.entity.FollowerFollowee
import com.okeicalm.simpleJournalEntry.infra.db.tables.references.ACCOUNTS
import com.okeicalm.simpleJournalEntry.infra.db.tables.references.FOLLOWER_FOLLOWEE
import org.jooq.DSLContext
import org.springframework.stereotype.Repository

interface FollowerFolloweeRepository {
    fun findFollowersOfUserById(id: Long): List<Account>
    fun findFolloweesOfUserById(id: Long): List<Account>
    fun findAll(): List<FollowerFollowee>
    fun createFollowerFolloweeRelation(
        followerId: Long,
        followeeId: Long
    ): FollowerFollowee

    fun deleteFollowerFolloweeRelation(
        followerId: Long,
        followeeId: Long
    ): Int
}

@Repository
class FollowerFolloweeRepositoryImpl(private val dslContext: DSLContext) :
    FollowerFolloweeRepository {
    override fun findFollowersOfUserById(id: Long): List<Account> {
        return dslContext.select(
            ACCOUNTS.ID,
            ACCOUNTS.NAME,
            ACCOUNTS.CODE,
            ACCOUNTS.ELEMENT_TYPE,
        )
            .from(ACCOUNTS).join(FOLLOWER_FOLLOWEE)
            .on(ACCOUNTS.ID.eq(FOLLOWER_FOLLOWEE.FOLLOWER_ID))
            .where(FOLLOWER_FOLLOWEE.FOLLOWEE_ID.eq(id)).fetch()
            .into(Account::class.java)
    }

    override fun findFolloweesOfUserById(id: Long): List<Account> {
        return dslContext.select(
            ACCOUNTS.ID,
            ACCOUNTS.NAME,
            ACCOUNTS.CODE,
            ACCOUNTS.ELEMENT_TYPE,
        )
            .from(ACCOUNTS).join(FOLLOWER_FOLLOWEE)
            .on(ACCOUNTS.ID.eq(FOLLOWER_FOLLOWEE.FOLLOWEE_ID))
            .where(FOLLOWER_FOLLOWEE.FOLLOWER_ID.eq(id)).fetch()
            .into(Account::class.java)
    }

    override fun findAll(): List<FollowerFollowee> {
        return dslContext.select()
            .from(FOLLOWER_FOLLOWEE).fetch()
            .into(FollowerFollowee::class.java)
    }

    override fun createFollowerFolloweeRelation(
        followerId: Long,
        followeeId: Long
    ): FollowerFollowee {
        val record = dslContext.newRecord(FOLLOWER_FOLLOWEE).apply {
            this.followeeId = followeeId
            this.followerId = followerId
        }
        record.store()
        return FollowerFollowee(
            followeeId = record.followeeId!!, followerId = record.followerId!!, id = record.id!!
        )
    }

    override fun deleteFollowerFolloweeRelation(
        followerId: Long,
        followeeId: Long
    ): Int {
        return dslContext
            .delete(FOLLOWER_FOLLOWEE)
            .where(
                FOLLOWER_FOLLOWEE.FOLLOWER_ID.eq(followerId)
                    .and(FOLLOWER_FOLLOWEE.FOLLOWEE_ID.eq(followeeId))
            )
            .execute()
    }
}
