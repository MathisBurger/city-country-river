ALTER TABLE game_owner
    ADD owner_id BIGINT;

ALTER TABLE game_owner
    ADD CONSTRAINT FK_GAMEOWNER_ON_OWNER FOREIGN KEY (owner_id) REFERENCES session (id);

ALTER TABLE GAME_OWNER
    DROP CONSTRAINT FK_GAMEOWNER_ON_SESSION;

ALTER TABLE GAME_OWNER
    DROP COLUMN SESSION;