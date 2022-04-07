package com.okeicalm.simpleJournalEntry.usecase.followerFollowee

import com.okeicalm.simpleJournalEntry.entity.Account
import com.okeicalm.simpleJournalEntry.repository.FollowerFolloweeRepository
import org.springframework.stereotype.Service

data class FindFolloweesUseCaseInput(val id: Long)
data class FindFolloweesUseCaseOutput(val followers: List<Account>)

interface FindFolloweesUseCase {
    fun call(input: FindFolloweesUseCaseInput): FindFolloweesUseCaseOutput
}

@Service
class FindFolloweesUseCaseImpl(private val followerFolloweeRepository: FollowerFolloweeRepository) :
    FindFolloweesUseCase {
    override fun call(input: FindFolloweesUseCaseInput): FindFolloweesUseCaseOutput {
        return FindFolloweesUseCaseOutput(followerFolloweeRepository.findFolloweesOfUserById(input.id))
    }
}
