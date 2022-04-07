package com.okeicalm.simpleJournalEntry.usecase.followerFollowee

import com.okeicalm.simpleJournalEntry.entity.Account
import com.okeicalm.simpleJournalEntry.repository.FollowerFolloweeRepository
import org.springframework.stereotype.Service

data class FindFollowersUseCaseInput(val followerId: Long, val followeeId: Long)
data class FindFollowersUseCaseOutput(val followers: List<Account>)

interface FindFollowersUseCase {
    fun call(input: FindFollowersUseCaseInput): FindFollowersUseCaseOutput
}

@Service
class FindFollowersUseCaseImpl(private val followerFolloweeRepository: FollowerFolloweeRepository) :
    FindFollowersUseCase {
    override fun call(input: FindFollowersUseCaseInput): FindFollowersUseCaseOutput {
        TODO("Not yet implemented")
    }
}
