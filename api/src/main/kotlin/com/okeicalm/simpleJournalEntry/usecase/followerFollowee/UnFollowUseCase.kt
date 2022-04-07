package com.okeicalm.simpleJournalEntry.usecase.followerFollowee

import com.okeicalm.simpleJournalEntry.repository.FollowerFolloweeRepository
import org.springframework.stereotype.Service

data class UnFollowUseCaseInput(val followerId: Long, val followeeId: Long)
data class UnFollowUseCaseOutput(val result: Int)

interface UnFollowUseCase {
    fun call(input: UnFollowUseCaseInput): UnFollowUseCaseOutput
}

@Service
class UnFollowUseCaseImpl(private val followerFolloweeRepository: FollowerFolloweeRepository) :
    UnFollowUseCase {
    override fun call(input: UnFollowUseCaseInput): UnFollowUseCaseOutput {

        val result = followerFolloweeRepository.deleteFollowerFolloweeRelation(
            followerId = input.followerId, followeeId = input.followeeId
        )
        return UnFollowUseCaseOutput(result)
    }
}
