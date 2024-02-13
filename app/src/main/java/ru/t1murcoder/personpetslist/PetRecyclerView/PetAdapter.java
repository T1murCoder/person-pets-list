package ru.t1murcoder.personpetslist.PetRecyclerView;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import ru.t1murcoder.personpetslist.databinding.ItemPetBinding;
import ru.t1murcoder.personpetslist.domain.Pet;

public class PetAdapter extends RecyclerView.Adapter<PetViewHolder> {

    private List<Pet> petList;

    public PetAdapter(List<Pet> petList) {
        this.petList = petList;
    }

    @NonNull
    @Override
    public PetViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        ItemPetBinding binding = ItemPetBinding.inflate(
                LayoutInflater.from(parent.getContext()
                )
        );

        return new PetViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull PetViewHolder holder, int position) {
        holder.bind(petList.get(position));
    }

    @Override
    public int getItemCount() {
        return petList.size();
    }

    public void setPetList(List<Pet> petList) {
        this.petList = petList;
        notifyDataSetChanged();
    }
}
