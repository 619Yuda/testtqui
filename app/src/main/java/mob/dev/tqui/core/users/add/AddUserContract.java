package mob.dev.tqui.core.users.add;

/**
 * Created by oussa on 25/11/2017.
 */

import android.content.Context;

import com.google.firebase.auth.FirebaseUser;



public interface AddUserContract {
    interface View {
        void onAddUserSuccess(String message);

        void onAddUserFailure(String message);
    }

    interface Presenter {
        void addUser(Context context, FirebaseUser firebaseUser);
    }

    interface Interactor {
        void addUserToDatabase(Context context, FirebaseUser firebaseUser);
    }

    interface OnUserDatabaseListener {
        void onSuccess(String message);

        void onFailure(String message);
    }
}
