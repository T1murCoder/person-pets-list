package ru.t1murcoder.personpetslist.PetRecyclerView;

import android.graphics.drawable.Drawable;

import androidx.recyclerview.widget.RecyclerView;

import ru.t1murcoder.personpetslist.R;
import ru.t1murcoder.personpetslist.databinding.ItemPetBinding;
import ru.t1murcoder.personpetslist.domain.Pet;

public class PetViewHolder extends RecyclerView.ViewHolder {

    private ItemPetBinding binding;

    public PetViewHolder(ItemPetBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }

    public void bind(Pet item) {
        binding.tvName.setText(item.getName());
        binding.tvBreed.setText(item.getBreed());
        binding.ivPhoto.setImageResource(binding.getRoot().getResources().getIdentifier(item.getImgUrl(), "drawable", "ru.t1murcoder.personpetslist"));
    }
}
