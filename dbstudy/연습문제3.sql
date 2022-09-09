-- ���� �������� �̿��ؼ� ����� ���̺�, ��ǰ ���̺�, ���� ���̺��� �ۼ��Ͻÿ�.

-- ���̺� ����
DROP TABLE BUYS;
DROP TABLE PRODUCTS;
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

-- ��ǰ ���̺�
CREATE TABLE PRODUCTS (
    PROD_CODE NUMBER NOT NULL,
    PROD_NAME VARCHAR2(20 BYTE),
    PROD_CATEGORY VARCHAR2(20 BYTE),
    PROD_PRICE NUMBER
);
-- ��ǰ ���̺� �⺻Ű
ALTER TABLE PRODUCTS
    ADD CONSTRAINT PK_PRODUCTS PRIMARY KEY(PROD_CODE);

-- ���� ���̺�
CREATE TABLE BUYS (
    BUY_NO NUMBER NOT NULL,
    USER_ID VARCHAR2(20 BYTE),
    PROD_CODE NUMBER,
    BUY_AMOUNT NUMBER
);

-- ���� ���̺� �⺻Ű
ALTER TABLE BUYS
    ADD CONSTRAINT PK_BUYS PRIMARY KEY(BUY_NO);
-- ����-����� �ܷ�Ű
ALTER TABLE BUYS
    ADD CONSTRAINT FK_BUYS_USERS FOREIGN KEY(USER_ID)
        REFERENCES USERS(USER_ID);
-- ����-��ǰ �ܷ�Ű
ALTER TABLE BUYS
    ADD CONSTRAINT FK_BUYS_PRODUCTS FOREIGN KEY(PROD_CODE)
        REFERENCES PRODUCTS(PROD_CODE);

-- ����� ������
DROP SEQUENCE USER_SEQ;
CREATE SEQUENCE USER_SEQ NOCACHE;

-- ��ǰ ������
DROP SEQUENCE PRODUCT_SEQ;
CREATE SEQUENCE PRODUCT_SEQ NOCACHE;

-- ���� ������
DROP SEQUENCE BUY_SEQ;
CREATE SEQUENCE BUY_SEQ NOCACHE;

-- ����� ���̺� ������
INSERT INTO USERS VALUES (USER_SEQ.NEXTVAL, 'YJS', '���缮', 1972, '����', '010', '11111111', '08/08/08');
INSERT INTO USERS VALUES (USER_SEQ.NEXTVAL, 'KHD', '��ȣ��', 1970, '���', '011', '22222222', '07/07/07');
INSERT INTO USERS VALUES (USER_SEQ.NEXTVAL, 'KKJ', '�豹��', 1965, '����', '010', '33333333', '09/09/09');
INSERT INTO USERS VALUES (USER_SEQ.NEXTVAL, 'KYM', '��븸', 1967, '����', '010', '44444444', '15/05/05');
INSERT INTO USERS VALUES (USER_SEQ.NEXTVAL, 'KJD', '������', 1974, '�泲', NULL, NULL, '13/03/03');
INSERT INTO USERS VALUES (USER_SEQ.NEXTVAL, 'NHS', '����', 1971, '�泲', '010', '55555555', '14/04/04');
INSERT INTO USERS VALUES (USER_SEQ.NEXTVAL, 'SDY', '�ŵ���', 1971, '���', NULL, NULL, '08/10/10');
INSERT INTO USERS VALUES (USER_SEQ.NEXTVAL, 'LHJ', '������', 1972, '���', '011', '66666666', '06/04/04');
INSERT INTO USERS VALUES (USER_SEQ.NEXTVAL, 'LKK', '�̰��', 1960, '�泲', '011', '77777777', '04/12/12');
INSERT INTO USERS VALUES (USER_SEQ.NEXTVAL, 'PSH', '�ڼ�ȫ', 1970, '����', '010', '88888888', '12/05/05');

