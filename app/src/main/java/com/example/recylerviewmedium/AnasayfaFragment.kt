package com.example.recylerviewmedium

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.recylerviewmedium.databinding.FragmentAnasayfaBinding

class AnasayfaFragment : Fragment() {
    private lateinit var tasarim:FragmentAnasayfaBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        tasarim = FragmentAnasayfaBinding.inflate(inflater, container, false)

        tasarim.toolbarAnasayfa.title = "Çiçekler"

        tasarim.rv.layoutManager = StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)

        val ciceklerListesi = ArrayList<Cicekler>()
        val c1 = Cicekler(1,"Ay Çiçeği","aycicegi")
        val c2 = Cicekler(2,"Cipsofilya","cipsofilya")
        val c3 = Cicekler(3,"Gerbera","gerbera")
        val c4 = Cicekler(4,"Gül","gul")
        val c5 = Cicekler(5,"Karanfil","karanfil")
        val c6 = Cicekler(6,"Lale","lale")
        val c7 = Cicekler(7,"Lavanta","lavanta")
        val c8 = Cicekler(8,"Mimoza","mimoza")
        val c9 = Cicekler(9,"Nergis","nergis")
        val c10 = Cicekler(10,"Papatya","papatya")
        val c11 = Cicekler(11,"Şebboy","sebboy")
        val c12 = Cicekler(12,"Sümbül","sumbul")

        ciceklerListesi.add(c1)
        ciceklerListesi.add(c2)
        ciceklerListesi.add(c3)
        ciceklerListesi.add(c4)
        ciceklerListesi.add(c5)
        ciceklerListesi.add(c6)
        ciceklerListesi.add(c7)
        ciceklerListesi.add(c8)
        ciceklerListesi.add(c9)
        ciceklerListesi.add(c10)
        ciceklerListesi.add(c11)
        ciceklerListesi.add(c12)

        val adapter = CiceklerAdapter(requireContext(),ciceklerListesi)
        tasarim.rv.adapter = adapter


        return tasarim.root
    }
}