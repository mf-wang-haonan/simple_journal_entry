package com.okeicalm.simpleJournalEntry.entity

data class FollowerFollowee(
    val id: Long = 0,
    val followerId: Long,
    val followeeId: Long,
)
