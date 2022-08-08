CREATE TABLE category_list
(
    id UUID NOT NULL,
    CONSTRAINT pk_categorylist PRIMARY KEY (id)
);

CREATE TABLE category_list_categories
(
    category_list_id UUID NOT NULL,
    words            VARCHAR(255)
);

CREATE TABLE game
(
    id               UUID NOT NULL,
    name             VARCHAR(255),
    category_list_id UUID,
    CONSTRAINT pk_game PRIMARY KEY (id)
);

ALTER TABLE session
    ADD current_game_id UUID;

ALTER TABLE game
    ADD CONSTRAINT FK_GAME_ON_CATEGORYLIST FOREIGN KEY (category_list_id) REFERENCES category_list (id);

ALTER TABLE session
    ADD CONSTRAINT FK_SESSION_ON_CURRENTGAME FOREIGN KEY (current_game_id) REFERENCES game (id);

ALTER TABLE category_list_categories
    ADD CONSTRAINT fk_categorylist_categories_on_category_list FOREIGN KEY (category_list_id) REFERENCES category_list (id);