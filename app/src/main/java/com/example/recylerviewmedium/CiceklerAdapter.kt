package com.example.recylerviewmedium

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recylerviewmedium.databinding.CardTasarimBinding

class CiceklerAdapter(var mContext:Context, var ciceklerListesi:List<Cicekler>) : RecyclerView.Adapter<CiceklerAdapter.CardTasarimTutucu>() {

    inner class CardTasarimTutucu(tasarim:CardTasarimBinding): RecyclerView.ViewHolder(tasarim.root){
        var tasarim:CardTasarimBinding
        init {
            this.tasarim = tasarim
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu {
        val layoutInflater = LayoutInflater.from(mContext)
        val tasarim = CardTasarimBinding.inflate(layoutInflater,parent,false)
        return CardTasarimTutucu(tasarim)
    }

    override fun onBindViewHolder(holder: CardTasarimTutucu, position: Int) {
        val cicek = ciceklerListesi.get(position)

        holder.tasarim.imageViewCicekResim.setImageResource(mContext.resources.getIdentifier(cicek.cicek_resim_ad,"drawable",mContext.packageName))
        holder.tasarim.textViewCicekAdi.text = cicek.cicek_ad
    }

    override fun getItemCount(): Int {
       return ciceklerListesi.size
    }
}