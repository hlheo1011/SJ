-- 1. ���� Į�� ������ �̿��Ͽ� MEMBER ���̺��� �����Ͻÿ�.
--    1) ȸ����ȣ: MEMBER_NO, NUMBER, �ʼ�
--    2) ȸ�����̵�: ID, VARCHAR2(30 BYTE), �ʼ�, �ߺ� �Ұ�
--    3) ȸ���н�����: PW, VARCHAR2(30 BYTE), �ʼ�
--    4) ȸ������Ʈ: POINT, NUMBER, �⺻�� 1000
--    5) ȸ�����: GRADE, VARCHAR2(10 BYTE), ������('VIP', 'GOLD', 'SILVER', 'BRONZE')
--    6) ȸ���̸���: EMAIL, VARCHAR2(100 BYTE), �ߺ� �Ұ�
DROP TABLE MEMBER;
CREATE TABLE MEMBER(
    MEMBER_NO NUMBER             NOT NULL,
    ID        VARCHAR2(30 BYTE)  NOT NULL,
    PW        VARCHAR2(30 BYTE)  NOT NULL,
    POINT     NUMBER(1)          NULL,
    GRADE     VARCHAR2(10 BYTE)  NULL,
    EMAIL     VARCHAR2(100 BYTE) NULL
);

ALTER TABLE MEMBER
    ADD CONSTRAINT UQ_MEMBER UNIQUE(ID);
ALTER TABLE MEMBER
    MODIFY GRADE VARCHAR2(10 BYTE) CHECK(GRADE IN('VIP', 'GOLD', 'SILVER', 'BRONZE'));


-- 2. MEMBER ���̺� ���� ���ο� Į���� �߰��Ͻÿ�.
--    1) ȸ���ּ�: ADDRESS VARCHAR2(200 BYTE)
--    2) ȸ��������: REGIST_DATE DATE
ALTER TABLE MEMBER
    ADD ADDRESS     VARCHAR2(200 BYTE) NULL;
ALTER TABLE MEMBER
    ADD REGIST_DATE DATE               NULL;


-- 3. �߰��� ȸ���ּ� Į���� �ٽ� �����Ͻÿ�.
ALTER TABLE MEMBER
    DROP COLUMN ADDRESS;
ALTER TABLE MEMBER
    DROP COLUMN REGIST_DATE;
    


-- 4. ȸ����� Į���� Ÿ���� VARCHAR2(20 BYTE)���� �����Ͻÿ�.
ALTER TABLE MEMBER
    MODIFY GRADE VARCHAR2(20 BYTE) CHECK(GRADE IN('VIP', 'GOLD', 'SILVER', 'BRONZE'));


-- 5. ȸ���н����� Į���� �̸��� PWD�� �����Ͻÿ�.
ALTER TABLE MEMBER
    RENAME COLUMN PW TO PWD;


-- 6. ȸ����ȣ Į���� �⺻Ű(PK_MEMBER)�� �����Ͻÿ�.
ALTER TABLE MEMBER
    ADD CONSTRAINT PK_MEMBER PRIMARY KEY(MEMBER_NO);



-- 7. ���� Į�� ������ �̿��Ͽ� BOARD ���̺��� �����Ͻÿ�.
--    1) �۹�ȣ: BOARD_NO, NUMBER, �ʼ�
--    2) ������: TITLE, VARCHAR2(1000 BYTE), �ʼ�
--    3) �۳���: CONTENT, VARCHAR2(4000 BYTE), �ʼ�
--    4) ��ȸ��: HIT, VARCHAR2(1 BYTE)
--    5) �ۼ���: WRITER, VARCHAR2(30 BYTE), �ʼ�
--    6) �ۼ�����: CREATE_DATE, DATE
DROP TABLE BOARD;
CREATE TABLE BOARD(
    BOARD_NO    NUMBER              NOT NULL,
    TITLE       VARCHAR2(1000 BYTE) NOT NULL,
    CONTENT     VARCHAR2(4000 BYTE) NOT NULL,
    HIT         VARCHAR2(1 BYTE)    NULL,
    WRITER      VARCHAR2(30 BYTE)   NOT NULL,
    CREATE_DATE DATE                NULL
);


-- 8. ��ȸ�� Į���� Ÿ���� NUMBER�� �����Ͻÿ�.
ALTER TABLE BOARD
    MODIFY HIT NUMBER;


-- 9. �۳��� Į���� �ʼ� ���������� �����Ͻÿ�.
ALTER TABLE BOARD MODIFY CONTENT NULL;
    


-- 10. �ۼ��� Į���� MEMBER ���̺��� ȸ�����̵� �����ϴ� FK_BOARD_MEMBER �ܷ�Ű�� �����Ͻÿ�.
-- �Խñ��� �ۼ��� ȸ�� ������ �����Ǹ� �ش� ȸ���� �ۼ��� �Խñ۵� ��� �Բ� ���������� ó���Ͻÿ�.


-- 11. MEMBER ���̺�� BOARD ���̺��� ��� �����Ͻÿ�.