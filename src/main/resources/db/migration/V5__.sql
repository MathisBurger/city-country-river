ALTER TABLE GAME
    DROP CONSTRAINT FK_GAME_ON_OWNING_SESSION;

ALTER TABLE GAME
    DROP COLUMN OWNING_SESSION_ID;