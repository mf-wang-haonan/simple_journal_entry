package com.okeicalm.simpleJournalEntry.handler.mutation

import com.expediagroup.graphql.server.operations.Mutation
import com.okeicalm.simpleJournalEntry.handler.type.FollowerFolloweeType
import com.okeicalm.simpleJournalEntry.usecase.followerFollowee.FollowUseCaseImpl
import com.okeicalm.simpleJournalEntry.usecase.followerFollowee.FollowUseCaseInput
import org.springframework.stereotype.Component

data class FollowMutationInput(val followerId: Int, val followeeId: Int)

@Component
class FollowMutation(val followUseCase: FollowUseCaseImpl) : Mutation {

    fun follow(input: FollowMutationInput): FollowerFolloweeType {
        val output = followUseCase.call(
            FollowUseCaseInput(
                followerId = input.followerId.toLong(),
                followeeId = input.followeeId.toLong()
            )
        )
        return FollowerFolloweeType(output.followerFollowee)
    }
}
