package mooc.vandy.java4android.diamonds.recycler;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewLeaderBoardAdapter extends RecyclerView.Adapter<ItemFriendViewHolder>{

    private List<Friends> givenListOfFriends = new ArrayList<>();

    @NonNull
    @Override
    public ItemFriendViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View rootView = inflater.inflate(R.layout.friends,parent,false);
        return new ItemFriendViewHolder(rootView);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemFriendViewHolder holder, int position) {
        holder.bindItem(givenListOfFriends.get(position));
    }

    @Override
    public int getItemCount() {
        return givenListOfFriends.size();
    }

    public void submitList(List<Friends> friends ){
        this.givenListOfFriends = friends;
        notifyDataSetChanged();
    }
}
