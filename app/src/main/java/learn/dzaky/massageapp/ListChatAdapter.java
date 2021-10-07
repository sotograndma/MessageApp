package learn.dzaky.massageapp;

import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class ListChatAdapter extends RecyclerView.Adapter<ListChatAdapter.ListViewHolder> {
    private ArrayList<Chat> listChat;

    public ListChatAdapter(ArrayList<Chat> list) {
        this.listChat = list;
    }

    @NotNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_msg, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull ListViewHolder holder, int position) {
        Chat chat = listChat.get(position);
        Glide.with(holder.itemView.getContext())
                .load(chat.getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgPhoto);
        holder.tvName.setText(chat.getName());
        holder.tvDetail.setText(chat.getDetail());
    }

    @Override
    public int getItemCount() {
        return listChat.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName;
        TextView tvDetail;

        ListViewHolder(View itemview) {
            super(itemview);
            imgPhoto = itemview.findViewById(R.id.img_item_msg);
            tvName = itemview.findViewById(R.id.msg_item_name);
            tvDetail = itemview.findViewById(R.id.msg_detail);
        }
    }
}
