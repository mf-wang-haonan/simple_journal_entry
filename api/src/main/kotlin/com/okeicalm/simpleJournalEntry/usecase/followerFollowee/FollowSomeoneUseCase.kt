package com.okeicalm.simpleJournalEntry.usecase.followerFollowee

import com.okeicalm.simpleJournalEntry.entity.FollowerFollowee
import com.okeicalm.simpleJournalEntry.repository.FollowerFolloweeRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

data class FollowSomeoneUseCaseInput(val followerId: Long, val followeeId: Long)
data class FollowSomeoneUseCaseOutput(val followerFollowee: FollowerFollowee)

interface FollowSomeoneUseCase {
    fun call(input: FollowSomeoneUseCaseInput): FollowSomeoneUseCaseOutput
}

@Service
class FollowSomeoneUseCaseImpl(private val followerFolloweeRepository: FollowerFolloweeRepository) :
    FollowSomeoneUseCase {

    @Transactional
    override fun call(input: FollowSomeoneUseCaseInput): FollowSomeoneUseCaseOutput {
        val newFollowRelation = followerFolloweeRepository.createFollowerFolloweeRelation(
            followerId = input.followerId, followeeId = input.followeeId
        )
        return FollowSomeoneUseCaseOutput(newFollowRelation)
    }
}
