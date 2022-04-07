package com.okeicalm.simpleJournalEntry.validation

import com.expediagroup.graphql.generator.exceptions.GraphQLKotlinException
import com.okeicalm.simpleJournalEntry.usecase.followerFollowee.FollowUseCaseInput
import org.springframework.stereotype.Service

@Service
object Validator {
    fun checkIsFollowingYourSelf(input: FollowUseCaseInput) {
        if (input.followeeId == input.followerId) throw GraphQLKotlinException("自分をフォローすることはできません。")
    }
}
