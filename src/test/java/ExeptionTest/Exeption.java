package ExeptionTest;

import org.assertj.core.error.MultipleAssertionsError;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Exeption {
    @Test
    void exception() {
        try {
            System.out.println((char[]) null);
            Assertions.assertTrue(false);
        } catch (NullPointerException e) {
            System.out.println("Ошибка обработана из 11 сроки");
        }catch (AssertionError e) {
            System.out.println("Ошибка обработана из 12 строки");
        }
    }
}
