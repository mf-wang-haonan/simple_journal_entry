package com.okeicalm.simpleJournalEntry.handler.type

import com.expediagroup.graphql.generator.annotations.GraphQLName
import com.expediagroup.graphql.generator.scalars.ID
import com.okeicalm.simpleJournalEntry.entity.FollowerFollowee


const val FollowerFolloweeTypeGraphQLName = "FollowerFollowee"

@GraphQLName(FollowerFolloweeTypeGraphQLName)
data class FollowerFolloweeType(
    val id: ID, val followerID: ID, val followeeID: ID
) {
    constructor(followerFollowee: FollowerFollowee) : this(
        ID(followerFollowee.id.toString()),
        ID(followerFollowee.followeeId.toString()),
        ID(followerFollowee.followerId.toString()),
    )
}
