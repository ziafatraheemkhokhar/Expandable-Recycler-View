package com.online.shopping;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;
import java.util.ArrayList;
public class HomeActivity extends AppCompatActivity {
    ArrayAdapter<CharSequence> arrayAdapter;
    Toolbar toolbar;
    ViewPager viewPager;
    TabLayout tabLayout;
    ViewPagerAdapter viewPagerAdapter;
    RecyclerView.LayoutManager layoutManager;
    private RecyclerView recyclerView;
    private ArrayList<Categories> categories;
    private RecyclerAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(viewPagerAdapter);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        categories = new ArrayList<>();
        setCatogries();
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        adapterForCategories = new RecyclerAdapter(this, categories);
        recyclerView.setAdapter(adapterForCategories);
    }
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        adapterForCategories.onSaveInstanceState(outState);
    }
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        adapterForCategories.onRestoreInstanceState(savedInstanceState);
    }
    private void setCatogries() {
        ArrayList<SubCategories> aircompressors = new ArrayList<>();
        aircompressors.add(new SubCategories("Air Compressors"));
        ArrayList<SubCategories> wrapsandadhessives = new ArrayList<>();
        wrapsandadhessives.add(new SubCategories("Bubble Free Wraps"));
        wrapsandadhessives.add(new SubCategories("3M Adhesives"));
        ArrayList<SubCategories> antitheftlocks = new ArrayList<>();
        antitheftlocks.add(new SubCategories("Car Steering Locks"));
        ArrayList<SubCategories> autogauges = new ArrayList<>();
        autogauges.add(new SubCategories("RPM/Tachometer"));
        ArrayList<SubCategories> bodykits = new ArrayList<>();
        bodykits.add(new SubCategories("ABS Bodykits"));
        bodykits.add(new SubCategories("Canards"));
        bodykits.add(new SubCategories("Spoilers"));
        bodykits.add(new SubCategories("3M Protector Lips"));
        ArrayList<SubCategories> brakelamps = new ArrayList<>();
        brakelamps.add(new SubCategories("Third Brake Light"));
        ArrayList<SubCategories> cameras = new ArrayList<>();
        cameras.add(new SubCategories("Cameras"));
        ArrayList<SubCategories> caralarm = new ArrayList<>();
        caralarm.add(new SubCategories("Non-Branded Alarm"));
        caralarm.add(new SubCategories("Ferreri® Car Alarm"));
        caralarm.add(new SubCategories("Steelmate®"));
        caralarm.add(new SubCategories("Central Locking Kit"));
        caralarm.add(new SubCategories("Maximus® Car Alarms"));
        ArrayList<SubCategories> carbettries = new ArrayList<>();
        carbettries.add(new SubCategories("Bosch Batteries"));
        ArrayList<SubCategories> carcare = new ArrayList<>();
        carcare.add(new SubCategories("Car Wax"));
        carcare.add(new SubCategories("Glass Cleaner"));
        carcare.add(new SubCategories("Polisher"));
        carcare.add(new SubCategories("Microfiber Cloth"));
        carcare.add(new SubCategories("Turtle®"));
        ArrayList<SubCategories> carspareparts = new ArrayList<>();
        carspareparts.add(new SubCategories("Toyota Genuine Spare Parts"));
        carspareparts.add(new SubCategories("Mix Car Spare Parts"));
        ArrayList<SubCategories> chrometrims = new ArrayList<>();
        chrometrims.add(new SubCategories("Chrome Accessories"));
        ArrayList<SubCategories> cosolebox = new ArrayList<>();
        cosolebox.add(new SubCategories("Front Console"));
        cosolebox.add(new SubCategories("Armrest"));
        ArrayList<SubCategories> emblemslogos = new ArrayList<>();
        emblemslogos.add(new SubCategories("Stickers"));
        emblemslogos.add(new SubCategories("Warning Stickers"));
        emblemslogos.add(new SubCategories("Vinyl Stickers"));
        emblemslogos.add(new SubCategories("Alloy/Metal Logos"));
        emblemslogos.add(new SubCategories("Cat Eyes"));
        emblemslogos.add(new SubCategories("Hood Logos"));
        emblemslogos.add(new SubCategories("Mugen / Trd"));
        emblemslogos.add(new SubCategories("Grille Logos"));
        emblemslogos.add(new SubCategories("Led Logos"));
        emblemslogos.add(new SubCategories("Plastic Logos"));
        ArrayList<SubCategories> emergencysos = new ArrayList<>();
        emergencysos.add(new SubCategories("Emergency SOS"));
        ArrayList<SubCategories> exhaustmufflers = new ArrayList<>();
        exhaustmufflers.add(new SubCategories("Exhaust System"));
        exhaustmufflers.add(new SubCategories("Muffler Tips"));
        ArrayList<SubCategories> exterioraccessories = new ArrayList<>();
        exterioraccessories.add(new SubCategories("Airpress/Sunvisors"));
        exterioraccessories.add(new SubCategories("Door Guards"));
        exterioraccessories.add(new SubCategories("Antenna"));
        exterioraccessories.add(new SubCategories("others"));
        exterioraccessories.add(new SubCategories("wiper Blades"));
        ArrayList<SubCategories> floormats = new ArrayList<>();
        floormats.add(new SubCategories("PVC Special Mats"));
        ArrayList<SubCategories> foglamps = new ArrayList<>();
        foglamps.add(new SubCategories("DLAA Fog Lamps"));
        foglamps.add(new SubCategories("DRL Fog Lamp Covers"));
        foglamps.add(new SubCategories("Universal Fog Lamps"));
        ArrayList<SubCategories> gearknobs = new ArrayList<>();
        gearknobs.add(new SubCategories("MOMO®/SPARCO®"));
        ArrayList<SubCategories> grilles = new ArrayList<>();
        grilles.add(new SubCategories("Universal Grilles"));
        ArrayList<SubCategories> hidkits = new ArrayList<>();
        hidkits.add(new SubCategories("MAXIMUS HID 35w"));
        hidkits.add(new SubCategories("MAXIMUS HID 55W"));
        hidkits.add(new SubCategories("MAXIMUS HID 75w-200w"));
        ArrayList<SubCategories> horns = new ArrayList<>();
        horns.add(new SubCategories("Maximus Premium Horns"));
        horns.add(new SubCategories("Bosch Horn – Made in Spain"));
        horns.add(new SubCategories("GUJIU – Made in China"));
        horns.add(new SubCategories("OSUN Horns"));
        horns.add(new SubCategories("Ungrouped"));
        ArrayList<SubCategories> interioraccessories = new ArrayList<>();
        interioraccessories.add(new SubCategories("Hangings"));
        interioraccessories.add(new SubCategories("Ashtrays"));
        interioraccessories.add(new SubCategories("Back Care"));
        interioraccessories.add(new SubCategories("Shades"));
        interioraccessories.add(new SubCategories("Tissue Box"));
        interioraccessories.add(new SubCategories("Mobile Accessories"));
        interioraccessories.add(new SubCategories("Interior Mats"));
        ArrayList<SubCategories> keychains = new ArrayList<>();
        keychains.add(new SubCategories("Avengers Keychains"));
        keychains.add(new SubCategories("Metal Keychains"));
        keychains.add(new SubCategories("Leather & Pvc"));
        keychains.add(new SubCategories("Other"));
        ArrayList<SubCategories> ledlighting = new ArrayList<>();
        ledlighting.add(new SubCategories("MAXIMUS Smd Lights"));
        ledlighting.add(new SubCategories("Flexible Drl/switchbacks"));
        ledlighting.add(new SubCategories("Drl Day Time Running Lights"));
        ledlighting.add(new SubCategories("Striplights"));
        ledlighting.add(new SubCategories("Others"));
        ledlighting.add(new SubCategories("Police Lights"));
        ledlighting.add(new SubCategories("Sill Plates"));
        ledlighting.add(new SubCategories("Angel Eyes"));
        ledlighting.add(new SubCategories("Back Lamps"));
        ArrayList<SubCategories> liscense = new ArrayList<>();
        liscense.add(new SubCategories("License Frames"));
        liscense.add(new SubCategories("License Plates"));
        liscense.add(new SubCategories("Tilters"));
        ArrayList<SubCategories> momosteering = new ArrayList<>();
        momosteering.add(new SubCategories("Deep Dish Momo®"));
        momosteering.add(new SubCategories("Momo® Steerings"));
        momosteering.add(new SubCategories("Steering Covers"));
        ArrayList<SubCategories> nonslipmates = new ArrayList<>();
        nonslipmates.add(new SubCategories("Large Size"));
        nonslipmates.add(new SubCategories("Medium Size"));
        ArrayList<SubCategories> oemkeycovers = new ArrayList<>();
        oemkeycovers.add(new SubCategories("Replacement Key Covers"));
        ArrayList<SubCategories> performance = new ArrayList<>();
        performance.add(new SubCategories("Ground Wiring"));
        performance.add(new SubCategories("Intake System"));
        performance.add(new SubCategories("other"));
        performance.add(new SubCategories("Suspension"));
        performance.add(new SubCategories("Volt Stabilisers"));
        performance.add(new SubCategories("Oil/ Radiator Caps"));
        performance.add(new SubCategories("Engine Starter"));
        performance.add(new SubCategories("Paddle Covers"));
        ArrayList<SubCategories> perfumes = new ArrayList<>();
        perfumes.add(new SubCategories("Car Perfumes"));
        perfumes.add(new SubCategories("Hanging Cards"));
        perfumes.add(new SubCategories("A/C Grille"));
        ArrayList<SubCategories> seatcover = new ArrayList<>();
        seatcover.add(new SubCategories("Chinese Genuine Stitched"));
        seatcover.add(new SubCategories("Japanese Genuine Stitched"));
        ArrayList<SubCategories> stereo = new ArrayList<>();
        stereo.add(new SubCategories("Stereo Accessories"));
        ArrayList<SubCategories> switchbuttons = new ArrayList<>();
        switchbuttons.add(new SubCategories("ON/OFF Button"));
        ArrayList<SubCategories> topcovers = new ArrayList<>();
        topcovers.add(new SubCategories("Korean Material"));
        ArrayList<SubCategories> towhooks = new ArrayList<>();
        towhooks.add(new SubCategories("Front Tow Hook"));
        towhooks.add(new SubCategories("Rare Tow Hook"));
        ArrayList<SubCategories> wheelaccessories = new ArrayList<>();
        wheelaccessories.add(new SubCategories("Tire Air Caps"));
        wheelaccessories.add(new SubCategories("Racing Lugnuts"));
        wheelaccessories.add(new SubCategories("Brake Calipers"));
        wheelaccessories.add(new SubCategories("Wheel Logos"));
        wheelaccessories.add(new SubCategories("WheelCups/WheelCovers"));
        ArrayList<SubCategories> ungrouped = new ArrayList<>();
        ungrouped.add(new SubCategories("Seat Belt Clips"));
        ungrouped.add(new SubCategories("Other"));
        categories.add(new Categories("Air Compressors", aircompressors));
        categories.add(new Categories("3M Wraps & Adhesives", wrapsandadhessives));
        categories.add(new Categories("Anti-Theft Locks", antitheftlocks));
        categories.add(new Categories("Auto Gauges", autogauges));
        categories.add(new Categories("Body Kits", bodykits));
        categories.add(new Categories("Brake Lamps", brakelamps));
        categories.add(new Categories("Cameras", cameras));
        categories.add(new Categories("Car Alarms", caralarm));
        categories.add(new Categories("Car Batteries", carbettries));
        categories.add(new Categories("Car Care", carcare));
        categories.add(new Categories("Car Spare Parts", carspareparts));
        categories.add(new Categories("Chrome Trims", chrometrims));
        categories.add(new Categories("Console Box", cosolebox));
        categories.add(new Categories("Emblems/Logos", emblemslogos));
        categories.add(new Categories("Emergency SOS", emergencysos));
        categories.add(new Categories("Exhaust/Mufflers", exhaustmufflers));
        categories.add(new Categories("Exterior Accessories", exterioraccessories));
        categories.add(new Categories("Floor Mats", floormats));
        categories.add(new Categories("Fog Lamps", foglamps));
        categories.add(new Categories("Gear Knobs", gearknobs));
        categories.add(new Categories("Grilles", grilles));
        categories.add(new Categories("HID Kits", hidkits));
        categories.add(new Categories("Horns", horns));
        categories.add(new Categories("Interior Accessories", interioraccessories));
        categories.add(new Categories("Keychains", keychains));
        categories.add(new Categories("Led and SMD Lighting", ledlighting));
        categories.add(new Categories("License/Number Plates", liscense));
        categories.add(new Categories("Momo Steering", momosteering));
        categories.add(new Categories("Non-slip/Anti Skid Mats", nonslipmates));
        categories.add(new Categories("Oem Key Covers", oemkeycovers));
        categories.add(new Categories("Performance", performance));
        categories.add(new Categories("Perfumes/Air fresheners", perfumes));
        categories.add(new Categories("Seat Cover", seatcover));
        categories.add(new Categories("Stereo", stereo));
        categories.add(new Categories("Switch/Buttons", switchbuttons));
        categories.add(new Categories("Top Covers", topcovers));
        categories.add(new Categories("Tow Hooks", towhooks));
        categories.add(new Categories("Wheel Accessories", wheelaccessories));
        categories.add(new Categories("Ungrouped", ungrouped));
    }
}