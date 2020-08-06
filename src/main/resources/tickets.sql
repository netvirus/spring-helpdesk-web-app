create table tickets
(
    id          int auto_increment
        primary key,
    createdDate timestamp default current_timestamp()   not null on update current_timestamp(),
    closedDate  timestamp default '0000-00-00 00:00:00' not null,
    stateId     int       default 0                     not null,
    ownerId     int                                     not null,
    managerId   int                                     not null,
    messageId   int                                     not null
);
