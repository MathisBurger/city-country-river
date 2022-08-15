CREATE TABLE game_player
(
    game_id   BIGINT NOT NULL,
    player_id BIGINT NOT NULL
);

ALTER TABLE session
    ADD current_game_id BIGINT;

ALTER TABLE session
    ADD game_owner_id BIGINT;

ALTER TABLE game_player
    ADD CONSTRAINT uc_game_player_player UNIQUE (player_id);

ALTER TABLE session
    ADD CONSTRAINT FK_SESSION_ON_CURRENTGAME FOREIGN KEY (current_game_id) REFERENCES game (id);

ALTER TABLE session
    ADD CONSTRAINT FK_SESSION_ON_GAMEOWNER FOREIGN KEY (game_owner_id) REFERENCES game_owner (id);

ALTER TABLE game_player
    ADD CONSTRAINT fk_gampla_on_game FOREIGN KEY (game_id) REFERENCES game (id);

ALTER TABLE game_player
    ADD CONSTRAINT fk_gampla_on_session FOREIGN KEY (player_id) REFERENCES session (id);

ALTER TABLE SESSION
    DROP CONSTRAINT FK_SESSION_ON_GAME;

ALTER TABLE SESSION
    DROP CONSTRAINT FK_SESSION_ON_OWNER;

ALTER TABLE SESSION
    DROP COLUMN GAME_ID;

ALTER TABLE SESSION
    DROP COLUMN OWNER_ID;