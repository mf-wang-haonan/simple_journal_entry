package com.okeicalm.simpleJournalEntry.handler.query

import com.expediagroup.graphql.server.operations.Query
import com.okeicalm.simpleJournalEntry.handler.type.AccountType
import com.okeicalm.simpleJournalEntry.handler.type.FollowerFolloweeType
import com.okeicalm.simpleJournalEntry.repository.FollowerFolloweeRepository
import org.springframework.stereotype.Component

@Component
class FollowerFolloweeQuery(private val repository: FollowerFolloweeRepository) : Query {

    fun followersOfUser(id: Int): List<AccountType> {
        return repository.findFollowersOfUserById(id.toLong()).map { AccountType(it) }
    }

    fun followeesOfUser(id: Int): List<AccountType> {
        return repository.findFolloweesOfUserById(id.toLong()).map { AccountType(it) }
    }

    fun followerFollowees(): List<FollowerFolloweeType> {
        return repository.findAll().map { FollowerFolloweeType(it) }
    }
}
