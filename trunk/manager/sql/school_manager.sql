
-- 学员基本信息
CREATE TABLE students (
  sId        VARCHAR(32)  NOT NULL,
  sName      VARCHAR(32)  NOT NULL,
  nSex       INT          NOT NULL,
  sIdCard    VARCHAR(32)  NOT NULL,
  nSchoolNo  INT          NOT NULL NOT NULL,
  sStudentNo VARCHAR(32)  NOT NULL,
  sClass     INT NOT NULL,
  sPhone     VARCHAR(32)  NOT NULL,
  sEmail     VARCHAR(32),
  sWeiXin    VARCHAR(64),
  sQQ        VARCHAR(32),
  sMark      VARCHAR(256) NOT NULL,
  dCreate    DATETIME     NOT NULL
);
