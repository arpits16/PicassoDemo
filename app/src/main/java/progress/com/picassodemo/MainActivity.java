package progress.com.picassodemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    ImageView imageView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView=findViewById(R.id.imageview);
        imageView1=findViewById(R.id.imageview1);
    }


    @Override
    protected void onResume() {
        super.onResume();

        Picasso picassoReference=Picasso.get();
       // picassoReference.setIndicatorsEnabled(true);

        //Fetching image from URL
        picassoReference.load("http://i.imgur.com/DvpvklR.png").resize(100,200).into(imageView);
        //Fetching image from my resources
        picassoReference.load(R.mipmap.ic_launcher_round).into(imageView1);

    }
}
