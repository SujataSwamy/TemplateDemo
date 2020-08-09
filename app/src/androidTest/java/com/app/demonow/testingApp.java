package com.app.demonow;

import androidx.test.espresso.IdlingRegistry;
import androidx.test.espresso.ViewInteraction;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import zzcxv.demo.MainActivity;

import static androidx.test.espresso.Espresso.onData;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.scrollTo;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.assertThat;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.anything;

@RunWith(AndroidJUnit4.class)
public class testingApp {

    //test variables
    private String userName = "NICK";
    private String password = "12345";
    private String origin = "ANR";
    private String destination = "BRU";
    private String train_number = "123456";
    private String position = "4";
    private String stock_number = "123456";
    private String flight_key = "123456";
    private int no_of_passengers = 25;

    @Rule
    public ActivityTestRule<MainActivity> activityRule
            = new ActivityTestRule(MainActivity.class);


    @Before
    public void setUp() {
//        IdlingRegistry.getInstance().register(IdlingResourceDemo.getIdlingResource());
    }

    @Test
    public void testUserLoginFailure() {
        validateLogin(userName, password);
    }

    private void validateLogin(String userName, String password) throws AssertionError {
//        ViewInteraction loginUserName = onView(withId(R.id.button_first));
//        ViewInteraction loginPassword = onView(withId(R.id.login_password));
        onView(withId(R.id.button_first)).perform(click());
        onView(withText("Previous")).check(matches(isDisplayed()));
//
//        loginUserName.perform(typeText(userName));
//        loginPassword.perform(typeText(password));
//        onData(anything()).inAdapterView(withId(R.id.home_grid_major)).atPosition(0).perform(click());
//        try {
//            onView(withId(R.id.input_flight_origin_layout)).perform(click());
//
//            onView(withId(R.id.input_flight_origin)).perform(typeText(origin));
//            onView(withId(R.id.input_flight_destination_layout)).perform(click());
//            onView(withId(R.id.input_flight_destination)).perform(typeText(destination));
//            onView(withId(R.id.input_flight_number)).perform(click());
//            onView(withId(R.id.input_flight_number)).perform(typeText(train_number));
//            onView(withId(R.id.input_flight_aircraft_registration)).perform(click());
//            onView(withId(R.id.input_flight_aircraft_registration)).perform(typeText("PHE-CDE"));
//            onView(withId(R.id.input_flight_key)).perform(click());
//            onView(withId(R.id.input_flight_key)).perform(typeText(flight_key));
//            onView(withId(R.id.input_flight_number_of_passengers)).perform(click());
//            onView(withId(R.id.input_flight_number_of_passengers)).perform(typeText(Integer.valueOf(no_of_passengers).toString()));
//            onView(withId(R.id.confirm_manual_input_flight)).perform(click());
//            onView(withText("Continue")).perform(click());
//        } catch (Exception e) {
//            applypromotions();
//        }
    }

//    private void applypromotions() {
//        onData(anything()).atPosition(0).inAdapterView(allOf(withId(R.id.gridview), isDisplayed())).perform(click());
//
//        onView(withId(R.id.checkout_cash_button)).perform(scrollTo(), click());
//    }

    @After
    public void unregister() {
//        IdlingRegistry.getInstance().unregister(IdlingResourceDemo.getIdlingResource());
    }
}