-- ��ǰ ���̺� ������
INSERT INTO PRODUCTS(PROD_CODE, PROD_NAME, PROD_CATEGORY, PROD_PRICE) VALUES (PRODUCT_SEQ.NEXTVAL, '�ȭ', '�Ź�', 30);
INSERT INTO PRODUCTS(PROD_CODE, PROD_NAME, PROD_CATEGORY, PROD_PRICE) VALUES (PRODUCT_SEQ.NEXTVAL, 'û����', '�Ƿ�', 50);
INSERT INTO PRODUCTS(PROD_CODE, PROD_NAME, PROD_CATEGORY, PROD_PRICE) VALUES (PRODUCT_SEQ.NEXTVAL, 'å', '��ȭ', 15);
INSERT INTO PRODUCTS(PROD_CODE, PROD_NAME, PROD_CATEGORY, PROD_PRICE) VALUES (PRODUCT_SEQ.NEXTVAL, '��Ʈ��', '����', 1000);
INSERT INTO PRODUCTS(PROD_CODE, PROD_NAME, PROD_CATEGORY, PROD_PRICE) VALUES (PRODUCT_SEQ.NEXTVAL, '�����', '����', 200);
INSERT INTO PRODUCTS(PROD_CODE, PROD_NAME, PROD_CATEGORY, PROD_PRICE) VALUES (PRODUCT_SEQ.NEXTVAL, '�޸�', '����', 80);
INSERT INTO PRODUCTS(PROD_CODE, PROD_NAME, PROD_CATEGORY, PROD_PRICE) VALUES (PRODUCT_SEQ.NEXTVAL, '��Ʈ', '��ȭ', 30);

-- ���� ���̺� ������
INSERT INTO BUYS(BUY_NO, USER_ID, PROD_CODE, BUY_AMOUNT) VALUES(BUY_SEQ.NEXTVAL, 'KHD', 1, 2);
INSERT INTO BUYS(BUY_NO, USER_ID, PROD_CODE, BUY_AMOUNT) VALUES(BUY_SEQ.NEXTVAL, 'KHD', 4, 1);
INSERT INTO BUYS(BUY_NO, USER_ID, PROD_CODE, BUY_AMOUNT) VALUES(BUY_SEQ.NEXTVAL, 'KYM', 5, 1);
INSERT INTO BUYS(BUY_NO, USER_ID, PROD_CODE, BUY_AMOUNT) VALUES(BUY_SEQ.NEXTVAL, 'PSH', 5, 5);
INSERT INTO BUYS(BUY_NO, USER_ID, PROD_CODE, BUY_AMOUNT) VALUES(BUY_SEQ.NEXTVAL, 'KHD', 2, 3);
INSERT INTO BUYS(BUY_NO, USER_ID, PROD_CODE, BUY_AMOUNT) VALUES(BUY_SEQ.NEXTVAL, 'PSH', 6, 10);
INSERT INTO BUYS(BUY_NO, USER_ID, PROD_CODE, BUY_AMOUNT) VALUES(BUY_SEQ.NEXTVAL, 'KJD', 3, 5);
INSERT INTO BUYS(BUY_NO, USER_ID, PROD_CODE, BUY_AMOUNT) VALUES(BUY_SEQ.NEXTVAL, 'LHJ', 3, 2);
INSERT INTO BUYS(BUY_NO, USER_ID, PROD_CODE, BUY_AMOUNT) VALUES(BUY_SEQ.NEXTVAL, 'LHJ', 2, 1);
INSERT INTO BUYS(BUY_NO, USER_ID, PROD_CODE, BUY_AMOUNT) VALUES(BUY_SEQ.NEXTVAL, 'PSH', 1, 2);

COMMIT;


/****************************** �� �� ****************************************/


-- 1. ��ǰ ���̺��� ��ǰ���� 'å'�� ��ǰ�� ī�װ��� '����'���� �����Ͻÿ�.



-- 2. ����ó1�� '011'�� ������� ����ó1�� ��� '010'���� �����Ͻÿ�.



