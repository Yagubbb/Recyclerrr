package mooc.vandy.java4android.diamonds.recycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerViewLeaderBoard;
    private FakeDatabase database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeUI();
        initializeDatabase();
        configureRecyclerViewLeaderBoard();
    }

    public void initializeUI(){
        recyclerViewLeaderBoard = findViewById(R.id.recycler_view_leaderboard);
    }

    public void configureRecyclerViewLeaderBoard(){
        LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerViewLeaderBoard.setLayoutManager(layoutManager);

        RecyclerViewLeaderBoardAdapter adapter = new RecyclerViewLeaderBoardAdapter();
        recyclerViewLeaderBoard.setAdapter(adapter);

        adapter.submitList(database.getListOfFriends());
    }

    public void initializeDatabase(){
        database = new FakeDatabase();

    }
}
