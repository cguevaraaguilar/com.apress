USE BOOKS;

DROP TABLE IF EXISTS BOOK;

CREATE TABLE BOOK (
	ID			INT 			NOT NULL AUTO_INCREMENT,
	CATEGORY_ID	INT 			NOT NULL,
	BOOK_TITLE	VARCHAR (60)	NOT NULL,
	PUBLISHER	VARCHAR (60)	NOT NULL,
	PRIMARY KEY (ID),
	CONSTRAINT CATEGORY_BOOK_CATEGORY_ID_FK FOREIGN KEY (CATEGORY_ID) REFERENCES CATEGORY (ID)
);