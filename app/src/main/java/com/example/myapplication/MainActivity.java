package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.myapplication.model.Person;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.SearchView;
import android.widget.Toast;


import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MyAdapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;
    private SearchView searchView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.my_recycler_view);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        searchView = findViewById(R.id.search_view); // ค้นหา SearchView

        // สร้าง Person 5 รายการ
        List<Person> persons = new ArrayList<>();

        Person person1 = new Person();
        person1.setPersonName("Olivia Rodrigo");
        person1.setPersonEmail("Olivia.Rodrigo@gmail.com");
        person1.setPersonImage("https://i.pinimg.com/564x/be/fc/a1/befca17ff3e353523f02f1e2431618ac.jpg");
        person1.setPersonAddress("123 Street Name");
        person1.setPersonCountry("USA");
        person1.setPersonPhone("+1 234 567 8901");
        persons.add(person1);

        Person person2 = new Person();
        person2.setPersonName("John Doe");
        person2.setPersonImage("https://i.pinimg.com/564x/0a/dd/72/0add7232b586a5ed1a0cc293684f7414.jpg");
        person2.setPersonEmail("John.doe@gmail.com");
        person2.setPersonAddress("456 Another St");
        person2.setPersonCountry("UK");
        person2.setPersonPhone("+44 20 7946 0958");
        persons.add(person2);

        Person person3 = new Person();
        person3.setPersonName("John Wick");
        person3.setPersonImage("https://i.pinimg.com/564x/24/f2/25/24f22516ec47facdc2dc114f8c3de7db.jpg");
        person3.setPersonEmail("John.wick@gmail.com");
        person3.setPersonAddress("789 Third Ave");
        person3.setPersonCountry("Canada");
        person3.setPersonPhone("+1 416-555-1234");
        persons.add(person3);

        Person person4 = new Person();
        person4.setPersonName("Jame Anderson");
        person4.setPersonImage("https://i.pinimg.com/564x/ab/6b/77/ab6b777b7b8deb651ef3b5d5636c5f3b.jpg");
        person4.setPersonEmail("Jame.anderson@gmail.com");
        person4.setPersonAddress("101 Main Street");
        person4.setPersonCountry("Australia");
        person4.setPersonPhone("+61 2 9876 5432");
        persons.add(person4);

        Person person5 = new Person();
        person5.setPersonName("Mason Clark");
        person5.setPersonImage("https://i.pinimg.com/564x/64/af/0d/64af0dbb6fd2218bd145d4b8c47fa529.jpg");
        person5.setPersonEmail("Mason.clark@gmail.com");
        person5.setPersonAddress("202 Elm Street");
        person5.setPersonCountry("New Zealand");
        person5.setPersonPhone("+64 3 123 4567");
        persons.add(person5);

        Person person6 = new Person();
        person6.setPersonName("Alice Johnson");
        person6.setPersonImage("https://i.pinimg.com/564x/0f/01/fd/0f01fd7ee72fa6603a84a023c1a6e7df.jpg");
        person6.setPersonEmail("alice.johnson@gmail.com");
        person6.setPersonAddress("303 Oak Lane");
        person6.setPersonCountry("South Africa");
        person6.setPersonPhone("+27 11 123 4567");
        persons.add(person6);

        Person person7 = new Person();
        person7.setPersonName("Bob Smith");
        person7.setPersonImage("https://i.pinimg.com/564x/71/be/29/71be2959b30d2b4572b181f36dcd87f1.jpg");
        person7.setPersonEmail("bob.smith@gmail.com");
        person7.setPersonAddress("404 Pine Road");
        person7.setPersonCountry("Ireland");
        person7.setPersonPhone("+353 1 234 5678");
        persons.add(person7);

        Person person8 = new Person();
        person8.setPersonName("Charlie Brown");
        person8.setPersonImage("https://i.pinimg.com/564x/3a/77/3e/3a773ed0e073c1daebcfb5f5820eb6c6.jpg");
        person8.setPersonEmail("charlie.brown@gmail.com");
        person8.setPersonAddress("505 Maple Street");
        person8.setPersonCountry("Germany");
        person8.setPersonPhone("+49 30 123456");
        persons.add(person8);

        Person person9 = new Person();
        person9.setPersonName("David Wilson");
        person9.setPersonImage("https://i.pinimg.com/564x/3b/8d/08/3b8d0809dc9b5bb03eb2f122a44c6ea4.jpg");
        person9.setPersonEmail("david.wilson@example.com");
        person9.setPersonAddress("606 Birch Avenue");
        person9.setPersonCountry("France");
        person9.setPersonPhone("+33 1 70 18 99 40");
        persons.add(person9);

        Person person10 = new Person();
        person10.setPersonName("Eva Green");
        person10.setPersonImage("https://i.pinimg.com/564x/6c/03/bd/6c03bd85b33bca97e0f3bb7bf50242e2.jpg");
        person10.setPersonEmail("eva.green@gmail.com");
        person10.setPersonAddress("707 Cedar Street");
        person10.setPersonCountry("Italy");
        person10.setPersonPhone("+39 06 12345678");
        persons.add(person10);

        Person person11 = new Person();
        person11.setPersonName("Cristina Joe");
        person11.setPersonImage("https://i.pinimg.com/564x/82/f0/66/82f066b88815ab12e9cdadcc69dbcbe1.jpg");
        person11.setPersonEmail("Cristina.joe@gmail.com");
        person11.setPersonAddress("808 Walnut Street");
        person11.setPersonCountry("Spain");
        person11.setPersonPhone("+34 91 123 4567");
        persons.add(person11);

        Person person12 = new Person();
        person12.setPersonName("Elizabeth Whitaker");
        person12.setPersonImage("https://i.pinimg.com/564x/15/00/74/150074395402217213bff809e78bd83d.jpg");
        person12.setPersonEmail("Elizabeth.whitaker@gmail.com");
        person12.setPersonAddress("909 Cherry Lane");
        person12.setPersonCountry("Portugal");
        person12.setPersonPhone("+351 21 123 4567");
        persons.add(person12);

        Person person13 = new Person();
        person13.setPersonName("Hank Carter");
        person13.setPersonImage("https://i.pinimg.com/564x/bc/84/1a/bc841a07000852731a734fd46efbce97.jpg");
        person13.setPersonEmail("hank.carter@gmail.com");
        person13.setPersonAddress("1010 Walnut Street");
        person13.setPersonCountry("Norway");
        person13.setPersonPhone("+47 22 123 456");
        persons.add(person13);

        Person person14 = new Person();
        person14.setPersonName("Ivy Adams");
        person14.setPersonImage("https://i.pinimg.com/564x/22/aa/22/22aa22237e8ddce02c88625f6fb6100c.jpg");
        person14.setPersonEmail("ivy.adams@gmail.com");
        person14.setPersonAddress("1111 Oak Road");
        person14.setPersonCountry("Sweden");
        person14.setPersonPhone("+46 8 123 4567");
        persons.add(person14);

        Person person15 = new Person();
        person15.setPersonName("Jack Evans");
        person15.setPersonImage("https://i.pinimg.com/564x/f0/2b/27/f02b279f7e0a0df668ae2b1de7bb613e.jpg");
        person15.setPersonEmail("jack.evans@gmail.com");
        person15.setPersonAddress("1212 Maple Street");
        person15.setPersonCountry("Denmark");
        person15.setPersonPhone("+45 33 123 456");
        persons.add(person15);

        Person person16 = new Person();
        person16.setPersonName("Michael Johnson");
        person16.setPersonImage("https://i.pinimg.com/564x/e8/82/72/e8827292777dca5378d3c75899029883.jpg");
        person16.setPersonEmail("michael.johnson@example.com");
        person16.setPersonAddress("9876 Pine Street");
        person16.setPersonCountry("Australia");
        person16.setPersonPhone("+61 2 5550 1234");
        persons.add(person16);

        Person person17 = new Person();
        person17.setPersonName("Sophia Turner");
        person17.setPersonImage("https://i.pinimg.com/564x/62/47/80/624780fe84a031fe5076225d5c448a91.jpg");
        person17.setPersonEmail("sophia.turner@gmail.com");
        person17.setPersonAddress("1001 Lavender Lane");
        person17.setPersonCountry("USA");
        person17.setPersonPhone("+1 555 789 1234");
        persons.add(person17);

        Person person18 = new Person();
        person18.setPersonName("Liam Wright");
        person18.setPersonImage("https://i.pinimg.com/564x/dd/43/8e/dd438e6038dc593072904bfdd53c7b67.jpg");
        person18.setPersonEmail("liam.wright@gmail.com");
        person18.setPersonAddress("1502 Olive Road");
        person18.setPersonCountry("Canada");
        person18.setPersonPhone("+1 555 345 6789");
        persons.add(person18);

        Person person19 = new Person();
        person19.setPersonName("Emma Davis");
        person19.setPersonImage("https://i.pinimg.com/736x/c2/a1/18/c2a118b75a53cc7f95e2b0110e7e237b.jpg");
        person19.setPersonEmail("emma.davis@gmail.com");
        person19.setPersonAddress("2003 Maple Avenue");
        person19.setPersonCountry("UK");
        person19.setPersonPhone("+44 20 7946 0959");
        persons.add(person19);

        Person person20 = new Person();
        person20.setPersonName("Noah Brown");
        person20.setPersonImage("https://i.pinimg.com/564x/b0/24/d8/b024d8fb189d362ad7ea1fb27055b073.jpg");
        person20.setPersonEmail("noah.brown@gmail.com");
        person20.setPersonAddress("2504 Cedar Street");
        person20.setPersonCountry("Australia");
        person20.setPersonPhone("+61 2 5550 1111");
        persons.add(person20);

        Person person21 = new Person();
        person21.setPersonName("Ava Harris");
        person21.setPersonImage("https://i.pinimg.com/originals/20/81/89/20818965bf4c0505b4ef63ec329813c5.gif");
        person21.setPersonEmail("ava.harris@gmail.com");
        person21.setPersonAddress("3005 Birch Boulevard");
        person21.setPersonCountry("New Zealand");
        person21.setPersonPhone("+64 3 234 5678");
        persons.add(person21);

        Person person22 = new Person();
        person22.setPersonName("James Robinson");
        person22.setPersonImage("https://i.pinimg.com/564x/7c/e4/da/7ce4da76cb56694091613a297431595c.jpg");
        person22.setPersonEmail("james.robinson@gmail.com");
        person22.setPersonAddress("3506 Oak Lane");
        person22.setPersonCountry("South Africa");
        person22.setPersonPhone("+27 11 234 5678");
        persons.add(person22);

        Person person23 = new Person();
        person23.setPersonName("Mia Walker");
        person23.setPersonImage("https://i.pinimg.com/564x/c3/d2/72/c3d2728e25cccb773141893bf26b877c.jpg");
        person23.setPersonEmail("mia.walker@gmail.com");
        person23.setPersonAddress("4007 Pine Road");
        person23.setPersonCountry("Ireland");
        person23.setPersonPhone("+353 1 345 6789");
        persons.add(person23);

        Person person24 = new Person();
        person24.setPersonName("Benjamin Lewis");
        person24.setPersonImage("https://i.pinimg.com/564x/01/6a/34/016a34bbf9dc95a43f2003c78964a543.jpg");
        person24.setPersonEmail("benjamin.lewis@gmail.com");
        person24.setPersonAddress("4508 Elm Street");
        person24.setPersonCountry("Germany");
        person24.setPersonPhone("+49 30 234567");
        persons.add(person24);

        Person person25 = new Person();
        person25.setPersonName("Charlotte Scott");
        person25.setPersonImage("https://i.pinimg.com/564x/b3/95/24/b39524ff30874e091694d3834b585caa.jpg");
        person25.setPersonEmail("charlotte.scott@gmail.com");
        person25.setPersonAddress("5009 Cedar Lane");
        person25.setPersonCountry("France");
        person25.setPersonPhone("+33 1 80 18 99 50");
        persons.add(person25);

        Person person26 = new Person();
        person26.setPersonName("Ethan King");
        person26.setPersonImage("https://i.pinimg.com/originals/be/9e/90/be9e90ef99a503ee5699c0b860f765fd.gif");
        person26.setPersonEmail("ethan.king@gmail.com");
        person26.setPersonAddress("5510 Pine Avenue");
        person26.setPersonCountry("Italy");
        person26.setPersonPhone("+39 06 23456789");
        persons.add(person26);

        Person person27 = new Person();
        person27.setPersonName("Amelia Martinez");
        person27.setPersonImage("https://i.pinimg.com/originals/30/29/d4/3029d48bb410bbe8cee85bd63902696d.gif");
        person27.setPersonEmail("amelia.martinez@gmail.com");
        person27.setPersonAddress("6011 Cherry Street");
        person27.setPersonCountry("Spain");
        person27.setPersonPhone("+34 91 234 5678");
        persons.add(person27);

        Person person28 = new Person();
        person28.setPersonName("Lucas Gonzalez");
        person28.setPersonImage("https://i.pinimg.com/originals/96/b7/ae/96b7ae0201d3ce2807f3d2b334cf9ee5.gif");
        person28.setPersonEmail("lucas.gonzalez@gmail.com");
        person28.setPersonAddress("6512 Walnut Lane");
        person28.setPersonCountry("Portugal");
        person28.setPersonPhone("+351 21 234 5678");
        persons.add(person28);

        Person person29 = new Person();
        person29.setPersonName("Isabella Clark");
        person29.setPersonImage("https://i.pinimg.com/originals/bd/84/d4/bd84d48f045975474b7e21d030635e92.gif");
        person29.setPersonEmail("isabella.clark@gmail.com");
        person29.setPersonAddress("7013 Pine Street");
        person29.setPersonCountry("Norway");
        person29.setPersonPhone("+47 22 234 567");
        persons.add(person29);

        Person person30 = new Person();
        person30.setPersonName("Henry Moore");
        person30.setPersonImage("https://i.pinimg.com/originals/02/40/9f/02409f9eb98c05b7e5577816b6aa5280.gif");
        person30.setPersonEmail("henry.moore@gmail.com");
        person30.setPersonAddress("7514 Oak Road");
        person30.setPersonCountry("Sweden");
        person30.setPersonPhone("+46 8 234 5678");
        persons.add(person30);

        // ส่ง persons ไปให้ MyAdapter
        mAdapter = new MyAdapter(this, persons, person -> {
            Toast.makeText(this, person.getPersonName(), Toast.LENGTH_SHORT).show();
        });
        recyclerView.setAdapter(mAdapter);

        // ตั้งค่า SearchView ให้กรองข้อมูลใน RecyclerView
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                mAdapter.getFilter().filter(newText); // เรียกใช้ฟิลเตอร์ใน Adapter
                return true;
            }
        });
    }
}