create table tikets
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

INSERT INTO helpdesk.tikets (id, createdDate, closedDate, stateId, ownerId, managerId, messageId) VALUES (1, '2020-08-05 14:07:32', '2020-08-05 14:07:32', 0, 1, 1, 1);
INSERT INTO helpdesk.tikets (id, createdDate, closedDate, stateId, ownerId, managerId, messageId) VALUES (2, '2020-08-05 14:08:03', '2020-08-05 14:08:03', 0, 2, 1, 3);
INSERT INTO helpdesk.tikets (id, createdDate, closedDate, stateId, ownerId, managerId, messageId) VALUES (3, '2020-08-05 14:08:21', '2020-08-05 14:08:21', 1, 1, 1, 4);