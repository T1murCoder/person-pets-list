package ru.t1murcoder.personpetslist.PersonListView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import ru.t1murcoder.personpetslist.MainActivity;
import ru.t1murcoder.personpetslist.PetRecyclerView.PetAdapter;
import ru.t1murcoder.personpetslist.R;
import ru.t1murcoder.personpetslist.databinding.ActivityMainBinding;
import ru.t1murcoder.personpetslist.databinding.ItemPersonBinding;
import ru.t1murcoder.personpetslist.domain.Person;

public class PersonAdapter extends ArrayAdapter<Person> {

    PersonClickListener listener;
    ActivityMainBinding binding;

    public PersonAdapter(Context context, List<Person> personList, ActivityMainBinding binding) {
        super(context, R.layout.item_person, personList);
        this.binding = binding;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        final Person person = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_person, null);
        }

        ((TextView) convertView.findViewById((R.id.tv_id))).setText(String.valueOf(person.getId()));
        ((TextView) convertView.findViewById((R.id.tv_name))).setText(person.getName());
        ((TextView) convertView.findViewById((R.id.tv_phone))).setText(person.getPhone());

        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.rvPet.setAdapter(new PetAdapter(person.getPetList()));
            }
        });

        return convertView;
    }
}
