package com.application.SafeShop;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyHolder extends RecyclerView.ViewHolder {

    ImageView mImageView;
    ImageView mImageView1;
    TextView mLine1, mLine2;

    public MyHolder(@NonNull View itemView) {
        super(itemView);
        this.mImageView = itemView.findViewById(R.id.imageIv);
        this.mImageView1 = itemView.findViewById(R.id.imageIv2);
        this.mLine1 = itemView.findViewById(R.id.line1);
        this.mLine2 = itemView.findViewById(R.id.line2);
    }
}
