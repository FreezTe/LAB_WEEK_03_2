package com.example.lab_week_03

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.widget.TextView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * A simple [Fragment] subclass.
 */
class DetailFragment : Fragment() {
    private val coffeeTitle: TextView?
        get() = view?.findViewById<TextView>(R.id.coffee_title)
    private val coffeeDesc: TextView?
        get() = view?.findViewById<TextView>(R.id.coffee_desc)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detail, container, false)
    }

    fun setCoffeeData(id: Int) {
        when (id) {
            R.id.affogato -> {
                coffeeTitle?.text = getString(R.string.affogato_title)
                coffeeDesc?.text = getString(R.string.affogato_desc)
            }

            R.id.americano -> {
                coffeeTitle?.text = getString(R.string.americano_title)
                coffeeDesc?.text = getString(R.string.americano_desc)
            }

            R.id.latte -> {
                coffeeTitle?.text = getString(R.string.latte_title)
                coffeeDesc?.text = getString(R.string.latte_desc)
            }
        }
    }

    companion object {
        // You can add a newInstance method here if needed, for example:
        // fun newInstance(): DetailFragment {
        //     return DetailFragment()
        // }
    }
}
