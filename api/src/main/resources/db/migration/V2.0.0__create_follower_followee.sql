use simple_journal_entry_db;

create table follower_followee
(
    id          bigint auto_increment primary key not null,
    follower_id bigint                            not null,
    followee_id bigint                            not null,
    constraint followee_accounts_id_fk
        foreign key (followee_id) references accounts (id)
            on update cascade on delete cascade,
    constraint follower_accounts_id_fk
        foreign key (follower_id) references accounts (id)
            on update cascade on delete cascade
);

alter table follower_followee
    add unique unique_index (followee_id, follower_id);