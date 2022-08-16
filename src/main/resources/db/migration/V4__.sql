ALTER TABLE game
    ADD owning_session_id BIGINT;

ALTER TABLE game
    ADD CONSTRAINT FK_GAME_ON_OWNING_SESSION FOREIGN KEY (owning_session_id) REFERENCES session (id);