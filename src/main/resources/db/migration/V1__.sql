CREATE TABLE session
(
    id UUID NOT NULL,
    ip VARCHAR(255),
    CONSTRAINT pk_session PRIMARY KEY (id)
);