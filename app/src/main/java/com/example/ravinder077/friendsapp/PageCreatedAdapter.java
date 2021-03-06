package com.example.ravinder077.friendsapp;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by SandahSaab on 8/22/2017.
 */

public class PageCreatedAdapter extends RecyclerView.Adapter<PageCreatedAdapter.MyViewHolder> {

    private List<PageCreatedData> mainimg;
    public PageCreatedAdapter(List<PageCreatedData> postlist) {
        mainimg = postlist;

        System.err.println("printing list"+mainimg);

    }


    class MyViewHolder extends RecyclerView.ViewHolder
    {
        public ImageView profileimg;
        public TextView profilename;
        public TextView timestamp;
        public TextView status;
        public ImageView mainimg;


        public MyViewHolder(View itemView) {
            super(itemView);

          /*  profileimg = (de.hdodenhof.circleimageview.CircleImageView) itemView.findViewById(R.id.pic);
            profilename = (TextView) itemView.findViewById(R.id.username);
            timestamp = (TextView) itemView.findViewById(R.id.time);*/
            status = (TextView) itemView.findViewById(R.id.pagestatus);
            mainimg = (ImageView) itemView.findViewById(R.id.mainimg);


        }
    }

    @Override
    public PageCreatedAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.pagecontents, parent, false);

        return new PageCreatedAdapter.MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(PageCreatedAdapter.MyViewHolder holder, int position) {
        PageCreatedData pagecreate = mainimg.get(position);


       /* holder.profileimg.setImageBitmap(wallclickdata.getProfileimgbit());
        holder.profilename.setText(wallclickdata.getProfilename());*/
        holder.status.setText(pagecreate.getStatus());
      //  holder.timestamp.setText(wallclickdata.getTime());
        holder.mainimg.setImageBitmap(pagecreate.getMainimgbit());
     /*   holder.commenterimg.setImageResource(R.drawable.user);
        holder.commentername.setText(wallclickdata.getCommentername());
        holder.comment.setText(wallclickdata.getComment());
*/


    }

    @Override
    public int getItemCount() {
        return mainimg.size();
    }
}
