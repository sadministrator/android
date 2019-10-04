package com.example.login

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import android.widget.FrameLayout
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RecycleFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?):View?{
        val v = inflater.inflate(R.layout.activity_recyclefrag, container, false)
        val recyclerView:RecyclerView=v.findViewById(R.id.recycler)
        recyclerView.layoutManager=LinearLayoutManager(null,LinearLayoutManager.VERTICAL,false)
        val items = ArrayList<Item>()

        items.add(Item("1","Bulbasaur"))
        items.add(Item("4", "Charmander"))
        items.add(Item("7", "Squirtle"))
        items.add(Item("25", "Pikachu"))
        items.add(Item("54", "Psyduck"))
        items.add(Item("94", "Gengar"))
        items.add(Item("95","Onix"))
        items.add(Item("103", "Exeggutor"))
        items.add(Item("106", "Hitmonlee"))
        items.add(Item("108", "Lickitung"))
        items.add(Item("109", "Koffing"))
        items.add(Item("118", "Goldeen"))
        items.add(Item("124", "Jinx"))
        items.add(Item("129", "Magikarp"))
        items.add(Item("130", "Gyrados"))
        items.add(Item("132", "Ditto"))
        items.add(Item("134", "Vaporeon"))
        items.add(Item("137", "Porygon"))
        items.add(Item("141", "Kabutops"))
        items.add(Item("143", "Snorlax"))
        items.add(Item("145", "Zapdos"))
        items.add(Item("149", "Dragonite"))
        items.add(Item("150", "Mewtwo"))

        val adapter = ItemAdapter(items)
        recyclerView.adapter = adapter
        return v
    }
}
