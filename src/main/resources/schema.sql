CREATE TABLE IF NOT EXISTS hotel (
    id BIGINT NOT NULL AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL,
    num_floors INT NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS elevator (
    id BIGINT NOT NULL AUTO_INCREMENT,
    current_floor INT NOT NULL,
    hotel_id BIGINT NOT NULL,
    name VARCHAR(255) NOT NULL,
    is_restricted BOOLEAN NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (hotel_id) REFERENCES hotel(id)
);

