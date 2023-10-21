package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.widget.Toast;

import com.bdtopcoder.smart_slider.SliderAdapter;
import com.bdtopcoder.smart_slider.SliderItem;
import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        ViewPager2 viewPager2 = findViewById(R.id.smartSlider);

        List<SliderItem> sliderItems = new ArrayList<>();
        sliderItems.add(new SliderItem(R.drawable.image1,"image 1"));
        sliderItems.add(new SliderItem(R.drawable.image2,"Image 2"));
        sliderItems.add(new SliderItem(R.drawable.image3,"Image 3"));
        sliderItems.add(new SliderItem(R.drawable.image3,"Image 3"));


        viewPager2.setAdapter(new SliderAdapter(sliderItems,viewPager2,3000));

        new SliderAdapter((position, title, view) -> {

            if (title.contains("image1"))
                Toast.makeText(this, "Position: "+position+" Title: "+title, Toast.LENGTH_SHORT).show();
        });


        ImageSlider imageSlider;


        imageSlider =findViewById(R.id.image_slider);

        ArrayList<SlideModel> imageList = new ArrayList<>();


        imageList.add(new SlideModel(R.drawable.image1,null));
        imageList.add(new SlideModel(R.drawable.image2,null));
        imageList.add(new SlideModel(R.drawable.image3,null));
        imageSlider.setImageList(imageList);







// image  slide  ar implement off file
//
//
//[1] For Gradle.Properties
//                ------------
//
//        android.enableJetifier=true
//
//        ___________________________________________
//
//                [2] For Settings.Gradle(Module)
//                ------------
//        maven { url 'https://jitpack.io' }
//
//        ___________________________________________
//
//                [3] For Build.Gradle(Module)
//                ------------
//        implementation 'com.github.denzcoskun:ImageSlideshow:0.1.0'
//
//
//        ___________________________________________
//
//
//                [4] For XML
//        ------------
//
//                <com.denzcoskun.imageslider.ImageSlider
//        android:id="@+id/image_slider"
//        android:layout_width="match_parent"
//        android:layout_height="200dp"
//        app:iss_auto_cycle="true"
//        app:iss_period="1000"
//        app:iss_placeholder="@drawable/ic_launcher_foreground"
//        app:iss_error_image="@drawable/ic_launcher_background"
//        app:iss_delay="0"/>
//
//                ___________________________________________
//
//
//                        [5] For JAVA
//        ------------
//
//
//
//                ImageSlider imageSlider;
//
//
//        imageSlider =findViewById(R.id.image_slider);
//
//        ArrayList<SlideModel> imageList = new ArrayList<>();
//
//
//        imageList.add(new SlideModel(R.drawable.ic_launcher_background,null));
//        imageList.add(new SlideModel(R.drawable.ic_launcher_background,null));
//        imageList.add(new SlideModel(R.drawable.ic_launcher_background,null));
//
//        imageSlider.setImageList(imageList);
//
//
//




    }
}