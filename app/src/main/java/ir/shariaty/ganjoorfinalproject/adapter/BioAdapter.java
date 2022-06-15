package ir.shariaty.ganjoorfinalproject.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import ir.shariaty.ganjoorfinalproject.R;
import ir.shariaty.ganjoorfinalproject.models.Biography;

public class BioAdapter extends RecyclerView.Adapter<BioAdapter.BioViewHolder> {

    private final List<Biography> biography_shaer;
    private Context context;

    public BioAdapter(List<Biography> biography_shaer, Context context) {
        this.context = context;
        this.biography_shaer = biography_shaer;
    }


    @NonNull
    @Override
    public BioViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.bio_item, parent, false);
        return new BioViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BioViewHolder holder, int position) {
        Biography biography = biography_shaer.get(position);

        // get string from resources
        String shaername = context.getResources().getString(R.string.name);
        String place = context.getResources().getString(R.string.place);
        String birthDate = context.getResources().getString(R.string.birthdate);
        String deathPlace = context.getResources().getString(R.string.deaddate);

        if (biography.getBirthPlace().equals("")) {
            holder.birth_Place.setVisibility(View.GONE);
        } else {
            holder.birth_Place.setVisibility(View.VISIBLE);
            holder.birth_Place.setText(place + biography.getBirthPlace());
        }


        holder.shaername.setText(shaername + biography.getName());
        holder.birth_Date.setText(birthDate + biography.getBirthYearInLHijri());
        holder.death_Date.setText(deathPlace + biography.getDeathYearInLHijri());
    }

    @Override
    public int getItemCount() {
        return biography_shaer.size();
    }

    public class BioViewHolder extends RecyclerView.ViewHolder {
        private TextView shaername;
        private TextView birth_Place;
        private TextView birth_Date;
        private TextView death_Date;

        public BioViewHolder(View itemView) {
            super(itemView);
            shaername = itemView.findViewById(R.id.txt_name);
            birth_Place = itemView.findViewById(R.id.txt_birth_place);
            birth_Date = itemView.findViewById(R.id.txt_birth_date);
            death_Date = itemView.findViewById(R.id.txt_death_date);
        }
    }
}
