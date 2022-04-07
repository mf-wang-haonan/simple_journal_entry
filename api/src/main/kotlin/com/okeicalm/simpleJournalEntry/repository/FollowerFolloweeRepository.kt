package com.okeicalm.simpleJournalEntry.repository

import com.okeicalm.simpleJournalEntry.entity.Account
import com.okeicalm.simpleJournalEntry.entity.FollowerFollowee
import org.jooq.DSLContext
import org.springframework.stereotype.Repository


interface FollowerFolloweeRepository {
    fun findFollowersOfUserById(id: Long): List<Account>
    fun findFolloweesOfUserById(id: Long): List<Account>
    fun findAllFollowRelations(): List<FollowerFollowee>
    fun followSomeone(followerId: Long, followeeId: Long): FollowerFollowee
    fun unfollowSomeone(followerId: Long, followeeId: Long): FollowerFollowee
}

@Repository
class FollowerFolloweeRepositoryImpl(private val dslContext: DSLContext) : FollowerFolloweeRepository {
    override fun findFolloweesOfUserById(id: Long): List<Account> {
        TODO("Not yet implemented")
    }

    override fun findFollowersOfUserById(id: Long): List<Account> {
        TODO("Not yet implemented")
    }

    override fun findAllFollowRelations(): List<FollowerFollowee> {
        TODO("Not yet implemented")
    }

    override fun followSomeone(followerId: Long, followeeId: Long): FollowerFollowee {
        TODO("Not yet implemented")
    }

    override fun unfollowSomeone(followerId: Long, followeeId: Long): FollowerFollowee {
        TODO("Not yet implemented")
    }
}