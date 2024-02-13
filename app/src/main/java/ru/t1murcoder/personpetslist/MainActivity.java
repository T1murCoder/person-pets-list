package ru.t1murcoder.personpetslist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.Window;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import ru.t1murcoder.personpetslist.PersonListView.PersonAdapter;
import ru.t1murcoder.personpetslist.databinding.ActivityMainBinding;
import ru.t1murcoder.personpetslist.domain.Person;
import ru.t1murcoder.personpetslist.domain.Pet;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private List<Person> personList;
    private List<Pet> petList1;
    private List<Pet> petList2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ListView personListView = binding.lvPerson;

        init();

        PersonAdapter adapter = new PersonAdapter(this, personList, binding);

        personListView.setAdapter(adapter);
    }

    private void init() {

        personList = new ArrayList<>();

        petList1 = new ArrayList<>();
        petList2 = new ArrayList<>();

        petList1.add(new Pet("Бобик", "dog_example", "Собака"));
        petList1.add(new Pet("Мурзик", "cat_example", "Кот"));
        petList1.add(new Pet("Кеша", "parrot_example", "Попугай"));
        petList1.add(new Pet("Свомпи", "crocodile", "Крокодил"));
        petList1.add(new Pet("Боня", "dog_example", "Собака"));
        petList1.add(new Pet("Мухтар", "dog", "Собака"));
        petList1.add(new Pet("Мухтар", "dog", "Собака"));
        petList1.add(new Pet("Мухтар", "dog_example", "Собака"));
        petList1.add(new Pet("Мухтар", "dog", "Собака"));

        petList2.add(new Pet("Ишак", "donkey", "Осёл"));
        petList2.add(new Pet("Егор", "horse", "Лошадь"));
        petList2.add(new Pet("Никита", "yeti", "Йети"));
        petList2.add(new Pet("Генерал Гавс", "colonel_ruffs", "Собака"));

        personList.add(new Person(1, "Alexander", "+7 800-555-35-35", petList1));


        personList.add(new Person(2, "Timur", "+7 800-555-35-35", petList2));
        personList.add(new Person(3, "Petya", "+7 800-555-35-35", petList1));
        personList.add(new Person(4, "Maksim", "+7 800-555-35-35", petList2));
        personList.add(new Person(5, "Bebra", "+7 800-555-35-35", petList1));
        personList.add(new Person(6, "Alexander", "+7 800-555-35-35", petList2));
        personList.add(new Person(7, "Alexander", "+7 800-555-35-35", petList1));
        personList.add(new Person(8, "Alexander", "+7 800-555-35-35", petList2));
        personList.add(new Person(9, "Alexander", "+7 800-555-35-35", petList1));
        personList.add(new Person(10, "Alexander", "+7 800-555-35-35", petList2));
    }
}