package com.example.tutorial;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import android.graphics.Color;
import android.os.Bundle;

import com.github.appintro.AppIntro;
import com.github.appintro.AppIntroCustomLayoutFragment;
import com.github.appintro.AppIntroFragment;
import com.github.appintro.AppIntroPageTransformerType;

public class MainActivity extends AppIntro {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setContentView(R.layout.activity_main);
        // Make sure you don't call setContentView!

        setImmersiveMode();
        //this.isColorTransitionsEnabled = true;

        // Call addSlide passing your Fragments.
        // You can use AppIntroFragment to use a pre-built fragment
        addSlide(AppIntroFragment.newInstance(
                "Welcome to BlueBox",
                "Slide 1",
                0,
                Color.parseColor("#B1D4E0"),
                0,
                0,
                0,
                0,
                R.drawable.back_slide1
        ));

        addSlide(AppIntroCustomLayoutFragment.newInstance(R.layout.layout_1));

        addSlide(AppIntroFragment.newInstance(
                "Connect your speakers",
                "Slide 2",
                0,
                Color.parseColor("#2E8BC0"),
                0,
                0,
                0,
                0,
                R.drawable.back_slide2
        ));

        addSlide(AppIntroFragment.newInstance(
                "Select your phone",
                "Slide 3",
                0,
                Color.parseColor("#145DA0"),
                0,
                0,
                0,
                0,
                R.drawable.back_slide3
        ));

        addSlide(AppIntroFragment.newInstance(
                "Enjoy !",
                "Slide 4",
                0,
                0,
                0,
                0,
                0,
                0,
                R.drawable.back_slide4
                //Color.parseColor("#0C2D48")
        ));

        setTransformer(AppIntroPageTransformerType.Fade.INSTANCE);
    }

    @Override
    protected void onSkipPressed(Fragment currentFragment) {
        super.onSkipPressed(currentFragment);
        // Decide what to do when the user clicks on "Skip"
        finish();
    }

    @Override
    protected void onDonePressed(Fragment currentFragment) {
        super.onDonePressed(currentFragment);
        // Decide what to do when the user clicks on "Skip"
        finish();
    }


}