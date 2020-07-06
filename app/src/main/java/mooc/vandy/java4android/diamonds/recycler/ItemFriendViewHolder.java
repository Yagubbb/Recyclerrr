package mooc.vandy.java4android.diamonds.recycler;

import android.graphics.Color;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ItemFriendViewHolder extends RecyclerView.ViewHolder {

    private TextView place;
    private ImageView profilePicture;
    private TextView fullName;
    private ProgressBar progress;
    private TextView score;
    private TextView level;

    public ItemFriendViewHolder(@NonNull View itemView) {
        super(itemView);

        place = itemView.findViewById(R.id.place);
        profilePicture = itemView.findViewById(R.id.image_view_profile);
        fullName = itemView.findViewById(R.id.text_view_name);
        progress = itemView.findViewById(R.id.progress_bar);
        score = itemView.findViewById(R.id.score);
        level = itemView.findViewById(R.id.level);
    }

    public void bindItem(Friends friendsData){
        place.setText(friendsData.getPlace());
        fullName.setText(friendsData.getFullName());
        progress.setProgress(friendsData.getProgress());
        score.setText(friendsData.getScore() + " pts" );
        level.setText("level " + friendsData.getLevel() );
        setTextColor(friendsData.getPlace());

    }

    public void setTextColor(String copyPlace){
        if (copyPlace.equals("1")){
            place.setTextColor(Color.parseColor("#d4b464"));
            score.setTextColor(Color.parseColor("#d4b464"));

        }
        else if(copyPlace.equals("2")){
            place.setTextColor(Color.parseColor("#82a9b8"));
            score.setTextColor(Color.parseColor("#82a9b8"));

        }
        else if(copyPlace.equals("3")){
            place.setTextColor(Color.parseColor("#8d5f4e"));
            score.setTextColor(Color.parseColor("#8d5f4e"));
        }
        else {
            place.setTextColor(Color.parseColor("#FFFFFF"));
            score.setTextColor(Color.parseColor("#FFFFFF"));

        }
    }
}
