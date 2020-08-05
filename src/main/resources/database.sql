DROP TABLE IF EXISTS `tikets`;
CREATE TABLE `tikets` (
  `id` int() NOT NULL AUTO_INCREMENT,
  `createdDate` timestamp () NOT NULL,
  `closedDate` timestamp() NOT NULL,
  `stateId` tinyint(1) NOT NULL DEFAULT 0,
  `ownerId` int() NOT NULL,
  `managerId` int() NOT NULL,
  `messageId` int() NOT NULL,
  PRIMARY KEY (`id`),
) ENGINE=MyISAM DEFAULT CHARSET=utf8;