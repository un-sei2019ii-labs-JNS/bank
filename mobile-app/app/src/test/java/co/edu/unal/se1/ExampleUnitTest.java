package co.edu.unal.se1;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import static org.junit.Assert.*;
import android.content.Context;
import android.os.Build;

import androidx.test.core.app.ApplicationProvider;

import co.edu.unal.se1.businessLogic.controller.ManagerController;
import co.edu.unal.se1.businessLogic.controller.UserController;
import co.edu.unal.se1.dataAccess.model.Manager;
import co.edu.unal.se1.dataAccess.model.User;


import static com.google.common.truth.Truth.assertThat;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing%22%3ETesting documentation</a>
 */
@Config(sdk = Build.VERSION_CODES.O_MR1)
@RunWith(RobolectricTestRunner.class)
public class ExampleUnitTest {

    private static final String FAKE_STRING = "se1_db_bank";
    private Context context = ApplicationProvider.getApplicationContext();

    @Test
    public void readStringFromUserRepository() {
        User user = new User();
        user.setId(1);
        user.setName("Antonio");
        user.setBalance(20000);
        // Given a Context object retrieved from Robolectric...
        UserController userController = new UserController();
        userController.createUser(user, context);
        // ...when the string is returned from the object under test...
        String result = userController.getUserRepository().getDB_NAME();

        // ...then the result should be the expected one.
        assertThat(result).isEqualTo(FAKE_STRING);
    }

    @Test
    public void readStringFromUserRepository1() {
        Manager manager = new Manager();
        manager.setId(1);
        manager.setNickname("Julito23");
        manager.setPassword("notelavoyadecir");
        // Given a Context object retrieved from Robolectric...
        ManagerController managerController = new ManagerController();
        managerController.createManager(manager, context);
        // ...when the string is returned from the object under test...
        String result = managerController.getManagerRepository().getDB_NAME();

        // ...then the result should be the expected one.
        assertThat(result).isEqualTo(FAKE_STRING);
    }
}