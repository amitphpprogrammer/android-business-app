package in.sitemakers.site_makers;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Amit on 10-11-2017.
 */
public class PortfolioAdapter extends RecyclerView.Adapter<PortfolioAdapter.MyViewHolder> {

    private Context context;
    private String[] title;
    private String[] des;
    private int[] img;


    public PortfolioAdapter(Context context, String[] title, String[] des, int[] img) {

        this.context = context;
        this.title = title;
        this.des = des;
        this.img = img;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        public TextView title, description;
        public ImageView imageView;

        public MyViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.title);
            description = (TextView) view.findViewById(R.id.description);
            imageView = (ImageView) view.findViewById(R.id.img_data);

            imageView.setOnClickListener(this);

        }

        @Override
        public void onClick(View v) {

            int a = getPosition();

            switch (a){
                case 0:

                    Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=in.sitemakers.mobilewallpapers"));
                    context.startActivity(browserIntent);

                    break;
                case 1:

                    Intent browserIntent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.lostmonuments.uniquewallpapers"));
                    context.startActivity(browserIntent1);
                    break;
                case 2:

                    Intent browserIntent2 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.CarsWallpapers1"));
                    context.startActivity(browserIntent2);
                    break;
                case 3:

                    Intent browserIntent3 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.ionicframework.debutstars749633"));
                    context.startActivity(browserIntent3);
                    break;
                case 4:

                    Intent browserIntent4 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.ionicframework.KCMeshFormula1"));
                    context.startActivity(browserIntent4);
                    break;
                case 5:

                    Intent browserIntent5 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.ionicframework.m_pics1"));
                    context.startActivity(browserIntent5);
                    break;
                case 6:

                    Intent browserIntent6 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.debutstars.com/"));
                    context.startActivity(browserIntent6);
                    break;
                case 7:

                    Intent browserIntent7 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://gogru.in/"));
                    context.startActivity(browserIntent7);
                    break;
                case 8:

                    Intent browserIntent8 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.hcelebs.net/"));
                    context.startActivity(browserIntent8);
                    break;
                case 9:

                    Intent browserIntent9 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.carphotos.in/"));
                    context.startActivity(browserIntent9);
                    break;
                case 10:

                    Intent browserIntent10 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.classictreat.com/"));
                    context.startActivity(browserIntent10);
                    break;
            }


        }
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.portfolio_list_row, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.title.setText(title[position]);
        holder.description.setText(des[position]);
        holder.imageView.setImageResource(img[position]);
    }

    @Override
    public int getItemCount() {
        return des.length;
    }
}

