package junit;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.Assert.*;

public class UserTest {
    private User user;
    private User user1;
    private User user2;

    @Before
    public void setUp() throws Exception {
        user = new User("Евгений", 35, Sex.MALE);
        user1 = new User("Марина", 34, Sex.FEMALE);
        user2 = new User("Алина", 7, Sex.FEMALE);
    }

    @Test
    public void testGetAllUsers() {
        //создаем список actual и заполняем его данными нашего метода
        List<User> actual = User.getAllUsers();

        //создаем список expected в него помещаем данные для сравнения
        //то что мы предпологиаем метод должен вернуть
        List<User> expected = new ArrayList<>();
        expected.add(user);
        expected.add(user1);
        expected.add(user2);

        // запускаем тест, в случае если список expected и actual не будут равны
        // test будет провален, о результатах теста читаем в консоли
        assertEquals(expected, actual);

    }
//    @Test
//    public void testGetAllUsersNoNull() {
//        List<User> expected = User.getAllUsers();
//        assertNotNull(expected);
//
//    }
//
//    @Test
//    public void testGetAllUsers_MALE(){
//        List<User> actual = User.getAllUsers(Sex.MALE);
//
//        List<User> expected = new ArrayList<>();
//        expected.add(user);
//
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void testGetHowManyUsers() throws Exception {
//
//    }
//
//    @Test
//    public void testGetHowManyUsers() throws Exception {
//
//    }
//
//    @Test
//    public void testGetAllAgeUsers() throws Exception {
//
//    }
//
//    @Test
//    public void testGetAllAgeUsers() throws Exception {
//
//    }
//
//    @Test
//    public void testGetAverageAgeOfAllUsers() throws Exception {
//
//    }
//
//    @Test
//    public void testGetAverageAgeOfAllUsers() throws Exception {
//
//    }
}
