/*
1.
���̺� �̸�(TABLE_NAME)�� 'EMP'�� ���̺� �����ϴ� �ε����� �̸�(INDEX_NAME)�� 
�ش� �ε����� ������ Į�� �̸�(COLUMN_NAME)�� ��ȸ�� �� �ִ� �������� �ۼ��Ͻÿ�.
���� ������ �����(USER)�� �ۼ��� �ε����� ������� ��ȸ�Ͻÿ�. (10��)
*/
SELECT INDEX_NAME, COLUMN_NAME
  FROM ALL_IND_COLUMNS
 WHERE TABLE_NAME = 'EMP';

/*
2.
���� ������ �����(USER)�� �ۼ��� ��� VIEW�� ����� ��ȸ�� �� �ִ� �������� �ۼ��Ͻÿ�.
��� Į��(*)�� ��ȸ�ϵ��� ó���Ͻÿ�. (10��)
*/
GRANT DBA TO SCOTT;
SELECT * FROM VIEW_EMP;


/*
3.
���� ���û����� �����ϴ� �ε���(INDEX)�� �����ϴ� DDL �� �ۼ��Ͻÿ�. (10��)
    1) ��� ���̺� : PRODUCT
    2) ��� Į�� : PRODUCT_NAME
    3) �ε��� �̸� : IDN_NAME
    4) ����/����� ���� : ����� �ε���(���� �ε��� �ƴ�)
*/
CREATE INDEX IDN_NAME ON PRODUCT(PRODUCT_NAME);


/*
4.
PRODUCT ���̺��� ��� Į���� �����Ͽ� NEW_PRODUCT�̶�� �̸��� �� ���̺��� �����ϴ� �������� �ۼ��Ͻÿ�.
������(��, ROW)�� ������� �ʰ� Į���� ����ǵ��� �ۼ��Ͻÿ�.
NOT NULL �̿��� ���������� ������ �ʿ�� ����. (10��)
*/
DROP TABLE NEW_PRODUCT;
CREATE TABLE NEW_PRODUCT
    AS (SELECT *
          FROM PRODUCT
         WHERE 1 = 2);


/*
5.
���� ���û����� ��� ���̺�� ��� Į�� ������ �̿��ؼ� ���ο� ��(VIEW)�� �����ϴ� �������� �ۼ��Ͻÿ�. (10��)
    1) ��� ���̺� : PRODUCT
    2) ��� Į�� : PRODUCT_NAME, PRODUCT_PRICE
    3) �� �̸� : V_PRODUCT
*/
GRANT DBA TO SCOTT;
CREATE VIEW V_PRODUCT
    AS (SELECT PRODUCT_NAME, PRODUCT_PRICE
          FROM PRODUCT);


/*
6.
���� ������ �����(USER)�� �ۼ��� ��� ���̺��� �̸��� ��ȸ�� �� �ִ� �������� �ۼ��Ͻÿ�.
���� ���̺� �̸��� ��ȸ�ǵ��� �ۼ��Ͻÿ�. (10��)
*/
SELECT TABLE_NAME
  FROM USER_TABLES;


/*
7.
���� ����� ����(USER)�� �ۼ��� ���� ���������� Ȯ���� �� �ִ� ���̺���
������ Ȯ���ϴ� �������� �ۼ��Ͻÿ�. (5��)
*/
SELECT * FROM USER_CONSTRAINTS;

/*
8.
���� �����ͺ��̽� ������ ������ �ִ� ���̺��� �ִٰ� �����ϰ� �������� �䱸�ϴ� �ùٸ� ������ 2���� ��� �ۼ��Ͻÿ�. (�� 10��, �� 20��)
<< �����ͺ��̽� ���� >>
    1) ������̺�
        EMPLOYEE (EMP_ID, EMP_NAME, SALARY, DEPT_ID)
    2) �μ����̺�
        DEPARTMENT (DEPT_ID, DEPT_NAME)
    3) EMPLOYEE ���̺��� �⺻Ű�� EMP_ID �̴�.
    4) DEPARTMENT ���̺��� �⺻Ű�� DEPT_ID �̴�.
    5) EMPLOYEE ���̺��� DEPT_ID �� DEPARTMENT ���̺��� DEPT_ID �� �����ϴ� �ܷ�Ű�̴�.
    <<< ����1 >>>
        ���� ���� ����(SALARY)�� �޴� ����� �μ� �̸�(DEPT_NAME)�� ��ȸ�ϴ� �������� �ۼ��Ͻÿ�.
    <<< ����2 >>>
        �μ� �̸�(DEPT_NAME)�� '�ѹ���'�� ������� �����ȣ(EMP_ID), �����(EMP_NAME), ����(SALARY)�� ��ȸ�ϴ� �������� �ۼ��Ͻÿ�.
*/



    
-- ����1
SELECT DEPT_NAME
  FROM DEPARTMENT
 WHERE SALARY = (SELECT MAX(SALARY)
                      FROM EMPLOYEE);

SELECT A.DEPT_NAME
  FROM (SELECT MAX(SALARY)
          FROM EMPLOYEE) A;
-- �ФФФ�.. �𸣰ھ��

-- ����2
SELECT E.EMP_ID, E.EMP_NAME, E.SALARY
  FROM DEPARTMENT D INNER JOIN EMPLOYEE E
    ON D.DEPT_ID = E.DEPT_ID
 WHERE D.DEPT_NAME = '�ѹ���';  

/*
9.
���� Į�� ������ �����Ͽ� BOARD ���̺��� �����ϴ� �������� �ۼ��Ͻÿ�.
���� CREATE���� ����ϰ�, ALTER���� ������� ���ÿ�. (10��)
<< Į�� ���� >>
    1) BOARD_NO : �۹�ȣ, ����, �ʼ�, �⺻Ű(���������̸� : PK_BOARD)
    2) TITLE : ������, �������̹��ڿ� �ִ� 1000����Ʈ, �ʼ�
    3) CONTENT : �۳���, �������̹��ڿ� �ִ� 4000����Ʈ
    4) HIT : ��ȸ��, ����
    5) CREATE_DATE : �ۼ���, ��¥
*/
DROP TABLE BOARD;
CREATE TABLE BOARD(
    BOARD_NO    NUMBER              NOT NULL CONSTRAINT PK_BOARD PRIMARY KEY,
    TITLE       VARCHAR2(1000 BYTE) NOT NULL,
    CONTENT     VARCHAR2(4000 BYTE) NULL,
    HIT         NUMBER              NULL,
    CREATE_DATE DATE
);

/*
10.
� ���̺� ����, ����, ������ ��(ROW) ������ ������ DB�� �ݿ��ϱ� ���ؼ� ����ϴ� �������� �ۼ��Ͻÿ�. (5��)
*/
COMMIT;
