package com.okeicalm.simpleJournalEntry.handler.mutation

import com.expediagroup.graphql.server.operations.Mutation
import com.okeicalm.simpleJournalEntry.handler.type.FollowerFolloweeType
import com.okeicalm.simpleJournalEntry.usecase.followerFollowee.FollowSomeoneUseCaseImpl
import com.okeicalm.simpleJournalEntry.usecase.followerFollowee.FollowSomeoneUseCaseInput
import org.springframework.stereotype.Component

data class FollowSomeoneMutationInput(val followerId: Int, val followeeId: Int)

@Component
class FollowSomeoneMutation(val usecase: FollowSomeoneUseCaseImpl) : Mutation {

    fun followSomeone(input: FollowSomeoneMutationInput): FollowerFolloweeType {
        val output = usecase.call(
            FollowSomeoneUseCaseInput(
                followerId = input.followerId.toLong(),
                followeeId = input.followeeId.toLong()
            )
        )
        return FollowerFolloweeType(output.followerFollowee)
    }
}
