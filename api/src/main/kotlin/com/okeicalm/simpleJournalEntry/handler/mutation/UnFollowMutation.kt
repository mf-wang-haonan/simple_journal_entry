package com.okeicalm.simpleJournalEntry.handler.mutation

import com.expediagroup.graphql.server.operations.Mutation
import com.okeicalm.simpleJournalEntry.usecase.followerFollowee.UnFollowUseCaseImpl
import com.okeicalm.simpleJournalEntry.usecase.followerFollowee.UnFollowUseCaseInput
import org.springframework.stereotype.Component

data class UnFollowMutationInput(val followerId: Int, val followeeId: Int)

@Component
class UnFollowMutation(val unFollowUseCase: UnFollowUseCaseImpl) : Mutation {

    fun unFollow(input: UnFollowMutationInput): Int {
        val output = unFollowUseCase.call(
            UnFollowUseCaseInput(
                followerId = input.followerId.toLong(),
                followeeId = input.followeeId.toLong()
            )
        )
        return output.result
    }
}
