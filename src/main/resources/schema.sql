-- DROP TABLE producer_entity;
-- DROP TABLE hardware_entity;
-- DROP TABLE user_entity;

CREATE TABLE IF NOT EXISTS producer_entity (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    address VARCHAR(255) NOT NULL
);

CREATE TABLE IF NOT EXISTS hardware_entity (
    id UUID PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    type VARCHAR(255) NOT NULL,
    price DOUBLE PRECISION NOT NULL,
    description VARCHAR(1000),
    producer_entity_id BIGINT,
    FOREIGN KEY (producer_entity_id) REFERENCES producer_entity(id)
);

CREATE TABLE IF NOT EXISTS user_entity (
    id UUID PRIMARY KEY,
    username VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL,
    role VARCHAR(255) DEFAULT 'ROLE_USER',
    UNIQUE(username)
);
