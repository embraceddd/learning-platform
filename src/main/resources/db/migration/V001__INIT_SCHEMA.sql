CREATE SCHEMA learning_platform;

CREATE TABLE learning_platform.track(
    id SERIAL PRIMARY KEY,
    name TEXT NOT NULL,
    description TEXT
);