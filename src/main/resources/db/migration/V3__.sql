ALTER TABLE category_list
    ADD name VARCHAR(255);

ALTER TABLE session
    ADD session_secret VARCHAR(255);

ALTER TABLE session
    ALTER COLUMN session_secret SET NOT NULL;