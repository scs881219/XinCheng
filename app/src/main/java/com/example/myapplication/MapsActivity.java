package com.example.myapplication;

import androidx.core.app.ActivityCompat;
import androidx.core.app.NavUtils;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;

import android.Manifest;
import android.app.AlertDialog;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback, LocationListener{
    public static final int MY_PERMISSIONS_REQUEST_LOCATION = 99;

    private LocationManager locationManager;
    private Location location;
    private ImageButton btn1,btn2,a1,a2,a3,transport;
    String bestProv;
    private int judge_pos = 0;
    private String judge_kinds = "eat";
    public int number, b1,b2,b3,b4=0;
    public String str;
    public Marker marker0, marker1, marker2, marker3,marker4,marker5,marker6,marker7,marker8,marker9, marker10, marker11, marker12,marker13,marker14,marker15,marker16,marker17,marker18, marker19,pos;

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);

        checkLocationPermission();

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
        doBindService();
        Intent music = new Intent();
        music.setClass(this, MusicService.class);
        startService(music);
        b1=1;
        b2=1;
        b3=1;
        Intent it = getIntent();
        number = it.getIntExtra("pos",0);
        str = it.getStringExtra("kinds");

        btn1 = findViewById(R.id.imageButton12);
        btn2 = findViewById(R.id.imageButton16);
        a1 = findViewById(R.id.button);
        a2 = findViewById(R.id.button2);
        a3 = findViewById(R.id.button3);
        transport = findViewById(R.id.buttonx);
        b1=1;
        b2=1;
        b3=1;

        a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b1==1)
                    b1=0;
                else
                    b1=1;
                checkstyle();
            }
        });
        a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b2==1)
                    b2=0;
                else
                    b2=1;
               checkstyle();
            }
        });
        a3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b3==1)
                    b3=0;
                else
                    b3=1;
                checkstyle();
            }
        });

        transport.setOnClickListener(new View.OnClickListener(){
            @Override
                public void onClick(View view){
                Intent intent = new Intent();
                intent.setClass(MapsActivity.this,transport.class);
                startActivity(intent);
                }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mMap.clear();
                finish();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MapsActivity.this,introduction.class);
                it.putExtra("pos",judge_pos);
                it.putExtra("kinds",judge_kinds);
                startActivity(it);
            }
        });

    }

    private boolean mIsBound = false;
    private MusicService mServ;
    private ServiceConnection Scon = new ServiceConnection() {

        public void onServiceConnected(ComponentName name, IBinder
                binder) {
            mServ = ((MusicService.ServiceBinder) binder).getService();
        }

        public void onServiceDisconnected(ComponentName name) {
            mServ = null;
        }
    };

    void doBindService() {
        bindService(new Intent(this, MusicService.class),
                Scon, Context.BIND_AUTO_CREATE);
        mIsBound = true;
    }

    void doUnbindService() {
        if (mIsBound) {
            unbindService(Scon);
            mIsBound = false;
        }
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        LatLng ?????????????????? = new LatLng(24.132197, 121.642216);
        LatLng ??????????????? = new LatLng(24.126521, 121.651940);
        LatLng ??????????????? = new LatLng(24.132649, 121.642846);
        LatLng ?????????????????? = new LatLng(24.126110, 121.651894);
        LatLng ?????????????????? = new LatLng(24.127950, 121.6502388);
        LatLng ??????????????? = new LatLng(24.128300, 121.649621);
        LatLng ???????????? = new LatLng(24.165738, 121.657070);
        LatLng ???????????? = new LatLng(24.129136, 121.650591);
        marker0= mMap.addMarker(new MarkerOptions().position(??????????????????).title("??????????????????").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)).snippet(""));
        marker0.setTag(0);
        marker1= mMap.addMarker(new MarkerOptions().position(???????????????).title("???????????????").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)).snippet("?????????????????????????????????"));
        marker1.setTag(1);
        marker2=  mMap.addMarker(new MarkerOptions().position(???????????????).title("???????????????").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)).snippet(""));
        marker2.setTag(2);
        marker3=  mMap.addMarker(new MarkerOptions().position(??????????????????).title("??????????????????").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)).snippet(""));
        marker3.setTag(3);
        marker4=mMap.addMarker(new MarkerOptions().position(??????????????????).title("??????????????????").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)).snippet(""));
        marker4.setTag(4);
        marker5= mMap.addMarker(new MarkerOptions().position(???????????????).title("???????????????").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)).snippet(""));
        marker5.setTag(5);
        marker6= mMap.addMarker(new MarkerOptions().position(????????????).title("????????????").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)).snippet(""));
        marker6.setTag(6);
        marker7=mMap.addMarker(new MarkerOptions().position(????????????).title("????????????").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)).snippet(""));
        marker7.setTag(7);
        LatLng ???????????? = new LatLng(24.127742, 121.641426);
        LatLng ??????????????? = new LatLng(24.129125, 121.650408);
        LatLng ??????????????? = new LatLng(24.129133, 121.650674);
        LatLng ????????????????????? = new LatLng(24.127471, 121.651153);
        LatLng ??????????????? = new LatLng(24.126449, 121.651888);
        LatLng ?????????X???????????????????????? = new LatLng(24.127153, 121.650997);
        LatLng ????????????????????? = new LatLng(24.126032, 121.652292);
        LatLng ???????????? = new LatLng(24.110376, 121.634487);
        LatLng ?????????????????? = new LatLng(24.127153, 121.650997);
        LatLng ??????????????? = new LatLng(24.154678, 121.660851);
        marker8= mMap.addMarker(new MarkerOptions().position(????????????).title("????????????").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)).snippet("????????????????????????????????????"));
        marker8.setTag(10);
        marker9 = mMap.addMarker(new MarkerOptions().position(???????????????).title("???????????????").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)).snippet("???????????????????????????"));
        marker9.setTag(11);
        marker10= mMap.addMarker(new MarkerOptions().position(???????????????).title("???????????????").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)).snippet("??????????????????????????????"));
        marker10.setTag(12);
        marker11= mMap.addMarker(new MarkerOptions().position(?????????????????????).title("?????????????????????").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)).snippet(""));
        marker11.setTag(13);
        marker12= mMap.addMarker(new MarkerOptions().position(???????????????).title("???????????????").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)).snippet("????????????????????????????????????"));
        marker12.setTag(14);
        marker13= mMap.addMarker(new MarkerOptions().position(?????????X????????????????????????).title("?????????X????????????????????????").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)).snippet(""));
        marker13.setTag(15);
        marker14= mMap.addMarker(new MarkerOptions().position(?????????????????????).title("?????????????????????").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)).snippet("?????????????????????????????????"));
        marker14.setTag(16);
        marker15= mMap.addMarker(new MarkerOptions().position(????????????).title("????????????").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)).snippet("?????????????????????????????????"));
        marker15.setTag(17);
        marker16 =mMap.addMarker(new MarkerOptions().position(??????????????????).title("??????????????????").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)).snippet(""));
        marker16.setTag(18);
        marker17=mMap.addMarker(new MarkerOptions().position(???????????????).title("???????????????").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)).snippet(""));
        marker17.setTag(19);
        LatLng ???????????????????????? = new LatLng(24.123719, 121.648945);
        LatLng ??????????????????????????? = new LatLng(24.131605, 121.643663);
        marker18 =mMap.addMarker(new MarkerOptions().position(????????????????????????).title("????????????????????????").snippet(""));
        marker18.setTag(20);
        marker19=mMap.addMarker(new MarkerOptions().position(???????????????????????????).title("???????????????????????????").snippet(""));
        marker19.setTag(21);

        // Add a marker in Sydney and move the camera


        if(str.equals("live")) {
            switch (number) {
                case 0:
                    mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(????????????????????????, 15) );
                    marker18.showInfoWindow();
                    break;
                case 1:
                    mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(???????????????????????????, 15) );
                    marker19.showInfoWindow();
                    break;
                case 2:
                {
                    LatLngBounds.Builder builder = new LatLngBounds.Builder();

//the include method will calculate the min and max bound.
                    builder.include(??????????????????);
                    builder.include(????????????);
                    builder.include(?????????????????????);
                    builder.include(????????????????????????);

                    LatLngBounds bounds = builder.build();

                    int width = getResources().getDisplayMetrics().widthPixels;
                    int height = getResources().getDisplayMetrics().heightPixels;
                    int padding = (int) (width * 0.10); // offset from edges of the map 10% of screen

                    CameraUpdate cu = CameraUpdateFactory.newLatLngBounds(bounds, width, height, padding);


                    LatLng latLng = new LatLng(24.127742, 121.641426);
                    CameraUpdate center =
                            CameraUpdateFactory.newLatLng(latLng);
                    CameraUpdate zoom = CameraUpdateFactory.zoomTo(15.0f);
                    mMap.moveCamera(center);
                    mMap.animateCamera(cu);
                    break;
                }

            }
        }
        else if(str.equals("play")) {
            switch (number) {
                case 0:
                    mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(????????????, 15));
                    marker8.showInfoWindow();
                    break;
                case 1:
                    mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(???????????????, 15));
                    marker9.showInfoWindow();
                    break;
                case 2:
                    mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(???????????????, 15));
                    marker10.showInfoWindow();
                    break;
                case 3:
                    mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(?????????????????????, 15));
                    marker11.showInfoWindow();
                    break;
                case 4:
                    mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(???????????????, 15));
                    marker12.showInfoWindow();
                    break;
                case 5:
                    mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(?????????X????????????????????????, 15));
                    marker13.showInfoWindow();
                    break;
                case 6:
                    mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(?????????????????????, 15));
                    marker14.showInfoWindow();
                    break;
                case 7:
                    mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(????????????, 15));
                    marker15.showInfoWindow();
                    break;
                case 8:
                    mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(??????????????????, 15));
                    marker16.showInfoWindow();
                    break;
                case 9:
                    mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(???????????????, 15));
                    marker17.showInfoWindow();
                    break;

            }
        }
            else if(str.equals("eat")) {
            switch (number) {
                case 0:
                    mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(??????????????????, 15));
                    marker0.showInfoWindow();
                    break;
                case 1:
                    mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(???????????????, 15));
                    marker1.showInfoWindow();
                    break;
                case 2:
                    mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(???????????????, 15));
                    marker2.showInfoWindow();
                    break;
                case 3:
                    mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(??????????????????, 15));
                    marker3.showInfoWindow();
                    break;
                case 4:
                    mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(??????????????????, 15));
                    marker4.showInfoWindow();
                    break;
                case 5:
                    mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(???????????????, 15));
                    marker5.showInfoWindow();
                    break;
                case 6:
                    mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(????????????, 15));
                    marker6.showInfoWindow();
                    break;
                case 7:
                    mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(????????????, 15));
                    marker7.showInfoWindow();
                    break;

            }
        }


        mMap.setOnMarkerClickListener(new GoogleMap.OnMarkerClickListener() {
            @Override
            public boolean onMarkerClick(Marker marker) {
                if(marker.getTag().equals(100))
                {

                }
                else
                {
                    btn2.setVisibility(View.VISIBLE);
                    int l = Integer.parseInt(marker.getTag().toString());
                    if((l/10) == 0){
                        judge_kinds = "eat";
                        judge_pos = l%10;
                    }
                    else if((l/10) == 1){
                        judge_kinds = "play";
                        judge_pos = l%10;
                    }
                    else{
                        judge_kinds = "live";
                        judge_pos = l%10;
                    }
                }

                return false;
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (mServ != null) {
            mServ.resumeMusic();
        }
        locationManager = (LocationManager) getSystemService(LOCATION_SERVICE);
        Criteria criteria = new Criteria();
        bestProv = locationManager.getBestProvider(criteria, true);
        if (checkLocationPermission()) {
            locationManager.requestLocationUpdates(bestProv, 1000,1, MapsActivity.this);
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        locationManager.removeUpdates(this);
    }

    public void onLocationChanged(Location location) {
        if(b4==1)
            pos.remove();

        LatLng Point = new LatLng(location.getLatitude(), location.getLongitude());
        pos=mMap.addMarker(new MarkerOptions().title("????????????").position(Point).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        pos.setTag(100);
        b4=1;


        float[] results = new float[1];
        Location.distanceBetween(location.getLatitude(), location.getLongitude(), 24.129133, 121.650674, results);
        if (results[0] <= 30)
            mServ.startMusic1();
        Location.distanceBetween(location.getLatitude(), location.getLongitude(), 24.128300, 121.649621, results);
        if (results[0] <= 30)
            mServ.startMusic2();
        Location.distanceBetween(location.getLatitude(), location.getLongitude(), 24.127950, 121.6502388, results);
        if (results[0] <= 30)
            mServ.startMusic3();
        Location.distanceBetween(location.getLatitude(), location.getLongitude(), 24.127153, 121.650997, results);
        if (results[0] <= 30)
            mServ.startMusic4();
        Location.distanceBetween(location.getLatitude(), location.getLongitude(), 24.129125, 121.650408, results);
        if (results[0] <= 30)
            mServ.startMusic9();
    }

    public void onStatusChanged(String provider, int status, Bundle extras) {
        Criteria criteria = new Criteria();
        bestProv = locationManager.getBestProvider(criteria, true);
    }

    public void onProviderEnabled(String provider) {

    }

    public void onProviderDisabled(String provider) {

    }

    @Override
    public void onBackPressed() {
        NavUtils.navigateUpTo(this, new Intent(this, MainActivity.class));
        finish();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        doUnbindService();
        Intent music = new Intent();
        music.setClass(this, MusicService.class);
        stopService(music);

    }


    public boolean checkLocationPermission() {
        if (ContextCompat.checkSelfPermission(this,
                Manifest.permission.ACCESS_FINE_LOCATION)
                != PackageManager.PERMISSION_GRANTED) {

            // Should we show an explanation?
            if (ActivityCompat.shouldShowRequestPermissionRationale(this,
                    Manifest.permission.ACCESS_FINE_LOCATION)) {

                // Show an explanation to the user *asynchronously* -- don't block
                // this thread waiting for the user's response! After the user
                // sees the explanation, try again to request the permission.
                new AlertDialog.Builder(this)
                        .setTitle("Alert")
                        .setMessage("This app need location permission, Please allow permission")
                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                //Prompt the user once explanation has been shown
                                ActivityCompat.requestPermissions(MapsActivity.this,
                                        new String[]{Manifest.permission.ACCESS_FINE_LOCATION},
                                        MY_PERMISSIONS_REQUEST_LOCATION);
                            }
                        })
                        .create()
                        .show();


            } else {
                // No explanation needed, we can request the permission.
                ActivityCompat.requestPermissions(this,
                        new String[]{Manifest.permission.ACCESS_FINE_LOCATION},
                        MY_PERMISSIONS_REQUEST_LOCATION);
            }
            return false;
        } else {
            return true;
        }
    }

public void checkstyle()
{
    if(b1==1)
    {
        marker0.setVisible(true);
        marker1.setVisible(true);
        marker2.setVisible(true);
        marker3.setVisible(true);
        marker4.setVisible(true);
        marker5.setVisible(true);
        marker6.setVisible(true);
        marker7.setVisible(true);
        a1.setBackgroundResource(R.drawable.mk3_2);
    }
    else
    {
        marker0.setVisible(false);
        marker1.setVisible(false);
        marker2.setVisible(false);
        marker3.setVisible(false);
        marker4.setVisible(false);
        marker5.setVisible(false);
        marker6.setVisible(false);
        marker7.setVisible(false);
        a1.setBackgroundResource(R.drawable.mk3_1);
    }
    if(b2==1)
    {
        marker8.setVisible(true);
        marker9.setVisible(true);
        marker10.setVisible(true);
        marker11.setVisible(true);
        marker12.setVisible(true);
        marker13.setVisible(true);
        marker14.setVisible(true);
        marker15.setVisible(true);
        marker16.setVisible(true);
        marker17.setVisible(true);
        a2.setBackgroundResource(R.drawable.mk1_2);
    }
    else
    {
        marker8.setVisible(false);
        marker9.setVisible(false);
        marker10.setVisible(false);
        marker11.setVisible(false);
        marker12.setVisible(false);
        marker13.setVisible(false);
        marker14.setVisible(false);
        marker15.setVisible(false);
        marker16.setVisible(false);
        marker17.setVisible(false);
        a2.setBackgroundResource(R.drawable.mk1_1);
    }
    if(b3==1)
    {
        marker18.setVisible(true);
        marker19.setVisible(true);
        a3.setBackgroundResource(R.drawable.mk2_2);

    }
    else
    {
        marker18.setVisible(false);
        marker19.setVisible(false);
        a3.setBackgroundResource(R.drawable.mk2_1);

    }
}


}
