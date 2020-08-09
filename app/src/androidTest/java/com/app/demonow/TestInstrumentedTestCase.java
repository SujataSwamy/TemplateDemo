package com.app.demonow;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import zzcxv.demo.MainActivity;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class TestInstrumentedTestCase {

    @Rule
    public ActivityTestRule<MainActivity> activityRule
            = new ActivityTestRule(MainActivity.class);

    @Test
    public void testUserLoginFailure() {
        validateApp();
    }

    private void validateApp() throws AssertionError {
        onView(withId(R.id.button_first)).perform(click());
        onView(withText("Previous")).check(matches(isDisplayed()));
    }
}