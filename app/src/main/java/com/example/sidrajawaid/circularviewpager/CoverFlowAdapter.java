package com.example.sidrajawaid.circularviewpager;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import java.util.List;

public class CoverFlowAdapter extends PagerAdapter {
    private List<Integer> data;
    private LayoutInflater layout_Inflater;
    private Context context;
    public static final String TAG="CoverFlowAdapter";

    public CoverFlowAdapter(List<Integer> arraydata, Context context) {
        this.data = arraydata;
        layout_Inflater=LayoutInflater.from(context);
        this.context = context;

    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view.equals(object);
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View)object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, final int position) {
        final View view=layout_Inflater.inflate(R.layout.card_item,container,false);
        ImageView imageView=(ImageView)view.findViewById(R.id.imageview1);
        imageView.setImageResource(data.get(position));
        /*view.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Log.d(TAG,"method body");
                AlertDialog.Builder ab = new AlertDialog.Builder(context);
                ab.setTitle("Sample View Pager")
                        .setIcon(R.drawable.alerticon)
                        .setMessage(" Image "+data.get(position))
                        .setCancelable(true).setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();

                    }
                });
            }
        });*/
        container.addView(view);
        return view;
    }

}
