package AdapterPattern;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.zxu.android.designpatern.R;

public class SonViewHolder extends RecyclerView.ViewHolder {

    public SonViewHolder(View itemView) {
        super(itemView);
        number_Txet_view = itemView.findViewById(R.id.number_text_view);
        songName_Txet_view = itemView.findViewById(R.id.song_name_text_view);
        info_txet_view = itemView.findViewById(R.id.info_text_view);
        moreInfo_image_view = itemView.findViewById(R.id.more_info_image_view);
    }


        private TextView number_Txet_view;
        private TextView songName_Txet_view;
        private TextView info_txet_view;
        private ImageView moreInfo_image_view;


        public void bindHolder(final Song song, int position){
            number_Txet_view.setText((position+1)+"");
            songName_Txet_view.setText(song.getTitle());
            String info = song.getSinger() + "-"+ song.getAlbum();
            info_txet_view.setText(info);
            moreInfo_image_view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                }
            });
            if(mOnItemClickListener!=null){
                itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        mOnItemClickListener.onClick(song);
                    }
                });
            }
        }


}
