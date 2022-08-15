CREATE TABLE category_list
(
    id         BIGINT AUTO_INCREMENT NOT NULL,
    name       VARCHAR(255),
    categories BLOB,
    CONSTRAINT pk_categorylist PRIMARY KEY (id)
);

CREATE TABLE game
(
    id               BIGINT AUTO_INCREMENT NOT NULL,
    name             VARCHAR(255),
    owner_id         BIGINT,
    category_list_id BIGINT,
    CONSTRAINT pk_game PRIMARY KEY (id)
);

CREATE TABLE game_owner
(
    id       BIGINT AUTO_INCREMENT NOT NULL,
    game_id  BIGINT,
    owner_id BIGINT,
    CONSTRAINT pk_gameowner PRIMARY KEY (id)
);

CREATE TABLE session
(
    id             BIGINT AUTO_INCREMENT NOT NULL,
    ip             VARCHAR(255),
    game_id        BIGINT,
    owner_id       BIGINT,
    session_secret VARCHAR(255)          NOT NULL,
    CONSTRAINT pk_session PRIMARY KEY (id)
);

ALTER TABLE game_owner
    ADD CONSTRAINT FK_GAMEOWNER_ON_GAME FOREIGN KEY (game_id) REFERENCES game (id);

ALTER TABLE game_owner
    ADD CONSTRAINT FK_GAMEOWNER_ON_OWNER FOREIGN KEY (owner_id) REFERENCES session (id);

ALTER TABLE game
    ADD CONSTRAINT FK_GAME_ON_CATEGORYLIST FOREIGN KEY (category_list_id) REFERENCES category_list (id);

ALTER TABLE game
    ADD CONSTRAINT FK_GAME_ON_OWNER FOREIGN KEY (owner_id) REFERENCES game_owner (id);

ALTER TABLE session
    ADD CONSTRAINT FK_SESSION_ON_GAME FOREIGN KEY (game_id) REFERENCES game (id);

ALTER TABLE session
    ADD CONSTRAINT FK_SESSION_ON_OWNER FOREIGN KEY (owner_id) REFERENCES game_owner (id);