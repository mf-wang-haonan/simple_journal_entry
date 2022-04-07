INSERT INTO simple_journal_entry_db.accounts (id, code, name, element_type)
VALUES (1, 'asd', 'Joe', 1);
INSERT INTO simple_journal_entry_db.accounts (id, code, name, element_type)
VALUES (2, 'bssfv', 'Marry', 2);
INSERT INTO simple_journal_entry_db.accounts (id, code, name, element_type)
VALUES (3, 'evswrv', 'Lenard', 1);
INSERT INTO simple_journal_entry_db.accounts (id, code, name, element_type)
VALUES (4, 'cecas', 'Tiger', 1);



INSERT INTO simple_journal_entry_db.journals (id, incurred_on)
VALUES (6, '2022-04-01');
INSERT INTO simple_journal_entry_db.journals (id, incurred_on)
VALUES (5, '2022-03-05');
INSERT INTO simple_journal_entry_db.journals (id, incurred_on)
VALUES (4, '2022-04-02');
INSERT INTO simple_journal_entry_db.journals (id, incurred_on)
VALUES (3, '2022-04-03');
INSERT INTO simple_journal_entry_db.journals (id, incurred_on)
VALUES (2, '2022-04-06');
INSERT INTO simple_journal_entry_db.journals (id, incurred_on)
VALUES (1, '2022-04-07');



INSERT INTO simple_journal_entry_db.journal_entries (id, journal_id, side, account_id, value)
VALUES (1, 1, 1, 1, 9127);
INSERT INTO simple_journal_entry_db.journal_entries (id, journal_id, side, account_id, value)
VALUES (2, 2, 1, 1, 412312);
INSERT INTO simple_journal_entry_db.journal_entries (id, journal_id, side, account_id, value)
VALUES (3, 3, 2, 2, 35212);
INSERT INTO simple_journal_entry_db.journal_entries (id, journal_id, side, account_id, value)
VALUES (4, 4, 3, 2, 19821);
INSERT INTO simple_journal_entry_db.journal_entries (id, journal_id, side, account_id, value)
VALUES (5, 5, 3, 2, 19821);
INSERT INTO simple_journal_entry_db.journal_entries (id, journal_id, side, account_id, value)
VALUES (6, 6, 3, 3, 19821);

