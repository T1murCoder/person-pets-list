package ru.t1murcoder.personpetslist.PersonListView;

import android.view.View;

import ru.t1murcoder.personpetslist.domain.Person;

public interface PersonClickListener extends View.OnClickListener {
    void onCLick(Person person);
}
