CREATE TABLE IF NOT EXISTS SESSIONS (
    ID VARCHAR(60)  DEFAULT RANDOM_UUID() PRIMARY KEY,
    IP VARCHAR(32) DEFAULT NULL
);