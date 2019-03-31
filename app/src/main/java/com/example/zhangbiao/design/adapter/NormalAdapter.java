package com.example.zhangbiao.design.adapter;


import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.zhangbiao.design.R;
import com.example.zhangbiao.design.SecondActivity;
import com.example.zhangbiao.design.been.DesignVO;

import java.util.List;

public class NormalAdapter extends RecyclerView.Adapter<NormalAdapter.VH> {
    private Context mContext;
    //② 创建ViewHolder
    public static class VH extends RecyclerView.ViewHolder{
        public final TextView tvName;
        public VH(View v) {
            super(v);
            tvName = (TextView) v.findViewById(R.id.tv_name);
        }
    }

    private List<DesignVO> mDatas;
    public NormalAdapter(Context context, List<DesignVO> data) {
        this.mDatas = data;
        this.mContext = context;
    }

    //③ 在Adapter中实现3个方法
    @Override
    public void onBindViewHolder(VH holder, final int position) {
        holder.tvName.setText(mDatas.get(position).getName());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //item 点击事件
                Intent intent = new Intent(mContext, SecondActivity.class);
                intent.putExtra("path",mDatas.get(position).getPath());
                mContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mDatas.size();
    }

    @Override
    public VH onCreateViewHolder(ViewGroup parent, int viewType) {
        //LayoutInflater.from指定写法
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_1, parent, false);
        return new VH(v);
    }
}
