ALTER TABLE session
    ADD owning_game_id BIGINT;

ALTER TABLE session
    ADD CONSTRAINT FK_SESSION_ON_OWNING_GAME FOREIGN KEY (owning_game_id) REFERENCES game (id);