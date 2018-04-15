package AdapterPattern;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;

import com.zxu.android.designpatern.R;

import java.util.List;

public class SonAdapter extends RecyclerView.Adapter<SonViewHolder> {

    private Context mcontext;
    private List<Song> mSongList;

    @NonNull
    @Override
    public SonViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mcontext)
                .inflate(R.layout.item_song,parent,false);
        return new SongViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SonViewHolder holder, int position) {
        holder.bindHolder(mSongList.get(position),position);
    }

    @Override
    public int getItemCount() {
        return mSongList.size();
    }
}
