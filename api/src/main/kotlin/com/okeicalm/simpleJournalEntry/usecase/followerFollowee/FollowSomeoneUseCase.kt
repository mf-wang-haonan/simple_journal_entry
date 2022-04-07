package com.okeicalm.simpleJournalEntry.usecase.followerFollowee

import com.okeicalm.simpleJournalEntry.entity.FollowerFollowee
import com.okeicalm.simpleJournalEntry.repository.FollowerFolloweeRepository
import org.springframework.stereotype.Service

data class FollowSomeoneUseCaseInput(val followerId: Long, val followeeId: Long)
data class FollowSomeoneUseCaseOutput(val followerFollowee: FollowerFollowee)

interface FollowSomeoneUseCase {
    fun call(input: FollowSomeoneUseCaseInput): FollowSomeoneUseCaseOutput
}

@Service
class FollowSomeoneUseCaseImpl(private val followerFolloweeRepository: FollowerFolloweeRepository) :
    FollowSomeoneUseCase {
    override fun call(input: FollowSomeoneUseCaseInput): FollowSomeoneUseCaseOutput {
        TODO("Not yet implemented")
    }
}