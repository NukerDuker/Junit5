import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculateUtilTest {

    // �����, ������������� ����� ������� ���������� ���� ������
    @BeforeAll
    public static void before() {
        System.out.println("Start testing CalculateUtil.java");
    }

    // �����-����, ����������� ������ ������ ������ ������
    @Test
    public void testAddAndMultiply() {
        // �������� ����� ������ ������, �������� ���������
        final int result = CalculateUtil.addAndMultiply(2, 3, 10);
        // ��������� ��������: ��� ����� ������ ��� ������� ����� = 50,
        // ���������� �������� � ���������
        Assertions.assertEquals(50, result);
    }

    // �����, ������������� ����� ��������� ���������� ���� ������
    @AfterAll
    public static void after() {
        System.out.println("Finish testing CalculateUtil.java");
    }
}