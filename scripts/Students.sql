CREATE TABLE STUDENTS
(
  ID NUMBER NOT NULL
, NAME VARCHAR2(200) NOT NULL
, AGE NUMBER
, STANDARD NUMBER
, SCHOOL VARCHAR2(200) NOT NULL
, CONSTRAINT STUDENTS_PK PRIMARY KEY
  (
    ID
  , SCHOOL
  )
  ENABLE
);

INSERT INTO "STUDENTS" (ID, NAME, AGE, STANDARD, SCHOOL) VALUES ('1', 'Siva', '15', '10', 'Aditya')
INSERT INTO "STUDENTS" (ID, NAME, AGE, STANDARD, SCHOOL) VALUES ('2', 'Kumar', '14', '10', 'Narayana')
