package com.okeicalm.simpleJournalEntry.usecase.followerFollowee

import com.okeicalm.simpleJournalEntry.entity.FollowerFollowee
import com.okeicalm.simpleJournalEntry.repository.FollowerFolloweeRepository
import org.springframework.stereotype.Service

data class UnFollowSomeoneUseCaseInput(val followerId: Long, val followeeId: Long)
data class UnFollowSomeoneUseCaseOutput(val followerFollowee: FollowerFollowee)

interface UnFollowSomeoneUseCase {
    fun call(input: UnFollowSomeoneUseCaseInput): UnFollowSomeoneUseCaseOutput
}

@Service
class UnFollowSomeoneUseCaseImpl(private val followerFolloweeRepository: FollowerFolloweeRepository) :
    UnFollowSomeoneUseCase {
    override fun call(input: UnFollowSomeoneUseCaseInput): UnFollowSomeoneUseCaseOutput {
        TODO("Not yet implemented")
    }
}