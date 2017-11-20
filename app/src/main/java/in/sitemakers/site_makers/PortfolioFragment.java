package in.sitemakers.site_makers;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v7.widget.DefaultItemAnimator;


public class PortfolioFragment extends Fragment {

    private String[] title = {"App: Debut Stars Pro/HD Wallpapers","App: Unique Monuments Wallpapers","App: Classical Cars Wallpapers","App: Debut Stars/Celebs Wallpapers","App: KC's Mesh Formula","App: Mobile Pics | Wallpapers","Website: DebutStars.com","Website: Gogru.in","Website: HCelebs.net","Website: CarPhotos.in","Website: ClassicTreat.com"};
    private int[] img = {R.drawable.app_debutstars_pro,R.drawable.app_lostmonuments,R.drawable.app_carphotos,R.drawable.app_debutstars,R.drawable.app_kc_mesh_formula,R.drawable.app_mobile_pics,R.drawable.debutstars,R.drawable.gogru,R.drawable.hcelebs,R.drawable.carphotos,R.drawable.classictreat};
    private String[] des = {"App contains the unique collection of HD wallpapers including Debut Stars/Celebs and Lost Monuments.","App includes every popular monuments across the world including the 7 new wonders.","App includes each and every popular cars build around the world","App contains the hot collection of Debut Stars/Celebs wallpapers","App relates to civil engineering and instrumentation", "App includes each and every beautiful celeb across the world.","DebutStars.com contains the profiles of new rising people from the fields of Hollywood, Bollywood, Sports, Politics etc.","Entertainment Portal; Dating India, Top Headlines", "Hot Celebs Photos, Entertainment News", "Classical Cars Pictures around the world", "Classic Treat Free Article Directory" };

    private RecyclerView recyclerView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_portfolio,container,false);

        getActivity().setTitle("Portfolio");

        recyclerView = (RecyclerView) v.findViewById(R.id.recycler_portfolio);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        PortfolioAdapter adapter = new PortfolioAdapter(getActivity(),title,des,img);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        recyclerView.addItemDecoration(new DividerItemDecoration(getActivity(), LinearLayoutManager.VERTICAL));


        recyclerView.setAdapter(adapter);


        return v;
    }


}