-- 3. ����� ���̺��� ����ڹ�ȣ�� 5�� ����ڸ� �����Ͻÿ�.
--    ����ڹ�ȣ�� 5�� ������� ���� ������ ���� ������ �� �����Ͻÿ�.



-- 4. ����ó1�� ���� ������� ����ڹ�ȣ, ���̵�, ����ó1, ����ó2�� ��ȸ�Ͻÿ�.



-- 5. ����ó2�� '5'�� �����ϴ� ������� ����ڹ�ȣ, ���̵�, ����ó1, ����ó2�� ��ȸ�Ͻÿ�.



-- 6. ��ǰ�� ������ ������� ���̵� ����Ƚ���� ��ȸ�Ͻÿ�.
-- ���̵�  ����Ƚ��
-- KHD     3
-- PSH     3
-- KYM     1
-- LHJ     2



-- 7. ��ǰ�� ������ �̷��� �ִ� ���� ���̵�, ����, ����Ƚ��, �ѱ��ž��� ��ȸ�Ͻÿ�.
-- ���̵�  ����  ����Ƚ��  �ѱ��ž�
-- LHJ     ������  2         80
-- KYM     ��븸  1         200
-- KHD     ��ȣ��  3         1210
-- PSH     �ڼ�ȫ  3         1860



-- 8. ���� �̷°� ��� ���� ���� ����Ƚ���� ��ȸ�Ͻÿ�.
--    ���� �̷��� ���� ��� ����Ƚ���� 0���� ��ȸ�Ͻÿ�.
--    ���̵�, ����, ����Ƚ���� ���̵��� ������������ ��ȸ�Ͻÿ�.
-- ���̵�  ����  ����Ƚ��
-- KHD     ��ȣ��  3
-- KKJ     �豹��  0
-- KYM     ��븸  1
-- LHJ     ������  2
-- LKK     �̰��  0
-- NHS     ����  0
-- PSH     �ڼ�ȫ  3
-- SDY     �ŵ���  0
-- YJS     ���缮  0



-- 9. ī�װ��� '����'�� ��ǰ�� ������ ���� ����, ��ǰ��, ���ž��� ��ȸ�Ͻÿ�.
-- ����  ��ǰ��  ���ž�
-- ��ȣ��  ��Ʈ��  1000
-- ��븸  �����  200
-- �ڼ�ȫ  �޸�  800
-- �ڼ�ȫ  �����  1000



-- 10. ����Ƚ���� 2ȸ �̻��� ����� ����Ƚ���� ��ȸ�Ͻÿ�.
-- ����  ����Ƚ��
-- �ڼ�ȫ  3
-- ������  2
-- ��ȣ��  3



-- 11. ��� ��ǰ�� ��ǰ��� �Ǹ�Ƚ���� ��ȸ�Ͻÿ�.
--     �Ǹ� �̷��� ���� ��ǰ�� 0���� ��ȸ�Ͻÿ�.
-- ��ǰ��  �Ǹ�Ƚ��
-- å      1
-- �޸�  1
-- �ȭ  2
-- ��Ʈ    0
-- �����  2
-- û����  2
-- ��Ʈ��  1



-- 12. � ���� � ��ǰ�� �����ߴ��� ��ȸ�Ͻÿ�.
--     ���� �̷��� ���� ���� ��ȸ�ǵ��� ó���ϰ� �����̵�� �������� �����Ͻÿ�.
-- ����   ������ǰ
-- ��ȣ��   �ȭ
-- ��ȣ��   ��Ʈ��
-- ��ȣ��   û����
-- �豹��   NULL
-- ��븸   �����
-- ������   å
-- ������   û����
-- �̰��   NULL
-- ����   NULL
-- �ڼ�ȫ   �ȭ
-- �ڼ�ȫ   �����
-- �ڼ�ȫ   �޸�
-- �ŵ���   NULL
-- ���缮   NULL