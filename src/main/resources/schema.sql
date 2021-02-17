CREATE TABLE POST
(
    id      BIGINT AUTO_INCREMENT PRIMARY KEY,
    title   VARCHAR(400)  NOT NULL,
    content VARCHAR(2000) NULL,
    created timestamp
);

CREATE TABLE COMMENT
(
    id      BIGINT AUTO_INCREMENT PRIMARY KEY,
    post_id BIGINT NOT NULL,
    content VARCHAR(2000) NULL,
    created timestamp
);
//Tworzenie klucza obcego (wiąże post_id z tabeli COMMENT z id z tabeli POST)
ALTER TABLE COMMENT
    ADD CONSTRAINT comment_post_id
    FOREIGN KEY (post_id) REFERENCES post(id)