use simple_journal_entry_db;

create table follower_followee
(
    id          bigint auto_increment not null,
    follower_id bigint                not null,
    followee_id bigint                not null,
    constraint follower_followee_pk
        primary key (id),
    constraint followee_accounts_id_fk
        foreign key (followee_id) references accounts (id)
            on update cascade on delete cascade,
    constraint follower_accounts_id_fk
        foreign key (follower_id) references accounts (id)
            on update cascade on delete cascade
);

create unique index follower_followee_id_uindex
    on follower_followee (id);


# create table follower_followee
# (
#     id          bigint not null primary key auto_increment,
#     follower_id bigint not null,
#     followee_id bigint not null
# )