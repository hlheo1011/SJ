-- ���� �������� �̿��ؼ� ����� ���̺�� ���� ���̺��� �ۼ��Ͻÿ�.

-- ���̺� ����
DROP TABLE BUYS;
DROP TABLE USERS;

-- ����� ���̺�
CREATE TABLE USERS (
    USER_NO NUMBER NOT NULL,                    -- ����ڹ�ȣ(�⺻Ű)
    USER_ID VARCHAR2(20 BYTE) NOT NULL UNIQUE,  -- ����ھ��̵�
    USER_NAME VARCHAR2(20 BYTE),                -- ����ڸ�
    USER_YEAR NUMBER(4),                        -- �¾�⵵
    USER_ADDR VARCHAR2(100 BYTE),               -- �ּ�
    USER_MOBILE1 VARCHAR2(3 BYTE),              -- ����ó1(010, 011 ��)
    USER_MOBILE2 VARCHAR2(8 BYTE),              -- ����ó2(12345678, 11111111 ��)
    USER_REGDATE DATE                           -- �����
);
-- ����� ���̺� �⺻Ű
ALTER TABLE USERS
    ADD CONSTRAINT PK_USERS PRIMARY KEY(USER_NO);


-- ���� ���̺�
CREATE TABLE BUYS (
    BUY_NO NUMBER NOT NULL,           -- ���Ź�ȣ
    USER_ID VARCHAR2(20 BYTE) ,       -- ������
    PROD_NAME VARCHAR2(20 BYTE),      -- ��ǰ��
    PROD_CATEGORY VARCHAR2(20 BYTE),  -- ��ǰī�װ�
    PROD_PRICE NUMBER,                -- ��ǰ����
    BUY_AMOUNT NUMBER                 -- ���ż���
);
-- ���� ���̺� �⺻Ű
ALTER TABLE BUYS
    ADD CONSTRAINT PK_BUYS PRIMARY KEY(BUY_NO);
-- ����-����� �ܷ�Ű
ALTER TABLE BUYS
    ADD CONSTRAINT FK_BUYS_USERS FOREIGN KEY(USER_ID)
        REFERENCES USERS(USER_ID);


-- ����.
-- BUYS ���̺��� ���� ���踦 Ȯ���ϰ� ����ȭ�� �����Ͻÿ�.