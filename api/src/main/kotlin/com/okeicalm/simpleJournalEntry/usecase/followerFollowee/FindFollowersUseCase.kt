package com.okeicalm.simpleJournalEntry.usecase.followerFollowee

import com.okeicalm.simpleJournalEntry.entity.Account
import com.okeicalm.simpleJournalEntry.repository.FollowerFolloweeRepository
import org.springframework.stereotype.Service

data class FindFollowersUseCaseInput(val id: Long)
data class FindFollowersUseCaseOutput(val followers: List<Account>)

interface FindFollowersUseCase {
    fun call(input: FindFollowersUseCaseInput): FindFollowersUseCaseOutput
}

@Service
class FindFollowersUseCaseImpl(private val repository: FollowerFolloweeRepository) :
    FindFollowersUseCase {
    override fun call(input: FindFollowersUseCaseInput): FindFollowersUseCaseOutput {
        return FindFollowersUseCaseOutput(repository.findFollowersOfUserById(input.id))
    }
}
