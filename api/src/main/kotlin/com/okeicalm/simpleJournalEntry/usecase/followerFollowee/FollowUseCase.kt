package com.okeicalm.simpleJournalEntry.usecase.followerFollowee

import com.okeicalm.simpleJournalEntry.entity.FollowerFollowee
import com.okeicalm.simpleJournalEntry.repository.FollowerFolloweeRepository
import com.okeicalm.simpleJournalEntry.validation.Validator
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

data class FollowUseCaseInput(val followerId: Long, val followeeId: Long)
data class FollowUseCaseOutput(val followerFollowee: FollowerFollowee)

interface FollowUseCase {
    fun call(input: FollowUseCaseInput): FollowUseCaseOutput
}

@Service
class FollowUseCaseImpl(private val followerFolloweeRepository: FollowerFolloweeRepository) :
    FollowUseCase {

    @Transactional
    override fun call(input: FollowUseCaseInput): FollowUseCaseOutput {

        Validator.checkIsFollowingYourSelf(input)

        val newFollowRelation = followerFolloweeRepository.createFollowerFolloweeRelation(
            followerId = input.followerId, followeeId = input.followeeId
        )
        return FollowUseCaseOutput(newFollowRelation)
    }
}
