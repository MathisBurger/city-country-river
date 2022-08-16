CREATE TABLE session
(
    id             BIGINT AUTO_INCREMENT NOT NULL,
    ip             VARCHAR(255),
    session_secret VARCHAR(255)          NOT NULL,
    CONSTRAINT pk_session PRIMARY KEY (id)
);