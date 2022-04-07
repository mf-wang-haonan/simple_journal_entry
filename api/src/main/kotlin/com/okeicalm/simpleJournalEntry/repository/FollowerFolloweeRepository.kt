package com.okeicalm.simpleJournalEntry.repository

import com.okeicalm.simpleJournalEntry.entity.Account
import com.okeicalm.simpleJournalEntry.entity.FollowerFollowee
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
    ): FollowerFollowee
}

@Repository
class FollowerFolloweeRepositoryImpl(private val dslContext: DSLContext) :
    FollowerFolloweeRepository {
    override fun findFolloweesOfUserById(id: Long): List<Account> {
        TODO("Not yet implemented")
    }

    override fun findFollowersOfUserById(id: Long): List<Account> {
//        val a =
//            dslContext.select(ACCOUNTS.ID,ACCOUNTS.CODE,ACCOUNTS.ELEMENT_TYPE, ACCOUNTS.NAME)
//                .from(FOLLOWER_FOLLOWEE).join(ACCOUNTS).on(ACCOUNTS.ID.eq(id))
        TODO("Not yet implemented")
    }

    override fun findAll(): List<FollowerFollowee> {
        TODO("Not yet implemented")
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
            followeeId = record.followerId!!,
            followerId = record.followerId!!,
            id = record.id!!
        )
    }

    override fun deleteFollowerFolloweeRelation(
        followerId: Long,
        followeeId: Long
    ): FollowerFollowee {
        TODO("Not yet implemented")
    }
}
