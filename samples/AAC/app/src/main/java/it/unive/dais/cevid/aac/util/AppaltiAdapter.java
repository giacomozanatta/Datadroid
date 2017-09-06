package it.unive.dais.cevid.aac.util;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;


import it.unive.dais.cevid.datadroid.template.R;
import it.unive.dais.cevid.lib.parser.AppaltiParser;



public class AppaltiAdapter extends RecyclerView.Adapter<AppaltiAdapter.AppaltoItem> {

    private List<AppaltiParser.Data> dataList;

    public AppaltiAdapter(List<AppaltiParser.Data> dataList) {
        this.dataList = dataList;
    }

    @Override
    public AppaltoItem onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView;
        itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.appalti_element, parent, false);
        return new AppaltoItem(itemView);
    }

    @Override
    public void onBindViewHolder(AppaltoItem holder, int position) {
        holder.importo.setText(dataList.get(position).importoSommeLiquidate);
        holder.aggiudicatario.setText(dataList.get(position).aggiudicatario);
        holder.oggetto.setText(dataList.get(position).oggetto);
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    public class AppaltoItem extends RecyclerView.ViewHolder {

        public TextView importo, oggetto, aggiudicatario;

        public AppaltoItem(View itemView) {
            super(itemView);
            importo = (TextView) itemView.findViewById(R.id.text_importo);
            oggetto = (TextView) itemView.findViewById(R.id.text_oggetto);
            aggiudicatario = (TextView) itemView.findViewById(R.id.text_aggiudicatario);
        }
    }
}
